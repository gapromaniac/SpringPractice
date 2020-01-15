package com.wtw.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrintEmailController {
	
	@GetMapping("/printandsend")
	public ModelAndView printSend(@RequestParam("email") String email, @RequestParam("format") String printFormat)
	{
		ModelAndView mv = new ModelAndView("result.jsp");
		
		mv.addObject("output", "Email Sent");
		
		return mv;
	}

}
