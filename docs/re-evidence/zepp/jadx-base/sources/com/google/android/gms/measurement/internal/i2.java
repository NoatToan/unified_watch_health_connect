package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class i2 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzp c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf e;
    public final /* synthetic */ zzjo f;

    public i2(zzjo zzjoVar, String str, String str2, zzp zzpVar, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f = zzjoVar;
        this.a = str;
        this.b = str2;
        this.c = zzpVar;
        this.d = z;
        this.e = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            zzeb zzebVar = this.f.c;
            if (zzebVar == null) {
                this.f.zzs.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.a, this.b);
                this.f.zzs.zzv().zzQ(this.e, bundle2);
                return;
            }
            Preconditions.checkNotNull(this.c);
            List<zzkv> listZzh = zzebVar.zzh(this.a, this.b, this.d, this.c);
            bundle = new Bundle();
            if (listZzh != null) {
                for (zzkv zzkvVar : listZzh) {
                    String str = zzkvVar.zze;
                    if (str != null) {
                        bundle.putString(zzkvVar.zzb, str);
                    } else {
                        Long l = zzkvVar.zzd;
                        if (l != null) {
                            bundle.putLong(zzkvVar.zzb, l.longValue());
                        } else {
                            Double d = zzkvVar.zzg;
                            if (d != null) {
                                bundle.putDouble(zzkvVar.zzb, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f.g();
                    this.f.zzs.zzv().zzQ(this.e, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.f.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.a, e);
                    this.f.zzs.zzv().zzQ(this.e, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.f.zzs.zzv().zzQ(this.e, bundle2);
                throw th;
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            this.f.zzs.zzv().zzQ(this.e, bundle2);
            throw th;
        }
    }
}
