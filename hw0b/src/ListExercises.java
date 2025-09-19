import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if (L.isEmpty()){
            return 0;
        }
        else {
            int list_sum = 0;
            for (int i = 0; i < L.size(); i++){
                list_sum += L.get(i);
            }
            return list_sum;
        }
        //return 0;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        if (L.isEmpty()){return new ArrayList<>();}
        else {
            List<Integer> lst = new ArrayList<>();
            for (int i = 0; i < L.size(); i++) {
                if (L.get(i) % 2 == 0){lst.add(L.get(i));}
                }
            return lst;
            }
        //return null;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < L1.size(); i++){
            for (int j = 0; j < L2.size(); j++){
                if (L1.get(i) == L2.get(j)){
                    lst.add(L1.get(i));
                }
            }
        }
        return lst;

        // return null;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for (int i = 0; i < words.size(); i++){
            if (words.get(i).equals(c)){
                count += 1;
            }
        }
        return count;
        // return 0;
    }
}
