package interest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class interest_test {

	@Test
	public void test() {
		interest i=new interest();
		Assert.assertEquals(i.simple_interest(1000,2,2),40.0, 0.2);
		Assert.assertEquals(i.comp_interest(1000,200,2),9000,0.2);
		Assert.
	}

}
