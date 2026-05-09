package stopwatch;

public class StopWatch {
    int minutes;
    int hours;
    int days;
    int dayHours;
    StopWatch(int dayHours){
        this.dayHours=dayHours;
    }
    StopWatch(){
        this.dayHours=0;
    }
    public void record(int minutes) {
        if (minutes >= 0) {
            this.minutes += minutes; //minutes supposed to be cumulative
            if(this.minutes>=60){
                this.hours+=(this.minutes/60);
                this.minutes=this.minutes%60;
            }

        }

    }

    public int getMinutes() {
        return minutes;
    }
    public int getHours(){
        return hours;
    }
    public int getDays(){
        return days;
    }
}
