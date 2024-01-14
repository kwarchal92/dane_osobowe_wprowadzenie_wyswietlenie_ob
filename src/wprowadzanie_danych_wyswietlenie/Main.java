package wprowadzanie_danych_wyswietlenie;

import java.io.*;

class osoba
{
    String nazwisko;
    String imie;
    String ulica;
    String kod;
    String miasto;

    public void inicjuj()
        throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wprowadzamy dane: ");
        System.out.println("Podaj nazwisko: ");
        nazwisko = br.readLine();
        System.out.println("Podaj imie: ");
        imie = br.readLine();
        System.out.println("Podaj ulice: ");
        ulica = br.readLine();
        System.out.println("Podaj kod: ");
        kod = br.readLine();
        System.out.println("Podaj miasto: ");
        miasto = br.readLine();
        System.out.println();
    }
    public void drukuj()
    {
        System.out.println("Wyswietlenie danych.");
        System.out.println("====================");
        System.out.println("Nazwisko " + nazwisko + ".");
        System.out.println("Imie " + imie + ".");
        System.out.println("Ulica " + ulica + ".");
        System.out.println("Kod " + kod + ".");
        System.out.println("Miasto " + miasto + ".");
    }

}
public class Main
{
    public static void main(String[] args)
        throws IOException
    {
        osoba pracownik = new osoba();

        pracownik.inicjuj();
        pracownik.drukuj();
    }
}
