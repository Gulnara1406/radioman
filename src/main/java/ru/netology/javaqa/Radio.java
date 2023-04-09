package ru.netology.javaqa;

public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int minStation = 0;
    private int maxStation = 10;
    private int currentStation = minStation;

    public Radio(int setNumOfStations){
        this.maxStation = setNumOfStations - 1;
    }

    public Radio (){
        this.maxStation = 10;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
        if (currentVolume >= maxVolume) {
            setCurrentVolume(maxVolume);
        }
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        }
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
        }

    }

    public int getNumOfMaxStations(){
        return maxStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            currentStation = maxStation - 1;
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        currentStation += 1;
        if (currentStation > maxStation) {
            setCurrentStation(minStation);
        }
    }

    public void prevStation() {
        currentStation -= 1;
        if (currentStation < minStation) {
            setCurrentStation(maxStation);
        }
    }
}
