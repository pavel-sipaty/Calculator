public class Run {
    public static void main(String[] args) {

        Calculator calc = new Calculator(2);

        System.out.println(calc.add(3,5));
        System.out.println(calc.add(-3, 4));
        System.out.println(calc.divide(3, 0));
        System.out.println(calc.divide(3,5));
        System.out.println(calc.divide(-342, 234));
        System.out.println(calc.multiply(3,5));
        System.out.println(calc.multiply(3.3, 45));
        System.out.println(calc.subtract(4.353, 1.53));
    }
}
