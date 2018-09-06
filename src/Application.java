import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int proba = 0;
        while (proba < 5) {
            String pytanie = "Zgadnij liczbe od 0 do 100";
            System.out.println(pytanie);

            int liczbaLosowa = wylosujLiczbe();

            System.out.println("Podaj swoj typ: ");

            Scanner typ = new Scanner(System.in);
            String wyborUzytkownika = typ.nextLine();
            int wyborUzytkownikaJakoLiczba = Integer.valueOf(wyborUzytkownika);

            String odpowiedzProgramu;
            if (wyborUzytkownikaJakoLiczba == liczbaLosowa) {
                odpowiedzProgramu = "Gratulacje zgadles/las!";
                System.out.println(odpowiedzProgramu);
                break;
            } else if (wyborUzytkownikaJakoLiczba < liczbaLosowa) {
                odpowiedzProgramu = "Podana liczba jest za mala";
                proba++;
            } else {
                odpowiedzProgramu = "Podana liczba jest za duza, przegłeś";
                proba++;
            }
            System.out.println(odpowiedzProgramu);
        }
    }

    private static int wylosujLiczbe() {
        return (int) Math.floor(Math.random() * 100);
    }

}
