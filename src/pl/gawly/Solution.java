package pl.gawly;

/**
 * Created by wojte on 12.01.2017.
 */
public class Solution {
    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[(i + K) % A.length] = A[i];
        }
        return result;
    }
}
