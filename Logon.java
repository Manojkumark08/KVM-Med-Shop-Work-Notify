package KVM_Work_Notify;

public class Logon extends InterfaceKVM {
	private String name;
	private int age;
	private String role;
	private long contact;
	private long aadharno;
	private String empID;
	public Logon(){
	}
	public Logon(String name,int age,long contact,long aadharno, String role,String empID)
	{
		this.name=name;
		this.age=age;
		this.contact=contact;
		this.aadharno=aadharno;
		this.role=role;
		this.empID=empID;
	}
	public void loginView()
	{
		while (a)
		{
			System.out.print("Enter Your Work ID :");
			String uempID=sc.next();
			System.out.print("Enter Contact Number :");
			long ucontact=sc.nextLong();
			if (currentUser != null && uempID.equals(currentUser.getEmpID()))
			{
				if (ucontact==(currentUser.getContact()))
				{
					if (verify(this.contact))
					{
						System.out.println("Verification Done and Login Successfully");
						System.out.println("\t \t\tStatus :Disconnected");
						loginPage();
							
					}
					else
					{
						System.out.println("Login Failed.... Try Again ");
					}
				}
				else
				{
					System.out.println("Login Failed.... Try Again");
				}
			}
			else
			{
				System.out.println("No Work ID Found....Need to  Register....");
				InterfaceKVM l=new InterfaceKVM();
				l.frontPage();
			}
		}
	}
	public void loginPage()
	{
		System.out.println("1.Clock In\n2.Clock Out\n3.Profile\n4.Request\n5.LogOut");
						while (a)
						{
							System.out.print("Wanna Move to :");
							if (sc.hasNextInt())
							{
								int user=sc.nextInt();
								if (user<6 && user>0)
								{
									switch (user)
									{
									case 1:
										{
											System.out.println("\t\tStatus :Connected");
											System.out.println("Go Ahead!!---- Have a Good Day Buddy......");
											workforYou();
										}
									break;
									case 2:
										{
											System.out.println("\t\tStatus :Disconnected");
											System.out.println("Good Work Buddy...");
											loginView();
										}
									break;
									case 3:
										{
											profileDetails();
										}
									break;
									case 4:
										{
											request();
										}
									break;
									case 5:
										{
											frontPage();
										}
									break;
									}
								}
								else
								{
									System.out.println("Enter Input Between 1 to 5");
								}
								break;
							}
							else
							{
								elseNote();
							}
						}
	}
	public void workforYou()
	{
		System.out.println("Your Work Will Update Soon.....");
		System.out.println("So Time to Disconnect..");
		System.out.println("1.Sure\n2.Not Sure");
		while (a)
		{
			System.out.print("Type Here :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user==1 || user==2)
				{
					switch (user)
					{
					case 1:
						{
							System.out.println("\t\t\tStatus : Disconnected");
							loginPage();
							a=false;
						}
					break;
					case 2:
						{
							System.out.println("Now there is no Work to do so...Redirecting to.....");
							System.out.println("\t\t\tStatus : Disconnected");
							loginPage();
							a=false;
						}
					break;
					}
				}
				else
				{
					System.out.println("Enter Input as 1 and 2");
				}
			}
			else
			{
				elseNote();
				sc.nextLine();
			}
		}
	}
	public void editProfileDetails()
	{
		System.out.println("\t1.Name\n\t2.Age\n\t3.Back");
		while (a)
		{
			System.out.print("Select Option Which You Wanna Edit ? :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user==1 || user==2 || user==3)
				{
					switch (user)
					{
					case 1:
						{
							changeName();
						}
						break;
					case 2:
						{
							changeAge();
						}
						break;
					case 3:
						{
							features();
						}
						break;
					}
				}
				else
				{
					System.out.println("Input should be 1 and 2.");
				}
			}
			else
			{
				elseNote();
				sc.nextLine();
			}
		} 
	}
	public void changeName()
	{
				while (a)
				{
					System.out.print("Enter Your Registered Contact Number :");
					long chancontact=sc.nextLong();
					if (chancontact==(currentUser.getContact()))
					{
						if (verify(this.contact))
						{
							sc.nextLine();
							System.out.print("Enter Name :");
							currentUser.setName(sc.nextLine());
							this.name=this.name.toUpperCase();
							System.out.println("Name Updated Successfully....");
							profileDetails();
						}
						else
						{
							System.out.println("Verification Failed...");
							loginView();
							a=false;
						}
					}
					else
					{
						System.out.println("Enter Valid Contact which is Registered in KVM......");
						loginView();
					}
				}
	}
	public void changeAge()
	{
				while (a)
				{
					System.out.print("Enter Your Registered Contact Number :");
					long chancontact=sc.nextLong();
					if (chancontact==(currentUser.getContact()))
					{
						if (verify(this.contact))
						{
							System.out.print("Enter Age :");
							currentUser.setAge(sc.nextInt());
							System.out.println("Age Updated Successfully....");
							profileDetails();
						}
						else
						{
							System.out.println("Verification Failed...");
							loginView();
							a=false;
						}
					}
					else
					{
						System.out.println("Enter Valid Contact which is Registered in KVM......");
						loginView();
					}
				}
	}
	public void features()
	{
		System.out.println("1.Edit Profile\n2.Salary Status\n3.Attendance Status\n4.Back");
		while (a)
		{
			System.out.print("Wanna move to :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user<5 && user>0)
				{
					switch (user)
					{
					case 1:
						{
							System.out.print("Edit Profile Details? (Yes/No) :");
							char con=sc.next().charAt(0);
							if (con=='Y'||con=='y')
							{
								editProfileDetails();
							}
							else if (con=='N'||con=='n')
							{
								features();
							}
							else
							{
								System.out.println("Enter Valid Input.....");
								sc.nextLine();
							}
						}
					break;
					case 2:
						{
							System.out.println("------Salary Status -----");
							System.out.println("Soon it will Upadate....");
							features();
						}
					break;
					case 3:
						{
							System.out.println("------Attendance Status-----");
							System.out.println("Soon it will Upadate....");
							features();
						}
					break;
					case 4:
						{
							loginPage();
						}
					break;
					}
				}
				else
				{
					elseNote();
					sc.nextLine();
				}
			}
			else
			{
				elseNote();
				sc.nextLine();
			}
		}	
	}
	public void profileDetails()
	{
		System.out.println("-----------Profile--------------");
		System.out.println("Name :"+currentUser.getName());
		System.out.println("Role :"+currentUser.getRole());
		System.out.println("Age :"+currentUser.getAge());
		System.out.println("Aadhar Number :"+currentUser.getAadharno());
		System.out.println("Contact :"+currentUser.getContact());
		System.out.println("____________________________________");
		features();
	}
	public void request()
	{
		System.out.println("1.Permission\n2.Leave\n3.Resignation\n4.Others\n5.Back");
		while (a)
		{
			System.out.print("Request For :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user<6 && user>0)
				{
					switch (user)
					{
					case 1:
						{
							System.out.print("How Many Hours :");
							if (sc.hasNextInt())
							{
								int perhr=sc.nextInt();
								System.out.printf("%d Hours Permission is Granted..\nPlease Be Safe...\n",perhr);
								System.out.println("Kindly Mail Briefly to our Mail:karpagavinayagarmed@gmail.com");
								loginPage();
							}
							else
							{
								elseNote();
							}
						}
					break;
					case 2:
						{
							System.out.print("How Many Days :");
							if (sc.hasNextInt())
							{
								int levday=sc.nextInt();
								System.out.printf("%d Days Holiday is Granted..\nPlease Be Safe...\n",levday);
								System.out.println("Kindly Mail Briefly to our Mail: karpagavinayagarmed@gmail.com");
								loginPage();
							}
							else
							{
								elseNote();
							}
						}
					break;
					case 3:
						{
							System.out.print("Reason :");
							String reason=sc.nextLine();
							System.out.println("Kindly Mail Briefly to our Mail: karpagavinayagarmed@gmail.com");
							System.out.println("Have a Beautiful Journey.....Buddy....");
							loginPage();
						}
					break;
					case 4:
						{
							System.out.print("Feel Free to Share with us....");
							System.out.println("Kindly Mail Briefly to our Mail: karpagavinayagarmed@gmail.com");
							loginPage();
						}
					break;
					case 5:
						{
							loginPage();
						}
					break;
					}
				}
				else
				{
					System.out.println("Enter Input Between 1 to 4");
				}
			}
			else
			{
				elseNote();
				sc.nextLine();
			}
		}
	}
}
