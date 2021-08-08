package ru.samsung.itschool.mdev;

import java.util.SortedSet;
import java.util.TreeSet;

/* Пример использования деревьев */
public class Main {

    public static void main(String[] args) {
        // Создание пустого дерева
        TreeSet<String> tree = new TreeSet<String>();
        // Добавление элементов в дерево
        tree.add("abc");
        tree.add("aba");
        // Элементы выводятся в сортированном (лексикографическом) порядке
        // Классы должны быть Comparable
        System.out.println("===== Tree =====");
        for (String s : tree){
            System.out.println(s);
        }
        System.out.println();

        // Удаление элементов
        System.out.println(tree.remove("aaa"));
        // Удаление несуществующего элемента возвращает False
        System.out.println(tree.remove("abc"));
        System.out.println("===== Tree =====");
        for (String s : tree) {
            System.out.println(s);
        }
        System.out.println(); tree.add("zzz");

        tree.add("xyz"); tree.add("zca");
        // Быстрая проверка наличия элемента в дереве
        System.out.println(tree.contains("xyz") + " " + tree.contains("aab"));
        // Выводит наименьший элемент больший или равный указанного
        System.out.println("ceiling = " + tree.ceiling("zyb"));
        System.out.println(tree.ceiling("zzzz")); //null если нет такого элемента

        // Выводит наибольший элемент меньший или равный указанного
        System.out.println("floor = " + tree.floor("zyb"));
        System.out.println(tree.floor("a")); //null если нет такого элемента
        System.out.println("===== Subtree =====");
        // Взятие подмножества элементов >= zaa и < zzzz
        SortedSet<String> subtree = tree.subSet("zaa", "zzzz");
        for (String s : subtree){
            System.out.println(s);
        }
        System.out.println();
    }
}


