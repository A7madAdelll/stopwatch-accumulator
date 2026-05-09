package stopwatch;

public class StopWatch {
    int minutes;
    int hours;
    public void record(int minutes) {
        if (minutes >= 0) {
            this.minutes = minutes; //this supposed to be comulative
            this.hours+=minutes/60;
            this.minutes=minutes%60;
        }

    }

    public int getMinutes() {
        return minutes;
    }
    public int getHours(){
        return hours;
    }
}
