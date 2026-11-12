package defpackage;

import android.annotation.SuppressLint;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public class rx3<T> implements Future<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future<T> f33022a;

    public rx3(Future<T> future) {
        this.f33022a = future;
    }

    public static <U> rx3<U> a(Supplier<U> supplier, Executor executor) {
        return new rx3<>(CompletableFuture.supplyAsync(supplier, executor));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f33022a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        return this.f33022a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f33022a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f33022a.isDone();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f33022a.get(j, timeUnit);
    }
}
