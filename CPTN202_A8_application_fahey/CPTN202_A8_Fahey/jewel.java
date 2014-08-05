import java.util.*;

public class jewel 
{
	
		protected int amount;
		protected String player; 
		protected Date found; 
		
		public jewel()
		{
			amount = 0;
			player = "New Player";	
			found = new Date();
		}
		
		public int get_amount()
		{
			return amount;
		}
		
		
		public void set_amount(int value)
		{
			amount  = value;
			return;
		}
		
		public String get_player()
		{
			return player;
		}
		
			
		public void set_player(String name)
		{
			player  = name;
			return;
		}
		
		public Date get_date()
		{
			return found;
		}
		
			
		public void set_date(Date approx)
		{
			found  = approx;
			return;
		}
		
		 public void display_message()
		    {
		    	System.out.println("Jewel Polymorphism");
		    }
}
