import static org.junit.Assert.*;

import org.junit.Test;

public class CostEstimatorTest {

	@Test
	public void testCostEstimator() {
		CostEstimator ce = new CostEstimator();
		assertEquals(18000,ce.costEstimator(15, "standard"),18000-ce.costEstimator(15, "standard"));
		assertEquals(37500,ce.costEstimator(25, "abovestandard"),1800-ce.costEstimator(25, "abovestandard"));
		assertEquals(405000,ce.costEstimator(225, "highstandard"),405000-ce.costEstimator(225,"highstandard"));
		assertEquals(575000,ce.costEstimator(230, "automated"),575000-ce.costEstimator(230, "automated"));
	}

}
