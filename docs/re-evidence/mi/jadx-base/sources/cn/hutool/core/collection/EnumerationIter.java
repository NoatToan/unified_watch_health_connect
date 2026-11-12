package cn.hutool.core.collection;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class EnumerationIter<E> implements Iterator<E>, Iterable<E>, Serializable {
    private static final long serialVersionUID = 1;
    private final Enumeration<E> e;

    public EnumerationIter(Enumeration<E> enumeration) {
        this.e = enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.e.hasMoreElements();
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public E next() {
        return this.e.nextElement();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
