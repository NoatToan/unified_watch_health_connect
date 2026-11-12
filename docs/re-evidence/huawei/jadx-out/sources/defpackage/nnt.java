package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class nnt extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f43335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Long> f43336b;
    private String d;

    static class b implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicInteger f43337b = new AtomicInteger(1);
        private String d;

        public b(String str) {
            this.d = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.d + this.f43337b.getAndIncrement());
        }
    }

    public nnt(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, String str) {
        super(i, i2, j, timeUnit, blockingQueue);
        this.d = str;
        setThreadFactory(new b(str));
        this.f43335a = System.currentTimeMillis();
        this.f43336b = new ConcurrentHashMap();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        this.f43336b.put(String.valueOf(runnable.hashCode()), Long.valueOf(System.currentTimeMillis()));
        if (System.currentTimeMillis() - this.f43335a >= 5000) {
            c();
            b();
            this.f43335a = System.currentTimeMillis();
        }
        super.beforeExecute(thread, runnable);
    }

    private void c() {
        new nnz.b().e(getActiveCount()).b(getCompletedTaskCount()).c(getTaskCount()).d(getCorePoolSize()).a(getLargestPoolSize()).c(getMaximumPoolSize()).b(getQueue().size());
    }

    private void b() {
        StringBuilder sb = new StringBuilder("thread dump:");
        sb.append("poolName:" + this.d + " activeCount:" + getActiveCount() + " completedTaskCount:" + getCompletedTaskCount() + " taskCount:" + getTaskCount() + " corePoolSize:" + getCorePoolSize() + " largestPoolSize:" + getLargestPoolSize() + " maximumPoolSize:" + getMaximumPoolSize() + " queueSize:" + getQueue().size() + " ");
        nox.b("ThreadPool", sb.toString(), true);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        nox.b("ThreadPool", "shutdown", true);
        b();
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        nox.b("ThreadPool", "shutdownNow", true);
        b();
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        a(runnable);
        b();
        super.afterExecute(runnable, th);
    }

    private void a(Runnable runnable) {
        Long lRemove = this.f43336b.remove(String.valueOf(runnable.hashCode()));
        long jLongValue = lRemove == null ? 0L : lRemove.longValue();
        nox.b("ThreadPool", "afterExecute, time costs:" + (System.currentTimeMillis() - jLongValue) + "ms", true);
    }
}
