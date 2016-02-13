(ns example.main
  "Entry point. Example HTML file is located in dist/index.html.")

(enable-console-print!)

(defn mark-success!
  "Appends either a 'build-success' or 'build-failed' class on the body, depending on the value
  of the success (bool)."
  [success body]
  (let [classes (.-classList body)]
    (doto classes
          (.remove "build-success")
          (.remove "build-failed")
          (.add (if success "build-success" "build-failed")))))

(defn init
  "Initializes event listeners."
  []
  (let [code-input (.querySelector js/document "input")
        body (.querySelector js/document "body")]
    (.addEventListener
     code-input "keyup"
     (fn [e]
       ;; TODO: the precompiled to JS version of cljs_bootstrap.core is used here. It also means
       ;;       for advanced compilation, we need externs. It's messy.
       ;;       It would probably make sense to include them as a regular CLJS namespaces in this
       ;;       project and require them with (:require).
       (let [code (-> e .-target .-value)
             cljs (-> js/window .-cljs_bootstrap .-core)]
         (.read_eval_print cljs code (fn [success _] (mark-success! success body))))))))

(.addEventListener js/window "DOMContentLoaded" init)
