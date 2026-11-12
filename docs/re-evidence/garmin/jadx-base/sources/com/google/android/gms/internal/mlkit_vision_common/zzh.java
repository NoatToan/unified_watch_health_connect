package com.google.android.gms.internal.mlkit_vision_common;

import c22.t;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzh extends zzac {
    private final int zza;
    private int zzb;

    public zzh(int i14, int i15) {
        zzf.zzb(i15, i14, FirebaseAnalytics.Param.INDEX);
        this.zza = i14;
        this.zzb = i15;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            t.g();
            return null;
        }
        int i14 = this.zzb;
        this.zzb = i14 + 1;
        return zza(i14);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            t.g();
            return null;
        }
        int i14 = this.zzb - 1;
        this.zzb = i14;
        return zza(i14);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract Object zza(int i14);
}
