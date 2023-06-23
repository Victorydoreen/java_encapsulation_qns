
import java.util.Scanner;

public class MainHardware {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hardware store name: ");
        String hardwareName = scanner.nextLine();

        System.out.print("Enter store contact: ");
        String contact = scanner.nextLine();

        System.out.print("Enter store location: ");
        String location = scanner.nextLine();

        Hardware_store store = new Hardware_store(hardwareName, contact, location);

        while (true) {
            System.out.println();
            System.out.println(" Below you can select any action you would like to perform ");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product Stock");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Product List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:

                    int productId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter product Id: ");

                    String name = scanner.nextLine();
                    System.out.print("Enter product name: ");

//                    int stock = scanner.nextInt();
//                    scanner.nextLine(); // Consume newline character

                    String price = scanner.nextLine();
                    System.out.print("Enter product price: ");

                    String image = scanner.nextLine();
                    System.out.print("Enter product image: ");

                    StoreProduct newProduct = new StoreProduct(productId, name, price, image);
                    store.addProduct(newProduct);
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    System.out.print("Enter product name to update stock: ");
                    String productNameToUpdate = scanner.nextLine();
                    System.out.print("Enter new stock quantity: ");
                    int newStockQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    store.updateProductStock(productNameToUpdate, newStockQuantity);
                    System.out.println("Stock updated successfully.");
                    break;
                case 3:
                    System.out.print("Enter product name to delete: ");
                    String productToDelete = scanner.nextLine();
                    store.deleteProduct(productToDelete);
                    break;
                case 4:
                    store.displayProducts();
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.Can you try another choice");
            }
        }
    }
}
