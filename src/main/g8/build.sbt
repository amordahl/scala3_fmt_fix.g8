val scala3Version = "$scala3version$"

lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "$version$",

    scalaVersion := scala3Version,
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision,

    scalacOptions ++= Seq(
      "-Wunused:all"
    ),

    /* Uncomment the next two lines if you want
       scalafmt and scalafix to run whenever your code is compiled. It
       is recommended to instead use format on save for scalafmt and Metals'
       custom keybinding for scalafix. */
    // scalafmtOnCompile := true,
    // scalafixOnCompile := true,

    // Test Dependencies
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
