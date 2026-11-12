package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
abstract class x2<F, T> implements Iterator<T> {
    public final Iterator<? extends F> a;

    public x2(Iterator<? extends F> it2) {
        this.a = (Iterator) Preconditions.checkNotNull(it2);
    }

    public abstract T a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
