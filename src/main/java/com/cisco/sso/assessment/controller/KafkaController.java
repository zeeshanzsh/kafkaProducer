package com.cisco.sso.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.sso.assessment.service.KafkaProducer;

@RestController
public class KafkaController {

	
	@Autowired
	KafkaProducer kafkaProducer;
	
	@RequestMapping(value="/v1/send")
	public String sendToKafka(@RequestParam(value="message") String message){
		kafkaProducer.sendMessage(message);
		return "Message Sent to stream";
	}
}
