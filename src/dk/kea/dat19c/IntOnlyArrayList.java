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

    //Adder en int value til listen, ved at tage listens længdeog  lægge 1 til. Derefter lægge en
    // int value ind på pladsen før, for hele tiden at have arrayet klar til at tage imod en
    // ny int.
    public void add(int value){
        int[] tempList = Arrays.copyOf(list, list.length+1);
        tempList[tempList.length - 1] = value;
        list = tempList;
    }

    //Returnere list index. Men inden tjekker den om index er out of bounds
    public int get(int index) {
        if ( 1 < 0 || index > list.length - 1){
            throw new IndexOutOfBoundsException("Index " +index+ " out of bound ");
        }
        return list[index];
    }


    //fjerner et element i listen.
    public void remove(int index){
        int[] tempList = Arrays.copyOfRange(list, 0, index);
        int[] tempList2 = Arrays.copyOfRange(list, index+1, list.length);
        list = Arrays.copyOf(tempList, tempList.length + tempList2.length);
        System.arraycopy(tempList2, 0, list, tempList.length, tempList2.length);
    }

    // returnere størrelsen på listen
    public int size(){

        return list.length;
    }

    //Fjerner alle elementer i listen ved at oprette et nyt array
    public void Clear(){

        list = new int[0];
    }

    //her kan toString skrives
}
