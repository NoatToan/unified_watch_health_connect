package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class l1 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ zzia b;

    public l1(zzia zziaVar, AtomicReference atomicReference) {
        this.b = zziaVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Boolean.valueOf(this.b.zzs.zzf().zzs(this.b.zzs.zzh().zzl(), zzdy.zzJ)));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
