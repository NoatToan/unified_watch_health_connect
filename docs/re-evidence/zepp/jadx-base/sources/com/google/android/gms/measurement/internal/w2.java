package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class w2 implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ zzjo b;

    public w2(zzjo zzjoVar, zzp zzpVar) {
        this.b = zzjoVar;
        this.a = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar = this.b.c;
        if (zzebVar == null) {
            this.b.zzs.zzay().zzd().zza("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.a);
            zzebVar.zzp(this.a);
            this.b.g();
        } catch (RemoteException e) {
            this.b.zzs.zzay().zzd().zzb("Failed to send consent settings to the service", e);
        }
    }
}
