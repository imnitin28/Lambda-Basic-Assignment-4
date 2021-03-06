package production.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import production.ProductionInRange;

public class ProductInRangeTest {
    @Test
    public void productInRangeTest()
    {
        ProductionInRange productionInRange = new ProductionInRange();
        long output1 = productionInRange.productInRangeInterface.productionInRange(0L,1L);
        Assert.assertEquals(output1,0L);

        long output2 = productionInRange.productInRangeInterface.productionInRange(2L,2L);
        Assert.assertEquals(output2,2L);

        long output3 = productionInRange.productInRangeInterface.productionInRange(1L,4L);
        Assert.assertEquals(output3,24L);

        long output4 = productionInRange.productInRangeInterface.productionInRange(5L,15L);
        Assert.assertEquals(output4,54486432000L);
    }
}
