package com.simplilearnphase3.Sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearnphase3.Sportyshoes.model.Product;
import com.simplilearnphase3.Sportyshoes.service.ProductService;

@Controller
public class HomeController {
	
    @Autowired
	private ProductService productService;
	
    @GetMapping("/")
    public String home(Model model) {
    	List<Product> products = productService.findAll();
		model.addAttribute("products", products);
        return "home";
    }
    
	@GetMapping("/home")
	public String viewProducts(Model model) {
		List<Product> products = productService.findAll();
		model.addAttribute("products", products);
		return "home"; 
	}
	


	@GetMapping("/login")
	public String login() {
		return "login"; 
	}
    
	
	@GetMapping("/logout")
	public String logout() {
		return "logout"; 
	}


}