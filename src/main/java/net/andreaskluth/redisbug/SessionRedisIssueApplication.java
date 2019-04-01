package net.andreaskluth.redisbug;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Hooks;
import reactor.core.publisher.Mono;
import redis.embedded.RedisServer;

@SpringBootApplication
public class SessionRedisIssueApplication {

  public static void main(String[] args) throws IOException {
    Hooks.onOperatorDebug();
    RedisServer redisServer = new RedisServer(6379);
    redisServer.start();

    SpringApplication.run(SessionRedisIssueApplication.class, args);
  }

  @RestController
  public static class HelloController {

    @GetMapping("/")
    public Mono<String> index() {
      return Mono.just("Hello World");
    }
  }
}
