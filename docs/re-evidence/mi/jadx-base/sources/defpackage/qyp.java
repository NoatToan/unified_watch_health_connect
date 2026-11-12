package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qyp<F, T> extends pyp<F, T> implements ListIterator<T> {
    public qyp(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<? extends F> b() {
        return epd.c(this.f30917a);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return a(b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
