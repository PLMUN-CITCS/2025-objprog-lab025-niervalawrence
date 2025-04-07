class Item {
    // Static variable to count the number of objects created
    static int objectCount = 0;

    // Instance variable for item name
    String itemName;

    // Constructor to initialize the item name and increment the object count
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;
    }

    // Static method to display the total number of objects created
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    // Instance method to display the item's name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        // Creating three Item objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Displaying information about each item
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Displaying the total number of Item objects created
        Item.displayObjectCount();
    }
}
