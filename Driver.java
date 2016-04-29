package homeworkassignment21;

import java.util.Random;

public class Driver 
{
	public static void main(String[] args)
	{
		int arrayOfNumbers[] = new int [10];
		int arrayOfNumbers2[] = new int [10];
		Driver.fillArrayWithRandomInts(arrayOfNumbers);
		Driver.printIntArray(arrayOfNumbers);
		Driver.mergeSort(arrayOfNumbers, arrayOfNumbers2, 10);
		Driver.printIntArray(arrayOfNumbers);
	}
	static void mergeSort(int a[], int B[], int n)
	{
	    mergeHelper(a, 0, n, B);
	}

	static void mergeHelper(int a[], int begin, int end, int b[])
	{
	    if(end - begin == 1)
	        {
	    	return;
	        }
	    int middle = (end + begin) / 2;
	    mergeHelper(a, begin,  middle, b);
	    mergeHelper(a, middle,    end, b);
	    merge(a, begin, middle, end, b);
	    copyArray(b, begin, end, a);
	}

	static void merge(int a[], int begin, int middle, int end, int b[])
	{
	    int i = begin;
	    int j = middle;
	    
	    for (int k = begin; k < end; k++) {
	        if (i < middle && (j >= end || a[i] <= a[j])) {
	            b[k] = a[i];
	            i = i + 1;
	        } else {
	            b[k] = a[j];
	            j = j + 1;    
	        }
	    } 
	}

	static void copyArray(int b[], int begin, int end, int a[])
	{
	    for(int i = begin; i < end; i++)
	        a[i] = b[i];
	}
	static void fillArrayWithRandomInts(int[] ar)
	{
		Random r = new Random();
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = r.nextInt(101);
		}
	}
	static void printIntArray(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
}
