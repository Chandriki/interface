package chandriki2;

import java.util.Scanner;

public class interfacep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Client C=new Raju();
	}

}
interface Client
{
	void input();
	void output();
}
class Raju implements Client
{
	String name;
	double salary;
	public void input()
	{
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		salary=sc.nextInt();
		}
		public void output()
		{
		System.out.println(name+" "+salary);
		}
}
