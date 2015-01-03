(ns safran.core
  (:use [feedparser-clj.core :only (parse-feed)])
  (:gen-class))

(use 'colorize.core)

; Parse Feed
(def feed
  (parse-feed "http://www.safran.io/feed.rss"))

; Pretty print feed
(defn print-feed [item]
  (println (red (:title item)))
  (println (underline (yellow (:link item))))
  (newline))

; Loop through entries in a try wrapper
(defn parse-safran []
  "A function to parse Safran.io entries."
  (try
    (doseq [item (:entries feed)] (print-feed item))
    (catch Exception e (str "Bir hata oluştu: " (.getMessage e)))))

; Main function for program entry point
(defn -main []
  (parse-safran))
