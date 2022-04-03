import java.time.LocalDateTime;
import java.util.function.Supplier;
public class Main {
    static Supplier<Calculator> instance = Calculator::new;
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);
        int b = calc.minus.apply(2,-2);
        calc.println.accept(b);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}
