package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes7.dex */
public class da1<T> extends CompletableFuture<T> {
    public static final String e = "AndroidFuture";
    public static final Executor f = new rbi();
    public static Handler g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BiConsumer<? super T, ? super Throwable> f15286b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15285a = new Object();
    public Executor c = f;
    public Handler d = f();

    public static class a<T, U> extends da1<U> implements BiConsumer<T, Throwable>, Runnable {
        public volatile T h = null;
        public final Executor i;
        public final Function<? super T, ? extends U> j;

        public a(da1<T> da1Var, Function<? super T, ? extends U> function, Executor executor) {
            Objects.requireNonNull(executor);
            this.i = executor;
            Objects.requireNonNull(function);
            this.j = function;
            da1Var.whenComplete(this);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture
        public /* bridge */ /* synthetic */ CompletableFuture orTimeout(long j, TimeUnit timeUnit) {
            return super.orTimeout(j, timeUnit);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                complete(this.j.apply(this.h));
            } catch (Throwable th) {
                completeExceptionally(th);
            }
        }

        @Override // java.util.function.BiConsumer
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void accept(T t, Throwable th) {
            if (th != null) {
                completeExceptionally(th);
            } else {
                this.h = t;
                this.i.execute(this);
            }
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenApply(Function function) {
            return super.thenApply(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenApplyAsync(Function function, Executor executor) {
            return super.thenApplyAsync(function, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenCombine(CompletionStage completionStage, BiFunction biFunction) {
            return super.thenCombine(completionStage, biFunction);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenCompose(Function function) {
            return super.thenCompose(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenComposeAsync(Function function, Executor executor) {
            return super.thenComposeAsync(function, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture whenComplete(BiConsumer biConsumer) {
            return super.whenComplete(biConsumer);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture whenCompleteAsync(BiConsumer biConsumer, Executor executor) {
            return super.whenCompleteAsync(biConsumer, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenApply(Function function) {
            return super.thenApply(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenApplyAsync(Function function, Executor executor) {
            return super.thenApplyAsync(function, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenCombine(CompletionStage completionStage, BiFunction biFunction) {
            return super.thenCombine(completionStage, biFunction);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenCompose(Function function) {
            return super.thenCompose(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenComposeAsync(Function function, Executor executor) {
            return super.thenComposeAsync(function, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage whenComplete(BiConsumer biConsumer) {
            return super.whenComplete(biConsumer);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage whenCompleteAsync(BiConsumer biConsumer, Executor executor) {
            return super.whenCompleteAsync(biConsumer, executor);
        }
    }

    public static class b<T, U, V> extends da1<V> implements BiConsumer<Object, Throwable> {
        public volatile T h = null;
        public volatile CompletionStage<? extends U> i;
        public final BiFunction<? super T, ? super U, ? extends V> j;

        public b(CompletableFuture<T> completableFuture, CompletionStage<? extends U> completionStage, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            Objects.requireNonNull(completionStage);
            this.i = completionStage;
            Objects.requireNonNull(biFunction);
            this.j = biFunction;
            completableFuture.whenComplete((BiConsumer) this);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture
        public /* bridge */ /* synthetic */ CompletableFuture orTimeout(long j, TimeUnit timeUnit) {
            return super.orTimeout(j, timeUnit);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void accept(Object obj, Throwable th) {
            if (th != null) {
                completeExceptionally(th);
                return;
            }
            if (this.i != null) {
                this.h = obj;
                this.i.whenComplete(new BiConsumer() { // from class: ea1
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj2, Object obj3) {
                        this.f16437a.u(obj2, (Throwable) obj3);
                    }
                });
            } else {
                try {
                    complete(this.j.apply(this.h, obj));
                } catch (Throwable th2) {
                    completeExceptionally(th2);
                }
            }
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenApply(Function function) {
            return super.thenApply(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenApplyAsync(Function function, Executor executor) {
            return super.thenApplyAsync(function, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenCombine(CompletionStage completionStage, BiFunction biFunction) {
            return super.thenCombine(completionStage, biFunction);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenCompose(Function function) {
            return super.thenCompose(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenComposeAsync(Function function, Executor executor) {
            return super.thenComposeAsync(function, executor);
        }

        public final /* synthetic */ void u(Object obj, Throwable th) {
            this.i = null;
            accept(obj, th);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture whenComplete(BiConsumer biConsumer) {
            return super.whenComplete(biConsumer);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture whenCompleteAsync(BiConsumer biConsumer, Executor executor) {
            return super.whenCompleteAsync(biConsumer, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenApply(Function function) {
            return super.thenApply(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenApplyAsync(Function function, Executor executor) {
            return super.thenApplyAsync(function, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenCombine(CompletionStage completionStage, BiFunction biFunction) {
            return super.thenCombine(completionStage, biFunction);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenCompose(Function function) {
            return super.thenCompose(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenComposeAsync(Function function, Executor executor) {
            return super.thenComposeAsync(function, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage whenComplete(BiConsumer biConsumer) {
            return super.whenComplete(biConsumer);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage whenCompleteAsync(BiConsumer biConsumer, Executor executor) {
            return super.whenCompleteAsync(biConsumer, executor);
        }
    }

    public static class c<T, U> extends da1<U> implements BiConsumer<Object, Throwable>, Runnable {
        public volatile T h = null;
        public final Executor i;
        public volatile Function<? super T, ? extends CompletionStage<U>> j;

        public c(da1<T> da1Var, Function<? super T, ? extends CompletionStage<U>> function, Executor executor) {
            Objects.requireNonNull(function);
            this.j = function;
            Objects.requireNonNull(executor);
            this.i = executor;
            da1Var.whenComplete(this);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture
        public /* bridge */ /* synthetic */ CompletableFuture orTimeout(long j, TimeUnit timeUnit) {
            return super.orTimeout(j, timeUnit);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                CompletionStage<U> completionStageApply = this.j.apply(this.h);
                Objects.requireNonNull(completionStageApply);
                CompletionStage<U> completionStage = completionStageApply;
                this.j = null;
                completionStage.whenComplete(this);
            } catch (Throwable th) {
                try {
                    completeExceptionally(th);
                } finally {
                    this.j = null;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void accept(Object obj, Throwable th) {
            if (th != null) {
                completeExceptionally(th);
            } else if (this.j == null) {
                complete(obj);
            } else {
                this.h = obj;
                this.i.execute(this);
            }
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenApply(Function function) {
            return super.thenApply(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenApplyAsync(Function function, Executor executor) {
            return super.thenApplyAsync(function, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenCombine(CompletionStage completionStage, BiFunction biFunction) {
            return super.thenCombine(completionStage, biFunction);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenCompose(Function function) {
            return super.thenCompose(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture thenComposeAsync(Function function, Executor executor) {
            return super.thenComposeAsync(function, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture whenComplete(BiConsumer biConsumer) {
            return super.whenComplete(biConsumer);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletableFuture whenCompleteAsync(BiConsumer biConsumer, Executor executor) {
            return super.whenCompleteAsync(biConsumer, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenApply(Function function) {
            return super.thenApply(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenApplyAsync(Function function, Executor executor) {
            return super.thenApplyAsync(function, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenCombine(CompletionStage completionStage, BiFunction biFunction) {
            return super.thenCombine(completionStage, biFunction);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenCompose(Function function) {
            return super.thenCompose(function);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage thenComposeAsync(Function function, Executor executor) {
            return super.thenComposeAsync(function, executor);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage whenComplete(BiConsumer biConsumer) {
            return super.whenComplete(biConsumer);
        }

        @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
        public /* bridge */ /* synthetic */ CompletionStage whenCompleteAsync(BiConsumer biConsumer, Executor executor) {
            return super.whenCompleteAsync(biConsumer, executor);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TT> void c(BiConsumer<? super TT, ? super Throwable> biConsumer, TT tt, Throwable th) {
        try {
            biConsumer.accept(tt, th);
        } catch (Throwable th2) {
            try {
                if (th == null) {
                    biConsumer.accept(null, th2);
                } else {
                    th2.addSuppressed(th);
                    throw th2;
                }
            } catch (Throwable th3) {
                uoe.c(e, "Failed to call whenComplete listener. res = " + tt, th3);
            }
        }
    }

    public static Handler f() {
        if (g == null) {
            g = new Handler(Looper.getMainLooper());
        }
        return g;
    }

    public static /* synthetic */ void h(BiConsumer biConsumer, BiConsumer biConsumer2, Object obj, Throwable th) {
        c(biConsumer, obj, th);
        c(biConsumer2, obj, th);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean zCancel = super.cancel(z);
        if (zCancel) {
            try {
                get();
                throw new IllegalStateException("Expected CancellationException");
            } catch (CancellationException e2) {
                i(null, e2);
            } catch (Throwable th) {
                throw new IllegalStateException("Expected CancellationException", th);
            }
        }
        return zCancel;
    }

    @Override // java.util.concurrent.CompletableFuture
    public boolean complete(T t) {
        boolean zComplete = super.complete(t);
        if (zComplete) {
            i(t, null);
        }
        return zComplete;
    }

    @Override // java.util.concurrent.CompletableFuture
    public boolean completeExceptionally(Throwable th) {
        boolean zCompleteExceptionally = super.completeExceptionally(th);
        if (zCompleteExceptionally) {
            i(null, th);
        }
        return zCompleteExceptionally;
    }

    public final void d(final BiConsumer<? super T, ? super Throwable> biConsumer, final T t, final Throwable th) {
        Executor executor = this.c;
        if (executor == f) {
            c(biConsumer, t, th);
        } else {
            executor.execute(new Runnable() { // from class: ca1
                @Override // java.lang.Runnable
                public final void run() {
                    da1.c(biConsumer, t, th);
                }
            });
        }
    }

    public da1<T> e() {
        this.d.removeCallbacksAndMessages(this);
        return this;
    }

    public void i(T t, Throwable th) {
        BiConsumer<? super T, ? super Throwable> biConsumer;
        e();
        synchronized (this.f15285a) {
            biConsumer = this.f15286b;
            this.f15286b = null;
        }
        if (biConsumer != null) {
            d(biConsumer, t, th);
        }
    }

    @Override // java.util.concurrent.CompletableFuture
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public da1<T> orTimeout(long j, TimeUnit timeUnit) {
        this.d.postDelayed(new Runnable() { // from class: aa1
            @Override // java.lang.Runnable
            public final void run() {
                this.f817a.p();
            }
        }, this, timeUnit.toMillis(j));
        return this;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public <U> da1<U> thenApply(Function<? super T, ? extends U> function) {
        return thenApplyAsync(function, f);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public <U> da1<U> thenApplyAsync(Function<? super T, ? extends U> function, Executor executor) {
        return new a(this, function, executor);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public <U, V> da1<V> thenCombine(CompletionStage<? extends U> completionStage, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        return new b(this, completionStage, biFunction);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public <U> da1<U> thenCompose(Function<? super T, ? extends CompletionStage<U>> function) {
        return thenComposeAsync(function, f);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public <U> da1<U> thenComposeAsync(Function<? super T, ? extends CompletionStage<U>> function, Executor executor) {
        return new c(this, function, executor);
    }

    public void p() {
        e();
        if (isDone()) {
            return;
        }
        completeExceptionally(new TimeoutException());
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public da1<T> whenComplete(BiConsumer<? super T, ? super Throwable> biConsumer) {
        return whenCompleteAsync(biConsumer, f);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.CompletionStage
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public da1<T> whenCompleteAsync(final BiConsumer<? super T, ? super Throwable> biConsumer, Executor executor) throws ExecutionException, InterruptedException {
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(executor);
        synchronized (this.f15285a) {
            try {
                if (isDone()) {
                    T t = null;
                    try {
                        th = null;
                        t = get();
                    } catch (ExecutionException e2) {
                        th = e2.getCause();
                    } catch (Throwable th) {
                        th = th;
                    }
                    d(biConsumer, t, th);
                    return this;
                }
                final BiConsumer<? super T, ? super Throwable> biConsumer2 = this.f15286b;
                if (biConsumer2 != null && executor != this.c) {
                    super.whenCompleteAsync((BiConsumer) biConsumer, executor);
                    return this;
                }
                this.c = executor;
                if (biConsumer2 != null) {
                    biConsumer = new BiConsumer() { // from class: ba1
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            da1.h(biConsumer2, biConsumer, obj, (Throwable) obj2);
                        }
                    };
                }
                this.f15286b = biConsumer;
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
