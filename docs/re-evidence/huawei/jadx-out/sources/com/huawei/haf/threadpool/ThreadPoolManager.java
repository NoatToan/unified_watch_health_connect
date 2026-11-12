package com.huawei.haf.threadpool;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class ThreadPoolManager extends AbstractExecutorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ThreadPoolManager f6071a;
    private static volatile ThreadPoolManager d;
    private static final ConcurrentHashMap<Thread, HealthThreadPoolExecutor.HealthRunnableInfo> e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HealthThreadPoolExecutor f6072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6073c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public interface TaskStatistics {
        void afterExecute(Runnable runnable, Throwable th);

        void beforeExecute(Thread thread, Runnable runnable);
    }

    private ThreadPoolManager(int i, int i2, String str) {
        this.f6072b = new HealthThreadPoolExecutor(i, i2, str);
    }

    public static ThreadPoolManager c() {
        if (f6071a == null) {
            synchronized (ThreadPoolManager.class) {
                if (f6071a == null) {
                    boolean zB = ProcessUtil.b();
                    f6071a = b(zB ? 10 : 5, zB ? 50 : 20, "haf-def");
                }
            }
        }
        return f6071a;
    }

    public static ThreadPoolManager d() {
        if (d == null) {
            synchronized (ThreadPoolManager.class) {
                if (d == null) {
                    int iMax = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 5));
                    d = b(iMax, iMax, "haf-cpu");
                }
            }
        }
        return d;
    }

    public static ThreadPoolManager d(int i, int i2) {
        return new ThreadPoolManager(i, i2, null);
    }

    public static ThreadPoolManager b(int i, int i2, String str) {
        return new ThreadPoolManager(i, i2, str);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        a();
        if (runnable instanceof HealthRunnable) {
            this.f6072b.execute(runnable);
        } else if (runnable != null) {
            this.f6072b.execute(new HealthRunnable(runnable));
        }
    }

    private void a() {
        if (LogUtil.c()) {
            return;
        }
        ConcurrentHashMap<Thread, HealthThreadPoolExecutor.HealthRunnableInfo> concurrentHashMap = e;
        if (CollectionUtils.c(concurrentHashMap)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f6073c < 300000) {
            return;
        }
        this.f6073c = jCurrentTimeMillis;
        int poolSize = this.f6072b.getPoolSize();
        int activeCount = this.f6072b.getActiveCount();
        LogUtil.b("HAF_ThreadPoolManager", "dumpThreadPoolThreadInfo poolSize:", Integer.valueOf(poolSize), " activeCount:", Integer.valueOf(activeCount), " taskRunNum:", Integer.valueOf(this.f6072b.a()), " waitRn:", Integer.valueOf(this.f6072b.b()));
        if (activeCount == 0 || poolSize != activeCount) {
            return;
        }
        StringBuilder sb = new StringBuilder("Running Threads Information:\n");
        boolean z = false;
        for (Map.Entry<Thread, HealthThreadPoolExecutor.HealthRunnableInfo> entry : concurrentHashMap.entrySet()) {
            Thread key = entry.getKey();
            HealthThreadPoolExecutor.HealthRunnableInfo value = entry.getValue();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - value.f6085a;
            if (jCurrentTimeMillis2 > 300000) {
                z = true;
            }
            sb.append("Thread Name: ");
            sb.append(key.getName());
            sb.append(", Simple Name: ");
            sb.append(value.f6086b);
            sb.append(", Start Time: ");
            sb.append(value.f6085a);
            sb.append(", Execution Time: ");
            sb.append(jCurrentTimeMillis2);
            sb.append(" ms\n");
        }
        LogUtil.e("HAF_ThreadPoolManager", "DumpThreadPoolThreadInfo ", sb.toString());
        if (z) {
            d("HAF_ThreadPoolManager", sb.toString());
            e.clear();
        }
    }

    private static void d(String str, String str2) {
        SharedPreferences.Editor editorEdit = BaseApplication.b().getSharedPreferences("error_monitor_upload_log_name", 0).edit();
        String str3 = System.currentTimeMillis() + ";" + str + ";" + str2 + ";" + BaseApplication.g();
        if (editorEdit != null) {
            editorEdit.putString("error_monitor_upload_log_key", str3);
            editorEdit.commit();
        }
    }

    public boolean e(Runnable runnable) {
        if (runnable instanceof HealthRunnable) {
            return this.f6072b.remove(runnable);
        }
        if (runnable != null) {
            return this.f6072b.remove(new HealthRunnable(runnable));
        }
        return false;
    }

    public void a(String str, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("tag is null");
        }
        execute(new HealthTagRunnable(str, runnable));
    }

    public int d(String str, Runnable runnable) {
        if (str == null) {
            throw new IllegalArgumentException("tag is null");
        }
        if (runnable != null) {
            return this.f6072b.remove(new HealthTagRunnable(str, runnable)) ? 1 : 0;
        }
        return this.f6072b.c(str);
    }

    public void b(String str, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("serialTag is null");
        }
        execute(new HealthSerialRunnable(str, runnable));
    }

    public int c(String str, Runnable runnable) {
        if (str == null) {
            throw new IllegalArgumentException("serialTag is null");
        }
        if (runnable != null) {
            return this.f6072b.remove(new HealthSerialRunnable(str, runnable)) ? 1 : 0;
        }
        return this.f6072b.a(str);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        if (e()) {
            LogUtil.e("HAF_ThreadPoolManager", "Unsupported shutdown default thread pool");
        } else {
            this.f6072b.shutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if (e()) {
            LogUtil.e("HAF_ThreadPoolManager", "Unsupported shutdownNow default thread pool");
            return Collections.EMPTY_LIST;
        }
        List<Runnable> listShutdownNow = this.f6072b.shutdownNow();
        for (int i = 0; i < listShutdownNow.size(); i++) {
            Runnable runnable = listShutdownNow.get(i);
            if (runnable instanceof HealthRunnable) {
                listShutdownNow.set(i, ((HealthRunnable) runnable).b());
            }
        }
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f6072b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f6072b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f6072b.awaitTermination(j, timeUnit);
    }

    public void d(TaskStatistics taskStatistics) {
        this.f6072b.c(taskStatistics);
    }

    public String toString() {
        return this.f6072b.c();
    }

    private boolean e() {
        return this == f6071a || this == d;
    }

    static class HealthRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f6078b;
        private final long e;

        HealthRunnable(Runnable runnable) {
            if (runnable == null) {
                throw new IllegalArgumentException("runnable == null");
            }
            this.f6078b = runnable;
            this.e = System.currentTimeMillis();
            this.f6077a = e(runnable.getClass().getName());
        }

        Runnable b() {
            return this.f6078b;
        }

        String c() {
            return e(this.f6078b.getClass().getName());
        }

        private String e(String str) {
            int iLastIndexOf;
            return (!this.f6078b.getClass().isAnonymousClass() || (iLastIndexOf = str.lastIndexOf(".")) <= 0) ? str : str.substring(iLastIndexOf + 1);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6078b.run();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof HealthRunnable) {
                return this.f6078b.equals(((HealthRunnable) obj).f6078b);
            }
            return false;
        }

        public int hashCode() {
            return this.f6078b.hashCode() + super.hashCode();
        }

        public String toString() {
            return e(this.f6078b.toString());
        }
    }

    static class HealthTagRunnable extends HealthRunnable {
        private static final Runnable d = new Runnable() { // from class: com.huawei.haf.threadpool.ThreadPoolManager.HealthTagRunnable.1
            @Override // java.lang.Runnable
            public void run() {
            }
        };
        private final String e;

        HealthTagRunnable(String str, Runnable runnable) {
            super(runnable);
            if (str == null) {
                throw new IllegalArgumentException("tag == null");
            }
            this.e = str;
        }

        HealthTagRunnable(String str) {
            super(d);
            if (str == null) {
                throw new IllegalArgumentException("tag == null");
            }
            this.e = str;
        }

        @Override // com.huawei.haf.threadpool.ThreadPoolManager.HealthRunnable
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HealthTagRunnable)) {
                return false;
            }
            HealthTagRunnable healthTagRunnable = (HealthTagRunnable) obj;
            if (!this.e.equals(healthTagRunnable.e)) {
                return false;
            }
            Runnable runnableB = b();
            Runnable runnable = d;
            if (runnableB == runnable || healthTagRunnable.b() == runnable) {
                return true;
            }
            return super.equals(obj);
        }

        @Override // com.huawei.haf.threadpool.ThreadPoolManager.HealthRunnable
        public int hashCode() {
            return this.e.hashCode() + super.hashCode();
        }

        @Override // com.huawei.haf.threadpool.ThreadPoolManager.HealthRunnable
        public String toString() {
            return "tag=(" + this.e + "), " + super.toString();
        }
    }

    static class HealthSerialRunnable extends HealthRunnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6081c;
        private HealthSerialRunnable e;

        HealthSerialRunnable(String str, Runnable runnable) {
            super(runnable);
            if (str == null) {
                throw new IllegalArgumentException("serialTag == null");
            }
            this.f6081c = str;
        }

        @Override // com.huawei.haf.threadpool.ThreadPoolManager.HealthRunnable
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof HealthSerialRunnable) && this.f6081c.equals(((HealthSerialRunnable) obj).f6081c)) {
                return super.equals(obj);
            }
            return false;
        }

        @Override // com.huawei.haf.threadpool.ThreadPoolManager.HealthRunnable
        public int hashCode() {
            return this.f6081c.hashCode() + super.hashCode();
        }

        @Override // com.huawei.haf.threadpool.ThreadPoolManager.HealthRunnable
        public String toString() {
            return "serialTag=(" + this.f6081c + "), " + super.toString();
        }
    }

    public static final class DefaultThreadFactory implements ThreadFactory {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final AtomicInteger f6074c = new AtomicInteger(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadGroup f6075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f6076b;
        private final AtomicInteger e;

        DefaultThreadFactory() {
            this("haf-def");
        }

        public DefaultThreadFactory(String str) {
            this.e = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            this.f6075a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f6076b = a(str) + Constants.LINK + f6074c.getAndIncrement() + Constants.LINK;
        }

        private String a(String str) {
            if (TextUtils.isEmpty(str)) {
                return "haf-unk";
            }
            if (str.length() <= 5) {
                return "haf-" + str;
            }
            return str.substring(0, Math.min(9, str.length()));
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f6075a, runnable, this.f6076b + this.e.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            return thread;
        }

        public String toString() {
            return this.f6076b + this.f6075a.getName();
        }
    }

    static class HealthWrapExecutionHandler implements RejectedExecutionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BlockingQueue<HealthRunnable> f6087a;
        private volatile boolean e;

        private HealthWrapExecutionHandler() {
            this.f6087a = new LinkedBlockingQueue();
            this.e = true;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            this.e = true;
        }

        void b(Runnable runnable, HealthThreadPoolExecutor healthThreadPoolExecutor) {
            if ((runnable == null && this.f6087a.isEmpty()) || healthThreadPoolExecutor.isShutdown()) {
                return;
            }
            if (runnable != null && !this.f6087a.offer(a(runnable))) {
                LogUtil.e("HAF_ThreadPoolManager", "task rejected:", runnable.toString());
            }
            if (this.e) {
                a(healthThreadPoolExecutor);
            }
        }

        private void a(HealthThreadPoolExecutor healthThreadPoolExecutor) {
            synchronized (this) {
                try {
                    this.e = false;
                    HealthRunnable healthRunnablePeek = this.f6087a.peek();
                    while (healthRunnablePeek != null) {
                        healthThreadPoolExecutor.e(healthRunnablePeek);
                        if (this.e) {
                            break;
                        }
                        this.f6087a.poll();
                        healthRunnablePeek = this.f6087a.peek();
                    }
                    this.e = true;
                } catch (Throwable th) {
                    this.e = true;
                    throw th;
                }
            }
        }

        boolean a(Runnable runnable, HealthThreadPoolExecutor healthThreadPoolExecutor) {
            boolean z;
            synchronized (this) {
                HealthRunnable healthRunnableA = a(runnable);
                z = healthThreadPoolExecutor.a(healthRunnableA) || this.f6087a.remove(healthRunnableA);
            }
            return z;
        }

        int c(String str, HealthThreadPoolExecutor healthThreadPoolExecutor) {
            int i;
            synchronized (this) {
                HealthTagRunnable healthTagRunnable = new HealthTagRunnable(str);
                BlockingQueue<Runnable> queue = healthThreadPoolExecutor.getQueue();
                i = 0;
                while (queue.remove(healthTagRunnable)) {
                    i++;
                }
                while (this.f6087a.remove(healthTagRunnable)) {
                    i++;
                }
            }
            return i;
        }

        int c(HealthThreadPoolExecutor healthThreadPoolExecutor) {
            int size;
            int size2;
            synchronized (this) {
                size = healthThreadPoolExecutor.getQueue().size();
                size2 = this.f6087a.size();
            }
            return size + size2;
        }

        void b(HealthThreadPoolExecutor healthThreadPoolExecutor) {
            synchronized (this) {
                healthThreadPoolExecutor.g();
                this.f6087a.clear();
            }
        }

        List<Runnable> d(HealthThreadPoolExecutor healthThreadPoolExecutor) {
            List<Runnable> listF;
            synchronized (this) {
                listF = healthThreadPoolExecutor.f();
                listF.addAll(this.f6087a);
                this.f6087a.clear();
            }
            return listF;
        }

        private HealthRunnable a(Runnable runnable) {
            if (runnable instanceof HealthRunnable) {
                return (HealthRunnable) runnable;
            }
            return new HealthRunnable(runnable);
        }
    }

    static final class HealthSerialExecutionHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthThreadPoolExecutor f6080b;
        private final HashMap<String, HealthSerialRunnable> e = new HashMap<>();
        private final AtomicInteger d = new AtomicInteger(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadLocal<Boolean> f6079a = new ThreadLocal<>();

        HealthSerialExecutionHandler(HealthThreadPoolExecutor healthThreadPoolExecutor) {
            this.f6080b = healthThreadPoolExecutor;
        }

        int e() {
            return this.d.intValue();
        }

        boolean e(HealthSerialRunnable healthSerialRunnable) {
            synchronized (this.e) {
                HealthSerialRunnable healthSerialRunnable2 = this.e.get(healthSerialRunnable.f6081c);
                if (healthSerialRunnable2 == null) {
                    this.e.put(healthSerialRunnable.f6081c, healthSerialRunnable);
                    return false;
                }
                while (healthSerialRunnable2.e != null) {
                    healthSerialRunnable2 = healthSerialRunnable2.e;
                }
                healthSerialRunnable2.e = healthSerialRunnable;
                this.d.getAndIncrement();
                return true;
            }
        }

        void b(Runnable runnable, Throwable th, HealthWrapExecutionHandler healthWrapExecutionHandler) {
            if (runnable instanceof HealthSerialRunnable) {
                if (th != null) {
                    HealthSerialRunnable healthSerialRunnableD = d(((HealthSerialRunnable) runnable).f6081c);
                    if (healthSerialRunnableD != null) {
                        healthWrapExecutionHandler.b(healthSerialRunnableD, this.f6080b);
                        return;
                    }
                    return;
                }
                Boolean bool = this.f6079a.get();
                if (bool == null || !bool.booleanValue()) {
                    this.f6079a.set(Boolean.TRUE);
                    try {
                        d((HealthSerialRunnable) runnable);
                    } finally {
                        this.f6079a.set(Boolean.FALSE);
                    }
                }
            }
        }

        boolean b(HealthSerialRunnable healthSerialRunnable, HealthWrapExecutionHandler healthWrapExecutionHandler) {
            HealthSerialRunnable healthSerialRunnableE;
            synchronized (this.e) {
                boolean zA = healthWrapExecutionHandler.a(healthSerialRunnable, this.f6080b);
                HealthSerialRunnable healthSerialRunnable2 = this.e.get(healthSerialRunnable.f6081c);
                if (healthSerialRunnable2 == null) {
                    return zA;
                }
                if (!zA) {
                    while (healthSerialRunnable2.e != null) {
                        if (healthSerialRunnable2.e.equals(healthSerialRunnable)) {
                            healthSerialRunnable2.e = healthSerialRunnable2.e.e;
                            this.d.getAndDecrement();
                            return true;
                        }
                        healthSerialRunnable2 = healthSerialRunnable2.e;
                    }
                    return false;
                }
                if (healthSerialRunnable2.equals(healthSerialRunnable) && (healthSerialRunnableE = e(healthSerialRunnable2.f6081c)) != null) {
                    healthWrapExecutionHandler.b(healthSerialRunnableE, this.f6080b);
                }
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        int d(String str, HealthWrapExecutionHandler healthWrapExecutionHandler) {
            int i;
            synchronized (this.e) {
                HealthSerialRunnable healthSerialRunnable = this.e.get(str);
                if (healthSerialRunnable == null) {
                    return 0;
                }
                boolean zA = healthWrapExecutionHandler.a(healthSerialRunnable, this.f6080b);
                HealthSerialRunnable healthSerialRunnableE = e(str);
                while (healthSerialRunnableE != null) {
                    i = zA;
                    healthSerialRunnableE = e(str);
                    i++;
                }
                i = zA;
                return i;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(List<Runnable> list) {
            synchronized (this.e) {
                if (this.e.isEmpty()) {
                    return;
                }
                for (String str : (String[]) this.e.keySet().toArray(new String[this.e.size()])) {
                    HealthSerialRunnable healthSerialRunnableE = e(str);
                    while (healthSerialRunnableE != null) {
                        if (list != null) {
                            list.add(healthSerialRunnableE);
                        }
                        healthSerialRunnableE = e(str);
                    }
                }
            }
        }

        private HealthSerialRunnable e(String str) {
            HealthSerialRunnable healthSerialRunnableRemove = this.e.remove(str);
            if (healthSerialRunnableRemove == null) {
                return null;
            }
            HealthSerialRunnable healthSerialRunnable = healthSerialRunnableRemove.e;
            if (healthSerialRunnable != null) {
                this.e.put(healthSerialRunnable.f6081c, healthSerialRunnable);
                this.d.getAndDecrement();
            }
            return healthSerialRunnable;
        }

        private HealthSerialRunnable d(String str) {
            HealthSerialRunnable healthSerialRunnableE;
            synchronized (this.e) {
                healthSerialRunnableE = e(str);
            }
            return healthSerialRunnableE;
        }

        private void d(HealthSerialRunnable healthSerialRunnable) {
            HealthSerialRunnable healthSerialRunnableD = d(healthSerialRunnable.f6081c);
            while (healthSerialRunnableD != null) {
                e(Thread.currentThread(), healthSerialRunnableD);
                healthSerialRunnableD = d(healthSerialRunnableD.f6081c);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void e(Thread thread, Runnable runnable) {
            this.f6080b.beforeExecute(thread, runnable);
            try {
                try {
                    try {
                        runnable.run();
                        this.f6080b.afterExecute(runnable, null);
                    } catch (Throwable th) {
                        throw new Error(th);
                    }
                } catch (Error e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (Throwable th2) {
                this.f6080b.afterExecute(runnable, thread);
                throw th2;
            }
        }
    }

    static final class HealthThreadPoolExecutor extends ThreadPoolExecutor {
        private static final DefaultThreadFactory d = new DefaultThreadFactory();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthSerialExecutionHandler f6083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicLong f6084c;
        private final HealthWrapExecutionHandler e;
        private TaskStatistics g;
        private TaskStatistics h;
        private final AtomicInteger i;

        private static int d(int i) {
            return (i >> 1) + 1;
        }

        HealthThreadPoolExecutor(int i, int i2, String str) {
            this(i, i2, 30L, str);
        }

        HealthThreadPoolExecutor(int i, int i2, long j, String str) {
            this(i, i2, d(i), j, str);
        }

        HealthThreadPoolExecutor(int i, int i2, int i3, long j, String str) {
            this(i, i2, i3, j, new HealthWrapExecutionHandler());
            setThreadFactory(new DefaultThreadFactory(str));
        }

        private HealthThreadPoolExecutor(int i, int i2, int i3, long j, HealthWrapExecutionHandler healthWrapExecutionHandler) {
            super(i, i2, j, TimeUnit.SECONDS, new ArrayBlockingQueue(Math.max(i3, 1)), d, healthWrapExecutionHandler);
            this.f6084c = new AtomicLong(0L);
            this.i = new AtomicInteger(0);
            this.e = healthWrapExecutionHandler;
            this.f6083b = new HealthSerialExecutionHandler(this);
            allowCoreThreadTimeOut(true);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void setRejectedExecutionHandler(RejectedExecutionHandler rejectedExecutionHandler) {
            throw new UnsupportedOperationException("Unsupported setRejectedExecutionHandler");
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public long getTaskCount() {
            return getCompletedTaskCount() + ((long) getActiveCount()) + ((long) b());
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public long getCompletedTaskCount() {
            return this.f6084c.get();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if ((runnable instanceof HealthSerialRunnable) && !isShutdown() && this.f6083b.e((HealthSerialRunnable) runnable)) {
                return;
            }
            this.e.b(runnable, this);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public boolean remove(Runnable runnable) {
            if (runnable instanceof HealthSerialRunnable) {
                return this.f6083b.b((HealthSerialRunnable) runnable, this.e);
            }
            return this.e.a(runnable, this);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
        public void shutdown() {
            this.e.b(this);
            this.f6083b.b(null);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            List<Runnable> listD = this.e.d(this);
            this.f6083b.b(listD);
            return listD;
        }

        static class HealthRunnableInfo {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final long f6085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final String f6086b;

            HealthRunnableInfo(String str, long j) {
                this.f6086b = str;
                this.f6085a = j;
            }
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void beforeExecute(Thread thread, Runnable runnable) {
            if (runnable instanceof HealthRunnable) {
                HealthRunnable healthRunnable = (HealthRunnable) runnable;
                ThreadPoolManager.e.put(thread, new HealthRunnableInfo(healthRunnable.f6077a, healthRunnable.e));
            }
            this.e.b(null, this);
            this.i.getAndIncrement();
            TaskStatistics taskStatisticsH = h();
            if (taskStatisticsH != null) {
                taskStatisticsH.beforeExecute(thread, runnable);
            }
            super.beforeExecute(thread, runnable);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            ThreadPoolManager.e.remove(Thread.currentThread());
            this.i.getAndDecrement();
            this.f6084c.getAndIncrement();
            TaskStatistics taskStatisticsJ = j();
            if (taskStatisticsJ != null) {
                taskStatisticsJ.afterExecute(runnable, th);
            }
            this.f6083b.b(runnable, th, this.e);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void terminated() {
            super.terminated();
            LogUtil.b("HAF_ThreadPoolManager", "health thread pool terminated, ", getThreadFactory().toString());
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append(c());
            sb.append(", state{[");
            sb.append(getMaximumPoolSize());
            sb.append(", ");
            sb.append(getCorePoolSize());
            sb.append(", ");
            sb.append(getLargestPoolSize());
            sb.append("], poolSize=");
            sb.append(getPoolSize());
            sb.append(", activeCount=");
            sb.append(getActiveCount());
            sb.append(", runNum=");
            sb.append(a());
            sb.append(", waitNum=(");
            sb.append(b());
            sb.append(", ");
            sb.append(e());
            sb.append(", ");
            sb.append(d());
            sb.append("), cmpNum=");
            sb.append(getCompletedTaskCount());
            return sb.toString();
        }

        int c(String str) {
            return this.e.c(str, this);
        }

        int a(String str) {
            return this.f6083b.d(str, this.e);
        }

        void e(HealthRunnable healthRunnable) {
            super.execute(healthRunnable);
        }

        boolean a(HealthRunnable healthRunnable) {
            return super.remove(healthRunnable);
        }

        void g() {
            super.shutdown();
        }

        List<Runnable> f() {
            return super.shutdownNow();
        }

        int a() {
            return this.i.intValue();
        }

        int b() {
            return this.e.c(this) + this.f6083b.e();
        }

        int e() {
            return getQueue().size();
        }

        int d() {
            return this.f6083b.e();
        }

        String c() {
            if (TextUtils.isEmpty(this.f6082a)) {
                this.f6082a = getThreadFactory().toString();
            }
            return this.f6082a;
        }

        String d(Runnable runnable) {
            if (runnable instanceof HealthRunnable) {
                return ((HealthRunnable) runnable).c();
            }
            return runnable == null ? "" : runnable.toString();
        }

        void c(TaskStatistics taskStatistics) {
            this.g = taskStatistics;
        }

        private TaskStatistics h() {
            TaskStatistics taskStatistics = this.h;
            TaskStatistics taskStatistics2 = this.g;
            if (taskStatistics != taskStatistics2) {
                this.h = taskStatistics2;
            }
            return this.h;
        }

        private TaskStatistics j() {
            return this.h;
        }
    }
}
