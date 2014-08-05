
public class ruby extends diamond
{
	 public ruby() 
	    { 
	        initialize();
	    } 
	 
	    private void initialize()
	    { 
	        super.set_amount(amount);
	        super.set_player(player);
	        super.set_date(found); 
	        return;
	    }
	    
	    public void display_message()
	    {
	    	System.out.println("Ruby Polymorphism");
	    }    
}
