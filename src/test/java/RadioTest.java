import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);

        return;
    }

    @Test
    public void testMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        return;
    }

    @Test
    public void testMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(20);

        return;
    }
    @Test
    public void testMax() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(26);

        int actual = radio.getCurrentStation();
        int expected = 26;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);

        return;
    }

    @Test
    public void testEighthToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(16);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 17;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNineToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEighthToPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOneToPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}
