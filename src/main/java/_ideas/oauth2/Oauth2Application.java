package _ideas.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Oauth2Application {

	public static void main(String[] args) {
		EnvLoader.loadEnv();
		SpringApplication.run(Oauth2Application.class, args);
	}
}
