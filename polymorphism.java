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
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
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
        //METHOD OVERLOADING -- POLYMORPHISM
        student1.printInfo(student1.name);
        student2.printInfo(student2.age);
        student1.printInfo(student1.name, student1.age);
        //CONSTRUCTOR OVERLOADING -- POLYMORPHISM
        

    }
}