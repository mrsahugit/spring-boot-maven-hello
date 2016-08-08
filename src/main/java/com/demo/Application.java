/**
 * 
 */
package com.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Manas Sahu
 *
 */
@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void post() {
		logger.debug("Sample Debug Message");
		logger.trace("Sample Trace Message");
	}

}
