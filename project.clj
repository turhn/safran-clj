(defproject safran "0.1.0"
  :description "Command Line Feed Reader for Safran.io"
  :url "http://github.com/turhn"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [adamwynne/feedparser-clj "0.5.2"]]
  :main ^:skip-aot safran.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
