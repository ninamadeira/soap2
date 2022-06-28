package com.ninamadeira.client;

import com.ninamadeira.CustomerDetail;
import com.ninamadeira.CustomerPort;
import com.ninamadeira.CustomerPortService;
import com.ninamadeira.GetCustomerDetailRequest;
import com.ninamadeira.GetCustomerDetailResponse;
import com.ninamadeira.InsertCustomerRequest;
import com.ninamadeira.InsertCustomerResponse;

public class ClientTest {
	  public static void main(String[] args) {

	        CustomerPortService service = new CustomerPortService();

	        CustomerPort port = service.getCustomerPortSoap11();

	        GetCustomerDetailRequest customerDetailRequest = new GetCustomerDetailRequest();
	        customerDetailRequest.setId(1);

	        GetCustomerDetailResponse customerDetailResponse  = port.getCustomerDetail(customerDetailRequest);

	        System.out.println("id -> " + customerDetailResponse.getCustomerDetail().getId());
	        System.out.println("name -> " + customerDetailResponse.getCustomerDetail().getName());
	        System.out.println("email -> " + customerDetailResponse.getCustomerDetail().getEmail());
	        System.out.println("phone -> " + customerDetailResponse.getCustomerDetail().getPhone());
	        
	        CustomerDetail customerDetail = new CustomerDetail();
	        customerDetail.setName("Piaf");
	        customerDetail.setEmail("piaf@gmail.com");
	        customerDetail.setPhone("666999");
	        InsertCustomerRequest insertCustomerRequest = new InsertCustomerRequest();
	        insertCustomerRequest.setCustomerDetail(customerDetail);
	        
	        InsertCustomerResponse insertCustomerResponse = port.insertCustomer(insertCustomerRequest); 
	        System.out.println(insertCustomerResponse.getStatus());

	    }

}
