package com.huawei.hianalytics.visual;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes33.dex */
public final class n1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f11669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f11670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11671c = -1;

    public n1(Runnable runnable, Handler handler) {
        this.f11669a = handler;
        this.f11670b = runnable;
    }

    public final void a() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.f11671c;
        if (j > 0 && jUptimeMillis - j >= 5000) {
            this.f11669a.removeCallbacks(this);
            this.f11671c = 0L;
            this.f11670b.run();
        } else {
            if (j <= 0) {
                this.f11671c = jUptimeMillis;
            }
            this.f11669a.removeCallbacks(this);
            this.f11669a.postAtTime(this, Math.min(this.f11671c + 5000, jUptimeMillis + 500));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11669a.removeCallbacks(this);
        this.f11671c = 0L;
        this.f11670b.run();
    }
}
