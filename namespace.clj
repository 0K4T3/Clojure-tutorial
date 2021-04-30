(ns clojure.example.hello
  (:gen-class))
(defn Example []
  (println (str "Hello World"))
  (println (+ 1 2)))
(Example)
