package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class j2 extends l2 {
    private int a = 0;
    private final int b;
    public final /* synthetic */ zzix c;

    public j2(zzix zzixVar) {
        this.c = zzixVar;
        this.b = zzixVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzit
    public final byte zza() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return this.c.a(i);
    }
}
