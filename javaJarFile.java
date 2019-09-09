import java.lang.Math;

public class javaJarFile {

	public static void main(String[] args) {
		double number = 0.0;
		int printNum = 0;
		
		number = Math.random();
		number = number*1000000;
		printNum = (int)Math.ceil(number);
		
		System.out.println(printNum);

	}

}
