package edu.bit.oms.model;

public class Order {
	private static Integer idCounter = 1;
	private final Integer id;
	private final String productName;
	private final Integer quantity;
	private final Double price;
	
	public Order(String productName, Integer quantity, Double price) {
		this.id = idCounter++;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Double getTotal() {
		return this.price * this.quantity;
	}

	public Integer getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}
}