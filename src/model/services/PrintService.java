package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> { // Minha classe é um PrintService do tipo T.

    List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) { // Se a list não for vazia.
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++ ) { // .size() retorna o tamanho da lista.
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}