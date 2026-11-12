package kotlinx.coroutines.channels;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.base.PayResponse;
import com.huami.watch.notification.TransportUri;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@ObsoleteCoroutinesApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004\n\u0006\u000f\u0013B\u0007¢\u0006\u0004\bA\u00107B\u0011\b\u0016\u0012\u0006\u00108\u001a\u00028\u0000¢\u0006\u0004\bA\u0010BJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b2\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u001d\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0011\u001a\u00028\u00002(\u0010\u001c\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b#\u0010$J)\u0010(\u001a\u00020\u00052\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b*\u0010$J\u001f\u0010*\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0016¢\u0006\u0004\b*\u0010-J\u001b\u0010.\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J&\u00103\u001a\b\u0012\u0004\u0012\u00020\u0005002\u0006\u0010\u0011\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b1\u00102R\u0019\u00108\u001a\u00028\u00008F@\u0006¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\u0015\u0010:\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b9\u00105R\u0016\u0010;\u001a\u00020\"8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R(\u0010@\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190=8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$d;", "subscriber", "", "b", "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$d;)V", "", "list", "a", "([Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$d;Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$d;)[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$d;", "f", "", "cause", "c", "(Ljava/lang/Throwable;)V", "element", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$a;", GoogleApiAvailabilityLight.a, "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$a;", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", TransportUri.ACTION_BLOCK, "e", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", com.twitter.sdk.android.tweetcomposer.g.g, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "getValue", "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "getValueOrNull", "valueOrNull", "isClosedForSend", "()Z", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class ConflatedBroadcastChannel<E> implements BroadcastChannel<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater b;
    private static final /* synthetic */ AtomicIntegerFieldUpdater c;
    private static final /* synthetic */ AtomicReferenceFieldUpdater d;

    @Deprecated
    @NotNull
    private static final Symbol f;

    @Deprecated
    @NotNull
    private static final c<Object> g;

    @NotNull
    private volatile /* synthetic */ Object _state;

    @NotNull
    private volatile /* synthetic */ int _updating;

    @NotNull
    private volatile /* synthetic */ Object onCloseHandler;

    @NotNull
    private static final b a = new b(null);

    @Deprecated
    @NotNull
    private static final a e = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0007\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0013\u0010\t\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"kotlinx/coroutines/channels/ConflatedBroadcastChannel$a", "", "", "a", "Ljava/lang/Throwable;", "closeCause", "()Ljava/lang/Throwable;", "sendException", "b", "valueException", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Throwable closeCause;

        public a(@Nullable Throwable th) {
            this.closeCause = th;
        }

        @NotNull
        public final Throwable a() {
            Throwable th = this.closeCause;
            return th == null ? new ClosedSendChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : th;
        }

        @NotNull
        public final Throwable b() {
            Throwable th = this.closeCause;
            return th == null ? new IllegalStateException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : th;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"kotlinx/coroutines/channels/ConflatedBroadcastChannel$b", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$a;", "CLOSED", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$a;", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$c;", "INITIAL_STATE", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$c;", "Lkotlinx/coroutines/internal/Symbol;", PayResponse.CODE_UNDEFINED, "Lkotlinx/coroutines/internal/Symbol;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R$\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"kotlinx/coroutines/channels/ConflatedBroadcastChannel$c", "E", "", "a", "Ljava/lang/Object;", "value", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$d;", "b", "[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$d;", "subscribers", "<init>", "(Ljava/lang/Object;[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class c<E> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Object value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final d<E>[] subscribers;

        public c(@Nullable Object obj, @Nullable d<E>[] dVarArr) {
            this.value = obj;
            this.subscribers = dVarArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"kotlinx/coroutines/channels/ConflatedBroadcastChannel$d", "E", "Lkotlinx/coroutines/channels/ConflatedChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "wasClosed", "", "onCancelIdempotent", "element", "", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "e", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "broadcastChannel", "<init>", "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class d<E> extends ConflatedChannel<E> implements ReceiveChannel<E> {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final ConflatedBroadcastChannel<E> broadcastChannel;

        public d(@NotNull ConflatedBroadcastChannel<E> conflatedBroadcastChannel) {
            super(null);
            this.broadcastChannel = conflatedBroadcastChannel;
        }

        @Override // kotlinx.coroutines.channels.ConflatedChannel, kotlinx.coroutines.channels.AbstractSendChannel
        @NotNull
        public Object offerInternal(E element) {
            return super.offerInternal(element);
        }

        @Override // kotlinx.coroutines.channels.ConflatedChannel, kotlinx.coroutines.channels.AbstractChannel
        public void onCancelIdempotent(boolean wasClosed) {
            if (wasClosed) {
                this.broadcastChannel.b(this);
            }
        }
    }

    static {
        Symbol symbol = new Symbol(PayResponse.CODE_UNDEFINED);
        f = symbol;
        g = new c<>(symbol, null);
        b = AtomicReferenceFieldUpdater.newUpdater(ConflatedBroadcastChannel.class, Object.class, "_state");
        c = AtomicIntegerFieldUpdater.newUpdater(ConflatedBroadcastChannel.class, "_updating");
        d = AtomicReferenceFieldUpdater.newUpdater(ConflatedBroadcastChannel.class, Object.class, "onCloseHandler");
    }

    public ConflatedBroadcastChannel() {
        this._state = g;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    private final d<E>[] a(d<E>[] list, d<E> subscriber) {
        if (list != null) {
            return (d[]) ArraysKt.plus(list, subscriber);
        }
        d<E>[] dVarArr = new d[1];
        for (int i = 0; i < 1; i++) {
            dVarArr[i] = subscriber;
        }
        return dVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(d<E> subscriber) {
        Object obj;
        c cVar;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
            }
            cVar = (c) obj;
        } while (!b.compareAndSet(this, obj, new c(cVar.value, f(cVar.subscribers, subscriber))));
    }

    private final void c(Throwable cause) {
        Symbol symbol;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (symbol = AbstractChannelKt.HANDLER_INVOKED) || !d.compareAndSet(this, obj, symbol)) {
            return;
        }
        ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1)).invoke(cause);
    }

    private final a d(E element) {
        Object obj;
        if (!c.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    this._updating = 0;
                    return aVar;
                }
                if (!(obj instanceof c)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
                }
            } catch (Throwable th) {
                this._updating = 0;
                throw th;
            }
        } while (!b.compareAndSet(this, obj, new c(element, ((c) obj).subscribers)));
        d<E>[] dVarArr = ((c) obj).subscribers;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.offerInternal(element);
            }
        }
        this._updating = 0;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void e(SelectInstance<? super R> select, E element, Function2<? super SendChannel<? super E>, ? super Continuation<? super R>, ? extends Object> block) {
        if (select.trySelect()) {
            a aVarD = d(element);
            if (aVarD == null) {
                UndispatchedKt.startCoroutineUnintercepted(block, this, select.getCompletion());
            } else {
                select.resumeSelectWithException(aVarD.a());
            }
        }
    }

    private final d<E>[] f(d<E>[] list, d<E> subscriber) {
        int length = list.length;
        int iIndexOf = ArraysKt___ArraysKt.indexOf(list, subscriber);
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(iIndexOf >= 0)) {
                throw new AssertionError();
            }
        }
        if (length == 1) {
            return null;
        }
        d<E>[] dVarArr = new d[length - 1];
        ArraysKt___ArraysJvmKt.copyInto$default(list, dVarArr, 0, 0, iIndexOf, 6, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto$default(list, dVarArr, iIndexOf, iIndexOf + 1, 0, 8, (Object) null);
        return dVarArr;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    /* JADX INFO: renamed from: close, reason: merged with bridge method [inline-methods] */
    public boolean cancel(@Nullable Throwable cause) {
        Object obj;
        int i;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return false;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
            }
        } while (!b.compareAndSet(this, obj, cause == null ? e : new a(cause)));
        d<E>[] dVarArr = ((c) obj).subscribers;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.cancel(cause);
            }
        }
        c(cause);
        return true;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return new SelectClause2<E, SendChannel<? super E>>(this) { // from class: kotlinx.coroutines.channels.ConflatedBroadcastChannel$onSend$1
            public final /* synthetic */ ConflatedBroadcastChannel<E> a;

            {
                this.a = this;
            }

            @Override // kotlinx.coroutines.selects.SelectClause2
            public <R> void registerSelectClause2(@NotNull SelectInstance<? super R> select, E param, @NotNull Function2<? super SendChannel<? super E>, ? super Continuation<? super R>, ? extends Object> block) {
                this.a.e(select, param, block);
            }
        };
    }

    public final E getValue() throws Throwable {
        Object obj = this._state;
        if (obj instanceof a) {
            throw ((a) obj).b();
        }
        if (!(obj instanceof c)) {
            throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
        }
        E e2 = (E) ((c) obj).value;
        if (e2 != f) {
            return e2;
        }
        throw new IllegalStateException("No value");
    }

    @Nullable
    public final E getValueOrNull() {
        Object obj = this._state;
        if (obj instanceof a) {
            return null;
        }
        if (!(obj instanceof c)) {
            throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
        }
        Symbol symbol = f;
        E e2 = (E) ((c) obj).value;
        if (e2 == symbol) {
            return null;
        }
        return e2;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(@NotNull Function1<? super Throwable, Unit> handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, null, handler)) {
            Object obj = this.onCloseHandler;
            if (obj != AbstractChannelKt.HANDLER_INVOKED) {
                throw new IllegalStateException(Intrinsics.stringPlus("Another handler was already registered: ", obj));
            }
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        Object obj2 = this._state;
        if ((obj2 instanceof a) && atomicReferenceFieldUpdater.compareAndSet(this, handler, AbstractChannelKt.HANDLER_INVOKED)) {
            handler.invoke(((a) obj2).closeCause);
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this._state instanceof a;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e2) {
        return BroadcastChannel.DefaultImpls.offer(this, e2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @NotNull
    public ReceiveChannel<E> openSubscription() {
        Object obj;
        c cVar;
        d dVar = new d(this);
        do {
            obj = this._state;
            if (obj instanceof a) {
                dVar.cancel(((a) obj).closeCause);
                return dVar;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
            }
            cVar = (c) obj;
            Object obj2 = cVar.value;
            if (obj2 != f) {
                dVar.offerInternal(obj2);
            }
        } while (!b.compareAndSet(this, obj, new c(cVar.value, a(cVar.subscribers, dVar))));
        return dVar;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Nullable
    public Object send(E e2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        a aVarD = d(e2);
        if (aVarD != null) {
            throw aVarD.a();
        }
        if (kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() == null) {
            return null;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo4435trySendJP2dKIU(E element) {
        a aVarD = d(element);
        return aVarD == null ? ChannelResult.INSTANCE.m4455successJP2dKIU(Unit.INSTANCE) : ChannelResult.INSTANCE.m4453closedJP2dKIU(aVarD.a());
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(@Nullable CancellationException cause) {
        cancel(cause);
    }

    public ConflatedBroadcastChannel(E e2) {
        this();
        b.lazySet(this, new c(e2, null));
    }
}
