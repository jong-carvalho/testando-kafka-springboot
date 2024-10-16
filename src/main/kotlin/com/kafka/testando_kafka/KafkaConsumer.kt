package com.kafka.testando_kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumer {

    @KafkaListener(topics = ["my-topic"], groupId = "my-group-id")
    fun consume(message: String) {
        println("Mensagem recebida: $message")
    }
}
