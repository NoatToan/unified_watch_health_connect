package cn.hutool.core.collection;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class ArrayIter<E> implements Iterator<E>, Iterable<E>, Serializable {
    private static final long serialVersionUID = 1;
    private final Object array;
    private int endIndex;
    private int index;
    private int startIndex;

    public ArrayIter(E[] eArr) {
        this((Object) eArr);
    }

    public Object getArray() {
        return this.array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.endIndex;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.array;
        int i = this.index;
        this.index = i + 1;
        return (E) Array.get(obj, i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method is not supported");
    }

    public void reset() {
        this.index = this.startIndex;
    }

    public ArrayIter(Object obj) {
        this(obj, 0);
    }

    public ArrayIter(Object obj, int i) {
        this(obj, i, -1);
    }

    public ArrayIter(Object obj, int i, int i2) {
        int length = Array.getLength(obj);
        this.endIndex = length;
        if (i2 > 0 && i2 < length) {
            this.endIndex = i2;
        }
        if (i >= 0 && i < this.endIndex) {
            this.startIndex = i;
        }
        this.array = obj;
        this.index = this.startIndex;
    }
}
