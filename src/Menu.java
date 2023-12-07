import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String noirPos="oui";
        String blancPos="oui";
        int x;
        int y;
        boolean coordonéeValide=false;


        char[][] plateau= {{'+','a','b','c','d','e','f','g','h','+'},
                           {'1',' ',' ',' ',' ',' ',' ',' ',' ','1'},
                           {'2',' ',' ',' ',' ',' ',' ',' ',' ','2'},
                           {'3',' ',' ',' ',' ',' ',' ',' ',' ','3'},
                           {'4',' ',' ',' ','⚫','⚪',' ',' ',' ','4'},
                           {'5',' ',' ',' ','⚪','⚫',' ',' ',' ','5'},
                           {'6',' ',' ',' ',' ',' ',' ',' ',' ','6'},
                           {'7',' ',' ',' ',' ',' ',' ',' ',' ','7'},
                           {'8',' ',' ',' ',' ',' ',' ',' ',' ','8'},
                           {'+','a','b','c','d','e','f','g','h','+'}};

        System.out.println("////////////////////////////////////// \n" +
                          "//////////////BONJOUR !!//////////////  \n" +
                         "////////////////////////////////////// \n");




        Fonction_Methode.AfficherPlateau(plateau);

        System.out.println("La couleur noir commence. Choississez un placement exemple:'D3'ou '6E' ");

            noirPos = scanner.nextLine();
        coordonéeValide = Fonction_Methode.coordonéeValide(noirPos);
        while (!coordonéeValide) {
            System.out.println("Coordonée Invalide !!!!:'a-h','1-8'");
            noirPos=scanner.nextLine();
            coordonéeValide=Fonction_Methode.coordonéeValide(noirPos);
        }














     //  Fonction_Methode.remplacer(plateau,y,x,'⚫','⚪');

      //  Fonction_Methode.AfficherPlateau(plateau);





    }
}