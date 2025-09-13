import java.util.Scanner;

public class Lesson8 { //// this is not lesson 8
    public static void main(String[] args) {

        // 1. int, enum, String are valid switch types //// not enum, answer: char

        // 2. Switch trace
        int x = 3, p = 5, y = -8;
        switch(x) {
            case 2:
                p++;
            case 3:
            case 4:
                y += (--p);
                break;
            case 5:
                y += (p++);
        }
        System.out.println(y);  // -4

        // 3. Switch on myChar
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char myChar = kb.next().charAt(0);
        int result = 0;

        switch(myChar) {
            case 'G': case 'g':
                result++;
                break;
            case 'M': case 'm':
                result--;
                break;
            default:
                result += 100;
        }
        System.out.println(result);

        //4    3
        //5
        char chr = 'z';
        //6
        int xx = 10, yy = 12;
        System.out.println("The sum is " + xx + yy); //// you need to comment your answer, answer: sum is 1012
        System.out.println("The sum is " + (xx + yy)); //// answer: sum is 22

        //7 Fixed: declare and read speed before switch
        System.out.print("Enter the speed: ");
        int speed = kb.nextInt();

        switch(speed) {
            case 75:
                System.out.println("Exceeding speed limit");
                break;
            case 69:
            case 70:
                System.out.println("Getting close");
                break;
            case 65:
                System.out.println("Cruising");
                break;
            default:
                System.out.println("Very slow");
        }

        kb.close();

        //8
        //no

        //9
        String s = "X";
char cchr = s.charAt(0);


    }
}
