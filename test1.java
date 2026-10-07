class Pen{
    String color;
    String type;

    public void write(){
        System.out.println(color + " " + type);
    }
    public void color(){
        System.out.println(this.color);
    }

}
class Student{
    String name;
    int age;
    int rollno;

    public void display(){
        System.out.println(name + " " + age + " " + rollno);
    }
    public void printInfo(){
      System.out.println(name + " " + age + " " + rollno);
    }
    Student(){
        
    }
    Student(String name, int age, int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
    }
    Student (Student s){
        this.name=s.name;
        this.age=s.age;
        this.rollno=s.rollno;
    }
    //NO DESTRUCTORS IN JAVA
    //GARBAGE COLLECTOR AVAILABLE IN JAVA
}
public class test1 {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel"; 
        pen1.write();
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen1.color();
        pen2.color();
        Student student1=new Student();
        student1.name="Alice";
        student1.age=20;
        student1.rollno=101;
        student1.printInfo();
        Student student2=new Student();
        student2.name="Bob";
        student2.age=22;
        student2.rollno=102;
        student2.printInfo();
        Student student3=new Student("Charlie",23,103);
        student3.printInfo();
        Student student4=new Student(student3);
        student4.printInfo();
    }

}
