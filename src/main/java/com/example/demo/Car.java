package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
	* @author <a href="mailto:josh@joshlong.com">Josh Long</a>
	*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
		private String model;
		private int year;
		private Long id;
}
