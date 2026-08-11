public class Calculator {
    public double calculator (double a, double b, String op){
        double result = switch (op) {
            case "+" -> a+b;
            case "-" -> a-b;
            case "*" -> a*b;
            case "/" -> {
                if (b == 0){
                    throw new ArithmeticException("b can not be 0");
                }
                yield a/b;
            }
            default -> throw new IllegalStateException("Unexpected value: " + op + " available op: +  -  /  *");
        };
        return Math.round(result * 1000.0) / 1000.0;
    }
}
