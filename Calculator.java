public class Calculator {

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getReal() + b.getReal();
        double imaginaryPart = a.getImaginary() + b.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginaryPart = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double divisor = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double realPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / divisor;
        double imaginaryPart = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / divisor;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
