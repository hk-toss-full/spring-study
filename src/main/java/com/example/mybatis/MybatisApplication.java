package com.example.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(MybatisApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace(); // 오류를 출력하여 원인을 파악
		}
	}
}
