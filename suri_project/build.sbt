name := "suri_project"

version := "1.0"

lazy val `suri_project` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq (
    jdbc,
    cache,
    ws,
    specs2 % Test,
    "mysql" % "mysql-connector-java" % "5.1.26"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

