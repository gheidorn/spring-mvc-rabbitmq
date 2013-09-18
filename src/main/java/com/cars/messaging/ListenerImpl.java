package com.cars.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListenerImpl {

	private static final Logger logger = LoggerFactory
			.getLogger(ListenerImpl.class);

	public void listen(byte[] message) {	
		logger.info("listener(byte[]):  " + message.toString());
	}
	
	public void listen(String message) {	
		logger.info("listener(String):  " + message);
	}

}
