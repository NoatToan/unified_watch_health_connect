package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class b implements Iterator<zzap> {
    private int a = 0;
    public final /* synthetic */ zzae b;

    public b(zzae zzaeVar) {
        this.b = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ zzap next() {
        if (this.a < this.b.zzc()) {
            zzae zzaeVar = this.b;
            int i = this.a;
            this.a = i + 1;
            return zzaeVar.zze(i);
        }
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }
}
