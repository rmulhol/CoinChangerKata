(ns coin-changer.core-test
  (:require [clojure.test :refer :all]
            [coin-changer.core :refer :all]))

(deftest coin-changer-test
  (testing "change-for"
    (are [amount change] (= (change-for amount) change)
         0 []
         1 [1]
         2 [1 1]
         3 [1 1 1]
         5 [5]
         6 [5 1]
         10 [10]
         16 [10 5 1]
         25 [25]
         42 [25 10 5 1 1]
         99 [25 25 25 10 10 1 1 1 1]
         )))
