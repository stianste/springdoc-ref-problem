package com.reproduce.springdocreproduce.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
  @GetMapping
  fun helloWorld() = HelloWorldResponse("Hello World")
}

data class HelloWorldResponse(
  val value: String
)
