class Student
{
    String name;
    int id;

    Student()
    {
        System.out.println("This consturot");
    }
    Student(int id)
    {
        System.out.println("here id is:"+id);
    }

    Student(String name)
    {
        System.out.println("Name is :"+name);
    }
}

class ConstrutorOver
{
    public static void main(String[] args) {
        
        Student s=new Student();
        Student s1=new Student("akash");
        Student s2=new Student(12);
    }
}