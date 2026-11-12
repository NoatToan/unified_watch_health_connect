package com.xiaomi.ai.android.track;

import android.util.Log;
import defpackage.f01;
import defpackage.ues;
import defpackage.wpe;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f10968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f10969b;
    protected d c;
    private ScheduledFuture<?> d;
    private ScheduledFuture<?> e;
    private final Object f = getClass();
    private volatile boolean g = true;
    protected boolean h;

    /* JADX INFO: renamed from: com.xiaomi.ai.android.track.b$b, reason: collision with other inner class name */
    public class RunnableC0347b implements Runnable {
        public RunnableC0347b() {
        }

        public final void a() {
            wpe.b("BaseTrackStrategy", "postDiskDataDelay:" + b.this.f10969b);
            if (b.this.e == null || b.this.e.isCancelled() || b.this.e.isDone()) {
                wpe.b("BaseTrackStrategy", "start DiskCheck task");
                b bVar = b.this;
                bVar.e = ues.a(new c(), ((long) bVar.f10969b) * 1000);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f) {
                try {
                    wpe.b("BaseTrackStrategy", "CacheCheckRunnable run");
                    b.this.b();
                    if (b.this.e()) {
                        return;
                    }
                    if (b.this.d()) {
                        if (b.this.j()) {
                            b.this.g = true;
                        }
                        a();
                        b.this.f();
                    } else {
                        b.this.b(false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wpe.f("BaseTrackStrategy", "DiskCheckRunnable run", b.this.h);
            b.this.a(false);
        }
    }

    public interface d {
        void a();

        void onError(f01 f01Var);
    }

    public b(int i, int i2, boolean z, d dVar) {
        this.c = dVar;
        this.f10968a = i;
        this.f10969b = i2;
        this.h = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ScheduledFuture<?> scheduledFuture = this.d;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        wpe.f("BaseTrackStrategy", "cancel Cache task", this.h);
        this.d.cancel(false);
    }

    private void c() {
        wpe.b("BaseTrackStrategy", "cleanDiskPeriodCheck");
        ScheduledFuture<?> scheduledFuture = this.e;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        wpe.b("BaseTrackStrategy", "cancel disk task");
        this.e.cancel(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        d dVar = this.c;
        if (dVar != null) {
            dVar.a();
        }
    }

    public abstract boolean d();

    public abstract boolean e();

    public boolean g() {
        wpe.f("BaseTrackStrategy", "postFailedData", this.h);
        try {
            if (i()) {
                return a(false);
            }
            wpe.f("BaseTrackStrategy", "postFailedData: no data", this.h);
            return true;
        } catch (Exception e) {
            wpe.c("BaseTrackStrategy", "postFailedData error :" + Log.getStackTraceString(e), this.h);
            return false;
        }
    }

    public abstract void h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    private void a() {
        ScheduledFuture<?> scheduledFuture = this.d;
        if (scheduledFuture == null || scheduledFuture.isCancelled() || this.d.isDone()) {
            wpe.f("BaseTrackStrategy", "start CacheCheck task", this.h);
            this.d = ues.a(new RunnableC0347b(), ((long) this.f10968a) * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(boolean z) {
        if (e()) {
            return false;
        }
        if (z && d()) {
            a();
            return true;
        }
        b();
        c();
        wpe.f("BaseTrackStrategy", "postTrackInfo:start to post", this.h);
        boolean zK = k();
        f();
        return zK;
    }

    public boolean a(boolean z) {
        boolean zB;
        synchronized (this.f) {
            try {
                try {
                    if (this.g) {
                        h();
                        this.g = false;
                    }
                    zB = b(z);
                } catch (Exception e) {
                    wpe.c("BaseTrackStrategy", "postTrackData error :" + wpe.o(e), this.h);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zB;
    }
}
