val scala3Version = "3.4.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "pekko-hello",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.apache.pekko" %% "pekko-actor-typed" % "1.0.2",
    libraryDependencies += "org.apache.pekko" %% "pekko-actor-testkit-typed" % "1.0.2",
//    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,

    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % Test,
    libraryDependencies += "ch.qos.logback" %% "logback-classic" % "1.2.13" cross CrossVersion.disabled
  )
