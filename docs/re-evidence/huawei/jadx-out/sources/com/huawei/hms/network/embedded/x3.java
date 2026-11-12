package com.huawei.hms.network.embedded;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes34.dex */
public class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15591c;

    public long timeoutNanos() {
        return this.f15591c;
    }

    public x3 timeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f15591c = timeUnit.toNanos(j);
        return this;
    }

    public boolean hasDeadline() {
        return this.f15589a;
    }

    public x3 deadlineNanoTime(long j) {
        this.f15589a = true;
        this.f15590b = j;
        return this;
    }

    public long deadlineNanoTime() {
        if (this.f15589a) {
            return this.f15590b;
        }
        throw new IllegalStateException("No deadline");
    }

    public final x3 deadline(long j, TimeUnit timeUnit) {
        if (j > 0) {
            if (timeUnit != null) {
                return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException("duration <= 0: " + j);
    }

    public x3 clearTimeout() {
        this.f15591c = 0L;
        return this;
    }

    public x3 clearDeadline() {
        this.f15589a = false;
        return this;
    }
}
