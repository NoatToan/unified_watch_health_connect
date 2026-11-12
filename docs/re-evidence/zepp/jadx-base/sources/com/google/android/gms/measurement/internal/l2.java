package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class l2 implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ zzjo b;

    public l2(zzjo zzjoVar, zzp zzpVar) {
        this.b = zzjoVar;
        this.a = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar = this.b.c;
        if (zzebVar == null) {
            this.b.zzs.zzay().zzd().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.a);
            zzebVar.zzm(this.a);
        } catch (RemoteException e) {
            this.b.zzs.zzay().zzd().zzb("Failed to reset data on the service: remote exception", e);
        }
        this.b.g();
    }
}
