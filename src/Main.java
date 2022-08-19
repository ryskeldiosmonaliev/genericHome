import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ArrayList<String>list1 = new ArrayList<>();
        list1.add("Nortan");
        list1.add("Bobi");
        list1.add("robert");
        Box.generic(list);
        Box.generic(list1);
    }
}