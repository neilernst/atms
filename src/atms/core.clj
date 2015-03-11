(ns atms.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; ATMS has 3 record types: ATMS itself, justifications, and environments.
(defrecord Atms
  [title
  node-counter             ; unique namer for nodes.
  just-counter               ; unique namer for justifications.
  env-counter                ; Unique id for environments.
  nodes                    ; List of all atms nodes.
  justs                  ; List of all justifications.
  contradictions          ; List of contradiction nodes.
  assumptions             ; List of all atms assumptions.
  debugging                ; Trace grungy details.
  nogood-table
  contra-node              ; A dummy contradiction node.
  env-table
  empty-env            ; Empty environment.
  node-string
  enqueue-procedure])

(defrecord Just
     [index
     informant
     consequence
     antecedents])

(defrecord Env
     [index
     count        ; Number of assumptions.
     assumptions
     nodes
     nogood?
     rules ])       ; Call this if becomes nogood.

(defn create-atms [title]

    )

(defn tms-create-node [atms datum]
    )