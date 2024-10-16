package com.kafka.testando_kafka

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/kafka")
class KafkaController(private val kafkaProducer: KafkaProducer) {

    @PostMapping("/send")
    fun sendMessage(@RequestParam message: String): String {
        kafkaProducer.sendMessage("my-topic", message)
        return "Mensagem enviada: $message"
    }
}
