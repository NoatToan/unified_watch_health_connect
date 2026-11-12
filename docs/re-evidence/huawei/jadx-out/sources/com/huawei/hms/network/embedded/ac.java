package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes34.dex */
public class ac {
    public static final ac d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14583c;

    public final class a extends ac {
        @Override // com.huawei.hms.network.embedded.ac
        public ac deadlineNanoTime(long j) {
            return this;
        }

        @Override // com.huawei.hms.network.embedded.ac
        public void throwIfReached() throws IOException {
        }

        @Override // com.huawei.hms.network.embedded.ac
        public ac timeout(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    public static long a(long j, long j2) {
        return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
    }

    public ac timeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f14583c = timeUnit.toNanos(j);
        return this;
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f14581a && this.f14582b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long e() {
        return this.f14583c;
    }

    public ac deadlineNanoTime(long j) {
        this.f14581a = true;
        this.f14582b = j;
        return this;
    }

    public boolean d() {
        return this.f14581a;
    }

    public long c() {
        if (this.f14581a) {
            return this.f14582b;
        }
        throw new IllegalStateException("No deadline");
    }

    public ac b() {
        this.f14583c = 0L;
        return this;
    }

    public final void a(Object obj) throws InterruptedIOException {
        try {
            boolean zD = d();
            long jE = e();
            long jNanoTime = 0;
            if (!zD && jE == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zD && jE != 0) {
                jE = Math.min(jE, c() - jNanoTime2);
            } else if (zD) {
                jE = c() - jNanoTime2;
            }
            if (jE > 0) {
                long j = jE / 1000000;
                obj.wait(j, (int) (jE - (1000000 * j)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jE) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public final ac a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            if (timeUnit != null) {
                return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException("duration <= 0: " + j);
    }

    public ac a() {
        this.f14581a = false;
        return this;
    }
}
