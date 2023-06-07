/**
 * Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Main, створити список цілих чисел і за
 * допомогою ListIterator пройтись по списку і збільшити значення на 1.
 */

package ua.itea.task3;

public class Main {

    public static void main(String[] args) {

        SomeList someList = new SomeList();
        someList.addingNumberToList(0);
        someList.addingNumberToList(1);
        someList.addingNumberToList(2);
        someList.addingNumberToList(3);
        someList.addingNumberToList(4);
        someList.addingNumberToList(5);
        someList.addingNumberToList(6);
        someList.addingNumberToList(7);
        someList.addingNumberToList(8);
        someList.addingNumberToList(9);
        someList.addingNumberToList(10);
        someList.increasingNumberListByNumber(1);
        someList.printList();

    }


}
