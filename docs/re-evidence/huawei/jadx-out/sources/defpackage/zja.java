package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.tencent.open.SocialConstants;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ)\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u001fJ\u0017\u0010 \u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0002\b$J\"\u0010%\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0016J\u0016\u0010*\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0015J\u0017\u0010,\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b-\u0010\"J\u001a\u0010.\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\u0010H\u0002J\u001f\u00100\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b1J\u001f\u00102\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\b4\u00105R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004R\u0014\u0010\u0011\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00066"}, d2 = {"Lkotlinx/coroutines/channels/ChannelSegment;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/internal/Segment;", "id", "", "prev", "channel", "Lkotlinx/coroutines/channels/BufferedChannel;", "pointers", "", "(JLkotlinx/coroutines/channels/ChannelSegment;Lkotlinx/coroutines/channels/BufferedChannel;I)V", "_channel", "getChannel", "()Lkotlinx/coroutines/channels/BufferedChannel;", "data", "Lkotlinx/atomicfu/AtomicArray;", "", "numberOfSlots", "getNumberOfSlots", "()I", "casState", "", "index", "from", "to", "casState$kotlinx_coroutines_core", "cleanElement", "", "cleanElement$kotlinx_coroutines_core", "getAndSetState", "update", "getAndSetState$kotlinx_coroutines_core", "getElement", "getElement$kotlinx_coroutines_core", "(I)Ljava/lang/Object;", "getState", "getState$kotlinx_coroutines_core", "onCancellation", "cause", "", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "onCancelledRequest", SocialConstants.PARAM_RECEIVER, "retrieveElement", "retrieveElement$kotlinx_coroutines_core", "setElementLazy", "value", "setState", "setState$kotlinx_coroutines_core", "storeElement", FunctionSetBeanReader.BI_ELEMENT, "storeElement$kotlinx_coroutines_core", "(ILjava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zja<E> extends Segment<zja<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zir<E> f54177b;
    private final AtomicReferenceArray d;

    public zja(long j, zja<E> zjaVar, zir<E> zirVar, int i) {
        super(j, zjaVar, i);
        this.f54177b = zirVar;
        this.d = new AtomicReferenceArray(BUFFERED.d * 2);
    }

    public final zir<E> b() {
        zir<E> zirVar = this.f54177b;
        zcp.e(zirVar);
        return zirVar;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        return BUFFERED.d;
    }

    public final void e(int i, E e) {
        d(i, e);
    }

    public final E a(int i) {
        return (E) this.d.get(i * 2);
    }

    public final E c(int i) {
        E eA = a(i);
        d(i);
        return eA;
    }

    public final void d(int i) {
        d(i, null);
    }

    private final void d(int i, Object obj) {
        this.d.lazySet(i * 2, obj);
    }

    public final Object e(int i) {
        return this.d.get((i * 2) + 1);
    }

    public final void a(int i, Object obj) {
        this.d.set((i * 2) + 1, obj);
    }

    public final boolean a(int i, Object obj, Object obj2) {
        return arj.b(this.d, (i * 2) + 1, obj, obj2);
    }

    public final Object c(int i, Object obj) {
        return this.d.getAndSet((i * 2) + 1, obj);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int index, Throwable cause, CoroutineContext context) {
        Function1<E, yzc> function1;
        Function1<E, yzc> function2;
        boolean z = index >= BUFFERED.d;
        if (z) {
            index -= BUFFERED.d;
        }
        E eA = a(index);
        while (true) {
            Object objE = e(index);
            if (!(objE instanceof Waiter) && !(objE instanceof zji)) {
                if (objE == BUFFERED.i || objE == BUFFERED.j) {
                    break;
                }
                if (objE != BUFFERED.p && objE != BUFFERED.s) {
                    if (objE == BUFFERED.f || objE == BUFFERED.f54168a || objE == BUFFERED.s()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objE).toString());
                }
            } else {
                if (a(index, objE, z ? BUFFERED.i : BUFFERED.j)) {
                    d(index);
                    a(index, !z);
                    if (!z || (function1 = b().f54143b) == null) {
                        return;
                    }
                    bindCancellationFun.d(function1, eA, context);
                    return;
                }
            }
        }
        d(index);
        if (!z || (function2 = b().f54143b) == null) {
            return;
        }
        bindCancellationFun.d(function2, eA, context);
    }

    public final void a(int i, boolean z) {
        if (z) {
            b().e((this.id * ((long) BUFFERED.d)) + ((long) i));
        }
        onSlotCleaned();
    }
}
