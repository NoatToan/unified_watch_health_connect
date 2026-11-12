package com.google.android.gms.internal.mlkit_vision_barcode;

import am.j;
import i3.e5;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzer extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzeq(null);
    private static final Runnable zzb = new zzeq(null);

    private final void zzg(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzeo zzeoVar = null;
        boolean z14 = false;
        int i14 = 0;
        while (true) {
            if (!(runnable instanceof zzeo)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzeoVar = (zzeo) runnable;
            }
            i14++;
            if (i14 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z14 = Thread.interrupted() || z14;
                    LockSupport.park(zzeoVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z14) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzf = zzf();
            if (!zZzf) {
                try {
                    objZza = zza();
                } catch (Throwable th3) {
                    try {
                        if (th3 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzg(threadCurrentThread);
                        }
                        zzc(th3);
                        return;
                    } catch (Throwable th4) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzg(threadCurrentThread);
                        }
                        zzd(null);
                        throw th4;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzg(threadCurrentThread);
            }
            if (zZzf) {
                return;
            }
            zzd(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strM;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            strM = "running=[DONE]";
        } else if (runnable instanceof zzeo) {
            strM = "running=[INTERRUPTED]";
        } else {
            strM = runnable instanceof Thread ? j.m("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]";
        }
        return e5.g(strM, ", ", zzb());
    }

    public abstract Object zza();

    public abstract String zzb();

    public abstract void zzc(Throwable th3);

    public abstract void zzd(Object obj);

    public final void zze() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzeo zzeoVar = new zzeo(this, null);
            zzeoVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzeoVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                    }
                } finally {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean zzf();
}
