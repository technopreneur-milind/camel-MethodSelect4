package com.example.JavaFileCopier;

import java.util.EventObject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.management.event.CamelContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:F:/data/BeanswithCamel1?noop=true").process(new Processor() {
			
			public void process(Exchange exchange) throws Exception {
				exchange.getOut().setBody(1);
			}
		})
		.bean(MyBean.class);
	}	
}