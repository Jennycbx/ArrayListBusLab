import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;

    @Before
    public void before() {
        busStop = new BusStop("Fleet Street");
    }

    @Test
    public void canAddToQueue() {
        busStop.addPersonToQueue();
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPersonToQueue();
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.getQueueLength());
    }

}
