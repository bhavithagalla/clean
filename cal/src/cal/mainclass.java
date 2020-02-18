package cal;
import java.util.Scanner;
public class mainclass extends samp{
	public static void main(String[] args)
	{
		char c;
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.next().charAt(0);
		switch(c)
		{
		case '+':System.out.println(add(a,b));
				 break;
		case '-':System.out.println(sub(a,b));
				  break;
		case '*':System.out.println(mul(a,b));
				break;
		case '/':System.out.println(div(a,b));
				break;
		default:
				System.out.print("wrong input");
		}
		
	}
	
}
