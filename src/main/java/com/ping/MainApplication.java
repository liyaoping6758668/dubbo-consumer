package com.ping;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ping.service.OrderService;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		System.out.println(applicationContext);
		OrderService orderService = (OrderService) applicationContext.getBean("orderServiceImpl");
		System.out.println(orderService);
		/*orderService.initOrder("1");
		System.out.println("调用完成");
		System.in.read();*/
		
	}
}
