package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes15.dex */
public class pyn extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static pyn f45976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f45977c;
    private static final int d;
    private static final int e;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        d = iAvailableProcessors;
        int i = iAvailableProcessors + 1;
        f45977c = i;
        e = i;
    }

    private pyn(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, new RejectedExecutionHandler() { // from class: pyn.4
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                pyx.b("Task rejected, too many task!");
            }
        });
    }

    public static pyn c() {
        if (f45976b == null) {
            synchronized (pyn.class) {
                if (f45976b == null) {
                    f45976b = new pyn(f45977c, e, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(64), new c());
                }
            }
        }
        return f45976b;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
                th = e2;
            } catch (ExecutionException e3) {
                th = e3.getCause();
            }
        }
        if (th != null) {
            pyx.b("Running task appeared exception! Thread [" + Thread.currentThread().getName() + "], because [" + th.getMessage() + "]\n" + th.getStackTrace());
        }
    }

    static class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AtomicInteger f45978a = new AtomicInteger(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ThreadGroup f45979c;
        private final String d;
        private final AtomicInteger e = new AtomicInteger(1);

        public c() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f45979c = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.d = "HwSkinner task pool No." + f45978a.getAndIncrement() + ", thread No.";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = this.d + this.e.getAndIncrement();
            pyx.a("Thread production, name is [" + str + "]");
            Thread thread = new Thread(this.f45979c, runnable, str, 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: pyn.c.5
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    pyx.a("Running task appeared exception! Thread [" + thread2.getName() + "], because [" + th.getMessage() + "]");
                }
            });
            return thread;
        }
    }
}
