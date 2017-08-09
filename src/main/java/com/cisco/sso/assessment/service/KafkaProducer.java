package com.cisco.sso.assessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String topic="extract_cli";
	
	public void sendMessage(String message){
		System.out.println("Message sending to Kafka stream"+message);
		kafkaTemplate.send(topic, message);
	}
}
