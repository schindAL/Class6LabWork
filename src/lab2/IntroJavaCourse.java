package lab2;

import javax.swing.JOptionPane;
/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }
    @Override
    public final String getCourseNumber() {
        return courseNumber;
    }
    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        else{
            this.courseNumber = courseNumber;
        }
    }
    @Override
    public final double getCredits() {
        return credits;
    }
    @Override
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        else{
            this.credits = credits;
        }
    }
    @Override
    public final String getCourseName() {
        return courseName;
    }
    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    @Override
    public final String getPrerequisites() {
        if(this.prerequisites == null || this.prerequisites.equals("")){
            return "There are no prerequistites!";
        }
        else{
            return prerequisites;
        }
    }
    @Override
    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        else{
            this.prerequisites = prerequisites;
        }
    }
    
}
