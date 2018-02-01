lazy val scalateVersion         = "1.8.0"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization     := "com.singhaiuklimited.scalate.tutorial",
      scalaVersion     := "2.12.4"
    )),
    name := "scalate-hello-world",
    version := "0.0.1-SNAPSHOT",
    libraryDependencies ++= Seq(
      "org.scalatra.scalate"       %% "scalate-core"                 % "1.8.0"
    )
  )
