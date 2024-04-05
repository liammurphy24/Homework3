package Homework3;
// Define the FitByte class
public class FitByte {
    // Private fields for age and resting heart rate
    private int age;
    private int restingHeartRate;

    // Default constructor with fixed values for age and resting heart rate
    public FitByte() {
        this.age = 26; // Default age
        this.restingHeartRate = 59; // Default resting heart rate
    }

    // Parameterized constructor to initialize age and resting heart rate
    public FitByte(int age, int restingHeartRate) {
        this.age = age; // Set age
        this.restingHeartRate = restingHeartRate; // Set resting heart rate
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter for resting heart rate
    public int getRestingHeartRate() {
        return restingHeartRate;
    }

    public void setRestingHeartRate(int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
    }

    // Method to calculate and return the target heart rate
    public double targetHeartRate(double percentageOfMaximum) {
        // Formula to calculate maximum heart rate
        double maxHeartRate = 206.3 - (0.711 * age);
        // Formula to calculate target heart rate
        return (maxHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }

    // Additional method to display FitByte information (void return type)
    public void displayFitByteInfo() {
        System.out.println("Age: " + age);
        System.out.println("Resting Heart Rate: " + restingHeartRate);
    }
}
