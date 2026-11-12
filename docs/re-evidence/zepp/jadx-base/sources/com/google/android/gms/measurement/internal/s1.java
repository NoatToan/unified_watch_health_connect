package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class s1 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ zzia b;

    public s1(zzia zziaVar, AtomicReference atomicReference) {
        this.b = zziaVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Double.valueOf(this.b.zzs.zzf().zza(this.b.zzs.zzh().zzl(), zzdy.zzN)));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
