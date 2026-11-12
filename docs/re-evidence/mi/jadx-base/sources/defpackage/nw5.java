package defpackage;

import com.alibaba.android.arouter.facade.template.ILogger;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class nw5 extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f28498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f28499b;
    public static final int c;
    public static volatile nw5 d;

    public class a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            kb.c.error(ILogger.defaultTag, "Task rejected, too many task!");
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f28498a = iAvailableProcessors;
        int i = iAvailableProcessors + 1;
        f28499b = i;
        c = i;
    }

    public nw5(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, new a());
    }

    public static nw5 a() {
        if (d == null) {
            synchronized (nw5.class) {
                try {
                    if (d == null) {
                        d = new nw5(f28499b, c, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(64), new gx5());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException e) {
                th = e;
            } catch (ExecutionException e2) {
                th = e2.getCause();
            }
        }
        if (th != null) {
            kb.c.warning(ILogger.defaultTag, "Running task appeared exception! Thread [" + Thread.currentThread().getName() + "], because [" + th.getMessage() + "]\n" + p8p.a(th.getStackTrace()));
        }
    }
}
