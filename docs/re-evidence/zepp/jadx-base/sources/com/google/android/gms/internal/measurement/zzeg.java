package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeg extends zzjt<zzeh, zzeg> implements zzld {
    private zzeg() {
        super(zzeh.zza);
    }

    public final int zza() {
        return ((zzeh) this.zza).zzb();
    }

    public final int zzb() {
        return ((zzeh) this.zza).zzc();
    }

    public final zzeg zzc(int i, zzei zzeiVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzeh.g((zzeh) this.zza, i, zzeiVar.zzaA());
        return this;
    }

    public final zzeg zzd(int i, zzer zzerVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzeh.f((zzeh) this.zza, i, zzerVar.zzaA());
        return this;
    }

    public final zzej zze(int i) {
        return ((zzeh) this.zza).zze(i);
    }

    public final zzes zzf(int i) {
        return ((zzeh) this.zza).zzf(i);
    }

    public /* synthetic */ zzeg(c1 c1Var) {
        super(zzeh.zza);
    }
}
