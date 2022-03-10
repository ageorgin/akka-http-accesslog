organization := "com.ageorgin"
name := "akka-http-accesslog"

lazy val scala213 = "2.13.5"
lazy val scala212 = "2.12.13"
scalaVersion := scala213
crossScalaVersions := Seq(scala213, scala212)

lazy val akkaVersion = "2.6.18"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Xlint:-unused,_"
) ++ (scalaBinaryVersion.value match {
  case "2.12" =>
    Seq(
      "-Yno-adapted-args",
      "-Xfuture"
    )
  case _ => Seq()
})

libraryDependencies ++= Seq(

)

// Tests settings
parallelExecution := false
