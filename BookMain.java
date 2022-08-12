package booksystem;

import java.util.Scanner;
public static void updateBookById() {
	boolean status=true;
	System.out.println("enter BookId to update book details: ");
	int id=sc.nextInt();
	for(int i=0;i<index;i++)
	{
		if(id==book[i].getBookId())
			System.out.println("enter the new book id: ");
		int bid=sc.nextInt();
		System.out.println("enter the new book Name: ");
		String bname=sc.nextLine();
		System.out.println("Enter new book price: ");
		double price=sc.nextDouble();
		book[i]=new Book(bid,bname,price);
		System.out.println("book has been updated successfully");
		status=true;
	}
	if(status==false)
	{
		System.out.println("Book id not found");
		System.out.println("=================================");
	}
}
}