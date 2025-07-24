package project_security;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectOneSecurityApplicationTests {
	
	

	@Test
	void contextLoads() {
	}

	
	@Test
	public void checkaddnumber() {
		ProjectOneSecurityApplication x = new ProjectOneSecurityApplication();
		int addnumers = x.addnumers(2, 3);
		
		assertEquals(5, addnumers);
		
	}
}
