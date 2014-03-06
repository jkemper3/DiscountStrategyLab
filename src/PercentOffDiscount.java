





public class PercentOffDiscount implements DiscountStrategy{

    private double discountRate = .10;
    
    
    public PercentOffDiscount(double rate) {
        setDiscountRate(rate);
    }
     
    @Override
    public final double getDiscountAmt(double unitPrice, int qty) {
        
    return unitPrice * qty * discountRate;
    
    }

    @Override
    public final double getDiscountRate() {
    return discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        if (discountRate < .10){
            System.out.println("Discount can't be less than 10%");
        }else{
       this.discountRate = discountRate;
    }
    }
    
}
