package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$historyCollection$1", f = "CachedPageEventFlow.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
public final class CachedPageEventFlow$downstreamFlow$1$historyCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.IntRef $lastReceivedHistoryIndex;
    final /* synthetic */ TemporaryDownstream $snapshot;
    final /* synthetic */ SimpleProducerScope $this_simpleChannelFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1$historyCollection$1(SimpleProducerScope simpleProducerScope, TemporaryDownstream temporaryDownstream, Ref.IntRef intRef, Continuation continuation) {
        super(2, continuation);
        this.$this_simpleChannelFlow = simpleProducerScope;
        this.$snapshot = temporaryDownstream;
        this.$lastReceivedHistoryIndex = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new CachedPageEventFlow$downstreamFlow$1$historyCollection$1(this.$this_simpleChannelFlow, this.$snapshot, this.$lastReceivedHistoryIndex, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CachedPageEventFlow$downstreamFlow$1$historyCollection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowConsumeHistory = this.$snapshot.consumeHistory();
            Object obj2 = new FlowCollector<IndexedValue<? extends PageEvent<T>>>() { // from class: androidx.paging.CachedPageEventFlow$downstreamFlow$1$historyCollection$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Object obj3, @NotNull Continuation continuation) {
                    IndexedValue indexedValue = (IndexedValue) obj3;
                    this.this$0.$lastReceivedHistoryIndex.element = indexedValue.getIndex();
                    Object objSend = this.this$0.$this_simpleChannelFlow.send(indexedValue.getValue(), continuation);
                    return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowConsumeHistory.collect(obj2, this) == coroutine_suspended) {
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
