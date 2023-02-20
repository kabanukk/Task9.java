import java.util.Scanner;
public class Task9
{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double a = console.nextInt();
        double b = console.nextInt();
        double c = console.nextInt();
        double x1;
        double x2;
        x1 = 0;
        x2 = 0;
        double D;
        D = b*b-4*a*c;
        if (D<0){
            System.out.print("Корнeй нeт");
        } else{
            x1 = (-b+Math.sqrt(D))/(2*a);
            x2 = (-b-Math.sqrt(D))/(2*a);
        }
        System.out.println("Корни");
        System.out.println(x1);
        System.out.println(x2);
	}
}
