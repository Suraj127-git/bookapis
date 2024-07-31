package com.restapi.bookapis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookapisApplicationTests {

	@Test
	void contextLoads() {
	}

}
//controller -> service(bo logic -> call fn db) -> repo(same fn) -> repo impl(db level query)