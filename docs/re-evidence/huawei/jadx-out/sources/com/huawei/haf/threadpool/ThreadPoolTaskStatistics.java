package com.huawei.haf.threadpool;

import com.huawei.haf.common.dfx.DfxMonitorTask;
import com.huawei.haf.common.dfx.block.ThreadMonitorTask;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.LogUtil;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class ThreadPoolTaskStatistics implements ThreadPoolManager.TaskStatistics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadPoolManager.HealthThreadPoolExecutor f6093c;
    private String h;
    private final ThreadPoolCallback i;
    private final ThreadPoolStateMonitor j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f6091a = new AtomicLong(0);
    private final AtomicLong d = new AtomicLong(0);
    private final AtomicLong e = new AtomicLong(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadLocal<ThreadMonitorTask> f6092b = new ThreadLocal<>();
    private final ThreadLocal<Long> f = new ThreadLocal<>();

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadPoolTaskStatistics(ThreadPoolManager threadPoolManager, ThreadPoolCallback threadPoolCallback) {
        this.f6093c = threadPoolManager.f6072b;
        this.i = threadPoolCallback;
        this.j = threadPoolCallback != null ? new ThreadPoolStateMonitor() : null;
    }

    @Override // com.huawei.haf.threadpool.ThreadPoolManager.TaskStatistics
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (this.i == null) {
            return;
        }
        this.j.e();
        if (!this.i.isMonitorTask()) {
            this.f.set(Long.valueOf(System.currentTimeMillis()));
            return;
        }
        ThreadMonitorTask threadMonitorTaskCreateBlockMonitorTask = this.f6092b.get();
        if (threadMonitorTaskCreateBlockMonitorTask == null) {
            threadMonitorTaskCreateBlockMonitorTask = this.i.createBlockMonitorTask(thread);
            this.f6092b.set(threadMonitorTaskCreateBlockMonitorTask);
        }
        threadMonitorTaskCreateBlockMonitorTask.b(a(runnable));
    }

    @Override // com.huawei.haf.threadpool.ThreadPoolManager.TaskStatistics
    public void afterExecute(Runnable runnable, Throwable th) {
        if (a(th) || th == null) {
            return;
        }
        LogUtil.e("HAF_TaskStatistics", a(runnable), ", throwable=", LogUtil.c(th));
    }

    private boolean a(Throwable th) {
        if (this.i == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.i.isMonitorTask()) {
            c(jCurrentTimeMillis - this.f.get().longValue());
            return false;
        }
        ThreadMonitorTask threadMonitorTask = this.f6092b.get();
        if (threadMonitorTask == null) {
            return false;
        }
        threadMonitorTask.a(th, jCurrentTimeMillis);
        c(jCurrentTimeMillis - threadMonitorTask.a());
        return true;
    }

    private void c(long j) {
        this.f6091a.incrementAndGet();
        this.d.addAndGet(j);
        if (j > this.e.get()) {
            this.e.set(j);
        }
    }

    private String a(Runnable runnable) {
        if (this.h == null) {
            this.h = this.f6093c.c() + ", runnable=";
        }
        return this.h + this.f6093c.d(runnable);
    }

    class ThreadPoolStateMonitor implements DfxMonitorTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f6094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f6095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f6096c;
        private long e;
        private long i;

        private ThreadPoolStateMonitor() {
            this.f6094a = System.currentTimeMillis();
        }

        void e() {
            if (this.f6096c) {
                return;
            }
            this.f6096c = true;
            DfxMonitorCenter.e(this);
        }

        @Override // com.huawei.haf.common.dfx.DfxMonitorTask
        public long monitorDelayTime() {
            return ThreadPoolTaskStatistics.this.i.minStatisticsTimeInterval();
        }

        @Override // com.huawei.haf.common.dfx.DfxMonitorTask
        public void onMonitor() {
            long completedTaskCount = ThreadPoolTaskStatistics.this.f6093c.getCompletedTaskCount();
            if (completedTaskCount == this.f6095b && ThreadPoolTaskStatistics.this.f6093c.a() == 0) {
                this.f6096c = false;
            } else {
                e(completedTaskCount);
                DfxMonitorCenter.e(this);
            }
        }

        private void e(long j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = jCurrentTimeMillis - this.f6094a;
            int corePoolSize = ThreadPoolTaskStatistics.this.f6093c.getCorePoolSize();
            int activeCount = ThreadPoolTaskStatistics.this.f6093c.getActiveCount();
            if ((activeCount < corePoolSize || activeCount == ThreadPoolTaskStatistics.this.f6093c.getMaximumPoolSize()) && j2 < ThreadPoolTaskStatistics.this.i.statisticsTimeInterval()) {
                return;
            }
            this.f6094a = jCurrentTimeMillis;
            this.f6095b = j;
            ThreadPoolStateInfo threadPoolStateInfo = new ThreadPoolStateInfo();
            threadPoolStateInfo.e(ThreadPoolTaskStatistics.this.f6093c, activeCount);
            threadPoolStateInfo.e(j2, ThreadPoolTaskStatistics.this.f6091a.get(), ThreadPoolTaskStatistics.this.d.get(), ThreadPoolTaskStatistics.this.e.get());
            a(threadPoolStateInfo);
            ThreadPoolTaskStatistics.this.i.threadPoolStateInfo(ThreadPoolTaskStatistics.this.f6093c.c(), threadPoolStateInfo, jCurrentTimeMillis);
        }

        private void a(ThreadPoolStateInfo threadPoolStateInfo) {
            ThreadPoolTaskStatistics.this.f6091a.getAndSet(0L);
            this.e += ThreadPoolTaskStatistics.this.d.getAndSet(0L);
            long andSet = ThreadPoolTaskStatistics.this.e.getAndSet(0L);
            if (andSet > this.i) {
                this.i = andSet;
            }
            threadPoolStateInfo.e(this.f6095b, this.e, this.i);
        }
    }
}
