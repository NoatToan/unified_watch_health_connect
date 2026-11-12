package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzdk extends zzcs {
    static final zzcs zza = new zzdk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzdk(Object[] objArr, int i14) {
        this.zzb = objArr;
        this.zzc = i14;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        zzaz.zza(i14, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i14];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcs, com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int zza(Object[] objArr, int i14) {
        System.arraycopy(this.zzb, 0, objArr, i14, this.zzc);
        return i14 + this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final Object[] zze() {
        return this.zzb;
    }
}
