package com.carlos.repository;

import org.springframework.data.repository.CrudRepository;

import com.carlos.entity.Purchase;

public interface PurchaseRepository  extends CrudRepository<Purchase, Long>{

	public Purchase findByCustomerIdAndEmployeeId(Long customerId, Long employeeId );
	//public Purchase findByCustomer_IdAndEmployee_Id(Customer customer, Employee employee ); TODO

}
