package androidx.paging.multicast;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1", f = "SharedFlowProducer.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class SharedFlowProducer$collectionJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SharedFlowProducer this$0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.paging.multicast.SharedFlowProducer$collectionJob$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1$1", f = "SharedFlowProducer.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<T> extends SuspendLambda implements Function3<FlowCollector<? super T>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(3, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(@NotNull FlowCollector<? super T> create, @NotNull Throwable it, @NotNull Continuation<? super Unit> continuation) {
            Intrinsics.checkNotNullParameter(create, "$this$create");
            Intrinsics.checkNotNullParameter(it, "it");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            AnonymousClass1 anonymousClass1 = SharedFlowProducer$collectionJob$1.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = it;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create((FlowCollector) obj, th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                Function2 function2 = SharedFlowProducer$collectionJob$1.this.this$0.sendUpsteamMessage;
                ChannelManager.Message.Dispatch.Error error = new ChannelManager.Message.Dispatch.Error(th);
                this.label = 1;
                if (function2.invoke(error, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFlowProducer$collectionJob$1(SharedFlowProducer sharedFlowProducer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sharedFlowProducer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new SharedFlowProducer$collectionJob$1(this.this$0, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SharedFlowProducer$collectionJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowM2416catch = FlowKt.m2416catch(this.this$0.src, new AnonymousClass1(null));
                SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1 sharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1 = new SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1(this);
                this.label = 1;
                if (flowM2416catch.collect(sharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (ClosedSendChannelException unused) {
        }
        return Unit.INSTANCE;
    }
}
