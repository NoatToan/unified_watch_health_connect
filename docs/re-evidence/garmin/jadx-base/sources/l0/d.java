package l0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListenableFuture<V> f107795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<V> f107796b;

    public class a implements androidx.concurrent.futures.b.c<V> {
        public a() {
        }

        @Override // androidx.concurrent.futures.b.c
        public final Object d(androidx.concurrent.futures.b.a<V> aVar) {
            d dVar = d.this;
            k7.h.f(dVar.f107796b == null, "The result can only set once!");
            dVar.f107796b = aVar;
            return "FutureChain[" + dVar + "]";
        }
    }

    public d() {
        this.f107795a = androidx.concurrent.futures.b.a(new a());
    }

    public static <V> d<V> a(ListenableFuture<V> listenableFuture) {
        return listenableFuture instanceof d ? (d) listenableFuture : new d<>(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f107795a.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z14) {
        return this.f107795a.cancel(z14);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f107795a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f107795a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f107795a.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j8, TimeUnit timeUnit) {
        return this.f107795a.get(j8, timeUnit);
    }

    public d(ListenableFuture<V> listenableFuture) {
        listenableFuture.getClass();
        this.f107795a = listenableFuture;
    }
}
