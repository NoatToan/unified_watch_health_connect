package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class v2 implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ zzjo b;

    public v2(zzjo zzjoVar, zzp zzpVar) {
        this.b = zzjoVar;
        this.a = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar = this.b.c;
        if (zzebVar == null) {
            this.b.zzs.zzay().zzd().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.a);
            zzebVar.zzs(this.a);
            this.b.g();
        } catch (RemoteException e) {
            this.b.zzs.zzay().zzd().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}
