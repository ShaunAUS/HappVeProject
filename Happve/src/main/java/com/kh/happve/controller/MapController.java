package com.kh.happve.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MapController {

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String map() {
	    return "detail";
	}
	
}

