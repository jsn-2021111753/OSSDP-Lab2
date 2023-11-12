import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L2021111753_5_Test {
    @Test
    public void Solution5Test() {
        Solution5 solution = new Solution5();
        int nums1[] = {3, 5, 6, 7};
        int nums2[] = {3, 3, 6, 8};
        int nums3[] = {2, 3, 3, 4, 6, 7};
        assertEquals(8,solution.numSubseq(nums1, 9));
        assertEquals(12,solution.numSubseq(nums2, 10));
        assertEquals(122,solution.numSubseq(nums3, 12));
    }
}
