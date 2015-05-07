(ns coin-changer.core-test
  (:use midje.sweet)
  (:use [coin-changer.core]))

(tabular "about 'change-for'"
  (fact "makes change for amounts"
    (change-for ?amount) => ?change)
  ?amount   ?change
  0         []
  1         [1]
  2         [1 1]
  3         [1 1 1]
  5         [5]
  6         [5 1]
  10        [10]
  16        [10 5 1]
  25        [25]
  42        [25 10 5 1 1]
  99        [25 25 25 10 10 1 1 1 1]
)
