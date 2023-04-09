package ru.netology.javaqa;

public class Radio {
    private int currentVolume;
    private int currentStation = 1;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume < 10) {
            currentVolume += 1;
        }
        if (currentVolume >= 10) {
            setCurrentVolume(10);
        }


    }

    public void decreaseCurrentVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
        if (currentVolume <= 0) {
            setCurrentVolume(0);
        }

    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        currentStation += 1;
        if (currentStation > 9) {
            setCurrentStation(1);
        }
    }

    public void prevStation() {
        currentStation -= 1;
        if (currentStation < 0) {
            setCurrentStation(9);
        }
    }
}
