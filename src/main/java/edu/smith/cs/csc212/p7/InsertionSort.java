package edu.smith.cs.csc212.p7;

import edu.smith.cs.csc212.adtr.ListADT;
import edu.smith.cs.csc212.adtr.real.JavaList;




// Until unsorted is empty, take the first element off it and find the point where it should go in sorted
// (the point where all previous elements are smaller, and all following elements are equal to or greater than).
// Insert it into sorted at this point.
public class InsertionSort {
	public static ListADT<Integer> insertionSort(ListADT<Integer> input) {
		
		
//		First make a list that we can store our sorted values in.
		ListADT<Integer> sortedList = new JavaList<>();
		
//		The size of our unsorted list
		int N = input.size();
		for (int i = 0; i < N; i++) {
			
//			For the size of our unsorted list, we're going to sort an element into our sortedList.
			insertSorted(sortedList, input.getIndex(i));
		
//		for (int i = 0; i < N; i++) {
//			int start = input.getIndex(i);
			}
//		we return this from our sub-method(insertSorted) to be inserted into our sortedList
//		or is this just to update it/pass into tests?
		return sortedList;
		}

//	This is the method that puts the value from our unsorted list
//	into our sorted list
	public static void insertSorted(ListADT<Integer> unsortedList, int value) {
//		We are processing the unsorted value in this method.
		int N = unsortedList.size();
		
//		int index = start;
		
		for (int i = 0; i < N; i++) {
//			need to check if value is less or greater than our sorted list?
//			If value is low, we want to send it to the front of our sortedList.
//			value is our input
			if (value >= unsortedList.getIndex(i)) {
//				????
			}
			

//			When we find right index of list for value we call addIndex(); i?
//			addIndex();
			
//			if (min > check) {
//				min = check;
//				index = i;
//				}
//			}
//			We need to return index so our insertionSort can move onto the next one correctly, right?
//			Or is that so it knows what index to put into our sorted list?
//		return index;
			
			
			}
		}
	}