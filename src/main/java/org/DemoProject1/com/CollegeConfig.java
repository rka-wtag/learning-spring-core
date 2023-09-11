package org.DemoProject1.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.DemoProject1.com")
public class CollegeConfig {
    @Bean
    public College collegeBean(){
        return new College();
    }
}
