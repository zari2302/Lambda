import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Double> sqrt = x-> Math.sqrt(x);
        double number = 8.0;
        double summa = sqrt.apply(number);
        System.out.println(summa);
    }
}