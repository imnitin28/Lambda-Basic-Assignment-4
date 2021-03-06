package production;
public class DriverMain {
    public static void main(String[] args) {
        ProductionInRange productionInRange = new ProductionInRange();
        long lowerRangeLimit = 5;
        long upperRangeLimit = 15;
        long productResult = productionInRange.productInRangeInterface.productionInRange(lowerRangeLimit,upperRangeLimit);
        System.out.println(productResult);
    }
}
