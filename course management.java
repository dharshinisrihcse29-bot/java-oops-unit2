import java.util.*;
interface CourseManagement {
 public void displayCourseDetails();
}
class Course implements CourseManagement {
 private String courseName;
 private String instructorName;
 private int duration;
 private double courseFee;
 public Course(String a, String b, int c, double d) {
 this.courseName = a;
 this.instructorName = b;
 this.duration = c;
 this.courseFee = d;
 }
 public void displayCourseDetails() {
 System.out.println("Course Details:");
 System.out.println("Course name: " + courseName);
 System.out.println("Instructor name: " + instructorName);
 System.out.println("Duration: " + duration);
 System.out.println("Course fee: " + courseFee);
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 System.out.print("Enter course name: ");
 String a = s.nextLine();
 System.out.print("Enter instructor name: ");
 String b = s.nextLine();
 System.out.print("Enter course duration: ");
 int c = s.nextInt();
 System.out.print("Enter course fee: ");
 double d = s.nextDouble();
 CourseManagement course = new Course(a, b, c, d);
 course.displayCourseDetails();
 }
}