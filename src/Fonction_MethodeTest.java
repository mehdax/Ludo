import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class Fonction_MethodeTest {


    @Test
    public final void Placer() {
        int x = 4;
        int y = 4;
        char c = '⚫';

        char[][] plateau = {{' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'},
                {'1', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'2', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'3', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'4', ' ', ' ', '⚪', '⚫', ' ', ' ', ' ', ' '},
                {'5', ' ', ' ', ' ', '⚪', '⚫', ' ', ' ', ' '},
                {'6', ' ', ' ', ' ', ' ', '⚪', ' ', ' ', ' '},
                {'7', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'8', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        assertTrue(Fonction_Methode.Placer(plateau, x, y, c));
        assertFalse(Fonction_Methode.Placer(plateau, 2, 2, c));


    }
    @Test
    public final void CoordonéeValide(){
        String a = "BA";
        String b = "aa";
        String c = "11";
        String d = "1A";
        String e = "a1";

        assertFalse(Fonction_Methode.coordonéeValide(a));
        assertFalse(Fonction_Methode.coordonéeValide(b));
        assertFalse(Fonction_Methode.coordonéeValide(c));
        assertTrue(Fonction_Methode.coordonéeValide(d));
        assertTrue(Fonction_Methode.coordonéeValide(e));
    }

}