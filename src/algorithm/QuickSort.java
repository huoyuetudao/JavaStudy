package algorithm;

import java.util.Arrays;

/**
 * 描述:快速排序实现
 *
 * @author: yangxiao2
 */
public class QuickSort {
    public static void main(String args[]){
        int array[] = {4,6,3,2,8};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int a[],int minIndex,int maxIndex){
        //边界值限定
        if(minIndex>=maxIndex){
            return;
        }
        int flag = a[minIndex];
        //递归实现
        int midIndex = findMid(a,minIndex,maxIndex,flag);
        quickSort(a,minIndex,midIndex-1);
        quickSort(a,midIndex+1,maxIndex);
    }

    private static int findMid(int[] a, int minIndex, int maxIndex, int flag) {
           while(minIndex<maxIndex){
               while(minIndex<maxIndex&&a[minIndex]<flag)
                   minIndex++;
               while(minIndex<maxIndex&&a[maxIndex]>flag)
                   maxIndex--;
               if(minIndex<maxIndex){
                   swap(a,minIndex,maxIndex);
               }
           }
           return minIndex;
    }

    private static void swap(int[] a, int minIndex, int maxIndex) {
        int temp = a[minIndex];
        a[minIndex]=a[maxIndex];
        a[maxIndex]=temp;
    }
}
