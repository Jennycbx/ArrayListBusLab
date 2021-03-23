import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus(2);
        busStop = new BusStop("Fleet Street");
        busStop.addPersonToQueue();
        busStop.addPersonToQueue();
        busStop.addPersonToQueue();
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPerson() {
        bus.pickUpPassengerFromQueue(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void willNotSurpassCapacity() {
        bus.pickUpPassengerFromQueue(busStop);
        bus.pickUpPassengerFromQueue(busStop);
        bus.pickUpPassengerFromQueue(busStop);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.pickUpPassengerFromQueue(busStop);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }
}
