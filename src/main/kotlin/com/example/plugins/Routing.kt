package com.example.plugins

import data.MessageResponse
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        get("/request") {
            val resp = MessageResponse(false, "it is bad")
            call.respond(resp)
        }

        get("/") {
            call.respondText("Text")
        }
    }
}
