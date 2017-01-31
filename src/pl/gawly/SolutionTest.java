package pl.gawly;

import org.junit.*;

import java.util.Arrays;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testExample1() {
        Assert.assertTrue(Arrays.equals(new int[]{9, 7, 6, 3, 8}, s.solution(new int[]{3, 8, 9, 7, 6}, 3)));
    }

    @Test
    public void testEmpty() {
        Assert.assertTrue(Arrays.equals(new int[]{}, s.solution(new int[]{}, 3)));
    }

    @Test
    public void testTheSame() {
        Assert.assertTrue(Arrays.equals(new int[]{4, -4, 17}, s.solution(new int[]{4, -4, 17}, 0)));
    }
}
