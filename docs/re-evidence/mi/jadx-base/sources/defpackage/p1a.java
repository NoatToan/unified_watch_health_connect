package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class p1a<T> extends t1a implements Iterator<T> {
    public abstract Iterator<T> f();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return f().hasNext();
    }

    public T next() {
        return f().next();
    }
}
