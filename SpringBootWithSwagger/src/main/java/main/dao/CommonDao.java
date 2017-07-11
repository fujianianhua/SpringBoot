package main.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class CommonDao {

	 @Autowired
     @Qualifier("primaryJdbcTemplate")
	 private JdbcTemplate jdbcTemplate ;

    public String test1(){
        List<Map<String,Object>> list =jdbcTemplate.queryForList("select * from tsys_user");
        return Arrays.asList(list).toString();
    }
}
