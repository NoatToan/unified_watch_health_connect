package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzhn implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzht zza;

    public zzhn(zzht zzhtVar) {
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i14, String str, List list, boolean z14, boolean z15) {
        zzgs zzgsVarZzj;
        int i15 = i14 - 1;
        if (i15 == 0) {
            zzgsVarZzj = this.zza.zzu.zzaV().zzj();
        } else if (i15 != 1) {
            if (i15 == 3) {
                zzgsVarZzj = this.zza.zzu.zzaV().zzk();
            } else if (i15 != 4) {
                zzgsVarZzj = this.zza.zzu.zzaV().zzi();
            } else if (z14) {
                zzgsVarZzj = this.zza.zzu.zzaV().zzf();
            } else {
                zzht zzhtVar = this.zza;
                zzgsVarZzj = !z15 ? zzhtVar.zzu.zzaV().zzh() : zzhtVar.zzu.zzaV().zze();
            }
        } else if (z14) {
            zzgsVarZzj = this.zza.zzu.zzaV().zzc();
        } else {
            zzht zzhtVar2 = this.zza;
            zzgsVarZzj = !z15 ? zzhtVar2.zzu.zzaV().zzd() : zzhtVar2.zzu.zzaV().zzb();
        }
        int size = list.size();
        if (size == 1) {
            zzgsVarZzj.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgsVarZzj.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgsVarZzj.zza(str);
        } else {
            zzgsVarZzj.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
