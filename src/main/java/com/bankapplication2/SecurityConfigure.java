package com.bankapplication2;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

public class SecurityConfigure extends WebSecurityConfigurerAdapter
{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/balance").authenticated()
		.antMatchers("/home").permitAll()
		.antMatchers("/contact").permitAll()
		.antMatchers("/about").permitAll()
		.and().formLogin()
		.and().httpBasic();

}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub

		auth.inMemoryAuthentication()
		    .withUser("sravs").password("kompelly").authorities("admin").and()
		    .withUser("akhi").password("battu").authorities("user").and()
		    .withUser("surti").password("mega").authorities("user").and().passwordEncoder(NoOpPasswordEncoder.getInstance());
		    
		    

	}


}
