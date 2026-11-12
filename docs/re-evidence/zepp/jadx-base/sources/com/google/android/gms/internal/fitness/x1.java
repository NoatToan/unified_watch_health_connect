package com.google.android.gms.internal.fitness;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class x1 extends y1 {
    private int a = 0;
    private final int b;
    private final /* synthetic */ zzfx c;

    public x1(zzfx zzfxVar) {
        this.c = zzfxVar;
        this.b = zzfxVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // com.google.android.gms.internal.fitness.zzgc
    public final byte nextByte() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return this.c.f(i);
    }
}
