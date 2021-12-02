import java.util.function.BiFunction;
import java.util.function.Function;

public class MainClass {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> max=(n1,n2) -> n1>=n2? n1:n2;
        System.out.println(max.apply(10,15));
    }
}

