package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x00<E> extends zaq<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38534b;

    public x00(int i) {
        this(i, 0);
    }

    public abstract E a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f38534b < this.f38533a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f38534b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f38534b;
        this.f38534b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f38534b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f38534b - 1;
        this.f38534b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f38534b - 1;
    }

    public x00(int i, int i2) {
        c6i.q(i2, i);
        this.f38533a = i;
        this.f38534b = i2;
    }
}
