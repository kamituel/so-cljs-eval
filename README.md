# Compile CLJS code on the fly

Example to help answer [this StackOverflow question](http://stackoverflow.com/questions/35247645/how-to-serialize-clojurescript-functions-to-edn-and-then-later-deserialize-and-i).

## Usage

1. Compile ClojureScript: `lein cljsbuild auto`
2. Open `dist/index.html` in your browser.
3. Type in any ClojureScript code in the input. If it's valid, input border will turn green. Otherwise - it'll be red. If your CLJS code will use `(prn)` or alike, you should see output in the JS console.

## Limitations

It's based on [cljs-bootstrap](https://github.com/kanaka/cljs-bootstrap), so any limitations there apply here too.

## License

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
