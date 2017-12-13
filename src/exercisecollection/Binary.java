package exercisecollection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Binary {
    public static void main(String[] args) {
        List<String> binaryNumbers = new ArrayList<String>();
        binaryNumbers.add("11");
        binaryNumbers.add("101");
        binaryNumbers.add("11111");
        binaryNumbers.add("1110");
        binaryNumbers.add("111101");

        for (String b : binaryNumbers) {
            System.out.println(b);

        }
        System.out.println("  ");
        Collections.sort(binaryNumbers, (o1, o2) -> -(Collections.frequency(Arrays.asList(o1.split("")), "1") - Collections.frequency(Arrays.asList(o2.split("")), "1")));
        for (String binaryNumber : binaryNumbers) {

            System.out.println(binaryNumber);
        }
    }
}