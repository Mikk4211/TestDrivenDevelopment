import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PunktTest {

    @Test
    void TestNytPunktXligmed3() {

        // 3. Set-up
        Punkt punkt = new Punkt();

        // 2. Act
        punkt.setX(3.0);

        // 1. Assert
        assertEquals(3.0, punkt.getX(), 0.001);

    }

    @Test
    void TestNytPunktXligmed4() {
        // 3. Set-up
        Punkt punkt = new Punkt();

        // 2. Act
        punkt.setX(4.0);

        // 1. Assert
        assertEquals(4.0, punkt.getX(), 0.001);
    }

    @Test
    void TestNytPunktYligmed5() {

        // 3. Set-up
        Punkt punkt = new Punkt();

        // 2. Act
        punkt.setY(5.0);

        // 1. Assert
        assertEquals(5.0, punkt.getY(), 0.001);
    }

    @Test
    void TestNytPunktYligmed1() {
        // 3. Set-up
        Punkt punkt = new Punkt();

        // 2. Act
        punkt.setY(1.0);

        // 1. Assert
        assertEquals(1.0, punkt.getY(), 0.001);
    }

    @Test
    void TestLinieLængdeLigmed15() {

        // 3. Set-up
        Linie linie = new Linie();

        // 2. Act
        linie.setLength(15.0);

        // 1. Assert
        assertEquals(15.0, linie.getLength(), 0.001);
    }

    @Test
    void TestLinieLængdeLigmed13(){

        // 3. Set-up
        Linie linie = new Linie();

        // 2. Act
        linie.setLength(13.0);

        // 1. Assert
        assertEquals(13.0, linie.getLength(), 0.001);
    }
    
}