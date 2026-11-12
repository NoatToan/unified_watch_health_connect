package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.TestTimedOutException;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class MethodRoadie {
    private final Object a;
    private final RunNotifier b;
    private final Description c;
    private TestMethod d;

    public class a implements Runnable {
        public final /* synthetic */ long a;

        /* JADX INFO: renamed from: org.junit.internal.runners.MethodRoadie$a$a, reason: collision with other inner class name */
        public class CallableC1204a implements Callable<Object> {
            public CallableC1204a() {
            }

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                MethodRoadie.this.runTestMethod();
                return null;
            }
        }

        public a(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new CallableC1204a());
            executorServiceNewSingleThreadExecutor.shutdown();
            try {
                long j = this.a;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!executorServiceNewSingleThreadExecutor.awaitTermination(j, timeUnit)) {
                    executorServiceNewSingleThreadExecutor.shutdownNow();
                }
                futureSubmit.get(0L, timeUnit);
            } catch (TimeoutException unused) {
                MethodRoadie.this.addFailure(new TestTimedOutException(this.a, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
                MethodRoadie.this.addFailure(e);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MethodRoadie.this.runTestMethod();
        }
    }

    public MethodRoadie(Object obj, TestMethod testMethod, RunNotifier runNotifier, Description description) {
        this.a = obj;
        this.b = runNotifier;
        this.c = description;
        this.d = testMethod;
    }

    private void a() {
        Iterator<Method> it2 = this.d.b().iterator();
        while (it2.hasNext()) {
            try {
                it2.next().invoke(this.a, new Object[0]);
            } catch (InvocationTargetException e) {
                addFailure(e.getTargetException());
            } catch (Throwable th) {
                addFailure(th);
            }
        }
    }

    private void b() throws org.junit.internal.runners.a {
        try {
            try {
                Iterator<Method> it2 = this.d.c().iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(this.a, new Object[0]);
                }
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        } catch (AssumptionViolatedException unused) {
            throw new org.junit.internal.runners.a();
        } catch (Throwable th) {
            addFailure(th);
            throw new org.junit.internal.runners.a();
        }
    }

    private void c(long j) {
        runBeforesThenTestThenAfters(new a(j));
    }

    public void addFailure(Throwable th) {
        this.b.fireTestFailure(new Failure(this.c, th));
    }

    public void run() {
        if (this.d.isIgnored()) {
            this.b.fireTestIgnored(this.c);
            return;
        }
        this.b.fireTestStarted(this.c);
        try {
            long timeout = this.d.getTimeout();
            if (timeout > 0) {
                c(timeout);
            } else {
                runTest();
            }
        } finally {
            this.b.fireTestFinished(this.c);
        }
    }

    public void runBeforesThenTestThenAfters(Runnable runnable) {
        try {
            try {
                b();
                runnable.run();
            } catch (org.junit.internal.runners.a unused) {
            } catch (Exception unused2) {
                throw new RuntimeException("test should never throw an exception to this level");
            }
            a();
        } catch (Throwable th) {
            a();
            throw th;
        }
    }

    public void runTest() {
        runBeforesThenTestThenAfters(new b());
    }

    public void runTestMethod() {
        try {
            this.d.invoke(this.a);
            if (this.d.a()) {
                addFailure(new AssertionError("Expected exception: " + this.d.getExpectedException().getName()));
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof AssumptionViolatedException) {
                return;
            }
            if (!this.d.a()) {
                addFailure(targetException);
                return;
            }
            if (this.d.d(targetException)) {
                addFailure(new Exception("Unexpected exception, expected<" + this.d.getExpectedException().getName() + "> but was<" + targetException.getClass().getName() + SearchCriteria.GT, targetException));
            }
        } catch (Throwable th) {
            addFailure(th);
        }
    }
}
