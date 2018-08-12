package com.springboot.spring;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app= new SpringApplication(Application.class);
//		app.addInitializers(new MyApplicationContextInitializer());
		ConfigurableApplicationContext context = app.run("aa","dd");
		ApplicationArguments arg = context.getBean(ApplicationArguments.class);
		System.out.println(arg.getSourceArgs().length);
		System.out.println(arg.getOptionNames());
		System.out.println(arg.getOptionValues("myname"));

//				syso


		context.close();
	}
}
