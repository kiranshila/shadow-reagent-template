(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(def heading (r/atom "Change Me!"))

; A react component, for reagent to render
; Described with hiccup, reacting to changes in r/atoms
(defn app []
  [:div
   [:h1 @heading]])

; Entry point - renders the app component to the app div from our HTML
; export metadata to export the main function for this module
(defn ^:export main []
  (rdom/render [app] (.getElementById js/document "app")))
