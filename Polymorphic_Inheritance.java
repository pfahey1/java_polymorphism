
//
// Hal Bettle
//
// 10 Mar 11
//
//
import java.io.*;    // Needed for File operation objects.
import java.util.*;  // Needed for Date Object

public class Polymorphic_Inheritance 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello from Polymorphic Inheritance");
		
		int i;
		
		Date now = new Date();
		Date alt = new GregorianCalendar(1995, 5 - 1, 1).getTime();
		
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle(5, "Medium Vehicle", alt);
		Vehicle vehicle3 = new Vehicle(35, "Fast Vehicle", alt);
		Plane plane1 = new Plane();
		Plane plane2 = new Plane(150, 1000, "Medium Plane", alt);
		Plane plane3 = new Plane(500, 10000, "Fast Plane", alt);
		Jet jet1 = new Jet();
		Jet jet2 = new Jet(500, 25000, 20000, "Medium Jet", alt);
		Jet jet3 = new Jet(3500,80000, 50000, "Fast Jet", alt);
		
		vehicle1.set_speed(3);
		vehicle1.set_type("Slow vehicle");
		vehicle1.set_manf(now);
		plane1.set_speed(60);
		plane1.set_altitude(100);
		plane1.set_type("Slow plane");
		plane1.set_manf(now);
		jet1.set_speed(300);
		jet1.set_altitude(300);
		jet1.set_thrust(1500);
		jet1.set_type("Slow Jet");
		jet1.set_manf(now);
		
		Vehicle vehicleoriginal[] = new Vehicle[9];
		/*
		vehicleoriginal[0] = new Vehicle();
		vehicleoriginal[1] = new Vehicle();
		vehicleoriginal[2] = new Vehicle();
		vehicleoriginal[3] = new Plane();
		vehicleoriginal[4] = new Plane();
		vehicleoriginal[5] = new Plane();
		vehicleoriginal[6] = new Jet();
		vehicleoriginal[7] = new Jet();
		vehicleoriginal[8] = new Jet();
		*/
		vehicleoriginal[0] = jet1;
		vehicleoriginal[1] = plane2;
		vehicleoriginal[2] = vehicle3;
		vehicleoriginal[3] = plane1;
		vehicleoriginal[4] = vehicle2;
		vehicleoriginal[5] = plane3;
		vehicleoriginal[6] = vehicle1;
		vehicleoriginal[7] = jet2;
		vehicleoriginal[8] = jet3;
		
		for ( i = 0; i < vehicleoriginal.length ; i++)
		{
			vehicleoriginal[i].display();
		}
		
		// Say Bye-bye
		
		System.out.println("Thank you for using Polymorphic Inheritance");

	}

}
