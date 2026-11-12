package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class k2 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ zzp b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zzjo d;

    public k2(zzjo zzjoVar, AtomicReference atomicReference, zzp zzpVar, boolean z) {
        this.d = zzjoVar;
        this.a = atomicReference;
        this.b = zzpVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.a) {
            try {
                try {
                    zzeb zzebVar = this.d.c;
                    if (zzebVar == null) {
                        this.d.zzs.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                        this.a.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.b);
                    this.a.set(zzebVar.zze(this.b, this.c));
                    this.d.g();
                    atomicReference = this.a;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.d.zzs.zzay().zzd().zzb("Failed to get all user properties; remote exception", e);
                    atomicReference = this.a;
                }
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
