package production;
@FunctionalInterface
public interface ProductInRangeInterface {
    long productionInRange(Long lower, Long upper);
}
