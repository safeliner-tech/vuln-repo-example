package testcode.sqli;

import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import java.sql.*;
import java.util.ArrayList;


// some new change
public class TestSqli {

    public void select_users(JdbcTemplate jdbcTemplate, String input) throws DataAccessException {
        String sql ="select * from Users where name = '"+input+"'";
        make_query(jdbcTemplate, sql);
    }














    public void make_query(JdbcTemplate jdbcTemplate, String query) throws DataAccessException {
        // ruleid:spring-sqli
        jdbcTemplate.execute(query);
    }

}