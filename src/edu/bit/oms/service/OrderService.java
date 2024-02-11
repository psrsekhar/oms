package edu.bit.oms.service;

import java.util.ArrayList;

import edu.bit.oms.model.Order;

public class OrderService {
	private final ArrayList<Order> orders;
	
	public OrderService() {
		orders = new ArrayList<Order>();
	}
	
	public boolean add(Order order) {
		boolean isAdded = false;
		orders.add(order);
		isAdded = true;
		return isAdded;
	}
	
	public ArrayList<Order> getAllOrders(){
		return orders;
	}
}