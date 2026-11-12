package com.google.android.gms.internal.measurement;

import c22.t;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzla extends zzlb {
    final /* synthetic */ zzlh zza;
    private int zzb;
    private final int zzc;

    public zzla(zzlh zzlhVar) {
        Objects.requireNonNull(zzlhVar);
        this.zza = zzlhVar;
        this.zzb = 0;
        this.zzc = zzlhVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final byte zza() {
        int i14 = this.zzb;
        if (i14 < this.zzc) {
            this.zzb = i14 + 1;
            return this.zza.zzb(i14);
        }
        t.g();
        return (byte) 0;
    }
}
