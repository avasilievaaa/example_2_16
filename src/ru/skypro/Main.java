package ru.skypro;

import ru.skypro.IntList.IntList;
import ru.skypro.IntList.IntListImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IntList intList = new IntListImpl();
        intList.add(5); //1
        intList.add(8); //2
        intList.add(1); //3
        intList.add(20); //4
        intList.add(13); //5
        intList.add(7); //6
        intList.add(2); //7
        intList.add(18); //8
        intList.add(15); //9
        intList.add(12); //10
        intList.add(3); //11
        System.out.println(intList.contains(20));
        System.out.println(Arrays.toString(intList.toArray()));
        System.out.println(intList.getSizeOfArray());
    }
}