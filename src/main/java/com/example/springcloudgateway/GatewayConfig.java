package com.example.springcloudgateway;

import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.http.HttpStatus;

/**
 * @author it.Baonk
 * created on 30/10/2024
 */
@Configuration
public class GatewayConfig {
//    @Bean
//    public LettuceConnectionFactory redisConnectionFactory() {
//        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("localhost", 6379));
//    }
//
//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("book-service", r -> r.path("/api/book/**")
//                        .filters(f -> f.stripPrefix(1))
//                        .uri("http://localhost:8081/")
//                )
//                .route("film-service", r -> r
//                        .path("/api/film/**")
//                        .filters(f -> f.requestRateLimiter(c -> c.setRateLimiter(redisRateLimiter()).setStatusCode(HttpStatus.TOO_MANY_REQUESTS))
//                                .stripPrefix(1)
//                        )
//                        .uri("http://localhost:8082/")
//                )
//                .build();
//    }
//
//    @Bean
//    public RedisRateLimiter redisRateLimiter() {
//        return new RedisRateLimiter(100, 300);
//    }
}
