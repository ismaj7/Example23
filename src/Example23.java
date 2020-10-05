import java.util.Scanner;
public class Example23 {
    public static void main (String [] argv){

        float grade = 0;
        float sum = 0;
        boolean wasTen = false;
        int i = 0;
        int tenCount = 0;

        System.out.println ("Please, enter your first grade here: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);

        while (grade != -1) {
            grade = inputValue.nextFloat();
            if (grade != -1) {
                sum = sum + grade;
                i = i + 1;
                System.out.println ("Please, enter another grade. (When you are finished, insert the value -1)");
                if (grade == 10) {
                    wasTen = true;
                    tenCount = tenCount + 1;
                }
            }
        }
        System.out.println ("The average grade is " + sum / i);
        if (wasTen) {
            System.out.println ("There was (" + tenCount + ") 10s in all your grades.");
        }else {
            System.out.println ("You didn't get any 10");
        }
    }
}
