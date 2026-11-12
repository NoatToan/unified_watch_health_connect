package kotlinx.coroutines.sync;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00118V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/sync/c;", "Lkotlinx/coroutines/sync/Semaphore;", "", GoogleApiAvailabilityLight.a, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "e", "(Lkotlinx/coroutines/CancellableContinuation;)Z", "g", "()Z", "f", "tryAcquire", "acquire", "release", "()V", "", "a", LogUtil.I, "permits", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "onCancellationRelease", "getAvailablePermits", "()I", "availablePermits", "acquiredPermits", "<init>", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
final class c implements Semaphore {
    private static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, com.google.android.exoplayer2.text.ttml.b.o);
    private static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(c.class, "deqIdx");
    private static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "tail");
    private static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(c.class, "enqIdx");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(c.class, "_availablePermits");

    @NotNull
    public volatile /* synthetic */ int _availablePermits;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int permits;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function1<Throwable, Unit> onCancellationRelease;

    @NotNull
    private volatile /* synthetic */ long deqIdx = 0;

    @NotNull
    private volatile /* synthetic */ long enqIdx = 0;

    @NotNull
    private volatile /* synthetic */ Object head;

    @NotNull
    private volatile /* synthetic */ Object tail;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Throwable, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th) {
            c.this.release();
        }
    }

    public c(int i, int i2) {
        this.permits = i;
        if (!(i > 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Semaphore should have at least 1 permit, but had ", Integer.valueOf(i)).toString());
        }
        if (!(i2 >= 0 && i2 <= i)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("The number of acquired permits should be in 0..", Integer.valueOf(i)).toString());
        }
        d dVar = new d(0L, null, 2);
        this.head = dVar;
        this.tail = dVar;
        this._availablePermits = i - i2;
        this.onCancellationRelease = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        while (!e(orCreateCancellableContinuation)) {
            if (g.getAndDecrement(this) > 0) {
                orCreateCancellableContinuation.resume(Unit.INSTANCE, this.onCancellationRelease);
                break;
            }
        }
        Object result = orCreateCancellableContinuation.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(CancellableContinuation<? super Unit> cont) {
        Object objM4472constructorimpl;
        boolean z;
        d dVar = (d) this.tail;
        long andIncrement = f.getAndIncrement(this);
        long j = andIncrement / ((long) SemaphoreKt.f);
        do {
            Segment segment = dVar;
            while (true) {
                if (segment.getId() >= j && !segment.getRemoved()) {
                    objM4472constructorimpl = SegmentOrClosed.m4472constructorimpl(segment);
                    break;
                }
                Object obj = segment.get_next();
                if (obj == ConcurrentLinkedListKt.b) {
                    objM4472constructorimpl = SegmentOrClosed.m4472constructorimpl(ConcurrentLinkedListKt.b);
                    break;
                }
                Segment segmentA = (Segment) ((ConcurrentLinkedListNode) obj);
                if (segmentA == null) {
                    segmentA = SemaphoreKt.a(segment.getId() + 1, (d) segment);
                    if (segment.trySetNext(segmentA)) {
                        if (segment.getRemoved()) {
                            segment.remove();
                        }
                    }
                }
                segment = segmentA;
            }
            if (!SegmentOrClosed.m4477isClosedimpl(objM4472constructorimpl)) {
                Segment segmentM4475getSegmentimpl = SegmentOrClosed.m4475getSegmentimpl(objM4472constructorimpl);
                while (true) {
                    Segment segment2 = (Segment) this.tail;
                    if (segment2.getId() < segmentM4475getSegmentimpl.getId()) {
                        if (!segmentM4475getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                            z = false;
                            break;
                        }
                        if (e.compareAndSet(this, segment2, segmentM4475getSegmentimpl)) {
                            if (segment2.decPointers$kotlinx_coroutines_core()) {
                                segment2.remove();
                            }
                        } else if (segmentM4475getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            segmentM4475getSegmentimpl.remove();
                        }
                    }
                    z = true;
                    break;
                }
            } else {
                break;
            }
        } while (!z);
        d dVar2 = (d) SegmentOrClosed.m4475getSegmentimpl(objM4472constructorimpl);
        int i = (int) (andIncrement % ((long) SemaphoreKt.f));
        if (dVar2.e.compareAndSet(i, null, cont)) {
            cont.invokeOnCancellation(new kotlinx.coroutines.sync.a(dVar2, i));
            return true;
        }
        if (dVar2.e.compareAndSet(i, SemaphoreKt.b, SemaphoreKt.c)) {
            cont.resume(Unit.INSTANCE, this.onCancellationRelease);
            return true;
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(dVar2.e.get(i) == SemaphoreKt.d)) {
                throw new AssertionError();
            }
        }
        return false;
    }

    private final boolean f(CancellableContinuation<? super Unit> cancellableContinuation) {
        Object objTryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, this.onCancellationRelease);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    private final boolean g() {
        Object objM4472constructorimpl;
        int i;
        boolean z;
        d dVar = (d) this.head;
        long andIncrement = d.getAndIncrement(this);
        long j = andIncrement / ((long) SemaphoreKt.f);
        do {
            Segment segment = dVar;
            while (true) {
                if (segment.getId() >= j && !segment.getRemoved()) {
                    objM4472constructorimpl = SegmentOrClosed.m4472constructorimpl(segment);
                    break;
                }
                Object obj = segment.get_next();
                if (obj == ConcurrentLinkedListKt.b) {
                    objM4472constructorimpl = SegmentOrClosed.m4472constructorimpl(ConcurrentLinkedListKt.b);
                    break;
                }
                Segment segmentA = (Segment) ((ConcurrentLinkedListNode) obj);
                if (segmentA == null) {
                    segmentA = SemaphoreKt.a(segment.getId() + 1, (d) segment);
                    if (segment.trySetNext(segmentA)) {
                        if (segment.getRemoved()) {
                            segment.remove();
                        }
                    }
                }
                segment = segmentA;
            }
            if (SegmentOrClosed.m4477isClosedimpl(objM4472constructorimpl)) {
                break;
            }
            Segment segmentM4475getSegmentimpl = SegmentOrClosed.m4475getSegmentimpl(objM4472constructorimpl);
            while (true) {
                Segment segment2 = (Segment) this.head;
                if (segment2.getId() < segmentM4475getSegmentimpl.getId()) {
                    if (!segmentM4475getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        z = false;
                        break;
                    }
                    if (c.compareAndSet(this, segment2, segmentM4475getSegmentimpl)) {
                        if (segment2.decPointers$kotlinx_coroutines_core()) {
                            segment2.remove();
                        }
                    } else if (segmentM4475getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM4475getSegmentimpl.remove();
                    }
                }
                z = true;
                break;
            }
        } while (!z);
        d dVar2 = (d) SegmentOrClosed.m4475getSegmentimpl(objM4472constructorimpl);
        dVar2.cleanPrev();
        if (dVar2.getId() > j) {
            return false;
        }
        int i2 = (int) (andIncrement % ((long) SemaphoreKt.f));
        Object andSet = dVar2.e.getAndSet(i2, SemaphoreKt.b);
        if (andSet != null) {
            if (andSet == SemaphoreKt.e) {
                return false;
            }
            return f((CancellableContinuation) andSet);
        }
        int i3 = SemaphoreKt.a;
        for (i = 0; i < i3; i++) {
            if (dVar2.e.get(i2) == SemaphoreKt.c) {
                return true;
            }
        }
        return !dVar2.e.compareAndSet(i2, SemaphoreKt.b, SemaphoreKt.d);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    @Nullable
    public Object acquire(@NotNull Continuation<? super Unit> continuation) {
        if (g.getAndDecrement(this) > 0) {
            return Unit.INSTANCE;
        }
        Object objD = d(continuation);
        return objD == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objD : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
        while (true) {
            int i = this._availablePermits;
            int i2 = this.permits;
            if (!(i < i2)) {
                throw new IllegalStateException(Intrinsics.stringPlus("The number of released permits cannot be greater than ", Integer.valueOf(i2)).toString());
            }
            if (g.compareAndSet(this, i, i + 1) && (i >= 0 || g())) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
        int i;
        do {
            i = this._availablePermits;
            if (i <= 0) {
                return false;
            }
        } while (!g.compareAndSet(this, i, i - 1));
        return true;
    }
}
