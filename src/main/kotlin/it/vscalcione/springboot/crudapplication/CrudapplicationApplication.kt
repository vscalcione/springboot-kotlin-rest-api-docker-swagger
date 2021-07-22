package it.vscalcione.springboot.crudapplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudapplicationApplication

fun main(args: Array<String>) {
	runApplication<CrudapplicationApplication>(*args)
}
