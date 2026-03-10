import java.util.HashMap;

public class BookMyStayApp{

    public static void main(String[] args) {

        // Initialize the inventory component
        RoomInventory inventory = new RoomInventory();

        // Display current inventory state
        System.out.println("Current Room Inventory:");
        inventory.displayInventory();

        // Example update
        inventory.updateAvailability("Single Room", -1);

        System.out.println("\nInventory After Update:");
        inventory.displayInventory();
    }
}

class RoomInventory {

    private HashMap<String, Integer> roomAvailability;

    // Constructor initializes room availability
    public RoomInventory() {
        roomAvailability = new HashMap<>();

        roomAvailability.put("Single Room", 10);
        roomAvailability.put("Double Room", 5);
        roomAvailability.put("Suite Room", 2);
    }

    // Retrieve availability
    public int getAvailability(String roomType) {
        return roomAvailability.getOrDefault(roomType, 0);
    }

    // Update room availability
    public void updateAvailability(String roomType, int change) {
        int current = roomAvailability.getOrDefault(roomType, 0);
        roomAvailability.put(roomType, current + change);
    }

    // Display inventory
    public void displayInventory() {
        for (String roomType : roomAvailability.keySet()) {
            System.out.println(roomType + " : " + roomAvailability.get(roomType));
        }
    }
}