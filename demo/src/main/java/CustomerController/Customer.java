package CustomerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CustomerService.Servicecustomer;
import Model.CustomeDetail;

@RestController
public class Customer 
{
	@Autowired
	private Servicecustomer servicecustomer;
	@RequestMapping("/customer")
	public CustomeDetail getAllcustomerDetail()
	{
		return servicecustomer.CreditScore();
	}

}
