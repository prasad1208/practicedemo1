package pojo2;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest12 {

	public static void main(String[] args) {
      
		RestAssured.baseURI="https://reqres.in/";
		 RequestSpecification req = RestAssured.given();//abstraction
	       Response res = req.request(Method.GET,"/api/users?page=2");
	       list_user s1 = res.as(list_user.class);	
	       System.out.println(s1.getPage());
	       System.out.println(s1.getSupport().getText());
	       List<Data> d = s1.getData();
	       for(Data l1:d)
	       {
	    	   System.out.println(l1.getFirst_name());
	    	  
	       }
	

	}
}
