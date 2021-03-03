
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayListTest {

    ArrayList arr;

    @BeforeEach
    public void RefreshArrayList() {
        arr = new ArrayList();
    }

    @Test
    public void ArrayListAdditionGetting() {
        int expectedValue = 0;
        arr.add(0);
        Assertions.assertEquals(expectedValue, arr.get(0));
    }
    @Test
    public void ArrayListAdditionGettingOverDefaultCountOfIndexes() {
        int expectedValue = 2;
        arr.add(0);
        arr.add(1);
        arr.add(2);
        Assertions.assertEquals(expectedValue, arr.get(2));
    }

    @Test
    public void ArrayListRemoving() {
        int expectedValue = 2;
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.remove(1);
        Assertions.assertEquals(expectedValue, arr.get(1));
    }

    @Test
    public void ArrayListThrowsExceptionForGettingNonexistentIndex(){
        arr.add(0);
        arr.add(1);
        arr.add(2);
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()-> arr.get(10));
    }

    @Test
    public void ArrayListThrowsExceptionForRemovingNonexistentIndex() {
        arr.add(0);
        arr.add(1);
        arr.add(2);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> arr.remove(10));
    }

}