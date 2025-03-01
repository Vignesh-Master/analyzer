package com.student.analyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.student.analyzer")
public class StudentAnalyzerApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentAnalyzerApplication.class, args);
	}
}