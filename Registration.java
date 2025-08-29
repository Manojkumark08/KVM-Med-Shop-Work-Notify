package KVM_Work_Notify;

public class Registration extends InterfaceKVM{
	private String name;
	private int age;
	private String role;
	private long contact;
	private long aadharno;
	private String empID;
	public Registration(){
	}
	public Registration(String name,int age,long contact,long aadharno, String role,String empID)
	{
		this.name=name;
		this.age=age;
		this.contact=contact;
		this.aadharno=aadharno;
		this.role=role;
		this.empID=empID;
	}
	public void register()
	{
		System.out.print("Enter Your Name :");
		sc.nextLine();
		this.name=sc.nextLine();
		this.name=this.name.toUpperCase();
		System.out.println("\tWhat's Your Role?");
		System.out.println("1.Admin\n2.Owner\n3.Doctor\n4.Staff\n5.CA\n6.Purchase Entry\n7.Customer Supporter\n8.Stock Checker\n9.Delivery Partner");
		while (a)
		{
			System.out.print("Enter Your Role :");
			if (sc.hasNextInt())
			{
				int user=sc.nextInt();
				if (user<10 && user>0)
				{
					switch (user)
					{
					case 1:
						{
							this.role="Admin";
						}
						break;
					case 2:
						{
							this.role="Owner";
						}
						break;
					case 3:
						{
							this.role="Doctor";
						}
						break;
					case 4:
						{
							this.role="Staff";
						}
						break;
					case 5:
						{
							this.role="CA";
						}
						break;
					case 6:
						{
							this.role="Purchase Entry";
						}
						break;
					case 7:
						{
							this.role="Customer Supporter";
						}
						break;
					case 8:
						{
							this.role="Stock Checker";
						}
						break;
					case 9:
						{
							this.role="Delivery Partner";
						}
						break;
					}
					break;
				}
				else
				{
					System.out.println("Enter Number Between 1 to 9..");
				}
			}
			else
			{
				elseNote();
				sc.next();
			}
			
		}
		while (a)
		{
			System.out.print("Enter Your Age :");
			if (sc.hasNextInt())
			{
				this.age=sc.nextInt();
				if (this.age>17)
				{
					break;
				}
				else
				{
					System.out.println("Attention!\n1.Age should be above 18 based on Govt Act.....\n2.Need to Register Again");
					thankyou();
					a=false;
				}
			}
			else
			{
				elseNote();
			}
		}
		while (a)
		{
			System.out.print("Enter Your Aadhar Number:");
			if (sc.hasNextLong())
			{
				this.aadharno=sc.nextLong();
				if (verifyAadhar(this.aadharno))
				{
					break;	
				}
				else
				{
					System.out.println("Kindly Check your Aadhar Number Length (12 Digit).....");
				}
			}
			else
			{
				elseNote();
				sc.next();
			}
		}
		while (a)
		{
			System.out.print("Enter Your Contact Number :");
			if (sc.hasNextLong())
			{
				this.contact=sc.nextLong();
				if (verifyContact(this.contact))
				{
					System.out.println("You Need to Verify Your Contact Number");
					if (verify(this.contact))
					{
						System.out.println("Verification done and Successfully Registered.");
						empIdGen();
						currentUser=new Registration(this.name,this.age,this.contact,this.aadharno,this.role,this.empID);
						loginExit();
						break;
					}
					else
					{
							System.out.println("Verifiction Failed..........");
							thankyou();
							a=false;
					}
				}
				else
				{
					System.out.println("Kindly Check your Contact Length (10 Digit).....");
				}
			}
			else
			{
				elseNote();
			}
		}
	}
	public void loginExit()
	{
		while (a)
		{
			System.out.println("\t1.Login\n\t2.Exit");
			System.out.print("You Need to Login or Exit ? :");
			if (sc.hasNextInt())
			{
				int user = sc.nextInt();
				if (user>0 && user<3)
				{
					switch (user)
					{
					case 1:
						{
							Logon login = new Logon();
							login.loginView();
						}
						break;
					case 2:
						{
							frontPage();
						}
						break;
					}
					break;
				}
				else
				{
					System.out.println("Input should be 1 and 2");
				}
			}
			else
			{
				elseNote();
				sc.nextLine();
			}
		}
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getRole()
	{
		return role;
	}
	public long getContact()
	{
		return contact;
	}
	public long getAadharno()
	{
		return aadharno;
	}
	public String getEmpID()
	{
		return empID;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public boolean verifyContact(long contact)
	{
		if (String.valueOf(contact).length()==10)
		{
			return a;
		}
		else
		{
			return a=false;
		}
	}
	public boolean verifyAadhar(long aadharno)
	{
		if (String.valueOf(aadharno).length()==12)
		{
			return a;
		}
		else
		{
			return a=false;
		}
	}
	public void empIdGen()
	{
		this.empID="KVM";
		int index=r.nextInt(100,200);
		this.empID+=index;
		System.out.printf("\t\tWork Id :%s\n",this.empID);
		System.out.println("Kindly Remember Your Work Id.....Don't Forget...");
	}
}
