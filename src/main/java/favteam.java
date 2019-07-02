import java.util.*;
public class favteam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		if (num<20) {
			for(int i=1;i<=num;i++) {
				System.out.println("Enter your name: ");
				String name = input.nextLine();
				System.out.println("Ente your fav team ");
				String team=input.nextLine();
				System.out.println("Enter your opinion on the place it'll finish ");
				String place=input.nextLine();
				System.out.println("Mr: " + name+"supporting "+ team + "think they finish in"+ place);
			}
		}
	}

}
