package edu.bit.oms;

import java.util.ArrayList;
import java.util.Scanner;

import edu.bit.oms.model.Order;
import edu.bit.oms.service.OrderService;

public class Amazon {
	private static Integer choice = 0;
	private static OrderService orderService = new OrderService();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			showMenu();
		}
	}

	private static void showMenu() {
		System.out.println("1.Add Order\n2.View Orders\n3.Exit");
		readUserChoice();
	}

	private static void readUserChoice() {
		System.out.print("enter your choice: ");
		choice = sc.nextInt();
		performOperations();
	}

	private static void performOperations() {
		switch (choice) {
		case 1:
			addOrder();
			break;
		case 2: 
			getOrders();
			break;
		case 3:
			System.out.println("Terminating the program.");
			System.exit(0);
		default:
			System.out.println("Invalid choice.");
			break;
		}
	}
	
	private static void addOrder() {
		System.out.print("Enter quantity: ");
		Integer quantity = sc.nextInt();
		System.out.print("Enter price: ");
		Double price = sc.nextDouble();
		System.out.print("Enter product name: ");
		String name = sc.next();
		
		Order order = new Order(name, quantity, price);
		if(orderService.add(order)) {
			System.out.println("Order added...");
		}else {
			System.err.println("Failed to add order.");
		}
	}
	
	private static void getOrders() {
		ArrayList<Order> orderList = orderService.getAllOrders();
		for(Order order: orderList) {
			System.out.println("Order ID: " + order.getId() + "\tProduct: " + order.getProductName()+ "\tQuantity: " + order.getQuantity()+"\tTotal Price: " + order.getTotal());
		}
	}
}