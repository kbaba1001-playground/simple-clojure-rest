(defproject simple-clojure-rest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/kbaba1001-playground/simple-clojure-rest"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [integrant "0.7.0"]
                 [ring/ring-core "1.7.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [ring/ring-json "0.4.0"]
                 [camel-snake-kebab "0.4.0"]]
  :main ^:skip-aot simple-clojure-rest.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[alembic "0.3.2"]
                                  [philoskim/debux "0.5.6"]]
                   :injections [(require '[debux.core :refer [dbg dbgn]])]}})
