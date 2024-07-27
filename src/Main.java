public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        ims.addProduct(new Product("P001", "Product 1", 10, 99.99));
        ims.addProduct(new Product("P002", "Product 2", 20, 149.99));

        System.out.println("All Products:");
        ims.printAllProducts();

        ims.updateProduct("P001", new Product("P001", "Updated Product 1", 15, 89.99));

        System.out.println("\nAfter updating Product 1:");
        ims.printAllProducts();

        ims.deleteProduct("P002");

        System.out.println("\nAfter deleting Product 2:");
        ims.printAllProducts();
    }
}
