package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class s2 implements Runnable {
    public final /* synthetic */ zzat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf c;
    public final /* synthetic */ zzjo d;

    public s2(zzjo zzjoVar, zzat zzatVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.d = zzjoVar;
        this.a = zzatVar;
        this.b = str;
        this.c = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfv zzfvVar;
        byte[] bArrZzu = null;
        try {
            try {
                zzeb zzebVar = this.d.c;
                if (zzebVar == null) {
                    this.d.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzfvVar = this.d.zzs;
                } else {
                    bArrZzu = zzebVar.zzu(this.a, this.b);
                    this.d.g();
                    zzfvVar = this.d.zzs;
                }
            } catch (RemoteException e) {
                this.d.zzs.zzay().zzd().zzb("Failed to send event to the service to bundle", e);
                zzfvVar = this.d.zzs;
            }
            zzkz zzkzVarZzv = zzfvVar.zzv();
        } finally {
            this.d.zzs.zzv().zzR(this.c, bArrZzu);
        }
    }
}
