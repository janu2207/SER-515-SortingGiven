package test.java;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
//	@Test
//	public void bubbleSortTest() {
//		Item arr[]= new Item[9];
//		arr[0]= new Item(5);
//		arr[1] =new Item(6);
//		arr[2] = new Item(7);
//		arr[3] =new Item(8);
//		arr[4]= new Item(1);
//		arr[5]= new Item(2);
//		arr[6]= new Item(3);
//		arr[7]= new Item(0);
//		arr[8] =new Item(22);
//		SortAlgos.bubbleSort(arr);
//		Item arr1[] =null;
//		int a[]= new int[9];
//		for( int i=0;i<arr.length;i++) {
//			a[i]=arr[i].key;
//		}
//		int res[]= new int[] {0,1,2,3,5,6,7,8,22};
//		
//		Assert.assertArrayEquals(a, res);
//
//	}
	
	@Test
	public void IfArrayHasRandomElementsBubbleSort() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("9 5 6 7 8 1 2 3 21 0");
		
		SortAlgos.bubbleSort(data.myArray);

		SortDemoData res= new SortDemoData();
		res.initializeArray("0 1 2 3 5 6 7 8 9 21");
		System.out.println(res.myArray);
		assertTrue(data.myArray[0].key == res.myArray[0].key );
		assertTrue(data.myArray[1].key == res.myArray[1].key );
		assertTrue(data.myArray[2].key == res.myArray[2].key );
		assertTrue(data.myArray[3].key == res.myArray[3].key );
		assertTrue(data.myArray[4].key == res.myArray[4].key );
		assertTrue(data.myArray[5].key == res.myArray[5].key );
		assertTrue(data.myArray[6].key == res.myArray[6].key );
		assertTrue(data.myArray[7].key == res.myArray[7].key );
		assertTrue(data.myArray[8].key == res.myArray[8].key );
		assertTrue(data.myArray[9].key == res.myArray[9].key );



	}
	

	
	@Test (expected=java.lang.NullPointerException.class)
	public void IfArrayIsNullBubbleSort() {
		SortDemoData data = new SortDemoData();
		SortAlgos.bubbleSort(data.myArray);
		

	}
	
	@Test
	public void IfArrayHasRandomElementsBubbleSortHeapSort() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("9 5 6 7 8 1 2 3 21 0");
		
		SortAlgos.heapSort(data.myArray);

		SortDemoData res= new SortDemoData();
		res.initializeArray("0 1 2 3 5 6 7 8 9 21");
		System.out.println(res.myArray);
		assertTrue(data.myArray[0].key == res.myArray[0].key );
		assertTrue(data.myArray[1].key == res.myArray[1].key );
		assertTrue(data.myArray[2].key == res.myArray[2].key );
		assertTrue(data.myArray[3].key == res.myArray[3].key );
		assertTrue(data.myArray[4].key == res.myArray[4].key );
		assertTrue(data.myArray[5].key == res.myArray[5].key );
		assertTrue(data.myArray[6].key == res.myArray[6].key );
		assertTrue(data.myArray[7].key == res.myArray[7].key );
		assertTrue(data.myArray[8].key == res.myArray[8].key );
		assertTrue(data.myArray[9].key == res.myArray[9].key );



	}
	

	
	@Test (expected=java.lang.NullPointerException.class)
	public void IfArrayIsNullHeapSort() {
		SortDemoData data = new SortDemoData();
		SortAlgos.heapSort(data.myArray);
		

	}
	
	@Test
	public void IfArrayHasRandomElementsMergeSort() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("9 5 6 7 8 1 2 3 21 0");
		
		SortAlgos.mergeSort(data.myArray);

		SortDemoData res= new SortDemoData();
		res.initializeArray("0 1 2 3 5 6 7 8 9 21");
		System.out.println(res.myArray);
		assertTrue(data.myArray[0].key == res.myArray[0].key );
		assertTrue(data.myArray[1].key == res.myArray[1].key );
		assertTrue(data.myArray[2].key == res.myArray[2].key );
		assertTrue(data.myArray[3].key == res.myArray[3].key );
		assertTrue(data.myArray[4].key == res.myArray[4].key );
		assertTrue(data.myArray[5].key == res.myArray[5].key );
		assertTrue(data.myArray[6].key == res.myArray[6].key );
		assertTrue(data.myArray[7].key == res.myArray[7].key );
		assertTrue(data.myArray[8].key == res.myArray[8].key );
		assertTrue(data.myArray[9].key == res.myArray[9].key );



	}
	

	
	@Test (expected=java.lang.NullPointerException.class)
	public void IfArrayIsNullMergeSort() {
		SortDemoData data = new SortDemoData();
		SortAlgos.mergeSort(data.myArray);
		

	}
	
	@Test
	public void IfArrayHasRandomElementsSelectionSort() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("9 5 6 7 8 1 2 3 21 0");
		
		SortAlgos.selectionSort(data.myArray);

		SortDemoData res= new SortDemoData();
		res.initializeArray("0 1 2 3 5 6 7 8 9 21");
		System.out.println(res.myArray);
		assertTrue(data.myArray[0].key == res.myArray[0].key );
		assertTrue(data.myArray[1].key == res.myArray[1].key );
		assertTrue(data.myArray[2].key == res.myArray[2].key );
		assertTrue(data.myArray[3].key == res.myArray[3].key );
		assertTrue(data.myArray[4].key == res.myArray[4].key );
		assertTrue(data.myArray[5].key == res.myArray[5].key );
		assertTrue(data.myArray[6].key == res.myArray[6].key );
		assertTrue(data.myArray[7].key == res.myArray[7].key );
		assertTrue(data.myArray[8].key == res.myArray[8].key );
		assertTrue(data.myArray[9].key == res.myArray[9].key );



	}
	

	
	@Test (expected=java.lang.NullPointerException.class)
	public void IfArrayIsNullSelectionSort() {
		SortDemoData data = new SortDemoData();
		SortAlgos.selectionSort(data.myArray);
	}
	
	@Test
	public void IfArrayHasRandomElementsInsertionSort() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("9 5 6 7 8 1 2 3 21 0");	
		SortAlgos.insertionSort(data.myArray);
		SortDemoData res= new SortDemoData();
		res.initializeArray("0 1 2 3 5 6 7 8 9 21");
		System.out.println(res.myArray);
		assertTrue(data.myArray[0].key == res.myArray[0].key );
		assertTrue(data.myArray[1].key == res.myArray[1].key );
		assertTrue(data.myArray[2].key == res.myArray[2].key );
		assertTrue(data.myArray[3].key == res.myArray[3].key );
		assertTrue(data.myArray[4].key == res.myArray[4].key );
		assertTrue(data.myArray[5].key == res.myArray[5].key );
		assertTrue(data.myArray[6].key == res.myArray[6].key );
		assertTrue(data.myArray[7].key == res.myArray[7].key );
		assertTrue(data.myArray[8].key == res.myArray[8].key );
		assertTrue(data.myArray[9].key == res.myArray[9].key );



	}
	

	
	@Test (expected=java.lang.NullPointerException.class)
	public void IfArrayIsNullInsertionSort() {
		SortDemoData data = new SortDemoData();
		SortAlgos.insertionSort(data.myArray);
		

	}
	
	
	@Test
	public void IfArrayHasRandomElementsQuickSort() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("9 5 6 7 8 1 2 3 21 0");	
		SortAlgos.quickSort(data.myArray);
		SortDemoData res= new SortDemoData();
		res.initializeArray("0 1 2 3 5 6 7 8 9 21");
		System.out.println(res.myArray);
		assertTrue(data.myArray[0].key == res.myArray[0].key );
		assertTrue(data.myArray[1].key == res.myArray[1].key );
		assertTrue(data.myArray[2].key == res.myArray[2].key );
		assertTrue(data.myArray[3].key == res.myArray[3].key );
		assertTrue(data.myArray[4].key == res.myArray[4].key );
		assertTrue(data.myArray[5].key == res.myArray[5].key );
		assertTrue(data.myArray[6].key == res.myArray[6].key );
		assertTrue(data.myArray[7].key == res.myArray[7].key );
		assertTrue(data.myArray[8].key == res.myArray[8].key );
		assertTrue(data.myArray[9].key == res.myArray[9].key );



	}
	

	
	@Test (expected=java.lang.NullPointerException.class)
	public void IfArrayIsNullQuickSort() {
		SortDemoData data = new SortDemoData();
		SortAlgos.quickSort(data.myArray);
		

	}
	

}
