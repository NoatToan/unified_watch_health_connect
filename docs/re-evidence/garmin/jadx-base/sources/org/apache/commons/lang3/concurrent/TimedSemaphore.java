package org.apache.commons.lang3.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k32.n;
import org.apache.commons.lang3.Validate;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class TimedSemaphore {
    public static final int NO_LIMIT = 0;
    private static final int THREAD_POOL_SIZE = 1;
    private int acquireCount;
    private final ScheduledExecutorService executorService;
    private int lastCallsPerPeriod;
    private int limit;
    private final boolean ownExecutor;
    private final long period;
    private long periodCount;
    private boolean shutdown;
    private ScheduledFuture<?> task;
    private long totalAcquireCount;
    private final TimeUnit unit;

    public TimedSemaphore(ScheduledExecutorService scheduledExecutorService, long j8, TimeUnit timeUnit, int i14) {
        Validate.inclusiveBetween(1L, Long.MAX_VALUE, j8, "Time period must be greater than 0!");
        this.period = j8;
        this.unit = timeUnit;
        if (scheduledExecutorService != null) {
            this.executorService = scheduledExecutorService;
            this.ownExecutor = false;
        } else {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            scheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            this.executorService = scheduledThreadPoolExecutor;
            this.ownExecutor = true;
        }
        setLimit(i14);
    }

    private boolean acquirePermit() {
        if (getLimit() > 0 && this.acquireCount >= getLimit()) {
            return false;
        }
        this.acquireCount++;
        return true;
    }

    private void prepareAcquire() {
        if (isShutdown()) {
            h.z("TimedSemaphore is shut down!");
        } else if (this.task == null) {
            this.task = startTimer();
        }
    }

    public synchronized void acquire() {
        boolean zAcquirePermit;
        prepareAcquire();
        do {
            zAcquirePermit = acquirePermit();
            if (!zAcquirePermit) {
                wait();
            }
        } while (!zAcquirePermit);
    }

    public synchronized void endOfPeriod() {
        int i14 = this.acquireCount;
        this.lastCallsPerPeriod = i14;
        this.totalAcquireCount += (long) i14;
        this.periodCount++;
        this.acquireCount = 0;
        notifyAll();
    }

    public synchronized int getAcquireCount() {
        return this.acquireCount;
    }

    public synchronized int getAvailablePermits() {
        return getLimit() - getAcquireCount();
    }

    public synchronized double getAverageCallsPerPeriod() {
        long j8;
        j8 = this.periodCount;
        return j8 == 0 ? 0.0d : this.totalAcquireCount / j8;
    }

    public ScheduledExecutorService getExecutorService() {
        return this.executorService;
    }

    public synchronized int getLastAcquiresPerPeriod() {
        return this.lastCallsPerPeriod;
    }

    public final synchronized int getLimit() {
        return this.limit;
    }

    public long getPeriod() {
        return this.period;
    }

    public TimeUnit getUnit() {
        return this.unit;
    }

    public synchronized boolean isShutdown() {
        return this.shutdown;
    }

    public final synchronized void setLimit(int i14) {
        this.limit = i14;
    }

    public synchronized void shutdown() {
        try {
            if (!this.shutdown) {
                if (this.ownExecutor) {
                    getExecutorService().shutdownNow();
                }
                ScheduledFuture<?> scheduledFuture = this.task;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.shutdown = true;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public ScheduledFuture<?> startTimer() {
        return getExecutorService().scheduleAtFixedRate(new n(this, 26), getPeriod(), getPeriod(), getUnit());
    }

    public synchronized boolean tryAcquire() {
        prepareAcquire();
        return acquirePermit();
    }

    public TimedSemaphore(long j8, TimeUnit timeUnit, int i14) {
        this(null, j8, timeUnit, i14);
    }
}
