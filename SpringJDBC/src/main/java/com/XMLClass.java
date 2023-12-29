package com;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class XMLClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
//		jdbcTemplate.execute("create table student(id int,name varchar(25),age int)");
//		jdbcTemplate.execute("insert into student values (1,'vinay',22),(2,'sai',22),(3,'virat',26),(4,'ram',24)");
//		jdbcTemplate.update("update student set name='sunny' where id=4");
//	    jdbcTemplate.query("select * from student", new StudentRowMapper());
		
//		Object[] obj = {1,2};
//		List<Student> list = jdbcTemplate.query("select * from student where id in (?,?)",new StudentRowMapper2(),obj );
//		System.out.println(list);
//		for(Object i : list) System.out.println(i);
		
//		Object[] obj = {5,"ram",23};
//		int NoOfRowsAffected = jdbcTemplate.update("insert into student values (?,?,?)",obj);
//		System.out.println(NoOfRowsAffected);
		
		Object[] obj = {4};
		int NoOfRowsAffected = jdbcTemplate.update("delete from student where id = ?",obj);
		System.out.println(NoOfRowsAffected);
	}
}
