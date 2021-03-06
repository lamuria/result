(defproject clanhr/result "0.16.0"
  :description "Generic result representation"
  :url "https://github.com/clanhr/result"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.395"]]
  :aliases {"autotest" ["with-profile" "+test" "test-refresh"]}
  :profiles {:test {:env {:secret "test_secret"}
                    :plugins [[com.jakemccrary/lein-test-refresh "0.17.0"]]}})
