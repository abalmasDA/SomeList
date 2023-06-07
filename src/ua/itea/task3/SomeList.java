package ua.itea.task3;

import java.util.ArrayList;
import java.util.ListIterator;

public class SomeList {
    private ArrayList<Integer> someList = new ArrayList<>();


    public void addingNumberToList(int numberToAdd) {
        someList.add(someList.size(), numberToAdd);
    }

    public void printList() {
        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }
    }


    public void increasingNumberListByNumber(int numberIncrease) {
        ListIterator<Integer> listIterator = someList.listIterator(0);
        while (listIterator.hasNext()) {
            Integer elementOfList = listIterator.next();
            listIterator.set(elementOfList + numberIncrease);
        }


    }


}
