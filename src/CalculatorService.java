

public class CalculatorService{

    public int CalculatorSum(int i, int j) {
    	System.out.println("calling CalculatorSum(int i, int j)" );

        int sum = i + j;
        return sum;
    }

     public int CalculatorDivide(int i, int j){
     	System.out.println("calling CalculatorDivide(int i, int j)" );

         int div = i/j;
         return  div;
        }

	public double CalculatorSum(double d, double e) {
     	System.out.println("calling CalculatorSum(double i, double j)" );

		double sum = d + e;
        return sum;
	
	}
	
	

}







