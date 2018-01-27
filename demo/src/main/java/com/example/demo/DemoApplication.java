package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.BookBean;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
	String index() {
		BookBean book = new BookBean();
		book.setAuthor("caoxueqing");
		book.setName("hongloumeng");
		book.setPrice("99.99");
		return "The Book Author is " + book.getAuthor() + "and Name is " + book.getName() + "and Price is"
				+ book.getPrice();
	}
}
