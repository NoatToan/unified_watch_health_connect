package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1<Value> implements FlowCollector<PageEvent<Value>> {
    final /* synthetic */ MutableLoadStateCollection $loadStates$inlined;
    final /* synthetic */ SimpleProducerScope $this_simpleChannelFlow$inlined;
    final /* synthetic */ PageFetcher.C12491 this$0;

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\u0007"}, d2 = {"emit", "", "T", "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1", f = "PageFetcher.kt", i = {}, l = {139, 147, 155}, m = "emit", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1(PageFetcher.C12491 c12491, SimpleProducerScope simpleProducerScope, MutableLoadStateCollection mutableLoadStateCollection) {
        this.this$0 = c12491;
        this.$this_simpleChannelFlow$inlined = simpleProducerScope;
        this.$loadStates$inlined = mutableLoadStateCollection;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Object obj, @NotNull Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj2 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            PageEvent pageEvent = (PageEvent) obj;
            if (pageEvent instanceof PageEvent.Insert) {
                PageEvent.Insert insert = (PageEvent.Insert) pageEvent;
                this.$loadStates$inlined.set(insert.getCombinedLoadStates().getSource(), this.this$0.$accessor.getState().getValue());
                SimpleProducerScope simpleProducerScope = this.$this_simpleChannelFlow$inlined;
                PageEvent.Insert insertCopy$default = PageEvent.Insert.copy$default(insert, null, null, 0, 0, this.$loadStates$inlined.snapshot(), 15, null);
                anonymousClass1.label = 1;
                if (simpleProducerScope.send(insertCopy$default, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (pageEvent instanceof PageEvent.Drop) {
                this.$loadStates$inlined.set(((PageEvent.Drop) pageEvent).getLoadType(), false, LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
                SimpleProducerScope simpleProducerScope2 = this.$this_simpleChannelFlow$inlined;
                anonymousClass1.label = 2;
                if (simpleProducerScope2.send(pageEvent, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (pageEvent instanceof PageEvent.LoadStateUpdate) {
                PageEvent.LoadStateUpdate loadStateUpdate = (PageEvent.LoadStateUpdate) pageEvent;
                this.$loadStates$inlined.set(loadStateUpdate.getLoadType(), loadStateUpdate.getFromMediator(), loadStateUpdate.getLoadState());
                SimpleProducerScope simpleProducerScope3 = this.$this_simpleChannelFlow$inlined;
                anonymousClass1.label = 3;
                if (simpleProducerScope3.send(pageEvent, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
