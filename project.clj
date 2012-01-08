(defproject clj-record "1.1.2-SNAPSHOT"
  :description "A pseudo-port of ActiveRecord to the Clojure programming language"
  :url "http://github.com/duelinmarkers/clj-record"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/java.jdbc "0.1.1"]]
  :dev-dependencies [[lein-clojars "0.6.0"]
                     [swank-clojure/swank-clojure "1.2.1"]
                     [mysql/mysql-connector-java "5.1.17"]])


(ns leiningen.reset-db
  (:require leiningen.compile))

(defn reset-db [project]
  (leiningen.compile/eval-in-project project
    '(do
      (clj-record.test-helper/reset-db))
    nil nil (require 'clj-record.test-helper)))

