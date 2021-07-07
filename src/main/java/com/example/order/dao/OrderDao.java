package com.example.order.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

	public List<Order> getOrderDetails() {

		return Stream
				.of(new Order(101, "Samik", 1, 30000), new Order(102, "Samrat", 2, 50000),
						new Order(103, "Snehasish", 3, 9087), new Order(104, "Alok", 4, 430000))
				.collect(Collectors.toList());

	}

}
