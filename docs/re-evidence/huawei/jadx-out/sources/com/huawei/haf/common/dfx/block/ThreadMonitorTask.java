package com.huawei.haf.common.dfx.block;

import com.huawei.haf.common.dfx.DfxMonitorTask;
import health.compact.a.DfxMonitorCenter;

/* JADX INFO: loaded from: classes2.dex */
public final class ThreadMonitorTask implements DfxMonitorTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MonitorCallback f5870a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5871c;
    private final Thread d;
    private volatile boolean e = false;

    public ThreadMonitorTask(Thread thread, MonitorCallback monitorCallback) {
        this.d = thread;
        this.f5870a = monitorCallback;
        this.f5871c = a(monitorCallback.monitorTimeInterval());
    }

    public void b(String str) {
        a(null, 0L);
        this.f5870a.begin(this.d, str, System.currentTimeMillis());
        DfxMonitorCenter.e(this);
        this.e = true;
    }

    public long a() {
        return this.f5870a.getBeginTime();
    }

    public void c() {
        a(null, 0L);
    }

    public void a(Throwable th, long j) {
        if (this.e) {
            DfxMonitorCenter.c(this);
            this.e = false;
            if (j <= this.f5870a.getBeginTime()) {
                j = System.currentTimeMillis();
            }
            this.f5870a.end(this.d, th, j, this.f5871c);
        }
    }

    private long a(long j) {
        return Math.max((j / 1000) * 1000, 1000L);
    }

    @Override // com.huawei.haf.common.dfx.DfxMonitorTask
    public long monitorDelayTime() {
        return this.f5871c;
    }

    @Override // com.huawei.haf.common.dfx.DfxMonitorTask
    public void onMonitor() {
        if (this.e) {
            if (!this.d.isAlive()) {
                this.e = false;
            } else if (this.f5870a.check(this.d, System.currentTimeMillis(), this.f5871c)) {
                DfxMonitorCenter.e(this);
            }
        }
    }
}
