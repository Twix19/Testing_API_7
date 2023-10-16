package org.example.courier;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class LoginCourierAPI {
    private static final String BAZE_URL = "https://qa-scooter.praktikum-services.ru";
    private static final String COURIER_PATH = "/api/v1/courier/login";
    Courier courier = new Courier("ninja", "1234", "saske");

    public Response sendAvtorizationDates(String parameterClass){
        return RestAssured.given()
                .contentType(io.restassured.http.ContentType.JSON)
                .baseUri(BAZE_URL)
                .body(parameterClass)
                .when()
                .post(COURIER_PATH);
    }
    public Response sendAvtorizationWrongData() {
       return RestAssured.given()
                .contentType("application/json")
                .body(courier)
                .when()
                .post(BAZE_URL +  COURIER_PATH);
    }

}
