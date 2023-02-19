package placement;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer_Service_Controller 
{
	@Autowired(required=true)
	private Customer_Service service;
	@GetMapping("/customerservice")
	public java.util.List<Customer> list()
	{
	return service.listAll();
	}
	@GetMapping("/customerservice/{c_id}")
	public ResponseEntity<Customer> get(@PathVariable Integer c_id)
	{
	try
	{
	Customer cust=service.get(c_id);
	return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}
	catch(NoResultException e)
	{
	return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	}
	}
	@PostMapping("/customerservice")
	public void add(@RequestBody Customer cust)
	{
	service.save(cust);
	}
	@PutMapping("/customerservice/{c_id}")
	public ResponseEntity<?> update(@RequestBody Customer cust, @PathVariable Integer
	c_id)
	{
	Customer existstud=service.get(c_id);
	service.save(existstud);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/customerservice/{c_id}")
	public void delete(@PathVariable Integer c_id)
	{
	service.delete(c_id);
	}
}
