package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.hms.network.embedded.g4;
import com.huawei.hms.network.embedded.r3;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001b\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103J;\u0010.\u001a\u00020/2'\u00100\u001a#\u0012\u0015\u0012\u0013\u0018\u000103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/04j\u0002`72\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0017\u00108\u001a\u00020/2\f\u00109\u001a\b\u0012\u0004\u0012\u00020/0:H\u0082\bJ1\u0010;\u001a\u00020/2!\u0010<\u001a\u001d\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/042\u0006\u00102\u001a\u000203J\u001e\u0010=\u001a\u00020/2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030?2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0012\u0010@\u001a\u00020\u001d2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001f\u0010A\u001a\u00020/2\b\u0010B\u001a\u0004\u0018\u00010\u00122\u0006\u00102\u001a\u000203H\u0010¢\u0006\u0002\bCJ\u0010\u0010D\u001a\u00020\u001d2\u0006\u00102\u001a\u000203H\u0002J\u0010\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020\u0012H\u0016J\r\u0010G\u001a\u00020/H\u0000¢\u0006\u0002\bHJ\b\u0010I\u001a\u00020/H\u0002J\u0010\u0010J\u001a\u00020/2\u0006\u0010K\u001a\u00020\nH\u0002J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020NH\u0016J\u0019\u0010O\u001a\u0004\u0018\u0001032\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0002\bPJ\n\u0010Q\u001a\u0004\u0018\u00010\u0012H\u0001J\u0010\u0010R\u001a\n\u0018\u00010Sj\u0004\u0018\u0001`TH\u0016J\u001f\u0010U\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0004\bV\u0010WJ\b\u0010X\u001a\u00020/H\u0016J\n\u0010Y\u001a\u0004\u0018\u00010\u0010H\u0002J1\u0010Z\u001a\u00020/2'\u00100\u001a#\u0012\u0015\u0012\u0013\u0018\u000103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/04j\u0002`7H\u0016J\u001c\u0010Z\u001a\u00020/2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030?2\u0006\u0010[\u001a\u00020\nH\u0016J\u0010\u0010\\\u001a\u00020/2\u0006\u00100\u001a\u00020\u0012H\u0002J\b\u0010]\u001a\u00020\u001dH\u0002J1\u0010^\u001a\u0002012'\u00100\u001a#\u0012\u0015\u0012\u0013\u0018\u000103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/04j\u0002`7H\u0002J\u001a\u0010_\u001a\u00020/2\u0006\u00100\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010`\u001a\u00020(H\u0014J\u0015\u0010a\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0000¢\u0006\u0002\bbJ\r\u0010c\u001a\u00020/H\u0000¢\u0006\u0002\bdJ\b\u0010e\u001a\u00020\u001dH\u0001J:\u0010f\u001a\u00020/2\u0006\u0010g\u001a\u00028\u00002#\u0010<\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u000104H\u0016¢\u0006\u0002\u0010hJA\u0010i\u001a\u00020/2\b\u0010-\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\n2%\b\u0002\u0010<\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u000104H\u0002J\u001e\u0010j\u001a\u00020/2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000lH\u0016ø\u0001\u0000¢\u0006\u0002\u0010mJS\u0010n\u001a\u0004\u0018\u00010\u00122\u0006\u0010$\u001a\u00020o2\b\u0010-\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\n2#\u0010<\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u0001042\b\u0010p\u001a\u0004\u0018\u00010\u0012H\u0002J\u000f\u0010q\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0002\brJ\b\u0010s\u001a\u00020(H\u0016J\b\u0010t\u001a\u00020\u001dH\u0002J!\u0010t\u001a\u0004\u0018\u00010\u00122\u0006\u0010g\u001a\u00028\u00002\b\u0010p\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010uJF\u0010t\u001a\u0004\u0018\u00010\u00122\u0006\u0010g\u001a\u00028\u00002\b\u0010p\u001a\u0004\u0018\u00010\u00122#\u0010<\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u000104H\u0016¢\u0006\u0002\u0010vJC\u0010w\u001a\u0004\u0018\u00010x2\b\u0010-\u001a\u0004\u0018\u00010\u00122\b\u0010p\u001a\u0004\u0018\u00010\u00122#\u0010<\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u000104H\u0002J\u0012\u0010y\u001a\u0004\u0018\u00010\u00122\u0006\u0010z\u001a\u000203H\u0016J\b\u0010{\u001a\u00020\u001dH\u0002J\u0019\u0010|\u001a\u00020/*\u00020}2\u0006\u0010g\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010~J\u0014\u0010\u007f\u001a\u00020/*\u00020}2\u0006\u0010z\u001a\u000203H\u0016R\t\u0010\f\u001a\u00020\rX\u0082\u0004R\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004R\u0011\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fX\u0082\u0004R\u001c\u0010\u0013\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0080\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "delegate", "Lkotlin/coroutines/Continuation;", "resumeMode", "", "(Lkotlin/coroutines/Continuation;I)V", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicInt;", "_parentHandle", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/DisposableHandle;", "_state", "", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", r3.B, "", "()Z", "isCancelled", "isCompleted", "parentHandle", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "stateDebugRepresentation", "", "getStateDebugRepresentation", "()Ljava/lang/String;", "alreadyResumedError", "", "proposedUpdate", "callCancelHandler", "", "handler", "Lkotlinx/coroutines/CancelHandler;", "cause", "", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "callCancelHandlerSafely", "block", "Lkotlin/Function0;", "callOnCancellation", "onCancellation", "callSegmentOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "cancel", "cancelCompletedResult", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "cancelLater", "completeResume", "token", "detachChild", "detachChild$kotlinx_coroutines_core", "detachChildIfNonResuable", "dispatchResume", Wpt.MODE, "getContinuationCancellationCause", "parent", "Lkotlinx/coroutines/Job;", "getExceptionalResult", "getExceptionalResult$kotlinx_coroutines_core", "getResult", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "initCancellability", "installParentHandle", "invokeOnCancellation", "index", "invokeOnCancellationImpl", "isReusable", "makeCancelHandler", "multipleHandlersError", "nameString", "parentCancelled", "parentCancelled$kotlinx_coroutines_core", "releaseClaimedReusableContinuation", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "resetStateReusable", "resume", "value", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeImpl", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resumedState", "Lkotlinx/coroutines/NotCompleted;", "idempotent", "takeState", "takeState$kotlinx_coroutines_core", "toString", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tryResumeImpl", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeWithException", TrackConstants$Events.EXCEPTION, "trySuspend", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class zgf<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame, Waiter {

    @Volatile
    private volatile int _decisionAndIndex;

    @Volatile
    private volatile Object _parentHandle;

    @Volatile
    private volatile Object _state;
    private final CoroutineContext d;
    private final Continuation<T> e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f54074c = AtomicIntegerFieldUpdater.newUpdater(zgf.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f54072a = AtomicReferenceFieldUpdater.newUpdater(zgf.class, Object.class, "_state");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f54073b = AtomicReferenceFieldUpdater.newUpdater(zgf.class, Object.class, "_parentHandle");

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zgf(Continuation<? super T> continuation, int i) {
        super(i);
        this.e = continuation;
        if (ASSERTIONS_ENABLED.a() && i == -1) {
            throw new AssertionError();
        }
        this.d = continuation.getContext();
        this._decisionAndIndex = 536870911;
        this._state = zgb.f54070c;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.d;
    }

    private final DisposableHandle i() {
        return (DisposableHandle) f54073b.get(this);
    }

    public final Object c() {
        return f54072a.get(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return c() instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(c() instanceof NotCompleted);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return c() instanceof zgm;
    }

    private final String j() {
        Object objC = c();
        if (objC instanceof NotCompleted) {
            return "Active";
        }
        return objC instanceof zgm ? "Cancelled" : "Completed";
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        DisposableHandle disposableHandleG = g();
        if (disposableHandleG != null && isCompleted()) {
            disposableHandleG.dispose();
            f54073b.set(this, zif.f54134b);
        }
    }

    private final boolean k() {
        if (!MODE_ATOMIC.b(this.resumeMode)) {
            return false;
        }
        Continuation<T> continuation = this.e;
        zcp.e(continuation, "");
        return ((zlh) continuation).c();
    }

    public final boolean h() {
        if (ASSERTIONS_ENABLED.a() && this.resumeMode != 2) {
            throw new AssertionError();
        }
        if (ASSERTIONS_ENABLED.a() && i() == zif.f54134b) {
            throw new AssertionError();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54072a;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (ASSERTIONS_ENABLED.a() && (obj instanceof NotCompleted)) {
            throw new AssertionError();
        }
        if ((obj instanceof zgj) && ((zgj) obj).d != null) {
            d();
            return false;
        }
        f54074c.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, zgb.f54070c);
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Object takeState$kotlinx_coroutines_core() {
        return c();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(Object takenState, Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54072a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof NotCompleted) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj instanceof zgl) {
                return;
            }
            if (obj instanceof zgj) {
                zgj zgjVar = (zgj) obj;
                if (zgjVar.a()) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54072a, this, obj, zgj.e(zgjVar, null, null, null, null, cause, 15, null))) {
                    zgjVar.c(this, cause);
                    return;
                }
            } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54072a, this, obj, new zgj(obj, null, null, null, cause, 14, null))) {
                return;
            }
        }
    }

    private final boolean b(Throwable th) {
        if (!k()) {
            return false;
        }
        Continuation<T> continuation = this.e;
        zcp.e(continuation, "");
        return ((zlh) continuation).d(th);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54072a;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54072a, this, obj, new zgm(this, cause, (obj instanceof CancelHandler) || (obj instanceof Segment))));
        NotCompleted notCompleted = (NotCompleted) obj;
        if (notCompleted instanceof CancelHandler) {
            b((CancelHandler) obj, cause);
        } else if (notCompleted instanceof Segment) {
            c((Segment<?>) obj, cause);
        }
        f();
        d(this.resumeMode);
        return true;
    }

    public final void d(Throwable th) {
        if (b(th)) {
            return;
        }
        cancel(th);
        f();
    }

    public final void b(CancelHandler cancelHandler, Throwable th) {
        try {
            cancelHandler.invoke(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandler.b(getContext(), new zgp("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void c(Segment<?> segment, Throwable th) {
        int i = f54074c.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            segment.onCancellation(i, th, getContext());
        } catch (Throwable th2) {
            CoroutineExceptionHandler.b(getContext(), new zgp("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void d(Function1<? super Throwable, yzc> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandler.b(getContext(), new zgp("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public Throwable e(Job job) {
        return job.getCancellationException();
    }

    private final boolean o() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f54074c;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f54074c.compareAndSet(this, i, (536870911 & i) + 536870912));
        return true;
    }

    private final boolean n() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f54074c;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f54074c.compareAndSet(this, i, (536870911 & i) + 1073741824));
        return true;
    }

    public final Object b() {
        Job job;
        boolean zK = k();
        if (o()) {
            if (i() == null) {
                g();
            }
            if (zK) {
                a();
            }
            return zbg.a();
        }
        if (zK) {
            a();
        }
        Object objC = c();
        if (!(objC instanceof zgl)) {
            if (MODE_ATOMIC.a(this.resumeMode) && (job = (Job) getContext().get(Job.INSTANCE)) != null && !job.isActive()) {
                CancellationException cancellationException = job.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(objC, cancellationException);
                if (!ASSERTIONS_ENABLED.b()) {
                    throw cancellationException;
                }
                zgf<T> zgfVar = this;
                if (zgfVar instanceof CoroutineStackFrame) {
                    throw ARTIFICIAL_FRAME.d(cancellationException, zgfVar);
                }
                throw cancellationException;
            }
            return getSuccessfulResult$kotlinx_coroutines_core(objC);
        }
        Throwable th = ((zgl) objC).f54081b;
        if (!ASSERTIONS_ENABLED.b()) {
            throw th;
        }
        zgf<T> zgfVar2 = this;
        if (zgfVar2 instanceof CoroutineStackFrame) {
            throw ARTIFICIAL_FRAME.d(th, zgfVar2);
        }
        throw th;
    }

    private final DisposableHandle g() {
        Job job = (Job) getContext().get(Job.INSTANCE);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleA = Job.b.a(job, true, false, new zgk(this), 2, null);
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54073b, this, null, disposableHandleA);
        return disposableHandleA;
    }

    public final void a() {
        Throwable thE;
        Continuation<T> continuation = this.e;
        zlh zlhVar = continuation instanceof zlh ? (zlh) continuation : null;
        if (zlhVar == null || (thE = zlhVar.e(this)) == null) {
            return;
        }
        d();
        cancel(thE);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        b(this, recoverResult.b(result, this), this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T value, Function1<? super Throwable, yzc> onCancellation) {
        e(value, this.resumeMode, onCancellation);
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int index) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f54074c;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, ((i >> 29) << 29) + index));
        d(segment);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(Function1<? super Throwable, yzc> handler) {
        d(c(handler));
    }

    private final void d(Object obj) {
        if (ASSERTIONS_ENABLED.a() && !(obj instanceof CancelHandler) && !(obj instanceof Segment)) {
            throw new AssertionError();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54072a;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof zgb) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54072a, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof CancelHandler) || (obj2 instanceof Segment)) {
                c(obj, obj2);
            } else {
                boolean z = obj2 instanceof zgl;
                if (z) {
                    zgl zglVar = (zgl) obj2;
                    if (!zglVar.e()) {
                        c(obj, obj2);
                    }
                    if (obj2 instanceof zgm) {
                        if (!z) {
                            zglVar = null;
                        }
                        Throwable th = zglVar != null ? zglVar.f54081b : null;
                        if (obj instanceof CancelHandler) {
                            b((CancelHandler) obj, th);
                            return;
                        } else {
                            zcp.e(obj, "");
                            c((Segment<?>) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof zgj) {
                    zgj zgjVar = (zgj) obj2;
                    if (zgjVar.f54079c != null) {
                        c(obj, obj2);
                    }
                    if (obj instanceof Segment) {
                        return;
                    }
                    zcp.e(obj, "");
                    CancelHandler cancelHandler = (CancelHandler) obj;
                    if (zgjVar.a()) {
                        b(cancelHandler, zgjVar.e);
                        return;
                    } else {
                        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54072a, this, obj2, zgj.e(zgjVar, null, cancelHandler, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof Segment) {
                        return;
                    }
                    zcp.e(obj, "");
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54072a, this, obj2, new zgj(obj2, (CancelHandler) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final CancelHandler c(Function1<? super Throwable, yzc> function1) {
        return function1 instanceof CancelHandler ? (CancelHandler) function1 : new zhp(function1);
    }

    private final void d(int i) {
        if (n()) {
            return;
        }
        MODE_ATOMIC.b(this, i);
    }

    private final Object b(NotCompleted notCompleted, Object obj, int i, Function1<? super Throwable, yzc> function1, Object obj2) {
        if (obj instanceof zgl) {
            if (ASSERTIONS_ENABLED.a() && obj2 != null) {
                throw new AssertionError();
            }
            if (!ASSERTIONS_ENABLED.a() || function1 == null) {
                return obj;
            }
            throw new AssertionError();
        }
        if ((MODE_ATOMIC.a(i) || obj2 != null) && (function1 != null || (notCompleted instanceof CancelHandler) || obj2 != null)) {
            return new zgj(obj, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function1, obj2, null, 16, null);
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void b(zgf zgfVar, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        zgfVar.e(obj, i, (Function1<? super Throwable, yzc>) function1);
    }

    private final void e(Object obj, int i, Function1<? super Throwable, yzc> function1) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54072a;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof NotCompleted) {
            } else {
                if (obj2 instanceof zgm) {
                    zgm zgmVar = (zgm) obj2;
                    if (zgmVar.d()) {
                        if (function1 != null) {
                            d(function1, zgmVar.f54081b);
                            return;
                        }
                        return;
                    }
                }
                b(obj);
                throw new yym();
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54072a, this, obj2, b((NotCompleted) obj2, obj, i, function1, null)));
        f();
        d(i);
    }

    private final zmh e(Object obj, Object obj2, Function1<? super Throwable, yzc> function1) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54072a;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof NotCompleted) {
            } else {
                if (!(obj3 instanceof zgj) || obj2 == null) {
                    return null;
                }
                zgj zgjVar = (zgj) obj3;
                if (zgjVar.d != obj2) {
                    return null;
                }
                if (!ASSERTIONS_ENABLED.a() || zcp.b(zgjVar.f54078b, obj)) {
                    return DECISION_SHIFT.f54075c;
                }
                throw new AssertionError();
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54072a, this, obj3, b((NotCompleted) obj3, obj, this.resumeMode, function1, obj2)));
        f();
        return DECISION_SHIFT.f54075c;
    }

    private final Void b(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void f() {
        if (k()) {
            return;
        }
        d();
    }

    public final void d() {
        DisposableHandle disposableHandleI = i();
        if (disposableHandleI == null) {
            return;
        }
        disposableHandleI.dispose();
        f54073b.set(this, zif.f54134b);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResume(T value, Object idempotent) {
        return e(value, idempotent, (Function1<? super Throwable, yzc>) null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResume(T value, Object idempotent, Function1<? super Throwable, yzc> onCancellation) {
        return e(value, idempotent, onCancellation);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResumeWithException(Throwable exception) {
        return e(new zgl(exception, false, 2, null), (Object) null, (Function1<? super Throwable, yzc>) null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(Object token) {
        if (ASSERTIONS_ENABLED.a() && token != DECISION_SHIFT.f54075c) {
            throw new AssertionError();
        }
        d(this.resumeMode);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t) {
        Continuation<T> continuation = this.e;
        zlh zlhVar = continuation instanceof zlh ? (zlh) continuation : null;
        b(this, t, (zlhVar != null ? zlhVar.f54261a : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th) {
        Continuation<T> continuation = this.e;
        Object[] objArr = 0;
        zlh zlhVar = continuation instanceof zlh ? (zlh) continuation : null;
        b(this, new zgl(th, false, 2, objArr == true ? 1 : 0), (zlhVar != null ? zlhVar.f54261a : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object state) {
        return state instanceof zgj ? (T) ((zgj) state).f54078b : state;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object state) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(state);
        if (exceptionalResult$kotlinx_coroutines_core == null) {
            return null;
        }
        Continuation<T> continuation = this.e;
        return (ASSERTIONS_ENABLED.b() && (continuation instanceof CoroutineStackFrame)) ? ARTIFICIAL_FRAME.d(exceptionalResult$kotlinx_coroutines_core, (CoroutineStackFrame) continuation) : exceptionalResult$kotlinx_coroutines_core;
    }

    public String toString() {
        return e() + g4.k + classSimpleName.a((Continuation<?>) this.e) + "){" + j() + "}@" + classSimpleName.d(this);
    }

    protected String e() {
        return "CancellableContinuation";
    }
}
