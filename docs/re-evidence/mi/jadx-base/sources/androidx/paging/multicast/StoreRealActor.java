package androidx.paging.multicast;

import com.miui.tsmclient.util.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0015B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\r\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\bH\u0002J\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/paging/multicast/StoreRealActor;", "T", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "closeCompleted", "Lkotlinx/coroutines/CompletableDeferred;", "", "didClose", "Ljava/util/concurrent/atomic/AtomicBoolean;", "inboundChannel", "Lkotlinx/coroutines/channels/Channel;", Constants.EXTRA_CLOSE_TAI, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doClose", "handle", "msg", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosed", "send", "Companion", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class StoreRealActor<T> {
    private final CompletableDeferred<Unit> closeCompleted;
    private final AtomicBoolean didClose;
    private final Channel<Object> inboundChannel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Object CLOSE_TOKEN = new Object();

    /* JADX INFO: renamed from: androidx.paging.multicast.StoreRealActor$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "msg", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.multicast.StoreRealActor$1", f = "StoreRealActor.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(completion);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.L$0;
                if (obj2 == StoreRealActor.INSTANCE.getCLOSE_TOKEN()) {
                    StoreRealActor.this.doClose();
                } else {
                    StoreRealActor storeRealActor = StoreRealActor.this;
                    this.label = 1;
                    if (storeRealActor.handle(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.multicast.StoreRealActor$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.multicast.StoreRealActor$2", f = "StoreRealActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super Object>, Throwable, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(3, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(@NotNull FlowCollector<Object> create, @Nullable Throwable th, @NotNull Continuation<? super Unit> continuation) {
            Intrinsics.checkNotNullParameter(create, "$this$create");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Object> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(flowCollector, th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StoreRealActor.this.doClose();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/multicast/StoreRealActor$Companion;", "", "()V", "CLOSE_TOKEN", "getCLOSE_TOKEN", "()Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Object getCLOSE_TOKEN() {
            return StoreRealActor.CLOSE_TOKEN;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.multicast.StoreRealActor$close$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@"}, d2 = {Constants.EXTRA_CLOSE_TAI, "", "T", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.multicast.StoreRealActor", f = "StoreRealActor.kt", i = {0}, l = {74, 76}, m = Constants.EXTRA_CLOSE_TAI, n = {"this"}, s = {"L$0"})
    public static final class C12801 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12801(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StoreRealActor.this.close(this);
        }
    }

    public StoreRealActor(@NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Channel<Object> channelChannel$default = ChannelKt.Channel$default(0, null, null, 6, null);
        this.inboundChannel = channelChannel$default;
        this.closeCompleted = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.didClose = new AtomicBoolean(false);
        FlowKt.launchIn(FlowKt.onCompletion(FlowKt.onEach(FlowKt.consumeAsFlow(channelChannel$default), new AnonymousClass1(null)), new AnonymousClass2(null)), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doClose() {
        if (this.didClose.compareAndSet(false, true)) {
            try {
                onClosed();
            } finally {
                SendChannel.DefaultImpls.close$default(this.inboundChannel, null, 1, null);
                this.closeCompleted.complete(Unit.INSTANCE);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        C12801 c12801;
        StoreRealActor<T> storeRealActor;
        if (continuation instanceof C12801) {
            c12801 = (C12801) continuation;
            int i = c12801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12801.label = i - Integer.MIN_VALUE;
            } else {
                c12801 = new C12801(continuation);
            }
        } else {
            c12801 = new C12801(continuation);
        }
        Object obj = c12801.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12801.label;
        if (i2 != 0) {
            if (i2 == 1) {
                storeRealActor = (StoreRealActor) c12801.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Channel<Object> channel = this.inboundChannel;
        Object obj2 = CLOSE_TOKEN;
        c12801.L$0 = this;
        c12801.label = 1;
        if (channel.send(obj2, c12801) == coroutine_suspended) {
            return coroutine_suspended;
        }
        storeRealActor = this;
        CompletableDeferred<Unit> completableDeferred = storeRealActor.closeCompleted;
        c12801.L$0 = null;
        c12801.label = 2;
        if (completableDeferred.await(c12801) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public abstract Object handle(T t, @NotNull Continuation<? super Unit> continuation);

    public void onClosed() {
    }

    @Nullable
    public final Object send(T t, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.inboundChannel.send(t, continuation);
        return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }
}
