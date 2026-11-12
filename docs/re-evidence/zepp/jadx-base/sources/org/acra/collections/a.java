package org.acra.collections;

import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
class a<E> implements Iterator<E> {
    private final Iterator<E> a;

    public a(Iterator<E> it2) {
        this.a = it2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
