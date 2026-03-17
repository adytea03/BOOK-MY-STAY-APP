public class UseCase3InventorySetup {
}
public static void main(String[] args) {

    System.out.println("Hotel Room Inventory Status\n");

    Room single = new SingleRoom();
    Room doubleRoom = new DoubleRoom();
    Room suite = new SuiteRoom();

    RoomInventory inventory = new RoomInventory();

    System.out.println("Single Room:");
    single.hashCode();
    System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Single") + "\n");

    System.out.println("Double Room:");
    doubleRoom.hashCode();
    System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Double") + "\n");

    System.out.println("Suite Room:");
    suite.hashCode();
    System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Suite"));
}
