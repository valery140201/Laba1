/**
 * @autor Бокша Валерия
 * 3 курс, 61 группа
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        System.out.println(arr.get(0));
        System.out.println(arr.get(2));
        arr.remove(0);
        System.out.println(arr.get(0));

    }
}
