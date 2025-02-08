class User
{
    String username;
    String email;
    int age;

    User( )
    {
        this.username="Guest";
        this.email="not provide";
        this.age=0;
    }

    User(String username ,String email)
    {
        this.username=username;
        this.email=email;
        this.age=0;
    }
    User(String username ,String email,int age) //here overload the construtor same method but change in arguemnt
    {
        this.username=username;
        this.email=email;
        this.age=13;
    }

    public void display()
    {
        System.out.println("User name :"+username+ "--"+"user email:"+email+ "--"+" User age:"+age);
    }
}
public class UserManagemenSystem {
    
    public static void main(String[] args) {
        
        User user=new User();
        User user2=new  User("Pratham", "gp@gmai.com");
        User user3=new User("Vikas", "Vikas@gmai.com", 12);

        user.display();
        user2.display();
        user3.display();

    }
}
