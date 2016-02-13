(defproject default "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]]
  :plugins [[lein-cljsbuild "1.1.2"]]
  :clean-targets ["dist/js/main.js"]
  :source-paths ["src/cljs"]
  :cljsbuild {:builds [{:source-paths ["src/cljs"]
                        :compiler {:output-to "dist/js/main.js"
                                   :main "example.main"
                                   :optimizations :advanced
                                   :pretty-print true
                                   :externs ["externs/cljs_bootstrap.js"]}}]})
