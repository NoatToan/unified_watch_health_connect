package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
class e {
    private final Executor a;
    private Task<Void> b = Tasks.forResult(null);
    private final Object c = new Object();
    private final ThreadLocal<Boolean> d = new ThreadLocal<>();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d.set(Boolean.TRUE);
        }
    }

    public class b implements Callable<Void> {
        public final /* synthetic */ Runnable a;

        public b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            this.a.run();
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> implements Continuation<Void, T> {
        public final /* synthetic */ Callable a;

        public c(Callable callable) {
            this.a = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public T then(@NonNull Task<Void> task) throws Exception {
            return (T) this.a.call();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class d<T> implements Continuation<T, Void> {
        public d() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(@NonNull Task<T> task) throws Exception {
            return null;
        }
    }

    public e(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    private <T> Task<Void> d(Task<T> task) {
        return task.continueWith(this.a, new d());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }

    private <T> Continuation<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    public Task<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> Task<T> h(Callable<T> callable) {
        Task<T> taskContinueWith;
        synchronized (this.c) {
            taskContinueWith = this.b.continueWith(this.a, f(callable));
            this.b = d(taskContinueWith);
        }
        return taskContinueWith;
    }

    public <T> Task<T> i(Callable<Task<T>> callable) {
        Task<T> taskContinueWithTask;
        synchronized (this.c) {
            taskContinueWithTask = this.b.continueWithTask(this.a, f(callable));
            this.b = d(taskContinueWithTask);
        }
        return taskContinueWithTask;
    }
}
