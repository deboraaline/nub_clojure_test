(ns centrality-service.util
  (:require [clojure.java.io :as io]))

(defn load-edges [filename]
  (with-open [rdr (io/reader (str "resources/" filename))]
    (vec (map #(read-string (str "(" % ")")) (line-seq rdr)))))
  