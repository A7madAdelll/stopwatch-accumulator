package stopwatch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StopWatchTest {

    @Test
    void test1() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(14);
        int minutes = stopWatch.getMinutes();
        Assertions.assertEquals(14, minutes);
    }
    //test for negative value refuse
    @Test
    void test2() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(-5);
        int minutes = stopWatch.getMinutes();
        if (minutes != 0) {
            Assertions.fail("Invalid value");
        }
    }
    //test that stopwatch has hours
    @Test
    void test3(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(120);
        int hours=stopWatch.getHours();
        Assertions.assertEquals(2,hours,"stopWatch does have hours");

    }
    //test comulative values of the minutes
    @Test
    void test4(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(30);
        stopWatch.record(30);
        stopWatch.record(30);
        stopWatch.record(30);
        Assertions.assertEquals(2,stopWatch.getHours(),"stop watch doesn't acumulate minutes");

    }

}
