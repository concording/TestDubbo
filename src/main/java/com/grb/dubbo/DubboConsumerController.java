package com.grb.dubbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.grb.indonesia.api.UserExporterService;

@RestController
public class DubboConsumerController {

	@Reference(version="1.0.0")
	private UserExporterService userService;

	 @RequestMapping(value="/test", method = RequestMethod.GET)
	public void echo(){
		 userService.echo();
         System.out.println("hello world");
    }
}
