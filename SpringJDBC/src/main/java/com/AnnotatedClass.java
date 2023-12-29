package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AnnotatedClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		int NoOfRowsAffected = jdbcTemplate.update("insert into student values (6,'sunny',23)");
		System.out.println(NoOfRowsAffected);
	}
}
