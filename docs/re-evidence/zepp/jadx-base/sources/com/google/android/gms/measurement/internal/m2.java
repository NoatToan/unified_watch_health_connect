package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class m2 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ zzp b;
    public final /* synthetic */ zzjo c;

    public m2(zzjo zzjoVar, AtomicReference atomicReference, zzp zzpVar) {
        this.c = zzjoVar;
        this.a = atomicReference;
        this.b = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.a) {
            try {
                try {
                    if (!this.c.zzs.zzm().d().zzk()) {
                        this.c.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                        this.c.zzs.zzq().h(null);
                        this.c.zzs.zzm().f.zzb(null);
                        this.a.set(null);
                        this.a.notify();
                        return;
                    }
                    zzeb zzebVar = this.c.c;
                    if (zzebVar == null) {
                        this.c.zzs.zzay().zzd().zza("Failed to get app instance id");
                        this.a.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.b);
                    this.a.set(zzebVar.zzd(this.b));
                    String str = (String) this.a.get();
                    if (str != null) {
                        this.c.zzs.zzq().h(str);
                        this.c.zzs.zzm().f.zzb(str);
                    }
                    this.c.g();
                    atomicReference = this.a;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.c.zzs.zzay().zzd().zzb("Failed to get app instance id", e);
                    atomicReference = this.a;
                }
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
