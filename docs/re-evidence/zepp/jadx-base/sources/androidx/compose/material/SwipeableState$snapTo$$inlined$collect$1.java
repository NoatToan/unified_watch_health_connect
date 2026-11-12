package androidx.compose.material;

import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class SwipeableState$snapTo$$inlined$collect$1<T> implements FlowCollector<Map<Float, ? extends T>> {
    public final /* synthetic */ Object $targetValue$inlined;
    public final /* synthetic */ SwipeableState this$0;

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1", f = "Swipeable.kt", i = {0}, l = {139}, m = "emit", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SwipeableState$snapTo$$inlined$collect$1.this.emit(null, this);
        }
    }

    public SwipeableState$snapTo$$inlined$collect$1(Object obj, SwipeableState swipeableState) {
        this.$targetValue$inlined = obj;
        this.this$0 = swipeableState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Map<Float, ? extends T> map, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        SwipeableState$snapTo$$inlined$collect$1<T> swipeableState$snapTo$$inlined$collect$1;
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
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Float offset = SwipeableKt.getOffset(map, this.$targetValue$inlined);
            if (offset == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
            }
            SwipeableState swipeableState = this.this$0;
            float fFloatValue = offset.floatValue();
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (swipeableState.snapInternalToOffset(fFloatValue, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            swipeableState$snapTo$$inlined$collect$1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            swipeableState$snapTo$$inlined$collect$1 = (SwipeableState$snapTo$$inlined$collect$1) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        swipeableState$snapTo$$inlined$collect$1.this$0.setCurrentValue(swipeableState$snapTo$$inlined$collect$1.$targetValue$inlined);
        return Unit.INSTANCE;
    }
}
