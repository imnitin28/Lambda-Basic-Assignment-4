package production;

import java.util.stream.LongStream;

public class ProductionInRange{
      //Returns production of all numbers in this range of lowerRange and upperRange
      public ProductInRangeInterface productInRangeInterface = (lowerRange,upperRange) -> {
           long result = lowerRange;
           result *= LongStream.rangeClosed(lowerRange + 1, upperRange).reduce(1, (a, b) -> a * b);
           return result;
       };
}
