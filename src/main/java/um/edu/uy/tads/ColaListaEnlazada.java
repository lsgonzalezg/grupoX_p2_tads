package um.edu.uy.tads;

import um.edu.uy.exceptions.*;
import um.edu.uy.interfaces.MyCola;

public class ColaListaEnlazada<T> implements MyCola<T> {

    public MyLinkedList<T> cola;

    public ColaListaEnlazada(){
        this.cola = new MyLinkedList<>();
    }


    @Override
    public void enqueue(T elemento) {
        cola.add(elemento);
    }

    @Override
    public T dequeue() throws EmptyQueueException {
        if (this.isEmpty()){
            throw new EmptyQueueException("La cola esta vacia");
        }
        T elemento = cola.get(0);
        cola.remove(0);
        return elemento;
    }

    @Override
    public boolean isEmpty() {
        if (cola.obtenerLargo() ==0){
            return true;
        }
        return false;
    }

    public static interface MyBinariTreeCompleto<K,T>{
        void insert(K key, T data);
        void remove(K key);
        String toString();

    }
}
