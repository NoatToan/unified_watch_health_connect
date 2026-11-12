package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1<T> implements FlowCollector<T> {
    final /* synthetic */ Ref.ObjectRef $accumulator$inlined;
    final /* synthetic */ FlowCollector $this_flow$inlined;
    final /* synthetic */ FlowExtKt.C12431 this$0;

    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\u0007"}, d2 = {"emit", "", "T", "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1", f = "FlowExt.kt", i = {0}, l = {137, 140}, m = "emit", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
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
            return FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1(FlowExtKt.C12431 c12431, FlowCollector flowCollector, Ref.ObjectRef objectRef) {
        this.this$0 = c12431;
        this.$this_flow$inlined = flowCollector;
        this.$accumulator$inlined = objectRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Object obj, @NotNull Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        Ref.ObjectRef objectRef;
        FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1<T> flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1;
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
        if (i2 != 0) {
            if (i2 == 1) {
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) anonymousClass1.L$1;
                flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 = (FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj2);
                objectRef = objectRef2;
                obj = (T) obj2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj2);
        objectRef = this.$accumulator$inlined;
        if (objectRef.element != FlowExtKt.NULL) {
            Function3 function3 = this.this$0.$operation;
            T t = this.$accumulator$inlined.element;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = objectRef;
            anonymousClass1.label = 1;
            InlineMarker.mark(6);
            obj = function3.invoke(t, obj, anonymousClass1);
            InlineMarker.mark(7);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 = this;
        objectRef.element = (T) obj;
        FlowCollector flowCollector = flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1.$this_flow$inlined;
        T t2 = flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1.$accumulator$inlined.element;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        if (flowCollector.emit(t2, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
