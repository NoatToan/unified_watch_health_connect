package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t10<T> extends uaq<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f34189a;

    public t10(T t) {
        this.f34189a = t;
    }

    public abstract T a(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34189a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.f34189a;
        if (t == null) {
            throw new NoSuchElementException();
        }
        this.f34189a = a(t);
        return t;
    }
}
