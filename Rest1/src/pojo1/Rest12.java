package pojo1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest12 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		 RequestSpecification req = RestAssured.given();//abstraction
	       Response res = req.request(Method.GET,"/api/users/2");
	      Singleuser s1 = res.as(Singleuser.class);
	    Support s = s1.getSupport();
	    System.out.println(s.getText());
	   Data d = s1.getData();
	   System.out.println(d.getAvatar());
	}

}
