package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class kj1<T> implements Iterator<T>, Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T[] f23906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23907b = 0;

    public kj1(T[] tArr) {
        this.f23906a = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23907b < this.f23906a.length;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.f23907b;
        T[] tArr = this.f23906a;
        if (i >= tArr.length) {
            throw new NoSuchElementException();
        }
        this.f23907b = i + 1;
        return tArr[i];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
