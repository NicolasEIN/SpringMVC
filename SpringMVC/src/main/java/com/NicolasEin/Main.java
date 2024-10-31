package com.NicolasEin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Special annotation that enables tree features: springbootConfiguration, Auto-Configuration and components to be used. 
//those features defines default configurations for you spring boot projects. 
@SpringBootApplication 


public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args); //function to run springboot applications
    }
}
