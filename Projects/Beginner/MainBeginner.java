import java.util.Scanner;
import static Beginner.Bin2Dec.BinaryToDecimal.Bin2Dec;

static Scanner input = new Scanner(System.in);

void main(String[] args) {
    System.out.println("""
            --------------------------------
            Starting Beginners Menu:
            0 - Exit
            1 - Binary To Decimal
            --------------------------------"""
    );
    Choice();
}

 static void Choice() {
    System.out.println("Chose one of the Items:");
    int x = input.nextInt();
    if (x == 0) {
        System.exit(0);
    } else if (x == 1) {
        System.out.println("Inform the Binary Code: ");
        String bin2 = input.next();
        Boolean test = false;
        char[] cor = bin2.toCharArray();
        for (char c : cor) {
            if (Character.getNumericValue(c) != 1 & Character.getNumericValue(c) != 0) {
                System.out.println("""
                        
                        Error
                        Inform a valid Binary number!
                        
                        """);
                Choice();
            }
        }
        String dec = Bin2Dec(bin2);
        System.out.println(dec + "\n");
        Choice();
    } else {
        System.out.println("""
                
                Invalid input!
                Chose a valid input to progress!
                
                """);
        Choice();
    }
 }