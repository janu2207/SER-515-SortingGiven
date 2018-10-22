package test.java;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {

	/*This test covers node, edge and condition coverage. 
	 * The test sequence is [9 5 6 7 8 1 2 3 21 0].
	 */
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
	
	/*This test covers node, edge and condition coverage. 
	 * The test sequence is a null array
	 */
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
