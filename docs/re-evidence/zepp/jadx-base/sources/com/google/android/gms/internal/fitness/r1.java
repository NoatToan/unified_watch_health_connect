package com.google.android.gms.internal.fitness;

import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes3.dex */
final class r1<T> extends zzfm<T> {
    private boolean a;
    private final /* synthetic */ Object b;

    public r1(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return (T) this.b;
    }
}
