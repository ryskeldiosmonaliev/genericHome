import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Integer> list1 = new Box<>(47);
        System.out.println(Box.generic(list1));
    }
}