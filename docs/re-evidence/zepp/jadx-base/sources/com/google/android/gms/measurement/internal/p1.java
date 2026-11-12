package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class p1 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ zzia b;

    public p1(zzia zziaVar, AtomicReference atomicReference) {
        this.b = zziaVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(this.b.zzs.zzf().zzo(this.b.zzs.zzh().zzl(), zzdy.zzK));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
