import java.util.Scanner;

public class Arvauspeli {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// right answer & guess
		String rightAnswer = "Mini";
		String guess = "";
		
		do
		{
		// ask guestion
		System.out.println("Guess the right car brand.");
		guess = in.nextLine();
		
		// if right or wrong answer
			if (guess.equalsIgnoreCase(rightAnswer))
			{
				System.out.println("That's right!\nCongratulations!");
			}
			else
			{
				System.out.println("Wrong! Try again.");
			}
		
		} while (!guess.equalsIgnoreCase(rightAnswer));
			
		

	}

}

//Tee arvauspeli, joka pyytää arvaamaan nimen. 
//Jos käyttäjä arvaa oikein, onnitellaan ja peli loppuu. 
//Jos käyttäjä arvaa väärin, pyydetään arvaamaan uudestaan.
//
//Vinkki! Kannattaa ensin tehdä peli sellaiseksi, 
//että se ei toista kysymyksiä väärin vastatessa, eli peli on ohi kertayrittämällä. 
//Lisää lopuksi toistorakenne. Mitä toistorakennetta kannattaisi käyttää (while, for, do - while)?
//
//Jos arvauspeli toimii yllä kuvatulla tavalla, kokeile halutessasi lopuksi:
//· Kerro, monta kertaa käyttäjä arvasi
//· Anna mahdollisuus, että jos kirjoittaa vaikka "loppu", peli loppuu, vaikka nimeä ei olisi arvannut
//
//Extra (Ei tarvita ohjelmoinnin perusteissa)
//
//Jos käyttäjä vastaa väärin, tulosta oikean vastauksen ensimmäinen kirjain. 
//Jos käyttäjä vastaa toisen kerran väärin, 
//tulosta käyttäjälle oikean vastauksen toinen kirjain (tai kaksi ensimmäistä) jne. 
//Vinkki käytä metodeja substring tai charAt.