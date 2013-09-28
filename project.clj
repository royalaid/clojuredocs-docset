(defproject clojuredocs-docset "0.1.0"
  :description "ClojureDocs.org dash docset generator"
  :url "http://github.com/dlokesh/clojuredocs-docset"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
  				 [org.jsoup/jsoup "1.7.2"]
  				 [org.clojure/java.jdbc "0.3.0-alpha4"]
  				 [org.xerial/sqlite-jdbc "3.7.2"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]}}
  :plugins [[lein-midje "3.0.0"]]  				 
  :main clojuredocs-docset.core)