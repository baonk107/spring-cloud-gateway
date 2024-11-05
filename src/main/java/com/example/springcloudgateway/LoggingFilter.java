package com.example.springcloudgateway;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;

import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.*;

/**
 * @author it.Baonk
 * created on 30/10/2024
 */
@Component
public class LoggingFilter implements GlobalFilter, Ordered {
    Log log = LogFactory.getLog(getClass());

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        Set<URI> originalUris = exchange.getAttribute(GATEWAY_ORIGINAL_REQUEST_URL_ATTR);
        URI originalRequestUris = exchange.getRequest().getURI();
        if (originalRequestUris != null) {
            Route route = exchange.getAttribute(GATEWAY_ROUTE_ATTR);

            log.info("Incoming request " + originalRequestUris + " is routed to id: " + route.getId()
                    + ", uri:" + route.getUri() + ", route: " + route);
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
