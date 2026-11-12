package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class e implements Iterator<zzap> {
    private int a = 0;
    public final /* synthetic */ zzat b;

    public e(zzat zzatVar) {
        this.b = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ zzap next() {
        if (this.a >= this.b.a.length()) {
            throw new NoSuchElementException();
        }
        String str = this.b.a;
        int i = this.a;
        this.a = i + 1;
        return new zzat(String.valueOf(str.charAt(i)));
    }
}
