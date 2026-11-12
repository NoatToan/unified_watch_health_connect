package com.google.android.play.core.splitcompat;

import java.io.File;

/* JADX INFO: loaded from: classes14.dex */
final class zzg implements zzl {
    final /* synthetic */ zzh zza;

    public zzg(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // com.google.android.play.core.splitcompat.zzl
    public final void zza(zzm zzmVar, File file, boolean z14) {
        this.zza.zzb.add(file);
        if (z14) {
            return;
        }
        this.zza.zzc.set(false);
    }
}
