name := "JSDoc-Parser"

version := "0.0.1-RELEASE"

scalaVersion := "2.11.7"

organization := "com.github.div082"

homepage := Some(url("https://github.com/divergence082/JSDoc-Parser"))

licenses := Seq("MIT License" -> url("http://www.opensource.org/licenses/mit-license.php"))

description := """JavaScript Documentation Parser"""

resolvers ++= Seq(
  "Sonatype OSS" at "https://oss.sonatype.org/content/repositories/releases/"
)

publishMavenStyle := true

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module"  %% "jackson-module-scala" % "2.6.0-1",
  "com.github.scopt" %% "scopt" % "3.3.0"
)

artifact in (Compile, assembly) := {
  val art = (artifact in (Compile, assembly)).value
  art.copy(classifier = Some("assembly"))
}

addArtifact(artifact in (Compile, assembly), assembly)
