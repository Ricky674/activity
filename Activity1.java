package activity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
 
class Activity1 {
 
	@Test
	void test() {
		//fail("Not yet implemented");
		Activity i=new Activity();
		int[] arr= {10,20};
		Assertions.assertEquals(20, i.SI(10, 10, 10));
		Assertions.assertEquals(10, i.dis(10));
		Assertions.assertEquals(10, i.minval(arr));
		
	}
 
}