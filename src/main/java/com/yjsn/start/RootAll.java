/**
 * 
 */
package com.yjsn.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** 
 * @author liuyang 
 * @Function 
 * @since JDK 1.7 
 * @date: 2017年5月15日 下午7:21:29
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.zx")
public class RootAll {
	public static void main(String[] args) {
		SpringApplication.run(RootAll.class, args);
	}
}
