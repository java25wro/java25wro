package com.java25wro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.awt.image.BufferedImage;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    public HttpMessageConverter<BufferedImage> createImageHttpMessageConverter() {
        return new BufferedImageHttpMessageConverter();

    }
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/barcode").allowedOrigins("http://localhost:4200");
                registry.addMapping("/barcode/generate/{barcode}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/barcode/save/{orderID}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/customers").allowedOrigins("http://localhost:4200");
                registry.addMapping("/customers/{id}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/meal").allowedOrigins("http://localhost:4200");
                registry.addMapping("/meal/restaurant/{restaurantId}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/meal/{mealId}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/order").allowedOrigins("http://localhost:4200");
                registry.addMapping("/order/{order_Id}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/restaurants").allowedOrigins("http://localhost:4200");
                registry.addMapping("/restaurants/{name}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/survey").allowedOrigins("http://localhost:4200");
                registry.addMapping("/survey/all").allowedOrigins("http://localhost:4200");
                registry.addMapping("/survey/{surveyid}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/delete/{surveyid}").allowedOrigins("http://localhost:4200");



            }
        };
    }
}
