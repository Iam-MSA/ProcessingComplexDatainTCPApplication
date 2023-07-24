package model;

import java.io.Serializable;


/**
 * This is the model for customer
 * 
 * @author Mirza Sahid Afridi
 *
 */
public class Customer implements Serializable{

	private int customerId;
	private String name;
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}