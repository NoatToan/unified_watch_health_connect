package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfl extends zzjt<zzfm, zzfl> implements zzld {
    private zzfl() {
        super(zzfm.zza);
    }

    public final zzfl zza(long j) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfm.g((zzfm) this.zza, j);
        return this;
    }

    public final zzfl zzb(int i) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfm.f((zzfm) this.zza, i);
        return this;
    }

    public /* synthetic */ zzfl(i1 i1Var) {
        super(zzfm.zza);
    }
}
