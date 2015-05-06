(ns coin-changer.core
  (:gen-class))

(defn -main
  [& args]
  (println "Behold, a mechanism for making change."))

(defn change-for [amount]
  (let [denominations [25 10 5 1]
        amounts (reductions #(rem %1 %2) amount denominations)
        coins (map #(int (/ %1 %2)) amounts denominations)]
    (mapcat #(take %1 (repeat %2)) coins denominations)))
