/**
 * @autor Бокша Валерия
 * 3 курс, 61 группа
 * @version 1.0
 * класс реализации ArrayList
 */
import java.util.Arrays;

public class ArrayList {
    /** Поле последнего индекса */
    private int lastIndex = 0;

    /** Поле начальной длины */
    private static final int SIZE = 0;

    /** Массив размера SIZE */
    private int[] array = new int[SIZE];

    /**
     * @param newElement - некоторый целочисленный элемент
     * Увеличивает размер массива на 1
     * Помещает newElement в новый элемент массива
     */
    public void add(int newElement) {
        array = Arrays.copyOf(array, array.length + 1);
        array[lastIndex++] = newElement;
    }

    /**
     * Getter-метод
     * @param index - некоторое целочисленное значение
     * @return элемент массива с индексом, указанным в параметрах
     * @throws IndexOutOfBoundsException если не существует такого индекса
     */
    int get(int index) {
        if (index > lastIndex)
            throw new IndexOutOfBoundsException();
        return array[index];
    }

    /**
     * Getter-метод
     * @param index - некоторое целочисленное значение
     * Удаляет элемент с индексом, указанным в параметрах
     * @throws IndexOutOfBoundsException если не существует такого индекса
     */
    void remove(int index) {
        if (index > lastIndex)
            throw new IndexOutOfBoundsException();
        else
            System.arraycopy(array, index + 1, array, index, --lastIndex - index);
        lastIndex--;
    }
}
