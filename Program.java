// Liam Murphy
package Homework3;
public class Program {
    public static void main(String[] args) {
        // Create instance of FitByte using non-default constructor
        FitByte fitByte = new FitByte(26, 59);

        // Create instance of ExercisePlan using non-default constructor
        ExercisePlan exercisePlan = new ExercisePlan("Intermediate Plan", 16, "This is an intermediate exercise plan focusing on muscle toning and cardiovascular health.");

        // Call methods from FitByte class
        System.out.println("Target Heart Rate: " + fitByte.targetHeartRate(0.75));
        fitByte.displayFitByteInfo();

        // Call methods from ExercisePlan class
        exercisePlan.displayPlanDetails();
    }
}
