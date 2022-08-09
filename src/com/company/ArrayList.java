package com.company;

class MyClass{
    Object arr[];
    int s;
    int capacity;
            MyClass(){
        capacity = 10;
        s = 0;
        arr = new Object[capacity];

            }
            void add(Object item){
                arr[s++] = item;
            }
            Object get(int index){
                return arr[index];
            }
            int size(){
                return s;
            }
}

public class ArrayList {
    public void Main(String[] args){

        MyClass my = new MyClass();
        my.add(1);
        my.add(2);
        my.add('c');
        my.add("Jawad");
        my.add(3);
        my.add(null);

        for (int i = 0; i<my.size();i++){
            System.out.println(my.get(i));
        }
    }
}
