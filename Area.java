import java.util.Scanner;
class Area 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int r=sc.nextInt();

		double area=3.14*r*r;

		System.out.println("area of a cirlce ="+area);
	}
}
