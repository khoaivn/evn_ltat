package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		try {
            SpringApplication app = new SpringApplication(DemoApplication.class);
            app.run(args);
        } catch(Throwable ex) {
            ex.printStackTrace();
        }
		// SpringApplication.run(DemoApplication.class, args);
	}

}
