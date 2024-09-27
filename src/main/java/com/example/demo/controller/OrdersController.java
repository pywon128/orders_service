package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.OrdersDAO;
import com.example.demo.entity.Orders;

@Controller
public class OrdersController {
	@Autowired
	private OrdersDAO dao;
	
	@GetMapping("/orders/list")
	@ResponseBody
	public List<Orders> list(){
		return dao.findAll();
	}
	
	@PostMapping("/orders/insert")
	public String insertSubmit(Orders orders) {
		dao.save(orders);
		return "redirect:/orders/list";
	}
}
