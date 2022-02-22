package com.eventoapp.eventoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller					//
public class IndexController {
		
		@RequestMapping("/")				//quando chamar index() ele redireciona pra essa requição
		public String index() {
			return "index";
		}
}
