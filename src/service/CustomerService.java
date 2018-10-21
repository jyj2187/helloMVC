package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {

	private Map<String, Customer> customerMap;
	
	private static final CustomerService instance = new CustomerService();

	private CustomerService() {
		customerMap = new HashMap<String, Customer>();
	}
	
	public static CustomerService getInstance() {
		return instance;
	}

	public void addCustomer(Customer customer) {

		customerMap.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id) {

		if (id != null)
			return (customerMap.get(id.toLowerCase()));
		else
			return null;
	}
	
	public Customer login(String id, String password) {
		Customer customer = findCustomer(id);
		if(customerMap.containsKey(id)) {
			if (password != null && customer.getPassword().trim().equals(password))
                return customer;
			else
				return null;
		}
		else return null;
	}
}
