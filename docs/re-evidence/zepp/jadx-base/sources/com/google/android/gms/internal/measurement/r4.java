package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class r4 implements Iterator<String> {
    public final Iterator<String> a;
    public final /* synthetic */ zzmg b;

    public r4(zzmg zzmgVar) {
        this.b = zzmgVar;
        this.a = zzmgVar.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
