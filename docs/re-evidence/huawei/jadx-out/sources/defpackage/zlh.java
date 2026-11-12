package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\tJ\r\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\u001f\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010$\u001a\u00020%H\u0010¢\u0006\u0002\b&J\u0015\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cH\u0000¢\u0006\u0002\b(J\u001f\u0010)\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010*\u001a\u00028\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\n\u0018\u00010.j\u0004\u0018\u0001`/H\u0016J\r\u00100\u001a\u000201H\u0000¢\u0006\u0002\b2J\u0015\u00103\u001a\u0002012\u0006\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b4J\r\u00105\u001a\u00020 H\u0000¢\u0006\u0002\b6JH\u00107\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000092%\b\b\u0010:\u001a\u001f\u0012\u0013\u0012\u00110%¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b($\u0012\u0004\u0012\u00020 \u0018\u00010;H\u0080\bø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u0002012\b\u0010A\u001a\u0004\u0018\u00010\fH\u0080\b¢\u0006\u0002\bBJ!\u0010C\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0080\bø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001e\u0010F\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0016ø\u0001\u0000¢\u0006\u0002\u0010EJ\u000f\u0010G\u001a\u0004\u0018\u00010\fH\u0010¢\u0006\u0002\bHJ\b\u0010I\u001a\u00020JH\u0016J\u001b\u0010K\u001a\u0004\u0018\u00010%2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030LH\u0000¢\u0006\u0002\bMR\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\u001a\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "_reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "get_state$kotlinx_coroutines_core$annotations", "()V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "countOrElement", "delegate", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "reusableCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "awaitReusability", "", "awaitReusability$kotlinx_coroutines_core", "cancelCompletedResult", "takenState", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "claimReusableCancellableContinuation", "claimReusableCancellableContinuation$kotlinx_coroutines_core", "dispatchYield", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "isReusable", "", "isReusable$kotlinx_coroutines_core", "postponeCancellation", "postponeCancellation$kotlinx_coroutines_core", "release", "release$kotlinx_coroutines_core", "resumeCancellableWith", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "resumeCancellableWith$kotlinx_coroutines_core", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeCancelled", "state", "resumeCancelled$kotlinx_coroutines_core", "resumeUndispatchedWith", "resumeUndispatchedWith$kotlinx_coroutines_core", "(Ljava/lang/Object;)V", "resumeWith", "takeState", "takeState$kotlinx_coroutines_core", "toString", "", "tryReleaseClaimedContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zlh<T> extends DispatchedTask<T> implements CoroutineStackFrame, Continuation<T> {
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(zlh.class, Object.class, "_reusableCancellableContinuation");

    @Volatile
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f54261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f54262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Continuation<T> f54263c;
    public final Object d;

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zlh(CoroutineDispatcher coroutineDispatcher, Continuation<? super T> continuation) {
        super(-1);
        this.f54261a = coroutineDispatcher;
        this.f54263c = continuation;
        this.f54262b = REUSABLE_CLAIMED.f54273a;
        this.d = NO_THREAD_ELEMENTS.c(getF54257c());
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f54263c;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    private final zgf<?> b() {
        Object obj = e.get(this);
        if (obj instanceof zgf) {
            return (zgf) obj;
        }
        return null;
    }

    public final boolean c() {
        return e.get(this) != null;
    }

    public final void a() {
        while (e.get(this) == REUSABLE_CLAIMED.f54274c) {
        }
    }

    public final void e() {
        a();
        zgf<?> zgfVarB = b();
        if (zgfVarB != null) {
            zgfVarB.d();
        }
    }

    public final zgf<T> d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                e.set(this, REUSABLE_CLAIMED.f54274c);
                return null;
            }
            if (obj instanceof zgf) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj, REUSABLE_CLAIMED.f54274c)) {
                    return (zgf) obj;
                }
            } else if (obj != REUSABLE_CLAIMED.f54274c && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final Throwable e(CancellableContinuation<?> cancellableContinuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != REUSABLE_CLAIMED.f54274c) {
                if (obj instanceof Throwable) {
                    if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    return (Throwable) obj;
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, REUSABLE_CLAIMED.f54274c, cancellableContinuation));
        return null;
    }

    public final boolean d(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (zcp.b(obj, REUSABLE_CLAIMED.f54274c)) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, REUSABLE_CLAIMED.f54274c, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Object takeState$kotlinx_coroutines_core() {
        Object obj = this.f54262b;
        if (ASSERTIONS_ENABLED.a() && obj == REUSABLE_CLAIMED.f54273a) {
            throw new AssertionError();
        }
        this.f54262b = REUSABLE_CLAIMED.f54273a;
        return obj;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        CoroutineContext context = this.f54263c.getF54257c();
        Object objB = recoverResult.b(result, null, 1, null);
        if (this.f54261a.isDispatchNeeded(context)) {
            this.f54262b = objB;
            this.resumeMode = 0;
            this.f54261a.dispatch(context, this);
            return;
        }
        ASSERTIONS_ENABLED.a();
        EventLoop eventLoopE = zih.e.e();
        if (eventLoopE.isUnconfinedLoopActive()) {
            this.f54262b = objB;
            this.resumeMode = 0;
            eventLoopE.dispatchUnconfined(this);
            return;
        }
        zlh<T> zlhVar = this;
        eventLoopE.incrementUseCount(true);
        try {
            CoroutineContext context2 = getF54257c();
            Object objD = NO_THREAD_ELEMENTS.d(context2, this.d);
            try {
                this.f54263c.resumeWith(result);
                yzc yzcVar = yzc.e;
                NO_THREAD_ELEMENTS.b(context2, objD);
                while (eventLoopE.processUnconfinedEvent()) {
                }
            } catch (Throwable th) {
                NO_THREAD_ELEMENTS.b(context2, objD);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zlhVar.handleFatalException$kotlinx_coroutines_core(th2, null);
            } finally {
                eventLoopE.decrementUseCount(true);
            }
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(Object takenState, Throwable cause) {
        if (takenState instanceof zgo) {
            ((zgo) takenState).e.invoke(cause);
        }
    }

    public final void b(CoroutineContext coroutineContext, T t) {
        this.f54262b = t;
        this.resumeMode = 1;
        this.f54261a.dispatchYield(coroutineContext, this);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f54261a + ", " + classSimpleName.a((Continuation<?>) this.f54263c) + ']';
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public CoroutineContext getF54257c() {
        return this.f54263c.getF54257c();
    }
}
