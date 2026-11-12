package defpackage;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class mkb extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f26953a;

    public mkb(Handler handler) {
        this.f26953a = handler;
    }

    public boolean a() {
        return Thread.currentThread() == this.f26953a.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public <T> ffl<T> newTaskFor(Runnable runnable, T t) {
        return new ffl<>(this.f26953a, runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public <T> ffl<T> newTaskFor(Callable<T> callable) {
        return new ffl<>(this.f26953a, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        runnable.getClass();
        ffl<T> fflVarNewTaskFor = newTaskFor(runnable, t);
        execute(fflVarNewTaskFor);
        return fflVarNewTaskFor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f26953a.post(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        callable.getClass();
        ffl<T> fflVarNewTaskFor = newTaskFor(callable);
        execute(fflVarNewTaskFor);
        return fflVarNewTaskFor;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ffl fflVarNewTaskFor = newTaskFor(runnable, null);
        this.f26953a.postDelayed(fflVarNewTaskFor, timeUnit.toMillis(j));
        return fflVarNewTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        ffl fflVarNewTaskFor = newTaskFor(callable);
        this.f26953a.postDelayed(fflVarNewTaskFor, timeUnit.toMillis(j));
        return fflVarNewTaskFor;
    }
}
