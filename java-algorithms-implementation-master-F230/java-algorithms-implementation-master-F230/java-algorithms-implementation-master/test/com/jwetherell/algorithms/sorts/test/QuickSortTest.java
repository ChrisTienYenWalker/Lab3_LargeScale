import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortModifiedTest {

    @Test
    public void testQuickSortCase1() {
        Integer[] input = {10, 4, 9, 2, 8, 6, 7, 3};
        Integer[] expected = {2, 3, 4, 6, 7, 8, 9, 10};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortCase2() {
        Integer[] input = {1, 3, 5, 7, 9};
        Integer[] expected = {1, 3, 5, 7, 9};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortCase3() {
        Integer[] input = {9, 7, 5, 3, 1};
        Integer[] expected = {1, 3, 5, 7, 9};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.MIDDLE, input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortCase4() {
        Integer[] input = {4, 4, 2, 4, 3, 2};
        Integer[] expected = {2, 2, 3, 4, 4, 4};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortCase5() {
        Integer[] input = {12};
        Integer[] expected = {12};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortCase6() {
        Integer[] input = {};
        Integer[] expected = {};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result);
    }
}
