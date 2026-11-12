package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class pyp<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator<? extends F> f30917a;

    public pyp(Iterator<? extends F> it) {
        this.f30917a = (Iterator) c6i.o(it);
    }

    public abstract T a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30917a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f30917a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f30917a.remove();
    }
}
