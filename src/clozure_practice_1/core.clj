(ns clozure-practice-1.core)

(defn madlib [adj-1 adj-2 adj-3 name-1 adj-4 adj-5 verb-1 noun-1 verb-2 noun-2 noun-3 verb-3 verb-4 relative-1 name-2]

  (println (str "I am having a " adj-1 " time at camp."))
  (println (str " The counselor is "adj-2" and the food is "adj-3".")) 
  (println (str " I met "name-1" and we became "adj-4" friends.")) 
  (println (str " Unfortunately "name-1" is "adj-5" and I "verb-1" my "noun-1", so we couldn't go "verb-2" like everybody else.")) 
  (println (str " I need more "noun-2" and a "noun-3" sharpener, so please "verb-3" more when you "verb-4" back.")) 
  (println (str " Your "relative-1",")) (println (str " "name-2""))


  (madlib "horrible" "mean" "gross" "Zenobia" "best" "Zenobia" "blind" "sold" "soul" "kayak" "pudding" "icecube" "send" "teleport" "daughter" "Juniper")
  (madlib "bad")
  )