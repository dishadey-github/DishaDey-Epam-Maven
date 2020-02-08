package dishaDey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class newyearGift
{
	String gifts;
	float weight_gift;
	static float totalWEIGHT_gift;
	newyearGift(String a,float b)
	{
		gifts=a;
		weight_gift=b;
		if(gifts=="T")
			totalWEIGHT_gift=totalWEIGHT_gift+weight_gift;
	}
}	
class Chocolates extends newyearGift
{
	String name;
	float price;
	Chocolates(String a,float b,String c,float d)
	{
		super(a,b);
	    name=c;
	    price=d;
	}
	public float getprice()
	{
		return price;
	}
	void show_newyeargifts()
	{
		System.out.println("chocolates given"+gifts);
		System.out.println("chocolates weight is"+weight_gift);
		System.out.println("chocolates name is"+name);
		System.out.println("chocolates price is"+price);
		
	}
}
class sort_price implements Comparator<Chocolates>
{
	public int compare(Chocolates price1,Chocolates price2)
	{
		return Float.compare(price1.getprice(),price2.getprice());
	}
}
class sweets extends newyearGift
{
	String name;
	float price;
	sweets(String a,float b,String e,float f)
	{
		super(a,b);
		name=e;
		price=f;
		
	}
    void show_newyeargifts()
	{
		System.out.println("sweets given"+gifts);
		System.out.println("sweets weight is"+weight_gift);
		System.out.println("sweets name is"+name);
		System.out.println("sweets price is"+price);
	}
}
class candies extends newyearGift
{
	String name;
	float price;
	candies(String a,float b,String g,float h)
	{
		super(a,b);
		name=g;
		price=h;
	}
    void show_newyeargifts()
	{
		System.out.println("candies given"+gifts);
		System.out.println("candies weight is"+weight_gift);
		System.out.println("candies name is"+name);
		System.out.println("candies price is"+price);
		
	}
    public float getprice()
	{
		return price;
	}
}
public class gifts2020 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String gifts;
		//float price_gift;
		String name;
		//float weight;
		ArrayList<Chocolates> choco=new ArrayList<Chocolates>();
		ArrayList<sweets> swe=new ArrayList<sweets>();
		ArrayList<candies> candy=new ArrayList<candies>();
		int receivedgifts=0;
		int option1=0,option2=0;
		int number=0;
		int x;
		float min,max;
		while(option2!='n')
		{
			System.out.println("EPAM-MAVEN PROJECT-DISHA DEY");
			System.out.println("TASK1=ENTER THE PRICES OF THE CHOCOLATES OF NEW YEAR GIFT AND SORT THEM IN ASCENDING ORDER");
			System.out.println("TASK2=ENTER THE OBJECTS OF THE SWEETS OF NEW YEAR GIFT");
			System.out.println("TASK3=ENTER THE PRICES OF THE CANDIES OF NEW YEAR GIFT AND SORT THEM IN ASCENDING ORDER THE GIVEN RANGE OF PRICE");
			System.out.println("TASK4=CALCULAE THE TOTAL WEIGHT OF NEW YEAR GIFTS ");
			System.out.println("ENTER THE OPTION");
			option1=scan.nextInt();
			
			
			float weight_gift;
			float price;
			while(option1==1)
			{System.out.println("ENTER THE QUANITY OF CHOCOLATES");
		              
		        x=scan.nextInt();
		       receivedgifts=receivedgifts+x;
                
               for(int i=1;i<=x;i++)
				{
					System.out.println("ENTER THE DETAILS FOR CHOCOLATES"+i);
					System.out.println("press T for giving the gifts & N for not giving the gifts");
					scan.nextLine();
					gifts=scan.nextLine();
					System.out.println("ENTER THE WEIGHT OF HE GIFTS");
					
				    weight_gift=scan.nextFloat();
					System.out.println("GIVE THE CHOCOLATE NAMES");
					scan.nextLine();
					name=scan.nextLine();
					System.out.println("GIVE THE CHOCOLATE PRICES");
					price=scan.nextFloat();
					choco.add(new Chocolates(gifts,weight_gift,name,price));
				}
               System.out.println("OBJECT OF THE CHOCOLATE");
				for(Chocolates chocos: choco)
					chocos.show_newyeargifts();
				System.out.println("SORT IN ASCENDING ORDER");
				Collections.sort(choco,new sort_price());
				System.out.println("CHOCOLATES BEING SORTED");
				for(Chocolates chocos: choco)
					chocos. show_newyeargifts();
				break;
				
			}
		while(option1==2)
			{
			System.out.println("ENTER THE QUANITY OF  SWEET");
              x=scan.nextInt();
              receivedgifts=receivedgifts+x;
              
              int j=1;
             for(;j<=x;j++)
	         {
		     System.out.println("ENTER THE DETAILS FOR  SWEET"+j);
		     System.out.println("press T for giving the gifts & N for not giving the gifts");
		     scan.nextLine();
		     gifts=scan.nextLine();
		     System.out.println("GIVE THE SWEET WEIGHT");
		    
		     weight_gift=scan.nextFloat();
		     System.out.println("GIVE THE  SWEET NAMES");
		     scan.nextLine();
		     name=scan.nextLine();
		     System.out.println("GIVE THE  SWEET PRICES");
		     price=scan.nextFloat();
		     swe.add(new sweets(gifts,weight_gift,name,price));
	         }
               System.out.println("OBJECT OF THE SWEET");
	          for(sweets s: swe)
		       {
	        	  s.show_newyeargifts();
		       }
	          break;
	      
			}
	while(option1==3)
		{System.out.println("ENTER THE QUANITY OF  CANDY");
        x=scan.nextInt();
       receivedgifts=receivedgifts+x;
        
       int j=1;
        for(;j<=x;j++)
	   {
		System.out.println("ENTER THE DETAILS FOR  CANDY"+j);
		System.out.println("press T for giving the gifts & N for not giving the gifts");
		scan.nextLine();
		gifts=scan.nextLine();
		System.out.println("GIVE THE CANDY WEIGHT");
		weight_gift=scan.nextFloat();
		System.out.println("GIVE THE  CANDY NAMES");
		scan.nextLine();
		name=scan.nextLine();
		System.out.println("GIVE THE  CANDY PRICES");
		price=scan.nextInt();
		candy.add(new candies(gifts,weight_gift,name,price));
	}
    System.out.println("OBJECT OF THE SWEET");
	for(candies C: candy)
		C. show_newyeargifts();
	System.out.println("ENTER THE RANGE OF PRICE)");
	System.out.println("ENTER THE MINIMUM PRICE");
	min=scan.nextFloat();
	System.out.println("ENTER THE MAXIMUM PRICE");
	max=scan.nextFloat();
	for(candies C: candy)
	{
		if(min<=C.getprice() && max>=C.getprice())
		{
		number=1;
		C. show_newyeargifts();
		}
	}
	break;
		}
	
	if(option1==4)
    {    
		System.out.println("TOTAL WEIGHT OF THE NEW YEAR GIFTS"+ newyearGift.totalWEIGHT_gift);
	}
	break;
 }
		 scan.close();
	}

}
