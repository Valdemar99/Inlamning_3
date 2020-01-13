
import java.util.Scanner;
import java.util.stream.IntStream;
import java.text.DecimalFormat;

/**
 * Programmet läser in fem tal, och behandlar dem. 
 * Insamling sker genom konsollen i en for-slinga.
 * @author Administrator
 *
 */

public class Inlämning3_a {

	public static void main(String[] args) {
		//Nu deklareras en lista och ett slingnummer
		//samt längd, maxvärde, summa och medelvärde.
		int [] talLista; 
		talLista = new int[5];
		int slingNummer;
		int max = 0, summa, längd;
		double medel;
		
		//Nu deklareras scanner och decimalformat
		Scanner indata = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		//Nu startar datainsamlingen
		for (slingNummer = 0; slingNummer < talLista.length; slingNummer++) {
			System.out.println("Skriv in ett tal.");
			talLista[slingNummer] = indata.nextInt();
		}
		//Nu behandlas datan, så vi hittar längd, summa och medelvärde
		längd = talLista.length;
		summa = IntStream.of(talLista).sum();
		medel = (double)summa/längd;
		
		//Nu avrundas medelvärdet till en sträng
		String medelAvrundat = dec.format(medel);
		
		//Nu hittas maxvärdet med en for-slinga
		for (slingNummer = 0; slingNummer < talLista.length; slingNummer++) {
			if (talLista[slingNummer] > max) {
				max = talLista[slingNummer];
			}
		}
		
		//Utskrivning
		System.out.println("Summan av listan är " + summa + ".");
		System.out.println("Medelvärdet är " + medelAvrundat + ".");
		System.out.println("Det största värdet är " + max + ".");
		
		//Nu stängs scannern
		indata.close();
	}

}
