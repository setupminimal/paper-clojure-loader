(ns main)

(defn register
  "Register all the needed listeners using the provided JavaPlugin"
  [plugin]
  (.. plugin getLogger (info "Hello from Clojure!")))
