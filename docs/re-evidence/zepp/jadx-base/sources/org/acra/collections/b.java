package org.acra.collections;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes23.dex */
class b<E> implements ListIterator<E> {
    private final ListIterator<E> a;

    public b(ListIterator<E> listIterator) {
        this.a = listIterator;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        return this.a.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.a.nextIndex();
    }

    @Override // java.util.ListIterator
    public E previous() {
        return this.a.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException();
    }
}
