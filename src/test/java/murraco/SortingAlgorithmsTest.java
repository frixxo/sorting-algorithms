package murraco;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import murraco.BubbleSort;
import murraco.Heapsort;
import murraco.InsertionSort;
import murraco.MergeSort;
import murraco.Quicksort;
import murraco.SelectionSort;

public class SortingAlgorithmsTest {

  @Test
  public void testBubbleSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testInsertionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    InsertionSort.insertionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testSelectionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    SelectionSort.selectionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testMergeSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    MergeSort.mergeSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testHeapsort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Heapsort.heapSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testQuicksort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Quicksort.quickSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }


  //New tests --------------------------------------------------------------------------------
  @Test
  public void testBubbleSortSameNum() {
    final Integer[] data = {4, 4, 4, 11, 7, 5, 15, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[1, 4, 4, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }
  @Test
  public void testBubbleSortEmpty() {
    final Integer[] data = {};
    BubbleSort.bubbleSort(data);
    assertEquals("[]", Arrays.toString(data));
  }
  @Test
  public void testBubbleSortSorted() {
    final Integer[] data = {1,2,3,4,5,6,7,8,9,10};
    BubbleSort.bubbleSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", Arrays.toString(data));
  }
  @Test
  public void testBubbleSortReverseSorted() {
    final Integer[] data = {10,9,8,7,6,5,4,3,2,1};
    BubbleSort.bubbleSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", Arrays.toString(data));
  }

  @Test
  public void testMergesortIncrementMutation() {
    final Integer[] data = {4, 3, 0, 11, 7, 15, 99, 5, 12, 1};
    InsertionSort.insertionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }
  @Test
  public void testInsertionSortEmpty() {
    final Integer[] data = {};
    InsertionSort.insertionSort(data);
    assertEquals("[]", Arrays.toString(data));
  }
}

