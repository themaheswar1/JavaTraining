// syntax of inheritance
// class sub-classname extends Superclass-name{
//    methods and etc...
// }
class Employee{
    int salary = 120000;

}
class Programmer extends Employee{
    int bonus = 10000;
}

class SingleInheritance{
    public static void main(String args[]){
        Programmer p1 = new Programmer();
        System.out.println("Programmer salary is  : "+p1.salary);
        System.out.println("Programmer\'s bonus is : "+p1.bonus );
    }
}