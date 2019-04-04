package edu.smith.cs.csc212.p7;

import edu.smith.cs.csc212.adtr.ListADT;


public class SelectionSort {
	public static void selectionSort(ListADT<Integer> input) {

		int N = input.size();
		for (int i = 0; i < N-1; i++) {
			int min_val = findMinVal(input, i);
			input.swap(min_val, i);
//			System.out.println("Sorting via selectionSort: " + input);
			}
		}

	private static int findMinVal(ListADT<Integer> input, int start) {
		int N = input.size();
		int min = input.getIndex(start);
		int index = start;
		for (int i = start; i < N; i++) {
			int check = input.getIndex(i);
			if (min > check) {
				min = check;
				index = i;
				}
			}
		return index;
		}
	}

// Can this be done w/o making find the min a method?


//		int N = input.size();
//		
//		for (int i = 0; i < N-1; i++) {
//			int min = input.getIndex(i);
//			int index = i;
//			
//			for (int j = i; j < N; j++) {
//				int check = input.getIndex(i);
//				if (min > check) {
//					min = check;
//					index = i;
//					}
//				}

////			int min_val = findMinVal(input, i);
//			
//
//			input.swap(min, i);			
////			input.swap(min_val, i);
//			}
//
//		}
//}


//		The issue with this is no access to i1 outside of the loop...
		
//		int N = input.size();
//		for (int i = 0; i < N-1; i++) {
//			int start = i;
//			int index = start;
//			
//			int min = input.getIndex(start);
//			for (int i1 = start; i1 < N; i1++) {
//				int current = input.getIndex(i1);
//				if (min > current) {
//					min = current;
//				}
		
//				}
//		input.swap(min, i1);
//			}
//		}
//	}

			
		
	
