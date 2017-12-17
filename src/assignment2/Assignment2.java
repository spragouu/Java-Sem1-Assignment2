
package assignment2;

/**
 *
 * @author Dylan
 */
public class Assignment2 {
    //declare arrays so all methods can call them
    private static String[] students;
    private static double[][] grades;
    
    public static void main(String[] args) {
        initializeData();
        displayData();
        highestAvg();
        below50Avg();
    }
    
    /**
     * Method that initializes 5 students and grades for 5 courses and populates data.
     */
    public static void initializeData() {
        //Give students array some values
        students = new String[] {"James", "Luke", "Alex", "Jenny"};
        
        //give 2D grades array some values
        grades = new double[][] {{98, 72, 85, 77, 90},{25,49,26,77,60},{13,8,46,52,28},{77,81,85,69,88}}; 
    }
    
    /**
     * Method that takes the data from initializeData() and displays it to the screen.
     */
    public static void displayData() {
        System.out.printf("%-8s %-10s %-10s %-10s%n", "Student", "Course 1", "Course 2", "Course 3", "Course 4", "Course 5");
        
        for(int i = 0; i<students.length; i++) {
            System.out.print(students[i]);
            for(int j = 0; j<grades.length; j++) {
                System.out.print(grades[i][j] + "   ");
            }
            System.out.println("");
        }
    }
    
    /**
     * Method that will calculate what student has the highest overall average and display it to the screen.
     */
    public static void highestAvg() {
        
    }
    
    /**
     * Method that will calculate which student(s)' overall average is below 50% and display it to the screen.
     */
    public static void below50Avg() {
        
    }
    
}