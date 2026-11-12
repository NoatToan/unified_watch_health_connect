package kotlinx.coroutines.internal;

import com.squareup.picasso.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b!\u0010\"J \u0010\u0006\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00028\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\u001b\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u001c\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0015\u0010\u001e\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010 \u001a\u00020\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "Lkotlin/Function0;", "", "onClosedAction", "nextOrIfClosed", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "value", "", "trySetNext", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "", "cleanPrev", "()V", "markAsClosed", "()Z", "remove", "b", "()Ljava/lang/Object;", "nextOrClosed", "a", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "leftmostAliveNode", "c", "rightmostAliveNode", "getNext", "next", "isTail", "getPrev", "prev", "getRemoved", u.A, "<init>", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next");
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev");

    @NotNull
    private volatile /* synthetic */ Object _next = null;

    @NotNull
    private volatile /* synthetic */ Object _prev;

    public ConcurrentLinkedListNode(@Nullable N n) {
        this._prev = n;
    }

    private final N a() {
        N n = (N) getPrev();
        while (n != null && n.getRemoved()) {
            n = (N) n._prev;
        }
        return n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object get_next() {
        return this._next;
    }

    private final N c() {
        if (DebugKt.getASSERTIONS_ENABLED() && !(!isTail())) {
            throw new AssertionError();
        }
        N n = (N) getNext();
        while (n.getRemoved()) {
            n = (N) n.getNext();
        }
        return n;
    }

    public final void cleanPrev() {
        b.lazySet(this, null);
    }

    @Nullable
    public final N getNext() {
        Object obj = get_next();
        if (obj == ConcurrentLinkedListKt.b) {
            return null;
        }
        return (N) obj;
    }

    @Nullable
    public final N getPrev() {
        return (N) this._prev;
    }

    public abstract boolean getRemoved();

    public final boolean isTail() {
        return getNext() == null;
    }

    public final boolean markAsClosed() {
        return a.compareAndSet(this, null, ConcurrentLinkedListKt.b);
    }

    @Nullable
    public final N nextOrIfClosed(@NotNull Function0 onClosedAction) {
        Object obj = get_next();
        if (obj != ConcurrentLinkedListKt.b) {
            return (N) obj;
        }
        onClosedAction.invoke();
        throw new KotlinNothingValueException();
    }

    public final void remove() {
        if (DebugKt.getASSERTIONS_ENABLED() && !getRemoved()) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && !(!isTail())) {
            throw new AssertionError();
        }
        while (true) {
            ConcurrentLinkedListNode concurrentLinkedListNodeA = a();
            ConcurrentLinkedListNode concurrentLinkedListNodeC = c();
            concurrentLinkedListNodeC._prev = concurrentLinkedListNodeA;
            if (concurrentLinkedListNodeA != null) {
                concurrentLinkedListNodeA._next = concurrentLinkedListNodeC;
            }
            if (!concurrentLinkedListNodeC.getRemoved() && (concurrentLinkedListNodeA == null || !concurrentLinkedListNodeA.getRemoved())) {
                return;
            }
        }
    }

    public final boolean trySetNext(@NotNull N value) {
        return a.compareAndSet(this, null, value);
    }
}
