package com.google.android.gms.internal.fitness;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class p4 implements Iterator<String> {
    private Iterator<String> a;
    private final /* synthetic */ zzjt b;

    public p4(zzjt zzjtVar) {
        this.b = zzjtVar;
        this.a = zzjtVar.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
