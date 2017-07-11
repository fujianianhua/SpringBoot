package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 * @author fujianianhua
 * @version 1.0.0
 * @blog  
 *
 */
@SpringBootApplication
@EnableAutoConfiguration  
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		
	}

}
