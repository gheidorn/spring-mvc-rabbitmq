package com.cars.messaging;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProducerController {

	private static final Logger logger = LoggerFactory.getLogger(ProducerController.class);
	
	@Inject
	RabbitTemplate amqpTemplate;
	
	@RequestMapping(value="produceMessage", method=RequestMethod.GET)
	public String produceMessage() {
		logger.info("about to send a message...");
		
		amqpTemplate.convertAndSend("Hello friends in listenerImpl");
		
		logger.info("sent a message");
		
		return "producer";
	}
	
}
