package com.reproduce.springdocreproduce.controller

import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.status
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

data class ApiExceptionDTO(
    val message: String,
    val statusCode: Int,
)

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
class RestExceptionHandler : ResponseEntityExceptionHandler() {
  @ResponseStatus
  @ExceptionHandler(Throwable::class)
  fun handleGeneralApiException(throwable: Throwable): ResponseEntity<ApiExceptionDTO> {
    println("Something went wrong")
    return status(500).body(ApiExceptionDTO("Something went horribly wrong", 500))
  }
}
