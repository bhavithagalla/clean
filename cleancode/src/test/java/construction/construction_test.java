package construction;

import org.junit.Assert;
import org.junit.Test;

public class construction_test {

	@Test
	public void test() {
		construction c=new construction();
		Assert.assertEquals(12000.0,c.cost('s',10, 'n'), 0.1);
	}

}
