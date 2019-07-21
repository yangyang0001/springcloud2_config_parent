package com.inspur.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: YANG
 * Date: 2019/7/20-17:56
 * Description: No Description
 */
@RestController
@RefreshScope
public class TestController {

	@Value("${test.projectName}")
	private String testProjectName;

	@RequestMapping("/getTestProjectName")
	public String getTestProjectName() {
		return testProjectName;
	}
}
