package org.junit.rules;

import java.util.concurrent.TimeUnit;
import org.junit.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Stopwatch implements TestRule {
    private final b a;
    private volatile long b;
    private volatile long c;

    public static class b {
        public long a() {
            return System.nanoTime();
        }
    }

    public class c extends TestWatcher {
        private c() {
        }

        @Override // org.junit.rules.TestWatcher
        public void failed(Throwable th, Description description) {
            Stopwatch.this.f();
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.failed(stopwatch.d(), th, description);
        }

        @Override // org.junit.rules.TestWatcher
        public void finished(Description description) {
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.finished(stopwatch.d(), description);
        }

        @Override // org.junit.rules.TestWatcher
        public void skipped(AssumptionViolatedException assumptionViolatedException, Description description) {
            Stopwatch.this.f();
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.skipped(stopwatch.d(), assumptionViolatedException, description);
        }

        @Override // org.junit.rules.TestWatcher
        public void starting(Description description) {
            Stopwatch.this.e();
        }

        @Override // org.junit.rules.TestWatcher
        public void succeeded(Description description) {
            Stopwatch.this.f();
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.succeeded(stopwatch.d(), description);
        }
    }

    public Stopwatch() {
        this(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long d() {
        if (this.b == 0) {
            throw new IllegalStateException("Test has not started");
        }
        long jA = this.c;
        if (jA == 0) {
            jA = this.a.a();
        }
        return jA - this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.b = this.a.a();
        this.c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.c = this.a.a();
    }

    @Override // org.junit.rules.TestRule
    public final Statement apply(Statement statement, Description description) {
        return new c().apply(statement, description);
    }

    public void failed(long j, Throwable th, Description description) {
    }

    public void finished(long j, Description description) {
    }

    public long runtime(TimeUnit timeUnit) {
        return timeUnit.convert(d(), TimeUnit.NANOSECONDS);
    }

    public void skipped(long j, AssumptionViolatedException assumptionViolatedException, Description description) {
    }

    public void succeeded(long j, Description description) {
    }

    public Stopwatch(b bVar) {
        this.a = bVar;
    }
}
