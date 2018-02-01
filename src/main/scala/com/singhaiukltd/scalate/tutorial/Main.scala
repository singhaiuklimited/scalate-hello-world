package com.singhaiuklimited.scalate.tutorial

import org.fusesource.scalate._

object Main extends App {
  val engine = new TemplateEngine
  val ctx  = Map("metrics"->List(
    Map("name"->"Alice")
    ,Map("name"->"Bob")
  ))
  val output = engine.layout("simpleHTML.mustache", ctx)
  System.out.println(output)
}
