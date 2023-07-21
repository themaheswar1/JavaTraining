class defaultconstructor{
    int rollno;
    String studentname;
    double marks;
    
 defaultconstructor(){
    rollno = 2001;
    studentname = " Adipurush ";
    marks = 200.0;
 }   
}
 class Main{
    public static void main(String args[]){
        defaultconstructor object1 = new defaultconstructor();
        System.out.println("The marks of"+object1.studentname+"are "+object1.marks+" with roll no as "+object1.rollno);
        defaultconstructor object2 = new defaultconstructor();
                System.out.println("The marks of"+object2.studentname+"are "+object2.marks+" with roll no as "+object2.rollno);
    }
 }
// default constructors assign the same values for all the number of objects you create . that's why we normally use parameterized constructors for distinct objects with distinct values.