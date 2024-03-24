public class Radio {

    private int CurrentStation;
    private int CurrentVolume;

    public Radio() {

    }

    public void next() {
        if (CurrentStation == 9) {
            CurrentStation = 0;
        } else {
            CurrentStation++;
        }
    }

    public void prev() {
        if (CurrentStation == 0) {
            CurrentStation = 9;
        } else {
            CurrentStation--;
        }
    }


    public int getCurrentStation() {
        return CurrentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < 0) {
            return;
        }
        if (CurrentStation > 9) {
            return;
        }
        this.CurrentStation = CurrentStation;
    }

    public int getCurrentVolume() {
        return CurrentVolume;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 100) {
            return;
        }
        this.CurrentVolume = CurrentVolume;
    }

    public void increaseVolume() {
        if (CurrentVolume < 100) {
            CurrentVolume = CurrentVolume + 1;
        }

    }

    public void reductionVolume() {
        if (CurrentVolume < 100) {
            CurrentVolume = CurrentVolume - 1;
        }
    }
}
