package KVM_Work_Notify;
import java.util.*;
public class InterfaceKVM {
	static boolean a=true;
	static final Scanner sc=new Scanner(System.in); 
	static Random r=new Random();
	public static Registration currentUser;
	public void frontPage()
	{
		System.out.println("-------------KARPAGA VINAYAGAR MEDICAL SHOP ASHOK NAGAR-------------- ");
		while (a)
		{
			System.out.println("\t1.Register\n\t2.Login\n\t3.Exit");
			System.out.print("Users choice :");
			if (sc.hasNextInt())
			{
				int	user=sc.nextInt();
				if (user>0 && user<4)
				{
					switch (user)
					{
					case 1:
						{
							Registration registers = new Registration();
							registers.register();
							Logon login = new Logon();
							login.loginView();
						}
						break;
					case 2:
						{
							Logon login = new Logon();
							login.loginView();
						}
						break;
					case 3:
						{
							thankyou();
							a=false;
						}
						break;
					
					}
				}
				else
				{
					System.out.println("Input should be 1,2 and 3");
				}
			}
			else
			{
				elseNote();
				sc.nextLine();
			}
		}
	}
	public void elseNote()
	{
		System.out.println("Invalid Input....Try Again....");
	}
	public void thankyou()
	{
		System.out.println("Thanks For Using Work Notify....Have a Good Day Buddy....");
		System.exit(0);
	}
	public boolean verify(long contact)
	{
		while (a)
		{
			System.out.println("Enter the OTP Which is Sent to the Registered Contact Number");
			int otp=r.nextInt(1000,9999);
			System.out.println("\t\t\t"+otp);
			System.out.print("Fill OTP here :");
			int uotp=sc.nextInt();
			if (uotp==otp)
			{
				return a;
			}
			else
			{
				a=false;
				return a;
			}
		}
		return false;
	}
	public static void main(String[] args)throws Exception
	{
		System.out.println("-----------------------Work Notify with Everyone-------------------------- ");
		InterfaceKVM kvmin=new InterfaceKVM();
		kvmin.frontPage();
	}
}
