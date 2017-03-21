(defproject tuddman/conch "0.9.0-SNAPSHOT"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/tuddman/conch"
  :description "A better shell-out library for Clojure."
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :aliases {"testall" ["with-profile" "dev,default:dev,1.7,default" "test"]}
  :profiles {:1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :release {:deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                                         :creds :gpg}
                                             "snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                                          :creds :gpg}}}}
  :repositories {"snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"}}
  :pom-addition [:developers [:developer
                              [:name "Anthony Grimes"]
                              [:url "http://blog.raynes.me"]
                              [:email "i@raynes.me"]
                              [:timezone "-6"]]])
