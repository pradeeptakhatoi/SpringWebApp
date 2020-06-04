package com.luv2code.spring.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@RequestMapping("/list")
	public String list() {
		return "post/list";
	}

}
