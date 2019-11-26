import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class LangTest {

    public static void  moduleTest(int nums[]) {
        System.out.println("桩模块调用成功！");
    }


    public static void throwMAXMIN(int nums[]){
        int length = ArrayUtils.getLength(nums);
        Arrays.sort(nums);
        //数组长度小于10去掉最小值
        if(length < 10){
    //        System.out.println(length);
            ArrayUtils.remove(nums,0);
   //         ArrayUtils.subarray(nums, length-2, length);
        }
        //数组长度在10~20之间去掉最大值
        else if(length >= 10 && length<20){
            ArrayUtils.remove(nums, length - 1);
        }
        //数组长度大于20去掉最小值和最大值
        else{
            ArrayUtils.remove(nums, 0);
            ArrayUtils.remove(nums, length - 1);
        }
    }

    public static void testArr( int nums1[], int nums2[]){

        int[] num;
       // int num1 = ArrayUtils.subarray(nums1[]{1, 2, 3, 4, 5, 6}, 0, 1);
      //  int num2 = ArrayUtils.subarray(nums2[]{}, 0, 1);
        int length1 = ArrayUtils.getLength(nums1);
        int length2 = ArrayUtils.getLength(nums2);
        //数组长度相等则把两数组合并
        if(length1 == length2){
            num = ArrayUtils.addAll(nums1, nums2);
        }
        //数组1>数组2则先使2反转再合并
        else if(length1 < length2){
            ArrayUtils.reverse(nums2);
            num = ArrayUtils.addAll(nums1, nums2);
        }
        //数组1<数组2则反转1再合并
        else{
            ArrayUtils.reverse(nums1);
            num = ArrayUtils.addAll(nums1, nums2);
        }
     //   throwMAXMIN(num);
        moduleTest(num);
        System.out.println(Arrays.toString(num));
    }

}
