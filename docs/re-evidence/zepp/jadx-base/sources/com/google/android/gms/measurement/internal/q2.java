package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class q2 implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ zzjo c;

    public q2(zzjo zzjoVar, zzp zzpVar, Bundle bundle) {
        this.c = zzjoVar;
        this.a = zzpVar;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar = this.c.c;
        if (zzebVar == null) {
            this.c.zzs.zzay().zzd().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.a);
            zzebVar.zzr(this.b, this.a);
        } catch (RemoteException e) {
            this.c.zzs.zzay().zzd().zzb("Failed to send default event parameters to service", e);
        }
    }
}
