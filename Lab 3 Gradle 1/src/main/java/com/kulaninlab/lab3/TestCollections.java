
package com.kulaninlab.lab3;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
/**
 * Класс тестирования списков
 * */
public class TestCollections {
    /**
     * Даннный метод заполняет списки элементами
     * @param lst - тип списка, который нужно заполнить
     * @param startNumOfObj - колличество эллементов после заполнения списка
     * @return Заполненый список
     * */
    private static List adder(List lst,int startNumOfObj)
    {
        for(Integer i=0;i<startNumOfObj;i++)
        {
            lst.add(i.toString());
        }
        return lst;
    }
    /**
     * Даннный метод тестирует списки методом add (добавление в конец списка)
     * @param lst - тестируемый список
     * @param numOfTests - колличество тестов
     * @return Время тестирования списка
     * */
    public static long addLastTest(List lst,int numOfTests)
    {
        Instant start= Instant.now();
        for(Integer i=0;i<numOfTests;i++)
        {
            lst.add(i.toString());
        }
        Instant finish=Instant.now();
        return Duration.between(start,finish).toMillis();
    }

    /**
     * Даннный метод тестирует списки методом add (добавление элементов в середину)
     * @param lst - тестируемый список
     * @param numOfTests - колличество тестов
     * @param startNumOfObj - колличество элементов списка до заполнения
     * @return Время тестирования списка
     * */
    public static long addCenterTest(List lst,int startNumOfObj,int numOfTests)
    {
        lst=adder(lst,startNumOfObj);
        Instant start =Instant.now();
        for(Integer i=startNumOfObj/2;i<numOfTests+startNumOfObj/2;i++)
        {
            lst.add(startNumOfObj/2,i.toString());
        }
        Instant finish =Instant.now();
        return Duration.between(start,finish).toMillis();
    }

    /**
     * Даннный метод тестирует списки методом add (добавление элементов в начало)
     * @param lst - тестируемый список
     * @param numOfTests - колличество тестов
     * @param startNumOfObj - колличество элементов списка до заполнения
     * @return Время тестирования списка
     * */
    public static long addFirstTest(List lst,int startNumOfObj,int numOfTests)
    {
        lst=adder(lst,startNumOfObj);
        Instant start =Instant.now();
        for(Integer i=0;i<numOfTests;i++)
        {
            lst.add(0,i.toString());
        }
        Instant finish =Instant.now();
        return Duration.between(start,finish).toMillis();
    }

    /**
     * Даннный метод тестирует списки методом get (возвращение элементов из конца)
     * @param lst - тестируемый список
     * @param numOfTests - колличество тестов
     * @param startNumOfObj - колличество элементов списка до заполнения
     * @return Время тестирования списка
     * */
    public static long getLastTest(List lst,int startNumOfObj,int numOfTests)
    {
        lst=adder(lst,startNumOfObj);
        int last=startNumOfObj-1;
        Instant start =Instant.now();
        for(int i=0;i<numOfTests;i++) lst.get(last);
        Instant finish =Instant.now();
        return Duration.between(start,finish).toMillis();
    }

    /**
     * Даннный метод тестирует списки методом get (возвращение элементов из центре)
     * @param lst - тестируемый список
     * @param Position - тестируемая позиция
     * @param startNumOfObj - колличество элементов списка до заполнения
     * @return Время тестирования списка
     * */
    public static long getTest(List lst,int startNumOfObj,int Position)
    {
        lst=adder(lst,startNumOfObj);
        Instant start =Instant.now();
        lst.get(Position);
        Instant finish =Instant.now();
        return Duration.between(start,finish).toMillis();
    }

    /**
     * Даннный метод тестирует списки методом get (возвращение элементов из начала)
     * @param lst - тестируемый список
     * @param numOfTests - количество тестов
     * @param startNumOfObj - колличество элементов списка до заполнения
     * @return Время тестирования списка
     * */
    public static long getFirstTest(List lst,int startNumOfObj,int numOfTests)
    {
        lst=adder(lst,startNumOfObj);
        Instant start =Instant.now();
        for(int i=0;i<numOfTests;i++) lst.get(0);
        Instant finish =Instant.now();
        return Duration.between(start,finish).toMillis();
    }

    /**
     * Даннный метод тестирует списки методом return (Удаляет последний элемент)
     * @param lst - тестируемый список
     * @param numOfTests - количество тестов
     * @param startNumOfObj - колличество элементов списка до заполнения
     * @return Время тестирования списка
     * */
    public static long removeLastTest(List lst,int startNumOfObj,int numOfTests)
    {
        lst=adder(lst,startNumOfObj);
        Instant start =Instant.now();
        for(int i=startNumOfObj-1;i>startNumOfObj-1-numOfTests;i--)
        {
            lst.remove(i);
        }
        Instant finish =Instant.now();
        return Duration.between(start,finish).toNanos();
    }


    /**
     * Даннный метод тестирует списки методом return (Удаляет первый элемент)
     * @param lst - тестируемый список
     * @param numOfTests - количество тестов
     * @param startNumOfObj - колличество элементов списка до заполнения
     * @return Время тестирования списка
     * */
    public static long removeFirstTest(List lst,int startNumOfObj,int numOfTests)
    {
        lst=adder(lst,startNumOfObj);
        Instant start =Instant.now();
        for(int i=0;i<numOfTests;i++)
        {
            lst.remove(0);
        }
        Instant finish =Instant.now();
        return Duration.between(start,finish).toMillis();
    }


    /**
     * Даннный метод тестирует списки методом return (Удаляет центральный элемент)
     * @param lst - тестируемый список
     * @param numOfTests - количество тестов
     * @param startNumOfObj - колличество элементов списка до заполнения
     * @return Время тестирования списка
     * */
    public static long removeCenterTest(List lst,int startNumOfObj,int numOfTests)
    {
        lst=adder(lst,startNumOfObj);
        Instant start =Instant.now();
        for(int i=0;i<numOfTests;i++)
        {
            lst.remove(i+startNumOfObj/2);
        }
        Instant finish =Instant.now();
        return Duration.between(start,finish).toMillis();
    }
}
