package com.lab.taskzen

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskzenApplication

fun main(args: Array<String>) {
	runApplication<TaskzenApplication>(*args)
}
