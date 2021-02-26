package com.FreshVotes.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
//	@RequestMapping(value="/login", method=RequestMethod.GET)
	@GetMapping(value="/login") //this annotation is equivalent to the one above
	public String login() {
		return "login";
	}

}
