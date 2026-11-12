package com.google.android.gms.internal.common;

import c22.t;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzk implements Iterator {
    private Object zza;
    private int zzb = 2;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzr.zza(this.zzb != 4);
        int i14 = this.zzb;
        int i15 = i14 - 1;
        if (i14 == 0) {
            throw null;
        }
        if (i15 == 0) {
            return true;
        }
        if (i15 != 2) {
            this.zzb = 4;
            this.zza = zza();
            if (this.zzb != 3) {
                this.zzb = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            t.g();
            return null;
        }
        this.zzb = 2;
        Object obj = this.zza;
        this.zza = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();

    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
