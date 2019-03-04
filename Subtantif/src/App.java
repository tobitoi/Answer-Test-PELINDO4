import java.util.Scanner;

public class App {
    public static void main(String [] args)
    {
        // just uncomment the function for run answer 1 by 1
                //----------number 1-----------//
                            //mod();
                //----------------------------//

                //----------number 2-----------//
                        //rectangel();
                //----------------------------//

                //----------number 3-----------//
                            //fibo();
                //----------------------------//

                //----------number 4-----------//
                          //prima();
                //----------------------------//

                //----------number 6-----------//
                         //salary();
                //----------------------------//

    }

    //answer number 1
    public static void mod(){
        for ( int i=1; i<=100; i++)  {
            System.out.print(i);
            if( i % 3 == 0 ) {
                System.out.print("\t Tiga ");
            }
            if( i % 5 == 0 ) {
                System.out.print("\t Lima ");
            }
            System.out.print("\n ");

        }
    }

    //answer number 2
    public static void rectangel(){
        for (int i=10; i>=1; i--){
            System.out.print(i);
            for (int j=1; j<i; j++){
                int x= j-i;
                System.out.print(x);

            }
            System.out.println();
        }
    }
    //answer number 3
    public static void fibo(){
        Scanner show = new Scanner(System.in);
        System.out.println("Input Fibo   ");
        int n = show.nextInt();
        long fibonacci[] = new long[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] +  " ");
        }
    }
    //answer number 4
    public static void prima(){
        Scanner input = new Scanner(System.in);
        System.out.println (" input minimal number :");

        int minNumber = input.nextInt();
        System.out.println ("input max number:");
        int maxNumber = input.nextInt();
        System.out.println ("Prima Number "+minNumber+ " of  " +
                maxNumber + " : ");

        int flag = 0;
        for(int i = minNumber; i <= maxNumber; i++)
        {
            for( int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                System.out.println(i);
            }
        }
    }
    //answer number 6
    public static void salary(){
        Scanner input = new Scanner (System.in);
        String name,nik,div;
        byte group,day;
        int piece,basicSalary,transport,total,salary;

        System.out.println ("    EMPLOYEE SALARY   ");
        System.out.println ("==============================");

        System.out.print ("Input name : ");
        name = input.nextLine();

        System.out.print ("Input NIK : ");
        nik = input.nextLine();

        System.out.print ("input Divisi  : ");
        div = input.nextLine();

        System.out.println ("GROUP EMPLOYEE : \n 1.A \n 2.B \n 3.C" );
        System.out.print ("Please Choose : ");
        group = input.nextByte();

        System.out.print ("Enter Incoming Day Amount : ");
        day = input.nextByte();
        transport = day*25000;

        System.out.println ("\n==========================");
        System.out.println ("Name : "+name);
        System.out.println ("NIK : "+nik);
        System.out.println ("Divisi : "+div);
        System.out.println ("Group : "+group);

        switch (group) {
            case 1:
                basicSalary = 3000000;
                piece = basicSalary*5/100;
                salary = basicSalary-piece;
                total = salary+transport;
                System.out.println ("Transport Allowance : "+transport);
                System.out.println ("Basic Salary : "+basicSalary);
                System.out.println ("Insurance deductions : "+piece);
                System.out.println ("Salary Net : "+total);
                break;
            case 2:
                basicSalary = 2500000;
                piece = basicSalary*3/100;
                salary = basicSalary-piece;
                total = salary+transport;
                System.out.println ("Transport Allowance : "+transport);
                System.out.println ("Basic Salary : "+basicSalary);
                System.out.println ("Insurance deductions : "+piece);
                System.out.println ("Salary Net : "+total);
                break;
            case 3:
                basicSalary = 2000000;
                total = basicSalary+transport;
                System.out.println ("Transport Allowance : "+transport);
                System.out.println ("Basic Salary : "+basicSalary);
                System.out.println ("Salary Net : "+total);
                break;
            default:
                System.out.println ("class choice is not appropriate, please re-enter !!");
                break;
        }
    }
}

