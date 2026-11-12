package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class r1 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ zzia b;

    public r1(zzia zziaVar, AtomicReference atomicReference) {
        this.b = zziaVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Integer.valueOf(this.b.zzs.zzf().zze(this.b.zzs.zzh().zzl(), zzdy.zzM)));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
