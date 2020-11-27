import java.util.*;
import java.util.Scanner ;
    public class jithu {

        static void enter(){ System.out.println("Menu \n");
            System.out.println("1.Insert Marks");
            System.out.println("2.Display Marks");
            System.out.println("3.Find Average");
            System.out.println("4.Edit Marks");
            System.out.println("5.Exit\n");
            System.out.println("Enter your Choice :");


        }


        public static void main(String jithu[]) {
            int m=1;
            int p=1;
            int c=1;
            int e=1;
            int b=1;
            enter();

            Scanner no = new Scanner(System.in);
            int number= no.nextInt();
            int i;

            while (true){
            switch(number) {
                case 1:
                    System.out.println("\nMarks\n");
                    String[] subMarks = {"1.Maths\n", "2.Physics\n", "3.Chemistry\n", "4.English\n", "5.Biology\n", "\n6.Exit\n"};
                    for (i = 0; i < subMarks.length; i++) {
                        System.out.println(subMarks[i]);
                    }
                    System.out.println("Enter marks: ");


                    System.out.println(" Enter Maths marks  : \n");
                    m = no.nextInt();
                    System.out.println(" Enter Physics marks  : \n");
                    p = no.nextInt();
                    System.out.println(" Enter Chemistry marks  : \n");
                    c = no.nextInt();
                    System.out.println(" Enter English marks  : \n");
                    e = no.nextInt();
                    System.out.println(" Enter Biology marks  : \n");
                    b = no.nextInt();
                    enter();break;
                case 2:
                    System.out.println("Display");
                    System.out.println("  Maths marks  : \n" + m);
                    System.out.println(" Physics marks  : \n" + p);
                    System.out.println(" Chemistry marks  : \n" + c);
                    System.out.println("  English marks  : \n" + e);
                    System.out.println("  Biology marks  : \n" + b);
                    break;
                case 3:
                    System.out.println("Average");

                    int avg = (m + p + c + e + b) / 5;
                    System.out.println(avg);
                    break;
                case 4:
                    System.out.println("Edit Marks");
                    break;
                case 5:
                    System.out.println("Program Exited");
                    break;

            }
            }


        }

}
