import java.util.Scanner;

public class kmile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double kilometer;
		double mile;
		String order="Enter a number of kilometer:";
		System.out.println(order);
		kilometer=in.nextDouble();
		in.close();
		mile= (kilometer*5400.0) / 10000.0*1.15;
		System.out.println("The equivalent in mile is ");
		System.out.println(mile);
	

	}

}
