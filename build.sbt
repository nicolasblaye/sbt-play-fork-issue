name := "TestProto"

scalaVersion := "2.12.6"
val libPath = Seq("/opt/libjpeg-turbo/lib64/").mkString(java.io.File.pathSeparator)

resolvers ++= Seq(
  "Turbojpeg" at "https://repo.boundlessgeo.com/main/"
)

libraryDependencies += guice
libraryDependencies +=  "com.typesafe" % "config" % "1.3.3"
libraryDependencies += "org.libjpegturbo" % "turbojpeg-wrapper" % "1.2.1.4" % "optional"

javaOptions += s"-Djava.library.path=$libPath"
javaOptions += "-Dtest=forked"
fork := true

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)