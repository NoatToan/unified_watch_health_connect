package com.garmin.android.apps.connectmobile.connectiq;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f31849a = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScheduledFuture<?> f31850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f31851c;

    public c1(Runnable runnable) {
        this.f31851c = runnable;
    }

    public final synchronized boolean a() {
        ScheduledFuture<?> scheduledFuture;
        scheduledFuture = this.f31850b;
        return (scheduledFuture == null || scheduledFuture.isDone()) ? false : true;
    }

    public final synchronized void b() {
        try {
            ScheduledFuture<?> scheduledFuture = this.f31850b;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f31850b.cancel(true);
            }
            this.f31850b = this.f31849a.schedule(this.f31851c, 60L, TimeUnit.SECONDS);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void c() {
        ScheduledFuture<?> scheduledFuture = this.f31850b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }
}
