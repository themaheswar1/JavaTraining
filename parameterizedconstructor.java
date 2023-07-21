class Student1{
    int roll_no;
    String student_name;
    int marks;
    Student1(int roll_no1,String student_name1){
           roll_no =roll_no1;
           student_name = student_name1;
    }
}

class Main1{
    public static void main(String args[]){
        Student1 object1 = new Student1(1001,"HyderabadModel");
        Student1 object2 = new Student1(1453,"TelanganaModel");

        System.out.println("First student name is "+object1.student_name+" and roll no is "+object1.roll_no);
        System.out.println("Second student name is "+object2.student_name+" and roll no is "+object2.roll_no);
    }
}