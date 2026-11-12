package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.common.i;
import com.mapbox.common.location.FailedTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class CrashlyticsWorker implements Executor {
    private final ExecutorService executor;
    private final Object tailLock = new Object();
    private Task<?> tail = Tasks.forResult(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.executor = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$await$6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$0(Callable callable, Task task) {
        return Tasks.forResult(callable.call());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$1(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$2(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$3(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTaskOnSuccess$4(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTaskOnSuccess$5(SuccessContinuation successContinuation, Task task) {
        if (task.isSuccessful()) {
            return successContinuation.then(task.getResult());
        }
        return task.getException() != null ? Tasks.forException(task.getException()) : Tasks.forCanceled();
    }

    public void await() throws InterruptedException {
        Tasks.await(submit(new ab2.a(3)), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.executor.execute(runnable);
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    @CanIgnoreReturnValue
    public <T> Task<T> submit(Callable<T> callable) {
        FailedTask failedTask;
        synchronized (this.tailLock) {
            failedTask = (Task<T>) this.tail.continueWithTask(this.executor, new a(callable, 0));
            this.tail = failedTask;
        }
        return failedTask;
    }

    @CanIgnoreReturnValue
    public <T, R> Task<R> submitTask(Callable<Task<T>> callable, Continuation<T, Task<R>> continuation) {
        FailedTask failedTask;
        synchronized (this.tailLock) {
            failedTask = (Task<R>) this.tail.continueWithTask(this.executor, new a(callable, 2)).continueWithTask(this.executor, continuation);
            this.tail = failedTask;
        }
        return failedTask;
    }

    @CanIgnoreReturnValue
    public <T, R> Task<R> submitTaskOnSuccess(Callable<Task<T>> callable, SuccessContinuation<T, R> successContinuation) {
        FailedTask failedTask;
        synchronized (this.tailLock) {
            failedTask = (Task<R>) this.tail.continueWithTask(this.executor, new a(callable, 3)).continueWithTask(this.executor, new i(successContinuation, 2));
            this.tail = failedTask;
        }
        return failedTask;
    }

    @CanIgnoreReturnValue
    public Task<Void> submit(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.tailLock) {
            taskContinueWithTask = this.tail.continueWithTask(this.executor, new i(runnable, 1));
            this.tail = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @CanIgnoreReturnValue
    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
        FailedTask failedTask;
        synchronized (this.tailLock) {
            failedTask = (Task<T>) this.tail.continueWithTask(this.executor, new a(callable, 1));
            this.tail = failedTask;
        }
        return failedTask;
    }
}
