package de.fraunhofer.iosb.ast.Remote.Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RemoteConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoteConfigurationApplication.class, args);
	}

}
