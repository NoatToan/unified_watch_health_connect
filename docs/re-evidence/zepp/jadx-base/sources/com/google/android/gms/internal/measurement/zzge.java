package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzge extends zzjt<zzgf, zzge> implements zzld {
    private zzge() {
        super(zzgf.zza);
    }

    public final zzge zza(Iterable<? extends Long> iterable) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzgf.g((zzgf) this.zza, iterable);
        return this;
    }

    public final zzge zzb(int i) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzgf.f((zzgf) this.zza, i);
        return this;
    }

    public /* synthetic */ zzge(i1 i1Var) {
        super(zzgf.zza);
    }
}
