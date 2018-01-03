package com.spring.oauth2.cloud.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@EnableResourceServer
public class SampleController {
	
	@RequestMapping("/greet")
    public String saludo(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello " + name;
    }
	
//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//        	.authorizeRequests()
//	        .antMatchers("/login").permitAll()
//	        .antMatchers("/oauth/token").permitAll()
//	//        .antMatchers("/greet").permitAll()
//	        .anyRequest().authenticated()
//	        .and()
//	        .sessionManagement()
//	        .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//	        .maximumSessions(1);
//	}

//	@Override
//	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//		resources.resourceId("Semple");
//		resources.tokenStore(tokenStore());
//	}
//
//	@Bean
//	public TokenStore tokenStore() {
//		return new InMemoryTokenStore();
//	}
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) {
//		auth.authenticationProvider(authenticationProvider());
//	}

//	@Bean
//	public AuthenticationProvider authenticationProvider() {
//		return new UserProvider(tokenServices);
//	}
}