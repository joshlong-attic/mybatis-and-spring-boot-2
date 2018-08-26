package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

		@Bean
		ApplicationRunner runner(CarMapper carMapper) {
				return args -> {
						Stream.of("A", "B").forEach(name -> carMapper.insert(new Car(name, 2018, null)));
						carMapper.search("A", 2018).forEach(System.out::println);
				};
		}

		public static void main(String[] args) {
				SpringApplication.run(DemoApplication.class, args);
		}
}

