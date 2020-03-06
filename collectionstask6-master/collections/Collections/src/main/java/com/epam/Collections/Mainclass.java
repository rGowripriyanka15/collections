package com.epam.Collections;

import java.util.*;
public class Mainclass {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		int ch;
		String key,r,ele;
		list.add("Triveni");
		list.add("chaitanya");
		list.add("gowri");
		list.add("Divya");
		list.add("vyshnavi");
		list.add("pragna");
		list.add("supraja");
		list.add("charitha");
		list.add("daddy");
		list.add("rani");
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Search for an Element\n2.Add Element\n3.Remove Element\n4.Print List\n5.Exit");
			System.out.println("Enter the index of the operation you want to perform:");
			ch=s.nextInt();
			if(ch==1)
			{
				System.out.println("Enter the name to search:");
				key=s.next();
				if(list.contains(key))
				{
					System.out.println("The Element is found at "+(list.indexOf(key)+1)+" position");
				}
				else
				{
					System.out.println("The Element is not found");
				}

			}
			else if(ch==2)
			{
				System.out.println("Enter the element you want to add:");
				ele=s.next();
				list.add(ele);
				System.out.println("Element added to the list..");

			}
			else if(ch==3)
			{
				System.out.println("Enter the element you want to remove from the list:");
				r=s.next();
				list.remove(r);
				System.out.println("Element "+r+" is removed from list succesfully..");
			}
			else if(ch==4)
			{
				System.out.println("-----Printing the list:------");
				for(String str : list)
				{
					System.out.println(str);
				}
			}
			else
			{
				System.out.println("Program Exiting!...");
				break;
			}
		}



	}

}
