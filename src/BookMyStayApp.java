public class BookMyStayApp {
    abstract class Room {

        protected String roomType;
        protected int beds;
        protected int size;
        protected double price;

        public Room(String roomType, int beds, int size, double price) {
            this.roomType = roomType;
            this.beds = beds;
            this.size = size;
            this.price = price;
        }

        public void displayRoomDetails() {
            System.out.println("Room Type : " + roomType);
            System.out.println("Beds      : " + beds);
            System.out.println("Size      : " + size + " sq.ft");
            System.out.println("Price     : $" + price);
        }
    }

    class SingleRoom extends Room {
        public SingleRoom() {
            super("Single Room", 1, 200, 80.0);
        }
    }

    class DoubleRoom extends Room {
        public DoubleRoom() {
            super("Double Room", 2, 350, 120.0);
        }
    }

    class SuiteRoom extends Room {
        public SuiteRoom() {
            super("Suite Room", 3, 500, 250.0);
        }
    }

    public class UseCase2RoomInitialization {

        public static void main(String[] args) {

            System.out.println("======================================");
            System.out.println("      Welcome to Book My Stay App     ");
            System.out.println("   Hotel Booking Management System    ");
            System.out.println("           Version: 2.1               ");
            System.out.println("======================================");

            Room singleRoom = new SingleRoom();
            Room doubleRoom = new DoubleRoom();
            Room suiteRoom = new SuiteRoom();

            int singleRoomAvailable = 10;
            int doubleRoomAvailable = 5;
            int suiteRoomAvailable = 2;

            System.out.println("\n--- Room Details & Availability ---\n");

            singleRoom.displayRoomDetails();
            System.out.println("Available : " + singleRoomAvailable);
            System.out.println();

            doubleRoom.displayRoomDetails();
            System.out.println("Available : " + doubleRoomAvailable);
            System.out.println();

            suiteRoom.displayRoomDetails();
            System.out.println("Available : " + suiteRoomAvailable);
            System.out.println();

            System.out.println("Thank you for using Book My Stay App.");
        }
    }