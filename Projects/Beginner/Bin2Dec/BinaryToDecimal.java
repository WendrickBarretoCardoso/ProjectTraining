package Beginner.Bin2Dec;

public class BinaryToDecimal {
    public static String Bin2Dec(String x) {
        char[] bin = x.toCharArray();
        int[] binary = new int[bin.length];
        int y = 0;
        for (char b : bin) {
            binary[y] = Character.getNumericValue(b);
            y++;
        }
        int sum = 0;
        y = binary.length - 1;
        for (int f : binary) {
            sum += (int) (f * (Math.pow(2, y)));
            y--;
        }
        x = String.valueOf(sum);
        return(x);
    }
}
