package com.johngodoi.akka

import akka.actor.{ActorSystem, Props}

object AkkaIntro extends App {
  val system = ActorSystem("akka-intro-system")
  val actor = system.actorOf(Props[SampleActor],"sample-actor")
}
