package com.reproduce.springdocreproduce.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("base-path")
class HelloWorldController {
  @GetMapping("hello-world") fun helloWorld() = HelloWorldResponse("Hello World")
}

data class HelloWorldResponse(val value: String)
