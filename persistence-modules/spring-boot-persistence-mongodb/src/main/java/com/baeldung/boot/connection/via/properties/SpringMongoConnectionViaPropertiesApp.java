package com.baeldung.boot.connection.via.properties;

import com.baeldung.boot.connection.via.client.SpringMongoConnectionViaClientApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:connection.via.properties/application.properties")
@SpringBootApplication(exclude={EmbeddedMongoAutoConfiguration.class})
public class SpringMongoConnectionViaPropertiesApp {

    public static void main(String... args) {
//        SpringApplication.run(SpringMongoConnectionViaPropertiesApp.class, args);

        SpringApplicationBuilder app = new SpringApplicationBuilder(SpringMongoConnectionViaPropertiesApp.class);
        app.web(WebApplicationType.NONE);
        app.run(args);
    }
}