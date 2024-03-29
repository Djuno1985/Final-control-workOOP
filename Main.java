public class Main {
    public static void main(String[] args) {
        ComplexCalculatorFacade complexCalculator = new ComplexCalculatorFacade();
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, 5);

        complexCalculator.add(num1, num2);
        complexCalculator.multiply(num1, num2);
        complexCalculator.divide(num1, num2);
    }
}
