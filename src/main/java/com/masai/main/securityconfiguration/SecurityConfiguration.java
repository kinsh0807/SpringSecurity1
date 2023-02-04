package com.masai.main.securityconfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfiguration {

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/request/app/api/admin/**").authenticated()
                .anyRequest().permitAll()
                .and()
                .httpBasic();
    }

}
