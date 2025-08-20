package com.tap.model;

public class OrderItem {
	private int orderItemId;
	private int orderId;
	private int menuId;
	private int quantity;
	private double price;
	private double totalAmount;
	
	public OrderItem() {
		
	}
	
		
	public OrderItem(int orderItemId, int orderId, int menuId, int quantity, double price, double totalAmount) {
		super();
		this.orderItemId = orderItemId;
		this.orderId = orderId;
		this.menuId = menuId;
		this.quantity = quantity;
		this.price = price;
		this.totalAmount = totalAmount;
	}


	public OrderItem(int orderId, int menuId, int quantity, double price, double totalAmount) {
		super();
		this.orderId = orderId;
		this.menuId = menuId;
		this.quantity = quantity;
		this.price = price;
		this.totalAmount = totalAmount;
	}

	public OrderItem(int orderItemId, int orderId, int menuId, int quantity, int totalAmount) {
		super();
		this.orderItemId = orderItemId;
		this.orderId = orderId;
		this.menuId = menuId;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}

	public OrderItem(int menuId, int quantity, double price, double totalAmount) {
		// TODO Auto-generated constructor stub
		super();
		this.menuId = menuId;
		this.quantity = quantity;
		this.price = price;
		this.totalAmount = totalAmount;
	}


	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	@Override
	public String toString() {
		return "Order Items [ menu Id: "+ menuId +"Quantity: "+quantity+" Total Amount: "+totalAmount+" ]";
	}
	
}
