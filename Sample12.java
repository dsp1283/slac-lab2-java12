// A Java program to demonstrate switch expressions
import java.util.ArrayList;

class Sample12
{
	public static void main(String args[])
	{
		// Creating an ArrayList with elements
		// {1, 2, 3, 4}
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);

		System.out.println("The old school switch");
		for (Integer i : arrList) {
			switch (i) {
		    case 1:
		    case 3:
		        System.out.println(i + " is odd");
		        break;
				case 2:
		    case 4:
		        System.out.println(i + " is even");
		        break;
		    }
		}

		System.out.println("The new hotness switch");
		for (Integer i : arrList) {
			switch (i) {
			    case 1, 3 -> System.out.println(i + " is odd");
			    case 2, 4 -> System.out.println(i + " is even");
			}
		}
	}
}
