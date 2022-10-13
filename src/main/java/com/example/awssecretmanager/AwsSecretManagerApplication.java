package com.example.awssecretmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class AwsSecretManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsSecretManagerApplication.class, args);
	}


	@Component
	public class SpringBootConsoleApplication
		implements CommandLineRunner {
		@Value("#{${usernames}}")
		private Map<String, String> usernames;
		@Override
		public void run(String... args) {
			System.out.println(usernames);
			//usernames.entrySet().forEach(e -> System.out.println(e.getKey()+":"+e.getValue()));
		}
	}
}
