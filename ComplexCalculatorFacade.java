import java.util.logging.Logger;

public class ComplexCalculatorFacade {
    private final Logger logger;

    public ComplexCalculatorFacade() {
        logger = Logger.getLogger(ComplexCalculatorFacade.class.getName());
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = Calculator.add(a, b);
        logger.info("Adding " + a + " and " + b + " gives " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = Calculator.multiply(a, b);
        logger.info("Multiplying " + a + " and " + b + " gives " + result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        try {
            ComplexNumber result = Calculator.divide(a, b);
            logger.info("Dividing " + a + " by " + b + " gives " + result);
            return result;
        } catch (ArithmeticException e) {
            logger.severe("Division by zero is not allowed");
            return null;
        }
    }
}
