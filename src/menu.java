import java.util.*;
public class menu {
    public static void main(String[] args) {
        System.out.println("Menu\n");
        System.out.println("1. Enter student details");
        System.out.println("2. Find student");
        System.out.println("3. Top Students");
        System.out.println("4. Show all Students");
        System.out.println("5. Exit");
        Scanner input=new Scanner(System.in);
        int choice= input.nextInt();

        if (choice==1){
            System.out.println(" Enter student details");
            System.out.println(" Enter student Name");
            Scanner nme=new Scanner(System.in);
            String Name= nme.nextLine();

            System.out.println(" Enter student Id");
            Scanner id=new Scanner(System.in);
            int studentId= id.nextInt();

            System.out.println(" Enter student gender");
            Scanner gndr=new Scanner(System.in);
            String Gender = gndr.next();

            System.out.println(" Enter subject marks");

            String[] subMarks = {"Maths\n", "Science\n", "English\n", "Social\n"};
            for (int i = 0; i < subMarks.length; i++) {
                System.out.println(subMarks[i]);}
                Scanner mathsMarks=new Scanner(System.in);
                Double subm= mathsMarks.nextDouble();
                Scanner scienceMarks=new Scanner(System.in);
                Double subs= scienceMarks.nextDouble();
                Scanner engMarks=new Scanner(System.in);
                Double sube= engMarks.nextDouble();
                Scanner socialMarks=new Scanner(System.in);
                Double subso= socialMarks.nextDouble();
                double tot=(subm+subs+sube+subso)/4;
                System.out.println(" Total Marks percentage is" + tot);



        }
        if (choice==2){
            System.out.println(" Find student");
        }
        if (choice==3){
            System.out.println(" Top Students");
        }
        if (choice==4){
            System.out.println(" Show all Students");
        }

    }
}





