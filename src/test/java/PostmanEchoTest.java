import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    public void postRequestTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Это автоматический тест API") // отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Это автоматический тест"));
    }
}