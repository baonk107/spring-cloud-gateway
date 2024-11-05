package com.example.springcloudgateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author it.Baonk
 * created on 30/10/2024
 */
@Configuration
public class BookRouteConfig {
//    @Bean
//    public RouteLocator bookRouteService(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("book-service", r -> r.path("/api/book/**")
//                        .filters(f -> f.stripPrefix(1))
//                        .uri("http://localhost:8081/")
//                )
//                .build();
//    }
}
