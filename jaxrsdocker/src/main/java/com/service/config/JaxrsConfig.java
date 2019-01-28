package com.service.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.service.ProductService;

@Component
public class JaxrsConfig extends ResourceConfig {
	public JaxrsConfig() {
		register(ProductService.class);
	}
}
