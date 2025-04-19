package horario.basura;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "horario.basura")
public class BasuraApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasuraApplication.class, args);
	}
}
