package lab1546;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class lightbulbTest {
	
	lightbulb l;

	@Before
	public void setUp() throws Exception {
		l=new lightbulb(100);
	}

	@Test
	public void testGetBulbWattage() {
		assertEquals(l.getBulbWattage(),100);
	}

}
