package server.controller;

import java.util.ArrayList;
import java.util.List;

import model.Customer;
import model.Product;

public class CustomerDataManager {

	private List<Customer> customers;
	
	/**
	 * This constructor will call Method 1.
	 */
	public CustomerDataManager()
	{
		// create customers
		this.customers = new ArrayList<Customer>();
		this.createCustomer();
	}
	
	
	private List<Customer> createCustomer() {
		
		// 5 Samples data
		int customerId[] = {123456, 789012, 345678, 901234 ,567890};
		String names[] = {"Emily Johnson", "Michael Davis", 
						  "Sophia Lee", "Daniel Martinez",
						  "Olivia Thompson"};
		
		// Adding data into the list
		for(int index = 0; index < 5; index++)
		{
			// insert each customer information
			Customer customer = new Customer();
			customer.setCustomerId(customerId[index]);
			customer.setName(names[index]);
			
			// add to the list
			customers.add(customer);
		}
		
		return customers;
	}
	
	
	/**
	 * @param name: Customer's name
	 * @return
	 */
	public Customer getCustomerByName(String name)
	{
		for (Customer customer:customers) {
			// check the customer name partially
			if(name.equals(customer.getName().substring(0, name.length())))
				return customer;
		}
		
		// Return customer as null if customer's name searched is not found
		Customer noCustomer = new Customer();
		noCustomer.setName(null);
		return noCustomer;
	}
	
	/**
	 *  @param id: Customer Id
	 *  @return
	 */
	
	public Customer getCustomerById(int id) {
		
		// Find a product
		for (Customer customer:customers) {
			
			if (customer.getCustomerId() == id)
				return customer;
		}
		
		// Return product not found
		Customer noCustomer = new Customer();
		noCustomer.setName(null);
		return noCustomer;
		
	}
	
	/**
	 * 
	 * 
	 * @return A list of customers
	 */
	public List<Customer> getCustomerList()
	{
		return customers;
	}
}
