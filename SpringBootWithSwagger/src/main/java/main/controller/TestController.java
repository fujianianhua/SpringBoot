package main.controller;


import main.service.CommonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

/**
 */   
@RestController
@RequestMapping("/home")
public class TestController {
@Autowired
private CommonService commonService ;
    @RequestMapping("/getuser")
    public String getuser(){
    	String result ="123";
    	result=commonService.test1();
    	return result;
    }
       
   

}