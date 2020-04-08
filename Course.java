import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName){
        this.courseName = courseName;
        students = new ArrayList<Student>();
    }

    public String getCourseName() {
        return courseName;
    }

    public int size() {
        return students.size();
    }

    public boolean add(Student student){

        if (!students.contains(student)){
            students.add(student);
            return true;
        }
        return false;
    }


    public void remove(Student student){
        students.remove(student);
    }


    public void remove(int i){
        students.remove(i);
    }


    public Student getStudent(int i){
        return students.get(i);
    }

    public static void main(String[] args) {

    }