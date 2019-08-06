package com.expig.jobapplicationlistener;

import com.expig.jobapplicationlistener.model.ApplicationState;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.expig.jobapplicationlistener.model.ApplicationState.APPLIED;

@SpringBootApplication
public class JobApplicationListener {

	public static void main(String[] args) {
		SpringApplication.run(JobApplicationListener.class, args);
		System.out.println("LamaQueen");
		System.out.println(APPLIED.getDisplayName());
		System.out.println(APPLIED.toString());
	}

}
