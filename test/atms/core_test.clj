(ns atms.core-test
  (:require [clojure.test :refer :all]
            [atms.core :refer :all]))

(deftest atms-test1
    (testing "add atoms"
        (def atms (create-atms "atms-test1" ))
        (def a (tms-create-node atms "A"))
        (def b (tms-create-node atms "B"))
        (def c (tms-create-node atms "C"))
        (def d (tms-create-node atms "D"))
        (def e (tms-create-node atms "E"))
        (def f (tms-create-node atms "F"))))

; (deftest atms-test2
;     (testing "assume atoms"
;         (def atms (create-atms "atms-test2" ))
;         (def a (tms-create-node atms "A"))
;         (def b (tms-create-node atms "B"))
;         (def c (tms-create-node atms "C"))
;         (def d (tms-create-node atms "D"))
;         (def e (tms-create-node atms "E"))
;         (def f (tms-create-node atms "F"))
;         (assume-node a)
;         (assume-node b)
;         (assume-node c)))

; (deftest atms-test3
;     (testing "justify atoms"
;        (def atms (create-atms "atms-test3" ))
;        (def a (tms-create-node atms "A"))
;        (def b (tms-create-node atms "B"))
;        (def c (tms-create-node atms "C"))
;        (def d (tms-create-node atms "D"))
;        (def e (tms-create-node atms "E"))
;        (def f (tms-create-node atms "F"))
;        (assume-node a)
;        (assume-node b)
;        (assume-node c)
;        (justify-node 'J1 d (list a b))
;        (justify-node 'J2 e (list b c))
;        (justify-node 'J3 f (list d e))))
