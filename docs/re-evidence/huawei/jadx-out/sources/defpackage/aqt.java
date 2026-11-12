package defpackage;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractCatchingFuture;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.GwtFuturesCatchingSpecialization;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ParametricNullness;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class aqt extends GwtFuturesCatchingSpecialization {
    public static <V> ListenableFuture<V> a(@ParametricNullness V v) {
        if (v == null) {
            return (ListenableFuture<V>) aqv.d;
        }
        return new aqv(v);
    }

    public static ListenableFuture<Void> e() {
        return aqv.d;
    }

    public static <V> ListenableFuture<V> a(Throwable th) {
        Preconditions.checkNotNull(th);
        return new aqv.b(th);
    }

    public static <V> ListenableFuture<V> b() {
        aqv.c<Object> cVar = aqv.c.f702b;
        return cVar != null ? cVar : new aqv.c();
    }

    public static <V, X extends Throwable> ListenableFuture<V> d(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function, Executor executor) {
        return AbstractCatchingFuture.create(listenableFuture, cls, function, executor);
    }

    public static <V, X extends Throwable> ListenableFuture<V> c(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
        return AbstractCatchingFuture.create(listenableFuture, cls, asyncFunction, executor);
    }

    public static <V> ListenableFuture<V> b(ListenableFuture<V> listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : arm.d(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> ListenableFuture<O> e(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        return AbstractTransformFuture.create(listenableFuture, asyncFunction, executor);
    }

    public static <I, O> ListenableFuture<O> d(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        return AbstractTransformFuture.create(listenableFuture, function, executor);
    }

    public static <V> void e(ListenableFuture<V> listenableFuture, FutureCallback<? super V> futureCallback, Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new b(listenableFuture, futureCallback), executor);
    }

    static final class b<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final FutureCallback<? super V> f698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Future<V> f699b;

        b(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.f699b = future;
            this.f698a = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            InternalFutureFailureAccess internalFutureFailureAccess = this.f699b;
            if ((internalFutureFailureAccess instanceof InternalFutureFailureAccess) && (thA = arq.a(internalFutureFailureAccess)) != null) {
                this.f698a.onFailure(thA);
                return;
            }
            try {
                this.f698a.onSuccess(aqt.e(this.f699b));
            } catch (ExecutionException e) {
                this.f698a.onFailure(e.getCause());
            } catch (Throwable th) {
                this.f698a.onFailure(th);
            }
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).addValue(this.f698a).toString();
        }
    }

    @ParametricNullness
    public static <V> V e(Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) aro.d(future);
    }
}
