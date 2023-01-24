package geektime.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}

	/*
	打包 跳过测试
		mvn clean package -Dmaven.test.skip

	执行
	java -jar helloworld-0.0.1-SNAPSHOT.jar

		前提：
		安装maven
		官网下载地址:http://maven.apache.org/download.cgi

		安装配置
		https://blog.csdn.net/jasnet_u/article/details/81209942
	*/
}

