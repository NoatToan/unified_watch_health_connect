package org.junit.internal.runners.statements;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestTimedOutException;

/* JADX INFO: loaded from: classes23.dex */
public class FailOnTimeout extends Statement {
    private final Statement a;
    private final TimeUnit b;
    private final long c;
    private final boolean d;
    private volatile ThreadGroup e;

    public static class Builder {
        private boolean a;
        private long b;
        private TimeUnit c;

        public FailOnTimeout build(Statement statement) {
            Objects.requireNonNull(statement, "statement cannot be null");
            return new FailOnTimeout(this, statement);
        }

        public Builder withLookingForStuckThread(boolean z) {
            this.a = z;
            return this;
        }

        public Builder withTimeout(long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException("timeout must be non-negative");
            }
            Objects.requireNonNull(timeUnit, "TimeUnit cannot be null");
            this.b = j;
            this.c = timeUnit;
            return this;
        }

        private Builder() {
            this.a = false;
            this.b = 0L;
            this.c = TimeUnit.SECONDS;
        }
    }

    public class b implements Callable<Throwable> {
        private final CountDownLatch a;

        private b() {
            this.a = new CountDownLatch(1);
        }

        public void a() throws InterruptedException {
            this.a.await();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Throwable call() throws Exception {
            try {
                this.a.countDown();
                FailOnTimeout.this.a.evaluate();
                return null;
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                return th;
            }
        }
    }

    private Thread[] b(Thread[] threadArr, int i) {
        int iMin = Math.min(i, threadArr.length);
        Thread[] threadArr2 = new Thread[iMin];
        for (int i2 = 0; i2 < iMin; i2++) {
            threadArr2[i2] = threadArr[i2];
        }
        return threadArr2;
    }

    public static Builder builder() {
        return new Builder();
    }

    private long c(Thread thread) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        if (!threadMXBean.isThreadCpuTimeSupported()) {
            return 0L;
        }
        try {
            return threadMXBean.getThreadCpuTime(thread.getId());
        } catch (UnsupportedOperationException unused) {
            return 0L;
        }
    }

    private Exception d(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        Thread threadG = this.d ? g(thread) : null;
        TestTimedOutException testTimedOutException = new TestTimedOutException(this.c, this.b);
        if (stackTrace != null) {
            testTimedOutException.setStackTrace(stackTrace);
            thread.interrupt();
        }
        if (threadG == null) {
            return testTimedOutException;
        }
        Exception exc = new Exception("Appears to be stuck in thread " + threadG.getName());
        exc.setStackTrace(f(threadG));
        return new MultipleFailureException(Arrays.asList(testTimedOutException, exc));
    }

    private Throwable e(FutureTask<Throwable> futureTask, Thread thread) {
        try {
            long j = this.c;
            return j > 0 ? futureTask.get(j, this.b) : futureTask.get();
        } catch (InterruptedException e) {
            return e;
        } catch (ExecutionException e2) {
            return e2.getCause();
        } catch (TimeoutException unused) {
            return d(thread);
        }
    }

    private StackTraceElement[] f(Thread thread) {
        try {
            return thread.getStackTrace();
        } catch (SecurityException unused) {
            return new StackTraceElement[0];
        }
    }

    private Thread g(Thread thread) {
        Thread[] threadArrH;
        if (this.e == null || (threadArrH = h(this.e)) == null) {
            return null;
        }
        long j = 0;
        Thread thread2 = null;
        for (Thread thread3 : threadArrH) {
            if (thread3.getState() == Thread.State.RUNNABLE) {
                long jC = c(thread3);
                if (thread2 == null || jC > j) {
                    thread2 = thread3;
                    j = jC;
                }
            }
        }
        if (thread2 == thread) {
            return null;
        }
        return thread2;
    }

    private Thread[] h(ThreadGroup threadGroup) {
        int iMax = Math.max(threadGroup.activeCount() * 2, 100);
        int i = 0;
        do {
            Thread[] threadArr = new Thread[iMax];
            int iEnumerate = threadGroup.enumerate(threadArr);
            if (iEnumerate < iMax) {
                return b(threadArr, iEnumerate);
            }
            iMax += 100;
            i++;
        } while (i < 5);
        return null;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        b bVar = new b();
        FutureTask<Throwable> futureTask = new FutureTask<>(bVar);
        this.e = new ThreadGroup("FailOnTimeoutGroup");
        Thread thread = new Thread(this.e, futureTask, "Time-limited test");
        thread.setDaemon(true);
        thread.start();
        bVar.a();
        Throwable thE = e(futureTask, thread);
        if (thE != null) {
            throw thE;
        }
    }

    @Deprecated
    public FailOnTimeout(Statement statement, long j) {
        this(builder().withTimeout(j, TimeUnit.MILLISECONDS), statement);
    }

    private FailOnTimeout(Builder builder, Statement statement) {
        this.e = null;
        this.a = statement;
        this.c = builder.b;
        this.b = builder.c;
        this.d = builder.a;
    }
}
