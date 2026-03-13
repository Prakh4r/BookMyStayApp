
abstract class Room {
    protected int numberOfBeds;

    protected int squareFeet;

    protected double pricePerNight;
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }
    public void displayRoomDetails(String roomType) {
        System.out.println(roomType + ":");
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}
class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}
public class BookMyStayApp {
    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization\n");

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        singleRoom.displayRoomDetails("Single Room");
        System.out.println("Available: " + singleAvailability);
        System.out.println();

        doubleRoom.displayRoomDetails("Double Room");
        System.out.println("Available: " + doubleAvailability);
        System.out.println();

        suiteRoom.displayRoomDetails("Suite Room");
        System.out.println("Available: " + suiteAvailability);
    }
}