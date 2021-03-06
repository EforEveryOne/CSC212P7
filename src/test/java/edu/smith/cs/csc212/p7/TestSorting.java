package edu.smith.cs.csc212.p7;

import java.util.Arrays;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.ListADT;
import edu.smith.cs.csc212.adtr.real.JavaList;

public class TestSorting {
	/**
	 * This is useful for testing whether sort algorithms work!
	 * @param items - the list of integers.
	 * @return true if it is sorted, false if not.
	 */
	public static boolean checkSorted(ListADT<Integer> items) {
		for (int i=0; i<items.size()-1; i++) {
//			If the index being checked is greater than the next index, there's a problem, it's not sorted.
			if (items.getIndex(i) > items.getIndex(i+1)) {
				System.err.println("items out of order: "+items.getIndex(i)+", "+items.getIndex(i+1) + " at index="+i);
				return false;
			}
		}
//		If we never found a case where the next index is less than the previous index, it's a sorted list.
		return true;
	}
	
	/**
	 * Here's some data!
	 */
	private static int[] data = {9,8,7,6,5,4,3,2,1};
	
	@Test
	public void testBubbleSort() {
		// See if the data can be reversed:
		ListADT<Integer> sortMe = new JavaList<>();
		for (int y : data) {
			sortMe.addBack(y);
		}
		BubbleSort.bubbleSort(sortMe);
		Assert.assertTrue(checkSorted(sortMe));
		
		Random rand = new Random(13);
		// For good measure, let's shuffle it and sort it again to see if that works, too.
		sortMe.shuffle(rand);
		System.out.println(sortMe.toJava());
		BubbleSort.bubbleSort(sortMe);
		Assert.assertTrue(checkSorted(sortMe));
		
		// check it is the original size
		Assert.assertEquals(sortMe.size(), data.length);
	}
	
	@Test
	public void testClassBubbleSort() {
		// See if the data can be reversed:
		ListADT<Integer> sortMe = new JavaList<>(Arrays.asList(35, 88, 11, 47, 14, 24, 41, 62, 27));
		
		System.out.println("");
		System.out.println("List before BUBBLE sorting: " + sortMe);
		
		BubbleSort.bubbleSort(sortMe);
		
		System.out.println("List after BUBBLE sorting: " + sortMe);
		System.out.println("");
		
		Assert.assertTrue(checkSorted(sortMe));
		// check it is the original size
		Assert.assertEquals(sortMe.size(), data.length);

	}
	
	
	
	@Test
	public void testSelectionSort() {
		// See if the data can be reversed:
		ListADT<Integer> sortMe = new JavaList<>();
		for (int y : data) {
		sortMe.addBack(y);
		}
		SelectionSort.selectionSort(sortMe);
		Assert.assertTrue(checkSorted(sortMe));
		
		Random rand = new Random(13);
		// For good measure, let's shuffle it and sort it again to see if that works, too.
		sortMe.shuffle(rand);
		System.out.println(sortMe.toJava());
		SelectionSort.selectionSort(sortMe);
		Assert.assertTrue(checkSorted(sortMe));
			
		// check it is the original size
		Assert.assertEquals(sortMe.size(), data.length);

	}
	
	
	@Test
	public void testClassSelectionSort() {
		// See if the data can be reversed:
		ListADT<Integer> sortMe = new JavaList<>(Arrays.asList(35, 88, 11, 47, 14, 24, 41, 62, 27));
		
		System.out.println("");
		System.out.println("List before SELECTION sorting: " + sortMe);
		
		SelectionSort.selectionSort(sortMe);
		
		System.out.println("List after SELECTION sorting: " + sortMe);
		System.out.println("");
		
		Assert.assertTrue(checkSorted(sortMe));
		// check it is the original size
		Assert.assertEquals(sortMe.size(), data.length);

	
		
	}
	
	@Test
	public void testInsertionSort() {
		// See if the data can be reversed:
		ListADT<Integer> sortMe = new JavaList<>();
		for (int y : data) {
			sortMe.addBack(y);
		}	
		InsertionSort.insertionSort(sortMe);
		Assert.assertTrue(checkSorted(sortMe));
		
		Random rand = new Random(13);
		// For good measure, let's shuffle it and sort it again to see if that works, too.
		sortMe.shuffle(rand);
		System.out.println(sortMe.toJava());	
		InsertionSort.insertionSort(sortMe);
		Assert.assertTrue(checkSorted(sortMe));
		
		// check it is the original size
		Assert.assertEquals(sortMe.size(), data.length);
	}
	
	@Test
	public void testClassInsertionSort() {
		// See if the data can be reversed:
		ListADT<Integer> sortMe = new JavaList<>(Arrays.asList(35, 88, 11, 47, 14, 24, 41, 62, 27));
		
		System.out.println("");
		System.out.println("List before INSERTION sorting: " + sortMe);
		
		InsertionSort.insertionSort(sortMe);
		
		System.out.println("List after INSERTION sorting: " + sortMe);
		System.out.println("");
		
		Assert.assertTrue(checkSorted(sortMe));
		// check it is the original size
		Assert.assertEquals(sortMe.size(), data.length);

	
		
	}
	
	
	
	
	
	@Test
	public void testSlice() {
		ListADT<Integer> sortMe = new JavaList<>(Arrays.asList(35, 88, 11, 47, 14, 24, 41, 62, 27));
		int mid = sortMe.size()/2;
		ListADT<Integer> leftSlice = sortMe.slice(0, mid);
		ListADT<Integer> rightSlice = sortMe.slice(mid, sortMe.size());
		
		Assert.assertEquals(leftSlice.toJava(), Arrays.asList(35, 88, 11, 47));
		Assert.assertEquals(rightSlice.toJava(), Arrays.asList(14, 24, 41, 62, 27));
		
		Assert.assertEquals(14, (int) rightSlice.removeFront());
		Assert.assertEquals(4, rightSlice.size());
		Assert.assertEquals(27, (int) rightSlice.removeBack());
		Assert.assertEquals(3, rightSlice.size());
	}


}
