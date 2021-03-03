package testcases;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class GetUserAPI {
	
	
	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api/users";
	}
	
	@Title(value = "Check the status code")
	@Test
	public void checkStatCode() {
		Response httpResponse = SerenityRest.given().when().get("2");
		httpResponse.then().statusCode(200);
	}
	
	@Title(value = "To print the response on the console")
	@Test
	public void responseTest() {
		Response httpResponse = SerenityRest.given().when().get("2");
		httpResponse.prettyPrint();
	}

}
