package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzmo implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzbe zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zznl zze;

    public zzmo(zznl zznlVar, boolean z14, zzr zzrVar, boolean z15, zzbe zzbeVar, Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = z15;
        this.zzc = zzbeVar;
        this.zzd = bundle;
        Objects.requireNonNull(zznlVar);
        this.zze = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zze;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        zzic zzicVar = zznlVar.zzu;
        if (zzgbVarZzZ == null) {
            a.j(zzicVar, "Failed to send default event parameters to service");
            return;
        }
        boolean zZzp = zzicVar.zzc().zzp(null, zzfy.zzbb);
        zzr zzrVar = this.zza;
        if (zZzp) {
            Preconditions.checkNotNull(zzrVar);
            this.zze.zzm(zzgbVarZzZ, this.zzb ? null : this.zzc, zzrVar);
            return;
        }
        try {
            Preconditions.checkNotNull(zzrVar);
            zzgbVarZzZ.zzu(this.zzd, zzrVar);
            zznlVar.zzV();
        } catch (RemoteException e4) {
            this.zze.zzu.zzaV().zzb().zzb("Failed to send default event parameters to service", e4);
        }
    }
}
