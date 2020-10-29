package com.kulaninlab.lab3;

/**
 * @author Evgeniy Kulanin
 * @version alfa
 * */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> ArrList=new ArrayList<>();
        List<String> LinkList=new LinkedList<>();
        System.out.println("\n Тест метода remove, при удалении элемента в конце списка!");
        System.out.println("Количество удаленных элементов = 200000, количество изначальных элементов = 200002.");
        System.out.println("Array List : "+ TestCollections.removeLastTest(ArrList,200002,200000)+" nanoSek.");
        System.out.println("Linked List : "+ TestCollections.removeLastTest(LinkList,200002,200000)+" nanoSek.\n");

        System.out.println("Тест метода remove, при удалении элемента в центре списка!");
        System.out.println("Количество удаленных элементов = 4000, количество изначальных элементов = 1000000.");
        System.out.println("Array List : "+ TestCollections.removeCenterTest(ArrList,100000,4000)+" mSek.");
        System.out.println("Linked List : "+ TestCollections.removeCenterTest(LinkList,100000,4000)+" mSek.\n");

        System.out.println("Тест метода remove, при удалении элемента в начале списка!");
        System.out.println("Количество удаленных элементов = 500 количество изначальных элементов = 500000.");
        System.out.println("Array List : "+ TestCollections.removeFirstTest(ArrList,500000,500)+" mSek.");
        System.out.println("Количество удаленных элементов = 5000 количество изначальных элементов = 500000.");
        System.out.println("Linked List : "+ TestCollections.removeFirstTest(LinkList,500000,5000)+" mSek.\n");

        System.out.println("Тест метода add, при добавлении элемента в конец списка!");
        System.out.println("Количество добавленных элементов = 5000000.");
        System.out.println("Array List : " + TestCollections.addLastTest(ArrList, 5000000) + " mSek.");
        System.out.println("Linked List : " + TestCollections.addLastTest(LinkList, 5000000) + " mSek.\n");

        System.out.println("Тест метода add, при добавлении элемента в центр списка!");
        System.out.println("Количество добавленных элементов = 50, количество изначальных элементов = 5000000");
        System.out.println("Array List : "+ TestCollections.addCenterTest(ArrList,5000000,50)+" mSek.");
        System.out.println("Linked List : "+ TestCollections.addCenterTest(LinkList,5000000,50)+" mSek.\n");

        System.out.println("Тест метода add, при добавлении элемента в начало списка!");
        System.out.println("Количество добавленных элементов = 50, количество изначальных элементов = 500000.");
        System.out.println("Array List : "+ TestCollections.addFirstTest(ArrList,500000,50)+" mSek.");
        System.out.println("Linked List : "+ TestCollections.addFirstTest(LinkList,500000,50)+" mSek.\n");

        System.out.println("Тест метода get, индекс находится в конце.");
        System.out.println("Количество изначальных элементов = 5000000.Количество тестов 99999");
        System.out.println("Array List : "+ TestCollections.getLastTest(ArrList,5000,99999)+" mSek.");
        System.out.println("Linked List : "+ TestCollections.getLastTest(LinkList,5000,99999)+" mSek.\n");

        System.out.println("Тест метода get, индекс находится в середине.");
        System.out.println("Количество изначальных элементов = 5000000.КОличество тестов 1");
        System.out.println("Array List : "+ TestCollections.getTest(ArrList,5000000,2499999)+" mSek.");
        System.out.println("Linked List : "+ TestCollections.getTest(LinkList,5000000,2499999)+" mSek.\n");

        System.out.println("Тест метода get, индекс находится в начале.");
        System.out.println("Количество изначальных элементов = 5000000.Колличество тестов 200000000.");
        System.out.println("Array List : "+ TestCollections.getFirstTest(ArrList,500000,200000000)+" nanoSek.");
        System.out.println("Linked List : "+ TestCollections.getFirstTest(LinkList,500000,200000000)+" nanoSek.\n");

    }
}

