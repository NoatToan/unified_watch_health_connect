package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class z2 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzp d;
    public final /* synthetic */ zzjo e;

    public z2(zzjo zzjoVar, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar) {
        this.e = zzjoVar;
        this.a = atomicReference;
        this.b = str2;
        this.c = str3;
        this.d = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.a) {
            try {
                try {
                    zzeb zzebVar = this.e.c;
                    if (zzebVar == null) {
                        this.e.zzs.zzay().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.b, this.c);
                        this.a.set(Collections.emptyList());
                        this.a.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.d);
                        this.a.set(zzebVar.zzf(this.b, this.c, this.d));
                    } else {
                        this.a.set(zzebVar.zzg(null, this.b, this.c));
                    }
                    this.e.g();
                    atomicReference = this.a;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.e.zzs.zzay().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.b, e);
                    this.a.set(Collections.emptyList());
                    atomicReference = this.a;
                }
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
