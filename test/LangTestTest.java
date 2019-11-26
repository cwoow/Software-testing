import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class LangTestTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testLang1() throws Exception {
        int[] nums1 = {  70, 6, 86 };
        int[] nums2 = { 9, 4, 66};
        LangTest test = new LangTest();
        test.testArr(nums1, nums2);
    }

    @Test
    public void testLang2() throws Exception {
        int[] nums1 = { 9, 50, 68, 31, 19, 22, 48, 39, 14, 33};
        int[] nums2 = {  73, 48, 7, 39, 14, 33};
        LangTest test = new LangTest();
        test.testArr(nums1, nums2);
    }

    @Test
    public void testLang3() throws Exception {
        int[] nums1 = { 45, 7, 63, 31, 50, 81};
        int[] nums2 = { 46, 67, 52, 37, 68, 42, 61, 28, 63, 43, 77, 68, 45};
        LangTest test = new LangTest();
        test.testArr(nums1, nums2);
    }
}