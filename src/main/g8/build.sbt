val scala3Version = "$scala3version$"

lazy val root = project
  .in(file("."))
  .settings(
    name                   := "$name$",
    version                := "$version$",
    scalaVersion           := scala3Version,
    semanticdbEnabled      := true,
    semanticdbVersion      := scalafixSemanticdb.revision,
    Compile / doc / target := file("docs"),
    scalacOptions ++= Seq(
      "-Wunused:all",
      "-Wnonunit-statement",
      "-Wvalue-discard",
      "-deprecation",
      "-feature",
      "-source:future"
    ),

    // Test Dependencies
    libraryDependencies += "org.scalameta" %% "munit" % "1.1.0" % Test,
    libraryDependencies += "org.scalameta" %% "munit-scalacheck" % "1.1.0" % Test
  )
