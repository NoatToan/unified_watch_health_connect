package kotlinx.coroutines.channels;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImplKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.ConcurrentKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001OB\u000f\u0012\u0006\u0010,\u001a\u00020'¢\u0006\u0004\bN\u0010EJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u000f\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001b\u001a\u00020\t2\u000e\u0010\u0005\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001b\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u00020 2\u0006\u0010\u001f\u001a\u00028\u00002\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#H\u0014¢\u0006\u0004\b%\u0010&R\u0019\u0010,\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00101\u001a\u00060-j\u0002`.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R2\u0010:\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f06j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f`78\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R$\u0010?\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u0010>R$\u0010B\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0013\"\u0004\bA\u0010>R$\u0010F\u001a\u00020'2\u0006\u0010;\u001a\u00020'8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bC\u0010+\"\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020\u00068T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00068T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\bI\u0010HR\u0016\u0010M\u001a\u00020J8T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006P"}, d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "", "cause", "", hl.k, "(Ljava/lang/Throwable;)Z", "", "l", "()V", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel$a;", "addSub", "removeSub", "u", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel$a;Lkotlinx/coroutines/channels/ArrayBroadcastChannel$a;)V", "", "m", "()J", "index", GoogleApiAvailabilityLight.b, "(J)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "close", com.twitter.sdk.android.tweetcomposer.g.g, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "element", "", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "", "c", LogUtil.I, "getCapacity", "()I", "capacity", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", GoogleApiAvailabilityLight.a, "Ljava/util/concurrent/locks/ReentrantLock;", "bufferLock", "", "e", "[Ljava/lang/Object;", "buffer", "", "Lkotlinx/coroutines/internal/SubscribersList;", "f", "Ljava/util/List;", "subscribers", "value", "o", "r", "(J)V", com.google.android.exoplayer2.text.ttml.b.o, DTransferConstants.SEARCH_KEY, "t", "tail", com.google.android.exoplayer2.text.ttml.b.r, SOAP.XMLNS, "(I)V", "size", "isBufferAlwaysFull", "()Z", "isBufferFull", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "<init>", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class ArrayBroadcastChannel<E> extends AbstractSendChannel<E> implements BroadcastChannel<E> {

    @NotNull
    private volatile /* synthetic */ long _head;

    @NotNull
    private volatile /* synthetic */ int _size;

    @NotNull
    private volatile /* synthetic */ long _tail;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ReentrantLock bufferLock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Object[] buffer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final List<a<E>> subscribers;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\tJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00048T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0016\u0010%\u001a\u00020\u00048T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0006R\u0016\u0010&\u001a\u00020\u00048T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0016\u0010'\u001a\u00020\u00048T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0006¨\u0006*"}, d2 = {"kotlinx/coroutines/channels/ArrayBroadcastChannel$a", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", SOAP.XMLNS, "()Z", "", "t", "()Ljava/lang/Object;", "", "cause", "close", "(Ljava/lang/Throwable;)Z", DTransferConstants.SEARCH_KEY, "pollInternal", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "c", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "broadcastChannel", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", GoogleApiAvailabilityLight.a, "Ljava/util/concurrent/locks/ReentrantLock;", "subLock", "", "value", "r", "()J", "u", "(J)V", "subHead", "isBufferAlwaysEmpty", "isBufferEmpty", "isBufferAlwaysFull", "isBufferFull", "<init>", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class a<E> extends AbstractChannel<E> implements ReceiveChannel<E> {

        @NotNull
        private volatile /* synthetic */ long _subHead;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final ArrayBroadcastChannel<E> broadcastChannel;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final ReentrantLock subLock;

        public a(@NotNull ArrayBroadcastChannel<E> arrayBroadcastChannel) {
            super(null);
            this.broadcastChannel = arrayBroadcastChannel;
            this.subLock = new ReentrantLock();
            this._subHead = 0L;
        }

        private final boolean s() {
            if (getClosedForReceive() != null) {
                return false;
            }
            return (isBufferEmpty() && this.broadcastChannel.getClosedForReceive() == null) ? false : true;
        }

        private final Object t() {
            long j = get_subHead();
            Closed<?> closedForReceive = this.broadcastChannel.getClosedForReceive();
            if (j < this.broadcastChannel.get_tail()) {
                Object objN = this.broadcastChannel.n(j);
                Closed<?> closedForReceive2 = getClosedForReceive();
                return closedForReceive2 != null ? closedForReceive2 : objN;
            }
            if (closedForReceive != null) {
                return closedForReceive;
            }
            Closed<?> closedForReceive3 = getClosedForReceive();
            return closedForReceive3 == null ? AbstractChannelKt.POLL_FAILED : closedForReceive3;
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
        public boolean close(@Nullable Throwable cause) {
            boolean zClose = super.close(cause);
            if (zClose) {
                ArrayBroadcastChannel.v(this.broadcastChannel, null, this, 1, null);
                ReentrantLock reentrantLock = this.subLock;
                reentrantLock.lock();
                try {
                    u(this.broadcastChannel.get_tail());
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return zClose;
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        public boolean isBufferAlwaysEmpty() {
            return false;
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel
        public boolean isBufferAlwaysFull() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        public boolean isBufferEmpty() {
            return get_subHead() >= this.broadcastChannel.get_tail();
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel
        public boolean isBufferFull() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        @Nullable
        public Object pollInternal() {
            boolean z;
            ReentrantLock reentrantLock = this.subLock;
            reentrantLock.lock();
            try {
                Object objT = t();
                if ((objT instanceof Closed) || objT == AbstractChannelKt.POLL_FAILED) {
                    z = false;
                } else {
                    u(get_subHead() + 1);
                    z = true;
                }
                reentrantLock.unlock();
                Closed closed = objT instanceof Closed ? (Closed) objT : null;
                if (closed != null) {
                    close(closed.closeCause);
                }
                if (q() ? true : z) {
                    ArrayBroadcastChannel.v(this.broadcastChannel, null, null, 3, null);
                }
                return objT;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        @Nullable
        public Object pollSelectInternal(@NotNull SelectInstance<?> select) {
            ReentrantLock reentrantLock = this.subLock;
            reentrantLock.lock();
            try {
                Object objT = t();
                boolean z = false;
                if (!(objT instanceof Closed) && objT != AbstractChannelKt.POLL_FAILED) {
                    if (select.trySelect()) {
                        u(get_subHead() + 1);
                        z = true;
                    } else {
                        objT = SelectKt.getALREADY_SELECTED();
                    }
                }
                reentrantLock.unlock();
                Closed closed = objT instanceof Closed ? (Closed) objT : null;
                if (closed != null) {
                    close(closed.closeCause);
                }
                if (q() ? true : z) {
                    ArrayBroadcastChannel.v(this.broadcastChannel, null, null, 3, null);
                }
                return objT;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean q() {
            Closed closed;
            boolean z = false;
            while (true) {
                closed = null;
                if (!s() || !this.subLock.tryLock()) {
                    break;
                }
                try {
                    Object objT = t();
                    if (objT != AbstractChannelKt.POLL_FAILED) {
                        if (objT instanceof Closed) {
                            closed = (Closed) objT;
                        } else {
                            ReceiveOrClosed<E> receiveOrClosedTakeFirstReceiveOrPeekClosed = takeFirstReceiveOrPeekClosed();
                            if (receiveOrClosedTakeFirstReceiveOrPeekClosed != 0 && !(receiveOrClosedTakeFirstReceiveOrPeekClosed instanceof Closed)) {
                                Symbol symbolTryResumeReceive = receiveOrClosedTakeFirstReceiveOrPeekClosed.tryResumeReceive(objT, null);
                                if (symbolTryResumeReceive != null) {
                                    if (DebugKt.getASSERTIONS_ENABLED()) {
                                        if (!(symbolTryResumeReceive == CancellableContinuationImplKt.RESUME_TOKEN)) {
                                            throw new AssertionError();
                                        }
                                    }
                                    u(get_subHead() + 1);
                                    this.subLock.unlock();
                                    receiveOrClosedTakeFirstReceiveOrPeekClosed.completeResumeReceive(objT);
                                    z = true;
                                }
                            }
                        }
                        this.subLock.unlock();
                        break;
                    }
                    this.subLock.unlock();
                } catch (Throwable th) {
                    this.subLock.unlock();
                    throw th;
                }
            }
            if (closed != null) {
                close(closed.closeCause);
            }
            return z;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final long get_subHead() {
            return this._subHead;
        }

        public final void u(long j) {
            this._subHead = j;
        }
    }

    public ArrayBroadcastChannel(int i) {
        super(null);
        this.capacity = i;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + getCapacity() + " was specified").toString());
        }
        this.bufferLock = new ReentrantLock();
        this.buffer = new Object[i];
        this._head = 0L;
        this._tail = 0L;
        this._size = 0;
        this.subscribers = ConcurrentKt.subscriberList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.coroutines.channels.BroadcastChannel
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final boolean cancel(Throwable cause) {
        boolean zClose = close(cause);
        Iterator<a<E>> it2 = this.subscribers.iterator();
        while (it2.hasNext()) {
            it2.next().cancel(cause);
        }
        return zClose;
    }

    private final void l() {
        Iterator<a<E>> it2 = this.subscribers.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it2.hasNext()) {
            if (it2.next().q()) {
                z = true;
            }
            z2 = true;
        }
        if (z || !z2) {
            v(this, null, null, 3, null);
        }
    }

    private final long m() {
        Iterator<a<E>> it2 = this.subscribers.iterator();
        long jCoerceAtMost = Long.MAX_VALUE;
        while (it2.hasNext()) {
            jCoerceAtMost = kotlin.ranges.e.coerceAtMost(jCoerceAtMost, it2.next().get_subHead());
        }
        return jCoerceAtMost;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E n(long index) {
        return (E) this.buffer[(int) (index % ((long) this.capacity))];
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    private final long get_head() {
        return this._head;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    private final int get_size() {
        return this._size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: from getter */
    public final long get_tail() {
        return this._tail;
    }

    private final void r(long j) {
        this._head = j;
    }

    private final void s(int i) {
        this._size = i;
    }

    private final void t(long j) {
        this._tail = j;
    }

    private final void u(a<E> addSub, a<E> removeSub) {
        Send sendTakeFirstSendOrPeekClosed;
        Symbol symbolTryResumeSend;
        while (true) {
            ReentrantLock reentrantLock = this.bufferLock;
            reentrantLock.lock();
            if (addSub != null) {
                try {
                    addSub.u(get_tail());
                    boolean zIsEmpty = this.subscribers.isEmpty();
                    this.subscribers.add(addSub);
                    if (!zIsEmpty) {
                        reentrantLock.unlock();
                        return;
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            if (removeSub != null) {
                this.subscribers.remove(removeSub);
                if (get_head() != removeSub.get_subHead()) {
                    reentrantLock.unlock();
                    return;
                }
            }
            long jM = m();
            long j = get_tail();
            long j2 = get_head();
            long jCoerceAtMost = kotlin.ranges.e.coerceAtMost(jM, j);
            if (jCoerceAtMost <= j2) {
                reentrantLock.unlock();
                return;
            }
            int i = get_size();
            while (true) {
                if (j2 >= jCoerceAtMost) {
                    reentrantLock.unlock();
                    return;
                }
                this.buffer[(int) (j2 % ((long) getCapacity()))] = null;
                boolean z = i >= getCapacity();
                j2++;
                r(j2);
                i--;
                s(i);
                if (z) {
                    while (true) {
                        sendTakeFirstSendOrPeekClosed = takeFirstSendOrPeekClosed();
                        if (sendTakeFirstSendOrPeekClosed != null && !(sendTakeFirstSendOrPeekClosed instanceof Closed)) {
                            symbolTryResumeSend = sendTakeFirstSendOrPeekClosed.tryResumeSend(null);
                            if (symbolTryResumeSend != null) {
                                break;
                            }
                        }
                    }
                }
            }
            if (DebugKt.getASSERTIONS_ENABLED()) {
                if (!(symbolTryResumeSend == CancellableContinuationImplKt.RESUME_TOKEN)) {
                    throw new AssertionError();
                }
            }
            this.buffer[(int) (j % ((long) getCapacity()))] = sendTakeFirstSendOrPeekClosed.getElement();
            s(i + 1);
            t(j + 1);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            sendTakeFirstSendOrPeekClosed.completeResumeSend();
            l();
            addSub = null;
            removeSub = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v(ArrayBroadcastChannel arrayBroadcastChannel, a aVar, a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        arrayBroadcastChannel.u(aVar, aVar2);
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(@Nullable Throwable cause) {
        if (!super.close(cause)) {
            return false;
        }
        l();
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @NotNull
    public String getBufferDebugString() {
        return "(buffer:capacity=" + this.buffer.length + ",size=" + get_size() + ')';
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    public boolean isBufferAlwaysFull() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    public boolean isBufferFull() {
        return get_size() >= this.capacity;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @NotNull
    public Object offerInternal(E element) {
        ReentrantLock reentrantLock = this.bufferLock;
        reentrantLock.lock();
        try {
            Closed<?> closedForSend = getClosedForSend();
            if (closedForSend != null) {
                reentrantLock.unlock();
                return closedForSend;
            }
            int i = get_size();
            if (i >= getCapacity()) {
                Symbol symbol = AbstractChannelKt.OFFER_FAILED;
                reentrantLock.unlock();
                return symbol;
            }
            long j = get_tail();
            this.buffer[(int) (j % ((long) getCapacity()))] = element;
            s(i + 1);
            t(j + 1);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            l();
            return AbstractChannelKt.OFFER_SUCCESS;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @NotNull
    public Object offerSelectInternal(E element, @NotNull SelectInstance<?> select) {
        ReentrantLock reentrantLock = this.bufferLock;
        reentrantLock.lock();
        try {
            Closed<?> closedForSend = getClosedForSend();
            if (closedForSend != null) {
                reentrantLock.unlock();
                return closedForSend;
            }
            int i = get_size();
            if (i >= getCapacity()) {
                Symbol symbol = AbstractChannelKt.OFFER_FAILED;
                reentrantLock.unlock();
                return symbol;
            }
            if (!select.trySelect()) {
                Object already_selected = SelectKt.getALREADY_SELECTED();
                reentrantLock.unlock();
                return already_selected;
            }
            long j = get_tail();
            this.buffer[(int) (j % ((long) getCapacity()))] = element;
            s(i + 1);
            t(j + 1);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            l();
            return AbstractChannelKt.OFFER_SUCCESS;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @NotNull
    public ReceiveChannel<E> openSubscription() {
        a aVar = new a(this);
        v(this, aVar, null, 2, null);
        return aVar;
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(@Nullable CancellationException cause) {
        cancel(cause);
    }
}
