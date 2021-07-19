import java.util.Scanner;  // importing java.util package
import java.io.*;  // importing java.io package
class Quiz
{
    //Declare instance variables
    static Thread thread = new Thread();  // Thread class for sleep function
    static String name;  // a String variable for accepting the player’s name
    static String answer[]=new String[15];  // a String array for accepting the player’s answer
    static String correctAnswers[]={"c","b","b","d","a","c","a","d","d","c","a","b","a","c","a"};  // correct answers for the questions
    //Method to take user inputs
    public static void takeInputs()throws Exception
    {
        //Declare Variables
        Scanner scan=new Scanner(System.in);
        int score=0; // an integer variable for storing the player’s score

        //Display Messages
        System.out.println("\t*****************************************");
        System.out.println("\t Welcome to National Talent Hunt ");
        thread.sleep(1000);
        System.out.println("\n\tYou have 5 multiple choice questions.");
        thread.sleep(1500);
        System.out.println("\n\tEach question has 4 choices.");
        thread.sleep(1500);
        System.out.println("\n\tEnter the answer number as your answer");
        thread.sleep(1500);
        System.out.println("\n\tEach correct choice will fetch you 20 points");
        thread.sleep(1500);

        //Take inputs
        System.out.print("\nEnter Your Name => ");
        name= scan.next();

        //Question 1
        System.out.println("\n  Your first question is : ");
        thread.sleep(1000);
        System.out.println("\n1.15, 31, 63, 127, ? ");
        thread.sleep(1500);
        System.out.println("\n(a) 501");
        thread.sleep(600);
        System.out.println("(b) 516");
        thread.sleep(600);
        System.out.println("(c) 511");
        thread.sleep(600);
        System.out.println("(d) 522");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[0]=scan.next();
        if((answer[0].equalsIgnoreCase(correctAnswers[0])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;

        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[0]);
            thread.sleep(500);
        }
        thread.sleep(500);

        //Question 2
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n2.13, 20, 14, 19, 15, ? ");
        thread.sleep(900);
        System.out.println("\n(a) 10");
        thread.sleep(600);
        System.out.println("(b) 18");
        thread.sleep(600);
        System.out.println("(c) 9");
        thread.sleep(600);
        System.out.println("(d) 16");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[1]=scan.next();
        if((answer[1].equalsIgnoreCase(correctAnswers[1])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[1]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 3
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n3.How many times a day does the minute hand and the hour hand coincide  : ");
        thread.sleep(900);
        System.out.println("\n(a) 11");
        thread.sleep(600);
        System.out.println("(b) 22");
        thread.sleep(600);
        System.out.println("(c) 12");
        thread.sleep(600);
        System.out.println("(d) 20");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[2]=scan.next();
        if((answer[2].equalsIgnoreCase(correctAnswers[2])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[2]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 4
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n4. 2, 7, 28, 63, 126, ?  ");
        thread.sleep(900);
        System.out.println("\n(a) 195");
        thread.sleep(600);
        System.out.println("(b) 225");
        thread.sleep(600);
        System.out.println("(c) 216");
        thread.sleep(600);
        System.out.println("(d) 215");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[3]=scan.next();
        if((answer[3].equalsIgnoreCase(correctAnswers[3])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[3]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 5
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n5. 2, 10, 30, 68, ? ");
        thread.sleep(900);
        System.out.println("\n(a) 130");
        thread.sleep(600);
        System.out.println("(b) 125");
        thread.sleep(600);
        System.out.println("(c) 120");
        thread.sleep(600);
        System.out.println("(d) 90 ");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[4]=scan.next();
        if( (answer[4].equalsIgnoreCase(correctAnswers[4])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[4]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 6
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n6.25 16 9 4 1 0 ? ");
        thread.sleep(900);
        System.out.println("\nIdentify the number : ");
        thread.sleep(600);
        System.out.println("\n(a) -1");
        thread.sleep(600);
        System.out.println("(b) 0");
        thread.sleep(600);
        System.out.println("(c) 1");
        thread.sleep(600);
        System.out.println("(d) 1/2 ");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[5]=scan.next();
        if( (answer[5].equalsIgnoreCase(correctAnswers[5])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[5]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 7
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n7. 20, 33, 50, 69, 92, ? ");
        thread.sleep(900);
        System.out.println("\n(a) 121");
        thread.sleep(600);
        System.out.println("(b) 110");
        thread.sleep(600);
        System.out.println("(c) 156");
        thread.sleep(600);
        System.out.println("(d) 125");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[6]=scan.next();
        if( (answer[6].equalsIgnoreCase(correctAnswers[6])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[6]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 8
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n8. In a party, there are 15 members. Each shakes hand with one another. Total numbers of the handshakes is : ");
        thread.sleep(900);
        System.out.println("\n(a) 120");
        thread.sleep(600);
        System.out.println("(b) 15");
        thread.sleep(600);
        System.out.println("(c) 90");
        thread.sleep(600);
        System.out.println("(d) 105");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[7]=scan.next();
        if( (answer[7].equalsIgnoreCase(correctAnswers[7])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[7]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 9
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n9. 9 36 40 10 6 24 ? ");
        thread.sleep(900);
        System.out.println("\n(a) 26");
        thread.sleep(600);
        System.out.println("(b) 32");
        thread.sleep(600);
        System.out.println("(c) 40");
        thread.sleep(600);
        System.out.println("(d) 28");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[8]=scan.next();
        if( (answer[8].equalsIgnoreCase(correctAnswers[8])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[8]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 10
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n10.Find the 13th number in the series : ");
        thread.sleep(700);
        System.out.println("\n 8 , 24 , 72 ....  ");
        thread.sleep(900);
        System.out.println("\n(a) 246");
        thread.sleep(600);
        System.out.println("(b) 132");
        thread.sleep(600);
        System.out.println("(c) 216");
        thread.sleep(600);
        System.out.println("(d) 182");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[9]=scan.next();
        if( (answer[9].equalsIgnoreCase(correctAnswers[9])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[9]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 11
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n11.13, 14, 27, 30, 55, 62, ?, 126 ");
        thread.sleep(900);
        System.out.println("\n(a) 111");
        thread.sleep(600);
        System.out.println("(b) 121");
        thread.sleep(600);
        System.out.println("(c) 105");
        thread.sleep(600);
        System.out.println("(d) 92");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[10]=scan.next();
        if( (answer[10].equalsIgnoreCase(correctAnswers[10])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[10]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 12
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n12.343, 350, 336, 357, 329, ?, 322 ");
        thread.sleep(900);
        System.out.println("\n(a) 354");
        thread.sleep(600);
        System.out.println("(b) 364");
        thread.sleep(600);
        System.out.println("(c) 368");
        thread.sleep(600);
        System.out.println("(d) 370");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[11]=scan.next();
        if( (answer[11].equalsIgnoreCase(correctAnswers[11])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[11]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 13
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n13.10, 14, 23, 39, 64, ?, 149 ");
        thread.sleep(900);
        System.out.println("\n(a) 100");
        thread.sleep(600);
        System.out.println("(b) 103");
        thread.sleep(600);
        System.out.println("(c) 78");
        thread.sleep(600);
        System.out.println("(d) 128");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[12]=scan.next();
        if( (answer[12].equalsIgnoreCase(correctAnswers[12])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[12]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 14
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n14.The angle between the hour hand and minute hand of a clock when the time is 8:40 : ");
        thread.sleep(900);
        System.out.println("\n(a) 15 degrees");
        thread.sleep(600);
        System.out.println("(b) 18 degrees");
        thread.sleep(600);
        System.out.println("(c) 20 degrees");
        thread.sleep(600);
        System.out.println("(d) 21 degrees");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[13]=scan.next();
        if( (answer[13].equalsIgnoreCase(correctAnswers[13])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[13]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Question 15
        System.out.println("\n  Your next question is : ");
        thread.sleep(800);
        System.out.println("\n15.A clock takes 10 seconds to strike 5. How much time will it take to strike 10 ? ");
        thread.sleep(900);
        System.out.println("\n(a) 20 seconds");
        thread.sleep(600);
        System.out.println("(b) 22.5 seconds");
        thread.sleep(600);
        System.out.println("(c) 24 seconds");
        thread.sleep(600);
        System.out.println("(d) 21.5 seconds");
        thread.sleep(600);
        System.out.print("\nEnter Your Choice => ");
        answer[14]=scan.next();
        if( (answer[14].equalsIgnoreCase(correctAnswers[14])))
        {
            System.out.println("\nCorrect!");
            thread.sleep(500);
            score+=20;
        }
        else
        {
            System.out.println("\nSorry! Correct answer is " +correctAnswers[14]);
            thread.sleep(500);

        }
        thread.sleep(500);

        //Anouncing the scores

        if(score==300)
        {
            System.out.print("\nYour Total Score is ");
            thread.sleep(800);
            System.out.println(score);
            thread.sleep(800);
            System.out.println("\nWow ! " + name + " you have won a brand new BMW i8 car !");
            thread.sleep(800);
            System.out.println("\nYou will receive your award on your birthday");
        }
        else if(score>250)
        {
            System.out.print("\nYour Total Score is ");
            thread.sleep(800);
            System.out.println(score);
            thread.sleep(800);
            System.out.println("\nWow ! " + name +  " you have won a brand new Harley Davidson  bike !");
            thread.sleep(800);
            System.out.println("\nYou will receive your award on your birthday");
        }
        else if(score>200)
        {
            System.out.print("\nYour Total Score is ");
            thread.sleep(800);
            System.out.println(score);
            thread.sleep(800);
            System.out.println("\nWow ! " + name + " you have won a brand new Apple iPhone 6+ !");
            thread.sleep(800);
            System.out.println("\nYou will receive your award on your birthday");
        }
        else
        {
            System.out.print("\n" + name + " your Total Score is ");
            thread.sleep(800);
            System.out.println(score);
        }
        thread.sleep(900);
        System.out.println("\nThank You");
        //System.exit(0);
    }

    public static void main(String args[])throws Exception
    {
        takeInputs(); //call to method takeInputs()
    }
}
