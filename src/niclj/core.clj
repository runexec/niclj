(ns niclj.core)

(defn nics []
  (->> (NetworkInterface/getNetworkInterfaces)
       enumeration-seq 
       (map #(assoc {}
               :display-name (.getDisplayName %)
               :name (.getName %)
               :addresses (->> %
                               .getInetAddresses
                               enumeration-seq)))))
