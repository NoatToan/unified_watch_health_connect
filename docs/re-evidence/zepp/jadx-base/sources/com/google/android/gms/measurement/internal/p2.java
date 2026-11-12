package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class p2 implements Runnable {
    public final /* synthetic */ zzih a;
    public final /* synthetic */ zzjo b;

    public p2(zzjo zzjoVar, zzih zzihVar) {
        this.b = zzjoVar;
        this.a = zzihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar = this.b.c;
        if (zzebVar == null) {
            this.b.zzs.zzay().zzd().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzih zzihVar = this.a;
            if (zzihVar == null) {
                zzebVar.zzq(0L, null, null, this.b.zzs.zzau().getPackageName());
            } else {
                zzebVar.zzq(zzihVar.zzc, zzihVar.zza, zzihVar.zzb, this.b.zzs.zzau().getPackageName());
            }
            this.b.g();
        } catch (RemoteException e) {
            this.b.zzs.zzay().zzd().zzb("Failed to send current screen to the service", e);
        }
    }
}
