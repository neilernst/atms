;;; These are functions from ATMS.lisp to be re-added
(defn ordered-insert [item alist test]
    )
(defn assumption-order [a1 a2]
    )
(defn env-order [e1 e2]
    )
(defn create-atms [title]

    )
(defn change-atms [atms node-string]
    )
(defn true-node? [node]
    )
(defn in-node? [n env] ; env optional
    )

(defn out-node? [n env]
    (not (in-node? n env)) )

(defn node-consistent-with? [n env]
    )
(defn tms-create-node [atms datum assumptionp contradictoryp]
    )
(defn assume-node [anode atms] ;; atms aux
    )
(defn make-contradiction
    )
(defn justify-node [informant consequence antecedents just atms] ;;&aux
    )
(defn nogood-nodes [informant nodes]
    )
(defn propagate [just antecedent envs new-envs]
    )
(defn update [new-envs consequence just ]
    )
(defn update-label [node new-envs]
    )
(defn weave [antecedent envs antecedents]
    )
(defn in-antecedent? [nodes]
    )
(defn weave? [env nodes]
    )
(defn supporting-antecedent? [nodes env]
    )
(defn remove-node [node]
    )
(defn create-env [atms assumptions]
    )
(defn union-env [e1 e2]
    )
(defn cons-env [assumption env]
    )
(defn find-or-make-env [assumptions atms]
    )
(defn insert-in-table [table env ]
    )
(defn lookup-env [assumes]
    )
(defn subset-env? [e1 e2]
    )
(defn compare-env [e1 e2]
    )
(defn new-nogood [atms cenv just]
    )
(defn set-env-contradictory [atms env]
    )
(defn remove-env-from-labels [env atms]
    )
(defn interpretations [atms choice-sets]
    )
(defn get-depth-solutions1 [solution choice-sets]
    )
(defn extend-via-defaults [solution remaining original]
    )
(defn explain-node [node env]
    (explain-node-1 env node nil nil))

(defn explain-node-1 [env node queued-nodes explanation]
    )
(defn why-node [node ] ; stream optional originally, we'll just print to stdout
    )
(defn why-nodes [atms]
    )
(defn node-justifications [node]
    )
(defn e [atms n])

(defn print-justification [j]
    )

;; TODO: allow each print form to take an optional stream param
(defn print-just [just stream ignore]
  (format stream "<~A ~D>" (just-informant just)
    (just-index just)))

(defn print-atms [atms stream ignore] "Print the ATMS" )

(defn print-env [e]
    )
(defn env-string [e]
    )
(defn print-nogoods [atms]
    )
(defn print-envs [atms]
    )
(defn print-env-table [table stream]
    )
(defn print-atms-statistics [atms]
    )
(defn print-table [msg table]
    )