package org.example.Vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean(name = "MyConfigName")
    public String MyConfigName() {
        return "Sistema de Vendas";
    }
}
