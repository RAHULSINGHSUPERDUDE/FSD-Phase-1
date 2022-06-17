
public class Calculator {

    public static void main(String[] args) {
	CalculatorService calService = new CalculatorService();

		double sumResult = calService.CalculatorSum(5.5,8.5);
		int divideResult = calService.CalculatorDivide(8,2);
	System.out.println("Printing Calculator sum   " + sumResult );
	System.out.println("Printing Calculator divide   " + divideResult );
    }
}

