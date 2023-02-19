package placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Customer_Service 
{
	@Autowired
	private Customer_Service_Repository repo;
	public List<Customer> listAll()
	{
	return repo.findAll();
	}
	public void save(Customer cust)
	{
	repo.save(cust);
	}
	public Customer get(Integer c_id)
	{
	return repo.findById(c_id).get();
	}
	public void delete(Integer c_id)
	{
	repo.deleteById(c_id);
	}

}
