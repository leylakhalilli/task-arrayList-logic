import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.index(i));
        }
    }
}
