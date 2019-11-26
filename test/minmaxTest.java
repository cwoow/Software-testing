import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class minmaxTest {

    @Test
    public void throwMAXMIN1() {
        int[] nums = { 7, 90, 54, 67, 22, 18};
        LangTest test = new LangTest();
        test.throwMAXMIN(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void throwMAXMIN2() {
        int[] nums = { 9, 50, 68, 31, 19, 22, 73, 48, 7, 39, 14, 33};
        LangTest test = new LangTest();
        test.throwMAXMIN(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void throwMAXMIN3() {
        int[] nums = { 45, 7, 63, 31, 50, 4, 81, 46, 67, 52, 37, 68, 42, 61, 28, 63, 90, 43, 77, 68, 45};
        LangTest test = new LangTest();
        test.throwMAXMIN(nums);
        System.out.println(Arrays.toString(nums));
    }
}