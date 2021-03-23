import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;
    private Person person;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int getQueueLength() {
        return this.queue.size();
    }

    public void addPersonToQueue() {
        this.queue.add(person);
    }


    public Person removePersonFromQueue() {
        return this.queue.remove(0);
    }
}
