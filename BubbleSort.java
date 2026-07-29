import java.util.*;

public class BubbleSort<T extends Comparable<T>> {

    private void troca(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public T[] sort(T[] array, Comparator<T> comparator) {
        int n = array.length;

        for (int fase = 1; fase < n; fase++) {

            // j comparacoes

            for (int j = 0; j < n - fase; j++) {

                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    troca(array, j, j + 1);
                }
            }
        }

        return array;
    } // fim sort

    public T[] sort(T[] array) {
        return sort(array, (a, b) -> ((Comparable<T>) a).compareTo(b));

    }

    public T[] sortverbose(T[] array, Comparator<T> comparator) {
        int n = array.length;
        int comparacoes = 0;

        for (int fase = 1; fase < n; fase++) {
            System.out.println("fase" + fase + ":" + Arrays.toString(array));

            // j comparacoes

            for (int j = 0; j < n - fase; j++) {
                System.out.println("comparando " + array[j] + " e " + array[j + 1]);

                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    troca(array, j, j + 1);

                    System.out.println("invertendo " + array[j + 1] + " por " + array[j]);
                }
            }
        }

        return array;
    } // fim sort

    public T[] sortverbose(T[] array) {
        return sortverbose(array, (a, b) -> ((Comparable<T>) a).compareTo(b));

    }

}