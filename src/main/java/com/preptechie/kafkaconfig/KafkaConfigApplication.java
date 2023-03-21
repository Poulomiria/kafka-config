package com.preptechie.kafkaconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KafkaConfigApplication {
	private static final Logger LOGGER= (Logger) LoggerFactory.getLogger(KafkaConfigApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KafkaConfigApplication.class, args);
	}

}
