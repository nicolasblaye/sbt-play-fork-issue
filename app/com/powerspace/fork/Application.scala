package com.powerspace.fork

import javax.inject.Inject

import akka.event.slf4j.SLF4JLogging
import akka.util.Timeout
import com.typesafe.config.Config
import org.libjpegturbo.turbojpeg.TJ
import play.api.mvc._

import scala.concurrent.duration._

class Application @Inject()(actionBuilder: DefaultActionBuilder, config: Config) extends BaseController with SLF4JLogging {

  implicit val timeout = Timeout(5 seconds)


  def index = actionBuilder { _ =>
    println(config.getString("test"))
    println(System.getProperty("java.library.path"))
    new TJ
    Ok("Ok")
    }

  override protected def controllerComponents: ControllerComponents = ???
}
