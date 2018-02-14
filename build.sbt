import sbt.Keys._
import sbt.{Def, _}

name := "common"

version := "1.5.0.1"

organization := "com.simplesys"

val circeExtender = "com.simplesys.cross" %% "circe-extender" % "1.0.0.6"
val logBackWrapper = "com.simplesys" %% "logback-wrapper" % "1.5.0.1"
val scalaTest = "org.scalatest" %% "scalatest" % "3.0.4"
val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.0.6"
val scalaReflect = Def.setting("org.scala-lang" % "scala-reflect" % scalaVersion.value)

val apacheCommonsLang = "org.apache.commons" % "commons-lang3" % "3.4"
val apacheCommonsIO = "commons-io" % "commons-io" % "2.5"

libraryDependencies ++= Seq(
    logBackWrapper,
    circeExtender,
    apacheCommonsLang,
    apacheCommonsIO,
    scalaXml,
    scalaReflect.value,
    scalaTest % Test
)

scalaVersion := "2.12.4"
