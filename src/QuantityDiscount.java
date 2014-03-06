




public class QuantityDiscount implements DiscountStrategy {
     private double discountRate = .10;
     private int minQuantity = 0;

    public QuantityDiscount(double rate, int minQty) {
        setDiscountRate(rate);
        setMinQuantity(minQty);
        
    }
     
    @Override
    public double getDiscountAmt(double unitPrice, int qty) {
      if(qty >= minQuantity) {
            return unitPrice * qty * discountRate;
        } else {
            return 0;
        }
    }

    public final int getMinQty() {
        return minQuantity;
    }

    public final void setMinQuantity(final int minQty) {
        // needs validation
        this.minQuantity = minQty;
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(final double discountRate) {
        // needs validation
        this.discountRate = discountRate;
    }
    
}