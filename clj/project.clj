; SPDX-License-Identifier: MIT
(defproject nomos-studio/txlog "0.1.0-SNAPSHOT"
  :description "txlog — session log format and SQLite client for nomos-studio"
  :url "https://github.com/nomos-studio/txlog"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [com.github.seancorfield/next.jdbc "1.3.939"]
                 [org.xerial/sqlite-jdbc "3.46.1.3"]]
  :plugins       [[lein-shell "0.5.0"]]
  :aliases       {"lint.reuse" ["shell" "reuse" "lint" "--root" ".."]}
  :source-paths ["src"]
  :test-paths   ["test"]
  :target-path  "target/%s"
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "1.5.0"]]}})
