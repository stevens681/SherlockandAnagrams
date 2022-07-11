import java.util.Arrays;
import java.util.HashMap;

public class Result {
    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
        // Write your code here
        int res = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++){
                char[] a =s.substring(i, j+1).toCharArray();
                Arrays.sort(a);
                String temp = new String(a);
                if (!map.containsKey(temp)) {
                    map.put(temp, 1);

                } else {

                    map.put(temp, map.get(temp) + 1);
                }
            }
        }
        for(String ch: map.keySet()){
            int n = map.get(ch);
            res += (n * (n-1))/2;

        }
        return res;

    }

    public static void main(String[] args) {
        String s1 = "kkkk";

        System.out.println(sherlockAndAnagrams(s1));

    }
}
