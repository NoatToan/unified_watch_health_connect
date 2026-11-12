package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzf {
    public final zzax a;
    public final zzg b;
    public final zzg c;
    public final zzj d;

    public zzf() {
        zzax zzaxVar = new zzax();
        this.a = zzaxVar;
        zzg zzgVar = new zzg(null, zzaxVar);
        this.c = zzgVar;
        this.b = zzgVar.zza();
        zzj zzjVar = new zzj();
        this.d = zzjVar;
        zzgVar.zzg("require", new zzw(zzjVar));
        zzjVar.zza("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzy();
            }
        });
        zzgVar.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    public final zzap zza(zzg zzgVar, zzgt... zzgtVarArr) {
        zzap zzapVarZza = zzap.zzf;
        for (zzgt zzgtVar : zzgtVarArr) {
            zzapVarZza = zzi.zza(zzgtVar);
            zzh.zzc(this.c);
            if ((zzapVarZza instanceof zzaq) || (zzapVarZza instanceof zzao)) {
                zzapVarZza = this.a.zza(zzgVar, zzapVarZza);
            }
        }
        return zzapVarZza;
    }
}
