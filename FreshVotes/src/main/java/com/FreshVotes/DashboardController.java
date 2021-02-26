package com.FreshVotes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//this is used for intercepting the HTTP requests made to the application

@Controller
public class DashboardController {

	//this means, listen for a get request on the url "/" (at the root which is currently //localhost:8080)
	//and it will display the word "index"
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String rootView() {
		return "index";
	}
}
