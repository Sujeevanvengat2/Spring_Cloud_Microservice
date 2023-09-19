package com.learn.microservices.limitsservice.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservices.limitsservice.configuration.Configuration;
import com.learn.microservices.limitsservice.controler.bean.Limits;

//@EnableConfigurationProperties(Configuration.class)
@RestController
@EnableConfigurationProperties(Configuration.class)
public class LimitsControler {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimts() {
//		return new Limits(1,1000);
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
	
}
