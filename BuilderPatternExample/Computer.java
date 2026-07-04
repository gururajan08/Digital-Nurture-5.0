public class Computer {
    // Required parameters
    private String CPU;
    private String RAM;
    private String storage;

    // Optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Builder Class
    public static class Builder {

        // Required parameters
        private String CPU;
        private String RAM;
        private String storage;

        // Optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String CPU, String RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
    
    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + 
               ", isGraphicsCardEnabled=" + isGraphicsCardEnabled + 
               ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
    }
}
