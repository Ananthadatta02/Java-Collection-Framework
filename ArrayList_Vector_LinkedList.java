package collection_framework.collection_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class AllList
{
	private static Scanner s = new Scanner(System.in);
	private List<Integer> li;
	public static void arrayList(int arrayListEleCount)
	{
		ArrayList<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i <= arrayListEleCount-1; i++) 
		{
			System.out.println("Enter " + (i+1) + "th element");
			li.add(s.nextInt());
		}
		System.out.println(li);
	}
	public static void vector(int vectorEleCount)
	{
		Vector<Integer> li = new Vector<Integer>();
		for (int i = 0; i <= vectorEleCount-1; i++) 
		{
			System.out.println("Enter " + (i+1) + "th element");
			li.add(s.nextInt());
		}
		System.out.println(li);
	}
	public static void linkedList(int linkedListEleCount)
	{
		LinkedList<Integer> li = new LinkedList<Integer>();
		for (int i = 0; i <= linkedListEleCount-1; i++) 
		{
			System.out.println("Enter " + (i+1) + "th element");
			li.add(s.nextInt());
		}
		System.out.println(li);
	}
}

public class ArrayList_Vector_LinkedList 
{
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter 1 to select ArrayList..");
		System.out.println("Enter 2 to select Vector..");
		System.out.println("Enter 3 to select LinkedList..");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("How many ArrayList Elements to Add..");
				 int arrayListEleCount = s.nextInt();
				 AllList.arrayList(arrayListEleCount);
		break;
		case 2 : System.out.println("How many Vector Elements to Add..");
		 		 int vectorEleCount = s.nextInt();
   		 		 AllList.vector(vectorEleCount);
		break;
		case 3 : System.out.println("How many LinkedList Elements to Add..");
		 		 int linkedListEleCount = s.nextInt();
		 		AllList.linkedList(linkedListEleCount);
		break;
		}
	}
}
