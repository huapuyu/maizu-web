package com.anders.maizu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/helloWorld.do")
	public ModelAndView helloWorld() {
		ModelAndView modelAndView = new ModelAndView("helloWorld");
		List<String> list = new ArrayList<String>();
		list.add("zhuzhen");
		list.add("guolili");
		modelAndView.addObject("list", list);
		return modelAndView;
	}
}
