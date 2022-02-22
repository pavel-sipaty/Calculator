import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    private int precision;

    public Calculator(int precision) {
        if(precision >= 0) {
            this.precision = precision;
        }else {
            throw new IllegalArgumentException("Precision can't be < 0!");
        }
    }

    public double add(double a, double b) {
        double result;
        double result1 = a + b;

        try {
            result = a + b;
            BigDecimal bd = new BigDecimal(Double.toString(result)).setScale(precision, RoundingMode.HALF_UP);
            result1 = bd.doubleValue();
        } catch (NumberFormatException e) {
            System.out.println("Wrong input!");
            e.printStackTrace();
        }
        return result1;
    }

    public double subtract(double a, double b) {
        double result;
        double result1 = a - b;

        try {
            result = a - b;
            BigDecimal bd = new BigDecimal(Double.toString(result)).setScale(precision, RoundingMode.HALF_UP);
            result1 = bd.doubleValue();
        } catch (NumberFormatException e) {
            System.out.println("Wrong input!");
            e.printStackTrace();

        }

        return result1;
    }

    public double multiply(double a, double b) {
        double result;
        double result1 = a * b;

        try {
            result = a * b;
            BigDecimal bd = new BigDecimal(Double.toString(result)).setScale(precision, RoundingMode.HALF_UP);
            result1 = bd.doubleValue();
        } catch (NumberFormatException e) {
            System.out.println("Wrong input!");
            e.printStackTrace();
        }
        return result1;
    }

    public double divide(double a, double b) {
        double result;
        double result1 = 0;

        try {
            result = a / b;
            BigDecimal bd = new BigDecimal(Double.toString(result)).setScale(precision, RoundingMode.HALF_UP);
            result1 = bd.doubleValue();
        } catch (NumberFormatException e) {
            System.out.println("Division by 0 is forbidden!");
            e.printStackTrace();
        }
        return result1;
    }
}
