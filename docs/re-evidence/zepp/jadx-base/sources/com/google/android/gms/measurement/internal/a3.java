package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class a3 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzp c;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf d;
    public final /* synthetic */ zzjo e;

    public a3(zzjo zzjoVar, String str, String str2, zzp zzpVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.e = zzjoVar;
        this.a = str;
        this.b = str2;
        this.c = zzpVar;
        this.d = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfv zzfvVar;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                zzeb zzebVar = this.e.c;
                if (zzebVar == null) {
                    this.e.zzs.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", this.a, this.b);
                    zzfvVar = this.e.zzs;
                } else {
                    Preconditions.checkNotNull(this.c);
                    arrayList = zzkz.zzG(zzebVar.zzf(this.a, this.b, this.c));
                    this.e.g();
                    zzfvVar = this.e.zzs;
                }
            } catch (RemoteException e) {
                this.e.zzs.zzay().zzd().zzd("Failed to get conditional properties; remote exception", this.a, this.b, e);
                zzfvVar = this.e.zzs;
            }
            zzkz zzkzVarZzv = zzfvVar.zzv();
        } finally {
            this.e.zzs.zzv().zzP(this.d, arrayList);
        }
    }
}
