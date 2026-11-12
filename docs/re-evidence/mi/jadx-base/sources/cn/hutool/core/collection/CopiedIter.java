package cn.hutool.core.collection;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class CopiedIter<E> implements Iterator<E>, Iterable<E>, Serializable {
    private static final long serialVersionUID = 1;
    private final Iterator<E> listIterator;

    public CopiedIter(Iterator<E> it) {
        this.listIterator = CollUtil.o(it).iterator();
    }

    public static <V> CopiedIter<V> copyOf(Iterator<V> it) {
        return new CopiedIter<>(it);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.listIterator.hasNext();
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public E next() {
        return this.listIterator.next();
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("This is a read-only iterator.");
    }
}
