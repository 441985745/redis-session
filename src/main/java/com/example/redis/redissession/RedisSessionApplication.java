package com.example.redis.redissession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
public class RedisSessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisSessionApplication.class, args);
    }

}
