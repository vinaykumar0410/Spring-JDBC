package com;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

// for result set
public class StudentRowMapper implements ResultSetExtractor<Student> {

	@Override
	public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		while(rs.next()) System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		return null;
	}
	
}
