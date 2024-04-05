// Liam Murphy

package Homework3;
// Define the ExercisePlan class
public class ExercisePlan {
    // Private fields for name, duration in weeks, and description
    private String name;
    private int durationInWeeks;
    private String description;

    // Default constructor with fixed values for name, duration, and description
    public ExercisePlan() {
        this.name = "Beginner Plan"; // Default name
        this.durationInWeeks = 12; // Default duration
        this.description = "This is a beginner exercise plan focusing on building strength and endurance."; // Default description
    }

    // Parameterized constructor to initialize name, duration, and description
    public ExercisePlan(String name, int durationInWeeks, String description) {
        this.name = name; // Set name
        this.durationInWeeks = durationInWeeks; // Set duration
        this.description = description; // Set description
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for duration in weeks
    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }

    // Getter and setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method to display details of the exercise plan
    public void displayPlanDetails() {
        System.out.println("Exercise Plan: " + name); // Display name
        System.out.println("Duration: " + durationInWeeks + " weeks"); // Display duration
        System.out.println("Description: " + description); // Display description
    }
}
