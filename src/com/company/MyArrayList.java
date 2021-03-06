package com.company;

public class MyArrayList <T> {
    private T[] arr;
    private int size;

    public MyArrayList() {
        arr = (T[]) new Object[10];
    }

    public void add(int index, T item) {
        for (int i = size; i > index; i--)
            arr[i] = arr[i - 1];
        arr[index] = item;
        size++;
    }

    public T remove(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
        T removedElement = arr[index];
        for (int i = index + 1; i < size; i++)
            arr[i - 1] = arr[i];
        size--;
        return removedElement;
    }

    public int find(T keyitem) {
        int i;
        for (i = 0; i < size; i++)
            if (arr[i].equals(keyitem))
                return i;
        return -1;
    }

    public int getSize() {
        return size;
    }
    public T get(int i)
    {
        return arr[i];
    }
}

