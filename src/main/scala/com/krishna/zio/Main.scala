package com.krishna.zio

import zio.*

object Main extends App:
  override def run(args: List[String]) =
    (for
      _ <- console.putStrLn("─" * 100)
      _ <- console.putStrLn("hello world")
      _ <- console.putStrLn("─" * 100)
    yield ()).exitCode
