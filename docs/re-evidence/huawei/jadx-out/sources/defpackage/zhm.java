package defpackage;

import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J.\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010#*\u00020$2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006%"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherImpl;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "getExecutor", "()Ljava/util/concurrent/Executor;", "cancelJobOnRejection", "", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", TrackConstants$Events.EXCEPTION, "Ljava/util/concurrent/RejectedExecutionException;", "close", "dispatch", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "", "scheduleBlock", "Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zhm extends ExecutorCoroutineDispatcher implements Delay {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f54104b;

    public zhm(Executor executor) {
        this.f54104b = executor;
        REMOVE_FUTURE_ON_CANCEL.d(getF54104b());
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long j, Continuation<? super yzc> continuation) {
        return Delay.c.b(this, j, continuation);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    /* JADX INFO: renamed from: getExecutor, reason: from getter */
    public Executor getF54104b() {
        return this.f54104b;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext context, Runnable block) {
        Runnable runnableWrapTask;
        try {
            Executor f54104b = getF54104b();
            AbstractTimeSource abstractTimeSourceC = timeSource.c();
            if (abstractTimeSourceC == null || (runnableWrapTask = abstractTimeSourceC.wrapTask(block)) == null) {
                runnableWrapTask = block;
            }
            f54104b.execute(runnableWrapTask);
        } catch (RejectedExecutionException e) {
            AbstractTimeSource abstractTimeSourceC2 = timeSource.c();
            if (abstractTimeSourceC2 != null) {
                abstractTimeSourceC2.unTrackTask();
            }
            d(context, e);
            zhf.c().dispatch(context, block);
        }
    }

    @Override // kotlinx.coroutines.Delay
    public void scheduleResumeAfterDelay(long timeMillis, CancellableContinuation<? super yzc> continuation) {
        Executor f54104b = getF54104b();
        ScheduledExecutorService scheduledExecutorService = f54104b instanceof ScheduledExecutorService ? (ScheduledExecutorService) f54104b : null;
        ScheduledFuture<?> scheduledFutureB = scheduledExecutorService != null ? b(scheduledExecutorService, new zic(this, continuation), continuation.getF54257c(), timeMillis) : null;
        if (scheduledFutureB != null) {
            zhs.b(continuation, scheduledFutureB);
        } else {
            zhc.d.scheduleResumeAfterDelay(timeMillis, continuation);
        }
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long timeMillis, Runnable block, CoroutineContext context) {
        Executor f54104b = getF54104b();
        ScheduledExecutorService scheduledExecutorService = f54104b instanceof ScheduledExecutorService ? (ScheduledExecutorService) f54104b : null;
        ScheduledFuture<?> scheduledFutureB = scheduledExecutorService != null ? b(scheduledExecutorService, block, context, timeMillis) : null;
        if (scheduledFutureB != null) {
            return new zhe(scheduledFutureB);
        }
        return zhc.d.invokeOnTimeout(timeMillis, block, context);
    }

    private final ScheduledFuture<?> b(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            d(coroutineContext, e);
            return null;
        }
    }

    private final void d(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        zhs.a(coroutineContext, CancellationException.e("The task was rejected", rejectedExecutionException));
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor f54104b = getF54104b();
        ExecutorService executorService = f54104b instanceof ExecutorService ? (ExecutorService) f54104b : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return getF54104b().toString();
    }

    public boolean equals(Object other) {
        return (other instanceof zhm) && ((zhm) other).getF54104b() == getF54104b();
    }

    public int hashCode() {
        return System.identityHashCode(getF54104b());
    }
}
