package com.google.android.gms.measurement.internal;

import android.os.Process;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
final class e0 extends Thread {
    private final Object a;
    private final BlockingQueue<d0<?>> b;

    @GuardedBy("threadLifeCycleLock")
    private boolean c = false;
    public final /* synthetic */ zzfs d;

    public e0(zzfs zzfsVar, String str, BlockingQueue<d0<?>> blockingQueue) {
        this.d = zzfsVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    private final void b() {
        synchronized (this.d.h) {
            if (!this.c) {
                this.d.i.release();
                this.d.h.notifyAll();
                if (this == this.d.b) {
                    this.d.b = null;
                } else if (this == this.d.c) {
                    this.d.c = null;
                } else {
                    this.d.zzs.zzay().zzd().zza("Current scheduler thread is neither worker nor network");
                }
                this.c = true;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.d.zzs.zzay().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.d.i.acquire();
                z = true;
            } catch (InterruptedException e) {
                c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                d0<?> d0VarPoll = this.b.poll();
                if (d0VarPoll == null) {
                    synchronized (this.a) {
                        if (this.b.peek() == null) {
                            zzfs.j(this.d);
                            try {
                                this.a.wait(30000L);
                            } catch (InterruptedException e2) {
                                c(e2);
                            }
                        }
                    }
                    synchronized (this.d.h) {
                        if (this.b.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(true != d0VarPoll.b ? 10 : threadPriority);
                    d0VarPoll.run();
                }
            }
            if (this.d.zzs.zzf().zzs(null, zzdy.zzaj)) {
                b();
            }
            b();
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
