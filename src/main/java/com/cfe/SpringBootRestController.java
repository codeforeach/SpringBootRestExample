package com.cfe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootRestController {

	@RequestMapping("/hello")
	public String createDefect() throws Exception {
		return "Hello from CodeForEach";
	}
}
