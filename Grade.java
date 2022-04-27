import java.util.Scanner;

    public class Grade {
        public static void main(String[] args) {

            int math, phys, chem, tr, hist, music;
        Scanner inp = new Scanner(System.in);
            System.out.print("Math Grade: ");
            math = inp.nextInt();

            System.out.println("Physics Grade: ");
            phys = inp.nextInt();

            System.out.println("Chemistry Grade: ");
            chem = inp.nextInt();

            System.out.println("Turkish Grade: ");
            tr = inp.nextInt();

            System.out.println("History Grade: ");
            hist = inp.nextInt();

            System.out.println("Music Grade: ");
            music = inp.nextInt();

            int sum = (math + phys + chem + tr + hist + music);
            double avg = sum / 6.0;

            String passFail = avg >= 60 ? "passed" : "failed";
            System.out.println("Your average is " + avg + "; you " + passFail);
        }
    }
