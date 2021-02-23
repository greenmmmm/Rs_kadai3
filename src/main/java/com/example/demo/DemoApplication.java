package com.example.demo;

import org.springframework.boot.SpringApplication;//SpringApplicationクラス
import org.springframework.boot.autoconfigure.SpringBootApplication;//～autoconfigureパッケージのSpringBootApplication型アノテーション

@SpringBootApplication//下記クラスは、SpringBootのアプリケーションクラスである
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
