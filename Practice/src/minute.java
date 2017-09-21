import java.util.Scanner;

public class minute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double year;
		double minute;
		String time="Enter a number of year:";
		System.out.println(time);
		year=in.nextDouble();
		in.close();
		minute= year*365*24*60;
		System.out.println("The equivalent time in minute is ");
		System.out.println(minute);
	

	}

}
