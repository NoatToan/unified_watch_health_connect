package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class n2 implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf b;
    public final /* synthetic */ zzjo c;

    public n2(zzjo zzjoVar, zzp zzpVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.c = zzjoVar;
        this.a = zzpVar;
        this.b = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfv zzfvVar;
        String strZzd = null;
        try {
            if (this.c.zzs.zzm().d().zzk()) {
                zzeb zzebVar = this.c.c;
                if (zzebVar == null) {
                    this.c.zzs.zzay().zzd().zza("Failed to get app instance id");
                    zzfvVar = this.c.zzs;
                } else {
                    Preconditions.checkNotNull(this.a);
                    strZzd = zzebVar.zzd(this.a);
                    if (strZzd != null) {
                        this.c.zzs.zzq().h(strZzd);
                        this.c.zzs.zzm().f.zzb(strZzd);
                    }
                    this.c.g();
                    zzfvVar = this.c.zzs;
                }
            } else {
                this.c.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                this.c.zzs.zzq().h(null);
                this.c.zzs.zzm().f.zzb(null);
                zzfvVar = this.c.zzs;
            }
        } catch (RemoteException e) {
            this.c.zzs.zzay().zzd().zzb("Failed to get app instance id", e);
            zzfvVar = this.c.zzs;
        } finally {
            this.c.zzs.zzv().zzU(this.b, null);
        }
        zzkz zzkzVarZzv = zzfvVar.zzv();
    }
}
