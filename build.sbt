name := "Javelin Ontologies"

version := "1.0"

scalaVersion := "2.10.1"

organization := "ivan"

javacOptions ++= Seq("-Xlint:unchecked")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
    "org.apache.jena" % "jena-arq" % "2.11.1" exclude("org.slf4j", "slf4j-log4j12")
)
