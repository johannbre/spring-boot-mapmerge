package pl.poznachowski.mergedmapproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MergedMapPropertiesApplication implements CommandLineRunner {

	@Autowired
	TestProperties testProperties;

	public static void main(String[] args) {
		SpringApplication.run(MergedMapPropertiesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(testProperties.getMap());
		System.out.println("-----");
		System.out.println(testProperties.getMapOfMap());
		System.out.println("-----");
	}
}