package com.elite.puspakom.ibms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EliteIbmsController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br>"
				+ "<div style='text-align:center;'>"
				+ "<h3>IBMS Sample View</h3>"
				+ "This message is coming from EliteIbmsController.java</div>"
				+ "<br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
