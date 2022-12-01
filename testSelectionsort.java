import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;

		int[] ExpectedSortedArr = new int[5];
		ExpectedSortedArr[0] = 2;
		ExpectedSortedArr[1] = 7;
		ExpectedSortedArr[2] = 8;
		ExpectedSortedArr[3] = 9;
		ExpectedSortedArr[4] = 10;

		/** add tests to check for this unit test **/
		SelectionSort sortArr = new SelectionSort();
		int[] ActualSortArr = sortArr.basicSelectionSort(arr);
		/** add tests to check for this unit test **/
//		assert(Arrays.equals(sosrtedValue, Sortedarr));
		assertArrayEquals(ExpectedSortedArr, ActualSortArr);
	}

	public void testNegative() {

		/** Test data contains negative values only **/
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;

		int[] ExpectedSortedArr = new int[5];
		ExpectedSortedArr[0] = 2;
		ExpectedSortedArr[1] = 7;
		ExpectedSortedArr[2] = 8;
		ExpectedSortedArr[3] = 9;
		ExpectedSortedArr[4] = 10;

		/** add tests to check for this unit test **/
		SelectionSort sortArr = new SelectionSort();
		int[] ActualSortArr = sortArr.basicSelectionSort(arr);
		/** add tests to check for this unit test **/
//		assert(Arrays.equals(sosrtedValue, Sortedarr));
		assertArrayEquals(ExpectedSortedArr, ActualSortArr);
	}

  public void testMixed() {

  /** Test data contains with both positive, negative and zeros **/
  int[] arr = new int[5];
  arr[0] = -8;
  arr[1] = 9;
  arr[2] = -7;
  arr[3] = -10;
  arr[4] = 2;

  int[] ExpectedSortedArr = new int[5];
  ExpectedSortedArr[0] = -10;
  ExpectedSortedArr[1] = -8;
  ExpectedSortedArr[2] = -7;
  ExpectedSortedArr[3] = 2;
  ExpectedSortedArr[4] = 9;
  /** add tests to check for this unit test **/
  SelectionSort sortArr = new SelectionSort();
  int[] ActualSortArr = sortArr.basicSelectionSort(arr);
  /** add tests to check for this unit test **/
//		assert(Arrays.equals(sosrtedValue, Sortedarr));
  assertArrayEquals(ExpectedSortedArr, ActualSortArr);

}

public void testDuplicates() {

  /** Test data contains duplicates **/
  int[] arr = new int[5];
  arr[0] = 8;
  arr[1] = 8;
  arr[2] = 7;
  arr[3] = 10;
  arr[4] = 2;

  int[] ExpectedSortedArr = new int[5];
  ExpectedSortedArr[0] = 2;
  ExpectedSortedArr[1] = 7;
  ExpectedSortedArr[2] = 8;
  ExpectedSortedArr[3] = 8;
  ExpectedSortedArr[4] = 10;

  /** add tests to check for this unit test **/
  SelectionSort sortArr = new SelectionSort();
  int[] ActualSortArr = sortArr.basicSelectionSort(arr);
  /** add tests to check for this unit test **/
//		assert(Arrays.equals(sosrtedValue, Sortedarr));
  assertArrayEquals(ExpectedSortedArr, ActualSortArr);
}


}
