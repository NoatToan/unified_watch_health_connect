package org.junit.experimental;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.runner.Computer;
import org.junit.runner.Runner;
import org.junit.runners.ParentRunner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;
import org.junit.runners.model.RunnerScheduler;

/* JADX INFO: loaded from: classes23.dex */
public class ParallelComputer extends Computer {
    private final boolean a;
    private final boolean b;

    public static class a implements RunnerScheduler {
        private final ExecutorService a = Executors.newCachedThreadPool();

        @Override // org.junit.runners.model.RunnerScheduler
        public void finished() {
            try {
                this.a.shutdown();
                this.a.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
        }

        @Override // org.junit.runners.model.RunnerScheduler
        public void schedule(Runnable runnable) {
            this.a.submit(runnable);
        }
    }

    public ParallelComputer(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    private static Runner a(Runner runner) {
        if (runner instanceof ParentRunner) {
            ((ParentRunner) runner).setScheduler(new a());
        }
        return runner;
    }

    public static Computer classes() {
        return new ParallelComputer(true, false);
    }

    public static Computer methods() {
        return new ParallelComputer(false, true);
    }

    @Override // org.junit.runner.Computer
    public Runner getRunner(RunnerBuilder runnerBuilder, Class<?> cls) throws Throwable {
        Runner runner = super.getRunner(runnerBuilder, cls);
        return this.b ? a(runner) : runner;
    }

    @Override // org.junit.runner.Computer
    public Runner getSuite(RunnerBuilder runnerBuilder, Class<?>[] clsArr) throws InitializationError {
        Runner suite = super.getSuite(runnerBuilder, clsArr);
        return this.a ? a(suite) : suite;
    }
}
