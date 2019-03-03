import java.util.Scanner;
import java.util.Arrays;

public class Test {

	private static Scanner scan;
	private static Scanner scan2;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String eleves[] = {"raymond","patrick","maurice"};
		int moyenne = 0;
		for (int i=0;i<eleves.length;i++) {


			System.out.println("combien de notes a "+ eleves[i]);
			int numberNote = scan.nextInt();
			int note[]= new int [numberNote];

			for(int x=0; x<numberNote;x++) {

				System.out.println("entre la note "+ (x+1));
				note[x] = scan.nextInt(); 
				moyenne =moyenne + note[x];
			}

			System.out.println("moyenne = " + moyenne/note.length);
			moyenne = 0;
		}
		
		scan2 = new Scanner(System.in);
		System.out.println("quelles éléves voulez vous chercher ?");
		String wantedElements = scan2.nextLine();

		boolean found = Arrays.stream(eleves).anyMatch(t -> t.equals(wantedElements));

		if(found) {
			System.out.println(wantedElements + " fait bien partie de mes éléves");
		}
		else System.out.println(wantedElements+ " 2" + "ne fait pas partie de mes eléves");

	}
}