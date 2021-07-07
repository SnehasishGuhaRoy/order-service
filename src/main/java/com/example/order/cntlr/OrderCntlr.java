package com.example.order.cntlr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.dao.Order;
import com.example.order.dao.OrderDao;

@RestController
public class OrderCntlr {

	@Autowired
	private OrderDao dao;
	@RequestMapping(path = "/orders",produces = "application/json")
	public List<Order> getOrderDetails() {
		return dao.getOrderDetails();
	}

}
