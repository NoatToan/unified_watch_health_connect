package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0011\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ'\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f0\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\bR\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "()V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "allocateLocked", "", "flow", "awaitPending", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "freeLocked", "", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "makePending", "takePending", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class zkc extends AbstractSharedFlowSlot<zkb<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f54223a = AtomicReferenceFieldUpdater.newUpdater(zkc.class, Object.class, "_state");

    @Volatile
    private volatile Object _state;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean allocateLocked(zkb<?> zkbVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54223a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, NONE.f54228a);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Continuation<yzc>[] freeLocked(zkb<?> zkbVar) {
        f54223a.set(this, null);
        return EMPTY_RESUMES.e;
    }

    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54223a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == NONE.f54229b) {
                return;
            }
            if (obj == NONE.f54228a) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54223a, this, obj, NONE.f54229b)) {
                    return;
                }
            } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54223a, this, obj, NONE.f54228a)) {
                yyt.c cVar = yyt.f53903b;
                ((zgf) obj).resumeWith(yyt.e(yzc.e));
                return;
            }
        }
    }

    public final boolean c() {
        Object andSet = f54223a.getAndSet(this, NONE.f54228a);
        zcp.e(andSet);
        if (ASSERTIONS_ENABLED.a() && (andSet instanceof zgf)) {
            throw new AssertionError();
        }
        return andSet == NONE.f54229b;
    }

    public final Object c(Continuation<? super yzc> continuation) {
        zgf zgfVar = new zgf(zbg.c(continuation), 1);
        zgfVar.initCancellability();
        zgf zgfVar2 = zgfVar;
        if (ASSERTIONS_ENABLED.a() && (f54223a.get(this) instanceof zgf)) {
            throw new AssertionError();
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(f54223a, this, NONE.f54228a, zgfVar2)) {
            if (ASSERTIONS_ENABLED.a() && f54223a.get(this) != NONE.f54229b) {
                throw new AssertionError();
            }
            yyt.c cVar = yyt.f53903b;
            zgfVar2.resumeWith(yyt.e(yzc.e));
        }
        Object objB = zgfVar.b();
        if (objB == zbg.a()) {
            probeCoroutineCreated.e(continuation);
        }
        return objB == zbg.a() ? objB : yzc.e;
    }
}
