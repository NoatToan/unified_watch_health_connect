package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible(emulated = true)
public final class Futures extends m {

    @Beta
    @GwtCompatible
    @CanIgnoreReturnValue
    public static final class FutureCombiner<V> {
        private final boolean a;
        private final ImmutableList<ListenableFuture<? extends V>> b;

        public class a implements Callable<Void> {
            public final /* synthetic */ Runnable a;

            public a(Runnable runnable) {
                this.a = runnable;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.a.run();
                return null;
            }
        }

        public /* synthetic */ FutureCombiner(boolean z, ImmutableList immutableList, a aVar) {
            this(z, immutableList);
        }

        @CanIgnoreReturnValue
        public <C> ListenableFuture<C> call(Callable<C> callable, Executor executor) {
            return new com.google.common.util.concurrent.f(this.b, this.a, executor, callable);
        }

        public <C> ListenableFuture<C> callAsync(AsyncCallable<C> asyncCallable, Executor executor) {
            return new com.google.common.util.concurrent.f(this.b, this.a, executor, asyncCallable);
        }

        public ListenableFuture<?> run(Runnable runnable, Executor executor) {
            return call(new a(runnable), executor);
        }

        private FutureCombiner(boolean z, ImmutableList<ListenableFuture<? extends V>> immutableList) {
            this.a = z;
            this.b = immutableList;
        }
    }

    public static class a implements Runnable {
        public final /* synthetic */ Future a;

