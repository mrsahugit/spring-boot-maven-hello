/**
 * 
 */
package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manas Sahu
 *
 */
@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/")
	public String index() {
		logger.debug("GET index()");
    	return "Greetings from Spring Boot!";
	}

}
