package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
abstract class y1 implements zzgc {
    @Override // java.util.Iterator
    public /* synthetic */ Byte next() {
        return Byte.valueOf(nextByte());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
