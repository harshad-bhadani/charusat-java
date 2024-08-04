
import java.util.*;

class student
{
    Scanner sc = new Scanner(System.in);
    int studentid;
    String name;
    String department;
    int age;

   
    public int getstudentid()
    {
       System.out.println("Enter id:");
       studentid= sc.nextInt();
       sc.nextLine();
        return studentid;
    }
    public String getname()
    {
       System.out.println("Enter Name:");
       name= sc.nextLine();

        return name;
    }
    public int getage()
    {
       System.out.println("Enter age:");
        age= sc.nextInt();
        sc.nextLine();
        return age;
    }
    public String getdepartment()
    {
       System.out.println("Enter department:");
       department = sc.nextLine();
        return department ;
    }

    public int  search(int find)
    {
            if(studentid==find)
            {
                return 1;
            }
            return -1;
    }
    public void display()
    {
        System.out.println("id:"+studentid);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("department:"+department);
        
    }
}
public class ass1_1 {
    public static void main(String[] args) {
        student s[] =new student[10];
        int n,choice,i;
       
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number of student:");
            n= sc.nextInt();

        
        int f=1;
        while(f!=0)
        {
            
            System.out.println("Enter 1 to enter data");
            System.out.println("enter 2 to display paricular");
            System.out.println("enter 3 to display all");
            System.out.println("enter 4 to exit");
            System.out.println("Enter the choice:");
            choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            
            for(i=0; i<n; i++)
            {
                s[i] = new student();
                s[i].getstudentid();
                s[i].getname();
                s[i].getage();
                s[i].getdepartment();
            }
            break;

            case 2:
            int find;
            System.out.println("Enter the id to find:");
            find =sc.nextInt();

            for(i=0; i<n; i++)
            {
                if(s[i].search(find)==1)
                {
                    s[i].display();
                }
            }
            break;

            case 3:

            for(i=0; i<n; i++)
            {
                s[i].display();
            }
            break;


            case 4:
            break;
        }
        System.out.println("Enter any number to continue:");
        f=sc.nextInt();
    }
       
    }
}
