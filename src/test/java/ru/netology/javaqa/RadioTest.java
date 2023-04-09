package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNotSetVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnderMin() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.decreaseCurrentVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationOverMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToNextStationOverMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToPrevStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}
