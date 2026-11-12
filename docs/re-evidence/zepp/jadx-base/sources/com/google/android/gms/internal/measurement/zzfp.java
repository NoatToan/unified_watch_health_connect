package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfp extends zzjt<zzfq, zzfp> implements zzld {
    private zzfp() {
        super(zzfq.zza);
    }

    public final zzfp zza(long j) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfq.g((zzfq) this.zza, j);
        return this;
    }

    public final zzfp zzb(String str) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfq.f((zzfq) this.zza, str);
        return this;
    }

    public /* synthetic */ zzfp(i1 i1Var) {
        super(zzfq.zza);
    }
}
