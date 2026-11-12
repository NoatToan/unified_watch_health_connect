package org.apache.commons.lang3.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes23.dex */
public class TimedSemaphore {
    public static final int NO_LIMIT = 0;
    private static final int l = 1;
    private final ScheduledExecutorService a;
    private final long b;
    private final TimeUnit c;
    private final boolean d;
    private ScheduledFuture<?> e;
    private long f;
    private long g;
    private int h;
    private int i;
    private int j;
    private boolean k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TimedSemaphore.this.b();
        }
    }

    public TimedSemaphore(long j, TimeUnit timeUnit, int i) {
        this(null, j, timeUnit, i);
    }

    private boolean a() {
        if (getLimit() > 0 && this.i >= getLimit()) {
            return false;
        }
        this.i++;
        return true;
    }

    private void c() {
        if (isShutdown()) {
            throw new IllegalStateException("TimedSemaphore is shut down!");
        }
        if (this.e == null) {
            this.e = startTimer();
        }
    }

    public synchronized void acquire() throws InterruptedException {
        boolean zA;
        c();
        do {
            zA = a();
            if (!zA) {
                wait();
            }
        } while (!zA);
    }

    public synchronized void b() {
        int i = this.i;
        this.j = i;
        this.f += (long) i;
        this.g++;
        this.i = 0;
        notifyAll();
    }

    public synchronized int getAcquireCount() {
        return this.i;
    }

    public synchronized int getAvailablePermits() {
        return getLimit() - getAcquireCount();
    }

    public synchronized double getAverageCallsPerPeriod() {
        long j;
        j = this.g;
        return j == 0 ? 0.0d : this.f / j;
    }

    public ScheduledExecutorService getExecutorService() {
        return this.a;
    }

    public synchronized int getLastAcquiresPerPeriod() {
        return this.j;
    }

    public final synchronized int getLimit() {
        return this.h;
    }

    public long getPeriod() {
        return this.b;
    }

    public TimeUnit getUnit() {
        return this.c;
    }

    public synchronized boolean isShutdown() {
        return this.k;
    }

    public final synchronized void setLimit(int i) {
        this.h = i;
    }

    public synchronized void shutdown() {
        if (!this.k) {
            if (this.d) {
                getExecutorService().shutdownNow();
            }
            ScheduledFuture<?> scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.k = true;
        }
    }

    public ScheduledFuture<?> startTimer() {
        return getExecutorService().scheduleAtFixedRate(new a(), getPeriod(), getPeriod(), getUnit());
    }

    public synchronized boolean tryAcquire() {
        c();
        return a();
    }

    public TimedSemaphore(ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit, int i) {
        Validate.inclusiveBetween(1L, Long.MAX_VALUE, j, "Time period must be greater than 0!");
        this.b = j;
        this.c = timeUnit;
        if (scheduledExecutorService != null) {
            this.a = scheduledExecutorService;
            this.d = false;
        } else {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            scheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            this.a = scheduledThreadPoolExecutor;
            this.d = true;
        }
        setLimit(i);
    }
}
