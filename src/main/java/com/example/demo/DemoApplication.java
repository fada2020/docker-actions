package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
@Slf4j
@SpringBootApplication
public class DemoApplication  implements ApplicationListener<ApplicationStartedEvent> {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		log.info("spring start!!!");
	}
}
