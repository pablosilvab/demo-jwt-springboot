package io.psilvab.demojwtspringboot;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.psilvab.demojwtspringboot.entity.User;
import io.psilvab.demojwtspringboot.repository.UserRepository;

@SpringBootApplication
public class DemoJwtSpringbootApplication {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(101, "user1", "pass1", "user1@gmail.com"),
				new User(102, "user2", "pass2", "user2@gmail.com"),
				new User(103, "user3", "pass3", "user3@gmail.com"),
				new User(104, "user4", "pass4", "user4@gmail.com")).collect(Collectors.toList());

		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoJwtSpringbootApplication.class, args);
	}

}
