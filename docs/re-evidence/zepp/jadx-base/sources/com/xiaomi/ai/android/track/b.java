package com.xiaomi.ai.android.track;

import android.util.Log;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes18.dex */
public abstract class b {
    public int a;
    public int b;
    public c c;
    public boolean d;
    private ScheduledFuture<?> e;
    private ScheduledFuture<?> f;
    private final Object g = getClass();
    private volatile boolean h = true;

    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.g) {
                Logger.a("BaseTrackStrategy", "CacheCheckRunnable run");
                b.this.i();
                if (b.this.f()) {
                    return;
                }
                if (b.this.b()) {
                    if (b.this.g()) {
                        b.this.h = true;
                    }
                    b.this.j();
                    b.this.l();
                } else {
                    b.this.b(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.ai.android.track.b$b, reason: collision with other inner class name */
    public class RunnableC0769b implements Runnable {
        private RunnableC0769b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.a("BaseTrackStrategy", "DiskCheckRunnable run", b.this.d);
            b.this.a(false);
        }
    }

    public interface c {
        void a();

        void a(AivsError aivsError);
    }

    public b(int i, int i2, boolean z, c cVar) {
        this.c = cVar;
        this.a = i;
        this.b = i2;
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(boolean z) {
        if (f()) {
            return false;
        }
        if (z && b()) {
            h();
            return true;
        }
        i();
        k();
        Logger.a("BaseTrackStrategy", "postTrackInfo:start to post", this.d);
        boolean zC = c();
        l();
        return zC;
    }

    private void h() {
        ScheduledFuture<?> scheduledFuture = this.e;
        if (scheduledFuture == null || scheduledFuture.isCancelled() || this.e.isDone()) {
            Logger.a("BaseTrackStrategy", "start CacheCheck task", this.d);
            this.e = com.xiaomi.ai.b.c.a(new a(), ((long) this.a) * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ScheduledFuture<?> scheduledFuture = this.e;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        Logger.a("BaseTrackStrategy", "cancel Cache task", this.d);
        this.e.cancel(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Logger.a("BaseTrackStrategy", "postDiskDataDelay:" + this.b);
        ScheduledFuture<?> scheduledFuture = this.f;
        if (scheduledFuture == null || scheduledFuture.isCancelled() || this.f.isDone()) {
            Logger.a("BaseTrackStrategy", "start DiskCheck task");
            this.f = com.xiaomi.ai.b.c.a(new RunnableC0769b(), ((long) this.b) * 1000);
        }
    }

    private void k() {
        Logger.a("BaseTrackStrategy", "cleanDiskPeriodCheck");
        ScheduledFuture<?> scheduledFuture = this.f;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        Logger.a("BaseTrackStrategy", "cancel disk task");
        this.f.cancel(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public boolean a() {
        Logger.a("BaseTrackStrategy", "postFailedData", this.d);
        try {
            if (e()) {
                return a(false);
            }
            Logger.a("BaseTrackStrategy", "postFailedData: no data", this.d);
            return true;
        } catch (Exception e) {
            Logger.c("BaseTrackStrategy", "postFailedData error :" + Log.getStackTraceString(e), this.d);
            return false;
        }
    }

    public boolean a(boolean z) {
        boolean zB;
        synchronized (this.g) {
            try {
                try {
                    if (this.h) {
                        d();
                        this.h = false;
                    }
                    zB = b(z);
                } catch (Exception e) {
                    Logger.c("BaseTrackStrategy", "postTrackData error :" + Logger.throwableToString(e), this.d);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zB;
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract void d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();
}
