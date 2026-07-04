public class ComputerBuilderTest {
    public static void main(String[] args) {
        // Creating a basic computer
        Computer basicComputer = new Computer.Builder("Intel i3", "8GB", "256GB SSD")
                .build();
                
        // Creating a high-end computer with optional parameters
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        // Testing the Builder Implementation
        System.out.println("Basic Computer Configuration: \n" + basicComputer.toString() + "\n");
        System.out.println("Gaming Computer Configuration: \n" + gamingComputer.toString());
    }
}
