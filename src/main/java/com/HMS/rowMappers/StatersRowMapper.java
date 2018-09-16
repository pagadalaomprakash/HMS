package com.HMS.rowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.HMS.POJO.Staters;

public class StatersRowMapper implements RowMapper<Staters> {

	public Staters mapRow(ResultSet arg0, int arg1) throws SQLException {
		Staters staters = new Staters();
		staters.setStaterName("");
		staters.setStaterPrice("");
		staters.setStaterType("");
		return null;
	}
	

}
