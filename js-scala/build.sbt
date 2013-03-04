name := "chooze-jsscala"

scalaVersion := "2.10.0"

scalaOrganization := "org.scala-lang.virtualized"

scalacOptions ++= Seq("-feature", "-deprecation", "-unchecked", "-Yvirtualize")

libraryDependencies ++= Seq(
  "EPFL" %% "js-scala" % "0.3-SNAPSHOT",
  "js-scala" %% "forest" % "0.4-SNAPSHOT",
  "js-scala" %% "react" % "0.1-SNAPSHOT"
)