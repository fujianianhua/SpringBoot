package main.service;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import main.dao.CommonDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class CommonService {
	  	@Autowired
	    @Qualifier("primaryJdbcTemplate")
	    JdbcTemplate jdbcTemplate1;

	    @Autowired
	    @Qualifier("secondaryJdbcTemplate")
	    JdbcTemplate jdbcTemplate2;
		@Autowired
		 private CommonDao commonDao ;
	    public String test1(){
	        return commonDao.test1();
	    }

	    @Bean(name = "primaryJdbcTemplate")
	    public JdbcTemplate primaryJdbcTemplate(@Qualifier("primaryDataSource")DataSource dataSource){
	        return new JdbcTemplate(dataSource);
	    }

	    @Bean(name = "secondaryJdbcTemplate")
	    public JdbcTemplate secondaryJdbcTemplate(@Qualifier("secondaryDataSource")DataSource dataSource){
	    	jdbcTemplate2 = new JdbcTemplate(dataSource);
	    	return jdbcTemplate2;
	    }
}
