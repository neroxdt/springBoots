/**
 * 
 */
package com.spring.oauth2.cloud.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.web.filter.GenericFilterBean;

/**
 * @author victor.h.rodriguez
 *
 */
public class CustomFilter extends GenericFilterBean {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("--------------...........---------->>>>> ENTRO AL FILTRO <<<<--------------...........----------");
		for(String key :request.getParameterMap().keySet()) {
			System.out.println("----> PARAM: " + key + " VALUE: " + request.getParameterMap().get(key)[0]);
			
		}
		chain.doFilter(request, response);
	}
}
