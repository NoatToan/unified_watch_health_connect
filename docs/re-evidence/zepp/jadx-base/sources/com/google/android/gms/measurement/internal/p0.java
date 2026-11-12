package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class p0 implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ zzgn b;

    public p0(zzgn zzgnVar, zzp zzpVar) {
        this.b = zzgnVar;
        this.a = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a();
        zzks zzksVar = this.b.a;
        zzp zzpVar = this.a;
        zzksVar.zzaz().zzg();
        zzksVar.b();
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzag zzagVarZzb = zzag.zzb(zzpVar.zzv);
        zzag zzagVarM = zzksVar.M(zzpVar.zza);
        zzksVar.zzay().zzj().zzc("Setting consent, package, consent", zzpVar.zza, zzagVarZzb);
        zzksVar.s(zzpVar.zza, zzagVarZzb);
        if (zzagVarZzb.zzm(zzagVarM)) {
            zzksVar.p(zzpVar);
        }
    }
}
