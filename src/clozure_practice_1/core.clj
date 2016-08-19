(ns clozure-practice-1.core)

(defn madlib [adj-1 adj-2 adj-3 name-1 adj-4 adj-5 verb-1 noun-1 sport-1 noun-2 noun-3 verb-3 verb-4 relative-1 name-2]

(println (str
"I am having a " adj-1 " time at camp." " The counselor is " adj-2 " and the food is " adj-3 "." " I met
" name-1 " and we became " adj-4 " friends." " Unfortunately " name-1 " is " adj-5 " and I " verb-1 " my " noun-1 ",
so we couldn't go " sport-1 " like everybody else." " I need more " noun-2 " and an " noun-3 " sharpener,
so please " verb-3 " more when you " verb-4 " back." "\n" "\n" "Much love," "\n" "Your " relative-1 "\n" name-2))

  )

(defn -main []
  (madlib "horrible" "mean" "gross" "Zenobia" "best" "blind" "sold" "soul" "kayaking" "pudding" "icecube" "send" "teleport" "daughter" "Indigo"))

(-main)