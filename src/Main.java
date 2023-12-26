import list.MyArrayList;
import list.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        list.add("2");
        list.add("30");
        list.add("20");
        list.add("ggr");
        System.out.println(list.get(1));
        list.delete(0);
        System.out.println(list);


    }
}