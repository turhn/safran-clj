(ns safran.core-test
  (:require [clojure.test :refer :all]
            [safran.core :refer :all]))

(testing "I should retrieve entries"
  (is (not (nil? feed))))

