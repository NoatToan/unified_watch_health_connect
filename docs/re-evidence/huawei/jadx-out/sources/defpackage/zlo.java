package defpackage;

import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.OpAnalyticsConstants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001(B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\tj\u0002`\nH\u0016J-\u0010\u0019\u001a\u00020\u00112\n\u0010\u0018\u001a\u00060\tj\u0002`\n2\u0016\u0010\u001a\u001a\u0012\u0012\b\u0012\u00060\u001cR\u00020\u0000\u0012\u0004\u0012\u00020\u00110\u001bH\u0082\bJ\u001c\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\tj\u0002`\nH\u0017J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00132\n\u0010\u0018\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J\u0010\u0010!\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\"\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0002J\u001f\u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0096\u0001J\b\u0010&\u001a\u00020'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0012\u0010\r\u001a\u00060\u000ej\u0002`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", "", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runningWorkers", "Lkotlinx/atomicfu/AtomicInt;", "workerAllocationLock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", OpAnalyticsConstants.DELAY, "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "block", "dispatchInternal", "startWorker", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "dispatchYield", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "limitedParallelism", "obtainTaskOrDeallocateWorker", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryAllocateWorker", "", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zlo extends CoroutineDispatcher implements Delay {
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(zlo.class, "runningWorkers");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zlx<Runnable> f54276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineDispatcher f54277c;
    private final /* synthetic */ Delay d;
    private final Object i;

    @Volatile
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public zlo(CoroutineDispatcher coroutineDispatcher, int i) {
        this.f54277c = coroutineDispatcher;
        this.f54275a = i;
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.d = delay == null ? DefaultDelay.a() : delay;
        this.f54276b = new zlx<>(false);
        this.i = new Object();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int parallelism) {
        checkParallelism.a(parallelism);
        return parallelism >= this.f54275a ? this : super.limitedParallelism(parallelism);
    }

    private final boolean c() {
        synchronized (this.i) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e;
            if (atomicIntegerFieldUpdater.get(this) >= this.f54275a) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable e() {
        while (true) {
            Runnable runnableB = this.f54276b.b();
            if (runnableB != null) {
                return runnableB;
            }
            synchronized (this.i) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f54276b.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "(Lkotlinx/coroutines/internal/LimitedDispatcher;Ljava/lang/Runnable;)V", "run", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f54278a;

        public b(Runnable runnable) {
            this.f54278a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.f54278a.run();
                } catch (Throwable th) {
                    CoroutineExceptionHandler.b(zbf.f53962b, th);
                }
                Runnable runnableE = zlo.this.e();
                if (runnableE == null) {
                    return;
                }
                this.f54278a = runnableE;
                i++;
                if (i >= 16 && zlo.this.f54277c.isDispatchNeeded(zlo.this)) {
                    zlo.this.f54277c.dispatch(zlo.this, this);
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext context, Runnable block) {
        Runnable runnableE;
        this.f54276b.b(block);
        if (e.get(this) >= this.f54275a || !c() || (runnableE = e()) == null) {
            return;
        }
        this.f54277c.dispatch(this, new b(runnableE));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext context, Runnable block) {
        Runnable runnableE;
        this.f54276b.b(block);
        if (e.get(this) >= this.f54275a || !c() || (runnableE = e()) == null) {
            return;
        }
        this.f54277c.dispatchYield(this, new b(runnableE));
    }

    @Override // kotlinx.coroutines.Delay
    public void scheduleResumeAfterDelay(long timeMillis, CancellableContinuation<? super yzc> continuation) {
        this.d.scheduleResumeAfterDelay(timeMillis, continuation);
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long timeMillis, Runnable block, CoroutineContext context) {
        return this.d.invokeOnTimeout(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long j, Continuation<? super yzc> continuation) {
        return this.d.delay(j, continuation);
    }
}
