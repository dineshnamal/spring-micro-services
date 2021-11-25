package com.customerservice.api;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.customerservice.entity.CustomerEntity;
import com.customerservice.model.Customer;
import com.customerservice.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CustomerApiDelegateImpl implements CustomerApiDelegate {

	private final CustomerRepository customerRepository;
	private final ModelMapper modelMapper;

	@Override
	public ResponseEntity<Void> addCustomer(Customer customer) {
		try {
			customerRepository.save(convertToEntity(customer));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception eX) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<List<Customer>> getAllCustomers() {
		return ResponseEntity
				.ok(customerRepository.findAll().stream().map(this::concertToDTO).collect(Collectors.toList()));
	}

	private CustomerEntity convertToEntity(Customer customer) {
		return modelMapper.map(customer, CustomerEntity.class);
	}

	private Customer concertToDTO(CustomerEntity customerEntity) {
		return modelMapper.map(customerEntity, Customer.class);
	}
}
