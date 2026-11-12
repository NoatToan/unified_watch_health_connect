package com.google.android.play.core.splitcompat;

import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes14.dex */
final class zzi implements zzk {
    final /* synthetic */ Set zza;
    final /* synthetic */ zzt zzb;
    final /* synthetic */ zzn zzc;

    public zzi(zzn zznVar, Set set, zzt zztVar) {
        this.zzc = zznVar;
        this.zza = set;
        this.zzb = zztVar;
    }

    @Override // com.google.android.play.core.splitcompat.zzk
    public final void zza(ZipFile zipFile, Set set) {
        this.zza.addAll(zzn.zza(this.zzc, set, this.zzb, zipFile));
    }
}
