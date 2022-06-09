package mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNewApplication.class, args);
		System.out.println("Yes!! The program's working");
	}

}
