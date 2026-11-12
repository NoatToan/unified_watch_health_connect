package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface u<E> extends Collection<E> {

    public interface a<E> {
        int getCount();

        E getElement();

        String toString();
    }

    int add(E e, int i);

    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<E> elementSet();

    Set<a<E>> entrySet();

    boolean equals(Object obj);

    int hashCode();

    int remove(Object obj, int i);

    boolean remove(Object obj);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();
}
