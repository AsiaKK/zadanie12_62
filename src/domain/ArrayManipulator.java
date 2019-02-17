package domain;

public class ArrayManipulator {

    public int[] calculateArray(int[] inputs, int n) {
        if (inputs == null) {
            throw new NullPointerException("");
        }
        if (n > inputs.length) {
            throw new ArrayIndexOutOfBoundsException("");
        }
        if (n <= 1 || n >= inputs.length / 2) {
            throw new IllegalArgumentException("");
        }


        int[] results = new int[n];

        int subTableCounter;

        if (inputs.length % n == 0) {
            subTableCounter = (inputs.length / n);
        } else {
            subTableCounter = (inputs.length / n) + 1;
        }

        int i =0;
        int j = 0;
        int limit = subTableCounter;

        while (i < inputs.length) {
            for (; i < limit && i < inputs.length ; i++) {
                results[j] += inputs[i];
            }
            i = limit;
            limit += subTableCounter;
            j++;
        }

        return results;
    }
}
