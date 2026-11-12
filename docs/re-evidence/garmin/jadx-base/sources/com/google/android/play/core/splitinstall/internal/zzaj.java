package com.google.android.play.core.splitinstall.internal;

import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class zzaj implements Runnable {
    final /* synthetic */ List zza;
    final /* synthetic */ com.google.android.play.core.splitinstall.zzf zzb;
    final /* synthetic */ zzak zzc;

    public zzaj(zzak zzakVar, List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        this.zzc = zzakVar;
        this.zza = list;
        this.zzb = zzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            boolean zZzb = this.zzc.zzc.zzb(this.zza);
            zzak zzakVar = this.zzc;
            if (zZzb) {
                zzak.zzc(zzakVar, this.zzb);
            } else {
                zzak.zzb(zzakVar, this.zza, this.zzb);
            }
        } catch (Exception unused) {
            this.zzb.zzb(-11);
        }
    }
}