        public a(Future future) {
            this.a = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.cancel(false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [O] */
    public static class b<O> implements Future<O> {
        public final /* synthetic */ Future a;
        public final /* synthetic */ Function b;

        public b(Future future, Function function) {
            this.a = future;
            this.b = function;
        }

        private O a(I i) throws ExecutionException {
            try {
                return (O) this.b.apply(i);
            } catch (Throwable th) {
                throw new ExecutionException(th);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.a.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public O get() throws ExecutionException, InterruptedException {
            return a(this.a.get());
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.a.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.a.isDone();
        }

        @Override // java.util.concurrent.Future
        public O get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return a(this.a.get(j, timeUnit));
        }
    }

    public static class c implements Runnable {
        public final /* synthetic */ f a;
        public final /* synthetic */ ImmutableList b;
        public final /* synthetic */ int c;

        public c(f fVar, ImmutableList immutableList, int i) {
            this.a = fVar;
            this.b = immutableList;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.f(this.b, this.c);
        }
    }

    public static final class d<V> implements Runnable {
        public final Future<V> a;
        public final FutureCallback<? super V> b;

        public d(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.a = future;
            this.b = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.onSuccess(Futures.getDone(this.a));
            } catch (Error e) {
                e = e;
                this.b.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.b.onFailure(e);
            } catch (ExecutionException e3) {
                this.b.onFailure(e3.getCause());
            }
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).addValue(this.b).toString();
        }
    }

    public static final class e<T> extends AbstractFuture<T> {
        private f<T> i;

        public /* synthetic */ e(f fVar, a aVar) {
            this(fVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public void afterDone() {
            this.i = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            f<T> fVar = this.i;
            if (!super.cancel(z)) {
                return false;
            }
            fVar.g(z);
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public String pendingToString() {
            f<T> fVar = this.i;
            if (fVar == null) {
                return null;
            }
            return "inputCount=[" + ((f) fVar).d.length + "], remaining=[" + ((f) fVar).c.get() + "]";
        }

        private e(f<T> fVar) {
            this.i = fVar;
        }
    }

    public static final class f<T> {
        private boolean a;
        private boolean b;
        private final AtomicInteger c;
        private final ListenableFuture<? extends T>[] d;
        private volatile int e;

        public /* synthetic */ f(ListenableFuture[] listenableFutureArr, a aVar) {
            this(listenableFutureArr);
        }

        private void e() {
            if (this.c.decrementAndGet() == 0 && this.a) {
                for (ListenableFuture<? extends T> listenableFuture : this.d) {
                    if (listenableFuture != null) {
                        listenableFuture.cancel(this.b);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(ImmutableList<AbstractFuture<T>> immutableList, int i) {
            ListenableFuture<? extends T>[] listenableFutureArr = this.d;
            ListenableFuture<? extends T> listenableFuture = listenableFutureArr[i];
            listenableFutureArr[i] = null;
            for (int i2 = this.e; i2 < immutableList.size(); i2++) {
                if (immutableList.get(i2).setFuture(listenableFuture)) {
                    e();
                    this.e = i2 + 1;
                    return;
                }
            }
            this.e = immutableList.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(boolean z) {
            this.a = true;
            if (!z) {
                this.b = false;
            }
            e();
        }

        private f(ListenableFuture<? extends T>[] listenableFutureArr) {
            this.a = false;
            this.b = true;
            this.e = 0;
            this.d = listenableFutureArr;
            this.c = new AtomicInteger(listenableFutureArr.length);
        }
    }

    @GwtIncompatible
    public static class g<V, X extends Exception> extends AbstractCheckedFuture<V, X> {
        public final Function<? super Exception, X> b;

        public g(ListenableFuture<V> listenableFuture, Function<? super Exception, X> function) {
            super(listenableFuture);
            this.b = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.util.concurrent.AbstractCheckedFuture
        public X mapException(Exception exc) {
            return this.b.apply(exc);
        }
    }

    public static final class h<V> extends AbstractFuture.j<V> implements Runnable {
        private ListenableFuture<V> i;

        public h(ListenableFuture<V> listenableFuture) {
            this.i = listenableFuture;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public void afterDone() {
            this.i = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public String pendingToString() {
            ListenableFuture<V> listenableFuture = this.i;
            if (listenableFuture == null) {
                return null;
            }
            return "delegate=[" + listenableFuture + "]";
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture<V> listenableFuture = this.i;
            if (listenableFuture != null) {
                setFuture(listenableFuture);
            }
        }
    }

    private Futures() {
    }

    private static void a(Throwable th) {
        if (!(th instanceof Error)) {
            throw new UncheckedExecutionException(th);
        }
        throw new ExecutionError((Error) th);
    }

    public static <V> void addCallback(ListenableFuture<V> listenableFuture, FutureCallback<? super V> futureCallback, Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new d(listenableFuture, futureCallback), executor);
    }

    @SafeVarargs
    @Beta
    public static <V> ListenableFuture<List<V>> allAsList(ListenableFuture<? extends V>... listenableFutureArr) {
        return new com.google.common.util.concurrent.e.b(ImmutableList.copyOf(listenableFutureArr), true);
    }

    @q.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> ListenableFuture<V> catching(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function, Executor executor) {
        return com.google.common.util.concurrent.a.w(listenableFuture, cls, function, executor);
    }

    @CanIgnoreReturnValue
    @q.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> ListenableFuture<V> catchingAsync(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
        return com.google.common.util.concurrent.a.x(listenableFuture, cls, asyncFunction, executor);
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
        return (V) k.e(future, cls);
    }

    @CanIgnoreReturnValue
    public static <V> V getDone(Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) Uninterruptibles.getUninterruptibly(future);
    }

    @CanIgnoreReturnValue
    public static <V> V getUnchecked(Future<V> future) {
        Preconditions.checkNotNull(future);
        try {
            return (V) Uninterruptibles.getUninterruptibly(future);
        } catch (ExecutionException e2) {
            a(e2.getCause());
            throw new AssertionError();
        }
    }

    public static <V> ListenableFuture<V> immediateCancelledFuture() {
        return new n.a();
    }

    @GwtIncompatible
    @Deprecated
    public static <V, X extends Exception> CheckedFuture<V, X> immediateCheckedFuture(@NullableDecl V v) {
        return new n.d(v);
    }

    @GwtIncompatible
    @Deprecated
    public static <V, X extends Exception> CheckedFuture<V, X> immediateFailedCheckedFuture(X x) {
        Preconditions.checkNotNull(x);
        return new n.b(x);
    }

    public static <V> ListenableFuture<V> immediateFailedFuture(Throwable th) {
        Preconditions.checkNotNull(th);
        return new n.c(th);
    }

    public static <V> ListenableFuture<V> immediateFuture(@NullableDecl V v) {
        return v == null ? n.e.c : new n.e(v);
    }

    @Beta
    public static <T> ImmutableList<ListenableFuture<T>> inCompletionOrder(Iterable<? extends ListenableFuture<? extends T>> iterable) {
        Collection collectionCopyOf = iterable instanceof Collection ? (Collection) iterable : ImmutableList.copyOf(iterable);
        ListenableFuture[] listenableFutureArr = (ListenableFuture[]) collectionCopyOf.toArray(new ListenableFuture[collectionCopyOf.size()]);
        a aVar = null;
        f fVar = new f(listenableFutureArr, aVar);
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < listenableFutureArr.length; i++) {
            builder.add(new e(fVar, aVar));
        }
        ImmutableList<ListenableFuture<T>> immutableListBuild = builder.build();
        for (int i2 = 0; i2 < listenableFutureArr.length; i2++) {
            listenableFutureArr[i2].addListener(new c(fVar, immutableListBuild, i2), MoreExecutors.directExecutor());
        }
        return immutableListBuild;
    }

    @GwtIncompatible
    public static <I, O> Future<O> lazyTransform(Future<I> future, Function<? super I, ? extends O> function) {
        Preconditions.checkNotNull(future);
        Preconditions.checkNotNull(function);
        return new b(future, function);
    }

    @GwtIncompatible
    @Deprecated
    public static <V, X extends Exception> CheckedFuture<V, X> makeChecked(ListenableFuture<V> listenableFuture, Function<? super Exception, X> function) {
        return new g((ListenableFuture) Preconditions.checkNotNull(listenableFuture), function);
    }

    public static <V> ListenableFuture<V> nonCancellationPropagating(ListenableFuture<V> listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        h hVar = new h(listenableFuture);
        listenableFuture.addListener(hVar, MoreExecutors.directExecutor());
        return hVar;
    }

    @GwtIncompatible
    public static <O> ListenableFuture<O> scheduleAsync(AsyncCallable<O> asyncCallable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        v vVarW = v.w(asyncCallable);
        vVarW.addListener(new a(scheduledExecutorService.schedule(vVarW, j, timeUnit)), MoreExecutors.directExecutor());
        return vVarW;
    }

    public static <O> ListenableFuture<O> submitAsync(AsyncCallable<O> asyncCallable, Executor executor) {
        v vVarW = v.w(asyncCallable);
        executor.execute(vVarW);
        return vVarW;
    }

    @SafeVarargs
    @Beta
    public static <V> ListenableFuture<List<V>> successfulAsList(ListenableFuture<? extends V>... listenableFutureArr) {
        return new com.google.common.util.concurrent.e.b(ImmutableList.copyOf(listenableFutureArr), false);
    }

    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        return com.google.common.util.concurrent.b.w(listenableFuture, function, executor);
    }

    public static <I, O> ListenableFuture<O> transformAsync(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        return com.google.common.util.concurrent.b.x(listenableFuture, asyncFunction, executor);
    }

    @SafeVarargs
    public static <V> FutureCombiner<V> whenAllComplete(ListenableFuture<? extends V>... listenableFutureArr) {
        return new FutureCombiner<>(false, ImmutableList.copyOf(listenableFutureArr), null);
    }

    @SafeVarargs
    public static <V> FutureCombiner<V> whenAllSucceed(ListenableFuture<? extends V>... listenableFutureArr) {
        return new FutureCombiner<>(true, ImmutableList.copyOf(listenableFutureArr), null);
    }

    @GwtIncompatible
    public static <V> ListenableFuture<V> withTimeout(ListenableFuture<V> listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : u.z(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    @Beta
    public static <V> ListenableFuture<List<V>> allAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new com.google.common.util.concurrent.e.b(ImmutableList.copyOf(iterable), true);
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j, TimeUnit timeUnit) throws Exception {
        return (V) k.f(future, cls, j, timeUnit);
    }

    @Beta
    public static <V> ListenableFuture<List<V>> successfulAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new com.google.common.util.concurrent.e.b(ImmutableList.copyOf(iterable), false);
    }

    public static <V> FutureCombiner<V> whenAllComplete(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new FutureCombiner<>(false, ImmutableList.copyOf(iterable), null);
    }

    public static <V> FutureCombiner<V> whenAllSucceed(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new FutureCombiner<>(true, ImmutableList.copyOf(iterable), null);
    }
}
