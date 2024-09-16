package Streams;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        final List<Integer> orignal = List.of(1, 2, 3, 4, 5, 6, 7, 91230, 73690);

        final List<Integer> newList = new ArrayList<>();
        for (final var element : orignal) {
            if (element % 2 == 0) {
                newList.add(element);
            }
        }

        System.out.println(newList);

    }
}
