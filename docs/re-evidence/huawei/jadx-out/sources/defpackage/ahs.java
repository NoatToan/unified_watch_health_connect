package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes21.dex */
public class ahs<T> implements Iterator<T>, Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T[] f424a;
    private int d = 0;

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }

    public ahs(T[] tArr) {
        this.f424a = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.d < this.f424a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.d;
        T[] tArr = this.f424a;
        if (i >= tArr.length) {
            throw new NoSuchElementException();
        }
        this.d = i + 1;
        return tArr[i];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
