package androidx.paging.multicast;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1", f = "Multicaster.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
public final class Multicaster$flow$1$invokeSuspend$$inlined$transform$1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1"}, k = 1, mv = {1, 4, 2})
    public static final class AnonymousClass1 implements FlowCollector<ChannelManager.Message.Dispatch.Value<T>> {
        final /* synthetic */ FlowCollector $this_flow$inlined;

        /* JADX INFO: renamed from: androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\b"}, d2 = {"emit", "", "T", "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1$1"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1", f = "Multicaster.kt", i = {0}, l = {134}, m = "emit", n = {"it"}, s = {"L$0"})
        public static final class C00611 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public C00611(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector) {
            this.$this_flow$inlined = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public Object emit(Object obj, @NotNull Continuation continuation) {
            C00611 c00611;
            ChannelManager.Message.Dispatch.Value value;
            if (continuation instanceof C00611) {
                c00611 = (C00611) continuation;
                int i = c00611.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c00611.label = i - Integer.MIN_VALUE;
                } else {
                    c00611 = new C00611(continuation);
                }
            } else {
                c00611 = new C00611(continuation);
            }
            Object obj2 = c00611.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c00611.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj2);
                FlowCollector flowCollector = this.$this_flow$inlined;
                value = (ChannelManager.Message.Dispatch.Value) obj;
                Object value2 = value.getValue();
                c00611.L$0 = value;
                c00611.label = 1;
                if (flowCollector.emit(value2, c00611) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                value = (ChannelManager.Message.Dispatch.Value) c00611.L$0;
                ResultKt.throwOnFailure(obj2);
            }
            CompletableDeferred<Unit> delivered = value.getDelivered();
            Unit unit = Unit.INSTANCE;
            delivered.complete(unit);
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Multicaster$flow$1$invokeSuspend$$inlined$transform$1(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$this_transform = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        Multicaster$flow$1$invokeSuspend$$inlined$transform$1 multicaster$flow$1$invokeSuspend$$inlined$transform$1 = new Multicaster$flow$1$invokeSuspend$$inlined$transform$1(this.$this_transform, continuation);
        multicaster$flow$1$invokeSuspend$$inlined$transform$1.L$0 = obj;
        return multicaster$flow$1$invokeSuspend$$inlined$transform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((Multicaster$flow$1$invokeSuspend$$inlined$transform$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
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
