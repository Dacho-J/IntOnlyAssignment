package dk.kea.dat19c;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntOnlyArrayList {

    private int[] list;

    public IntOnlyArrayList() {
        list = new int[0];
        //ia = new ArrayList<>();
        //str = 0;
    }

    public void add(int value){
        int[] tempList = Arrays.copyOf(list, list.length+1);
        tempList[tempList.length - 1] = value;
        list = tempList;
    }

    public int get(int index) {
        if ( 1 < 0 || index > list.length - 1){
            throw new IndexOutOfBoundsException("Index " +index+ " out of bound ");
        }
        return list[index];
    }



    public void remove(int index){
        int[] tempList = Arrays.copyOfRange(list, 0, index);
        int[] tempList2 = Arrays.copyOfRange(list, index+1, list.length);
        list = Arrays.copyOf(tempList, tempList.length + tempList2.length);
        System.arraycopy(tempList2, 0, list, tempList.length, tempList2.length);
        }

    public int size(){

        return list.length;
    }

    //her kan toString skrives
}
