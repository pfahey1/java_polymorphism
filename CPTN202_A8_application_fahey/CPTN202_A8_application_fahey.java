/*
	 * Java Source File for Assignment 8
	 * Paul Fahey
	 *16 April 2012
	 * Source -  Absolute Java Savitch
*/

import java.util.*; // Needed for date objects
import java.io.*; // Needed for file operation objects



public class CPTN202_A8_application_fahey 
{
	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner (System.in);
		Date date = new GregorianCalendar(1991,6-1,28).getTime();
		
		
		System.out.println("Enter the first players name: ");
		String player1 = keyboard.nextLine();
		System.out.println("Enter the first players amount of jewels: ");
		int number2 = Integer.parseInt(keyboard.nextLine());
		System.out.println();
		
		
		System.out.println("Enter the second players name: ");
		String player2 = keyboard.nextLine();
		System.out.println("Enter the second players amount of jewels: ");
		int number3 = Integer.parseInt(keyboard.nextLine());
		System.out.println();
		
		System.out.println("Enter the third players name: ");
		String player3 = keyboard.nextLine();
		System.out.println("Enter the third players amount of jewels: ");
		int number4 = Integer.parseInt(keyboard.nextLine());
		System.out.println();
		
		
		jewel [] jewels = new jewel[3];
		
		for (int i=0;i<jewels.length;i++)
		{
		    jewels[i]= new jewel(); 
		}
			
		jewels[0].set_player(player1);
		jewels[0].set_amount(number2);
		jewels[0].set_date(date);
		jewels[1].set_player(player2);
		jewels[1].set_amount(number3);
		jewels[1].set_date(date);
		jewels[2].set_player(player3);
		jewels[2].set_amount(number4);
		jewels[2].set_date(date);
		
		System.out.println();
		
		System.out.println("Enter the fourth players name: ");
		String player4 = keyboard.nextLine();
		System.out.println("Enter the fourth players amount of diamonds: ");
		int number5 = Integer.parseInt(keyboard.nextLine());
		System.out.println();
		
		
		System.out.println("Enter the fifth players name: ");
		String player5 = keyboard.nextLine();
		System.out.println("Enter the fifth players amount of diamonds: ");
		int number6 = Integer.parseInt(keyboard.nextLine());
		System.out.println();
		
		System.out.println("Enter the sixth players name: ");
		String player6 = keyboard.nextLine();
		System.out.println("Enter the sixth players amount of diamonds: ");
		int number7 = Integer.parseInt(keyboard.nextLine());
		System.out.println();
		
		jewel [] diamonds = new diamond[3];
		
		for (int i=0;i<diamonds.length;i++)
		{
		    diamonds[i]= new diamond(); 
		}
			
		diamonds[0].set_player(player4);
		diamonds[0].set_amount(number5);
		diamonds[0].set_date(date);
		diamonds[1].set_player(player5);
		diamonds[1].set_amount(number6);
		diamonds[1].set_date(date);
		diamonds[2].set_player(player6);
		diamonds[2].set_amount(number7);
		diamonds[2].set_date(date);
		
		System.out.println();
		
		System.out.println("Enter the seventh players name: ");
		String player7 = keyboard.nextLine();
		System.out.println("Enter the seventh players amount of rubys: ");
		int number8 = Integer.parseInt(keyboard.nextLine());
		System.out.println();
		
		
		System.out.println("Enter the eighth players name: ");
		String player8 = keyboard.nextLine();
		System.out.println("Enter the eight players amount of rubys: ");
		int number9 = Integer.parseInt(keyboard.nextLine());
		System.out.println();
		
		System.out.println("Enter the nineth players name: ");
		String player9 = keyboard.nextLine();
		System.out.println("Enter the nineth players amount of rubys: ");
		int number10 = Integer.parseInt(keyboard.nextLine());
		System.out.println();
		
		jewel [] rubys = new ruby[3];
		
		for (int i=0;i<rubys.length;i++)
		{
		    rubys[i]= new ruby(); 
		}
			
		rubys[0].set_player(player7);
		rubys[0].set_amount(number8);
		rubys[0].set_date(date);
		rubys[1].set_player(player8);
		rubys[1].set_amount(number9);
		rubys[1].set_date(date);
		rubys[2].set_player(player9);
		rubys[2].set_amount(number10);
		rubys[2].set_date(date);
		
		System.out.println();
		
		// Polymorphism Tests
		
		jewel jewels2 [] = new jewel[9];
		
		jewels2[0] = jewels[0];
		jewels2[1] = jewels[1];
		jewels2[2] = jewels[2];
		jewels2[3] = diamonds[0];
		jewels2[4] = diamonds[1];
		jewels2[5] = diamonds[2];
		jewels2[6] = rubys[0];
		jewels2[7] = rubys[1];
		jewels2[8] = rubys[2];
		
		for (int i = 0; i < jewels2.length; i++)
		{
			jewels2[i].display_message();
		}
		
		System.out.println();
		
		/*
		
		// File operations
		
		File text_file = new File("CPTN202_A8_jewels_fahey.txt");
		FileWriter output_file;
		PrintWriter output_line;
		
		
		// Put the strings into the file.
		
		try
		{
			text_file.delete(); // delete original file
			output_file = new FileWriter(text_file,true); // Create the empty file
			output_line = new PrintWriter(output_file); // Open the file for writing
			
			for(int i =0; i<jewels.length;i++) // Write the lines
			{
				output_line.println("Player: " + jewels[i].get_player());
				output_line.println("Number of Jewels: " + jewels[i].get_amount());
				output_line.println("Date Found: " + jewels[i].get_date());
				output_line.println();
			}
			
			for(int i =0; i<diamonds.length;i++) // Write the lines
			{
				output_line.println("Player: " + diamonds[i].get_player());
				output_line.println("Number of Diamonds: " + diamonds[i].get_amount());
				output_line.println("Date Found: " + diamonds[i].get_date());
				output_line.println();
			}
			
			for(int i =0; i<rubys.length;i++) // Write the lines
			{
				output_line.println("Player: " + rubys[i].get_player());
				output_line.println("Number of Rubys: " + rubys[i].get_amount());
				output_line.println("Date Found: " + rubys[i].get_date());
				output_line.println();
			}
			
			output_line.close(); 
		}
		
		catch (IOException exception)
		{
			System.out.println("Can't open file for writing");
		}
		
		*/
		
		for(int i =0; i<jewels.length;i++)
		{
			System.out.println("Player: " + jewels[i].get_player());
			System.out.println("Number of Jewels: " + jewels[i].get_amount());
			System.out.println("Date Found: " + jewels[i].get_date());
			System.out.println();
		}
		
		
		for(int i =0; i<diamonds.length;i++)
		{
			System.out.println("Player: " + diamonds[i].get_player());
			System.out.println("Number of Diamonds: " + diamonds[i].get_amount());
			System.out.println("Date Found: " + diamonds[i].get_date());
			System.out.println();
		}
		
		
		for(int i =0; i<rubys.length;i++)
		{
			System.out.println("Player: " + rubys[i].get_player());
			System.out.println("Number of Rubys: " + rubys[i].get_amount());
			System.out.println("Date Found: " + rubys[i].get_date());
			System.out.println();
		}		

	}
}
