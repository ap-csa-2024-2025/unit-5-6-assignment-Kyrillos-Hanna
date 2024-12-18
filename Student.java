public class Student
{
  private int ID;
  private int grade;
  private String name;

  // Constructors
  public Student(int input_id, int input_grade, String input_name)
  {
    ID = input_id;
    grade = input_grade;
    name = input_name;
  }

  public Student() {
    this(444444, 100, "Name");
  }

  public Student(int ID) {
    this(ID, 100, "Name");
  }

  public Student(String name) {
    this(444444, 100, name);
  }

  public String toString()
  {
    return "ID: " + ID + "\nName: " + name + "\nGrade: " + grade;
  }

  public String getName() {
    return name;
  }

  public int getGrade() {
    return grade;
  }

  public int getID() {
    return ID;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGrade (int grade) {
    this.grade = grade;
  }

  public void setID (int ID) {
    this.ID = ID;
  }
}
