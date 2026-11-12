package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$lambda-10$$inlined$collect$1, reason: invalid class name */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class FlowKt__TransformKt$runningFold$lambda10$$inlined$collect$1<T> implements FlowCollector<T> {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ Function3 b;
    public final /* synthetic */ FlowCollector c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$lambda-10$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$lambda-10$$inlined$collect$1", f = "Transform.kt", i = {0}, l = {135, 136}, m = "emit", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$runningFold$lambda10$$inlined$collect$1.this.emit(null, this);
        }
    }

    public FlowKt__TransformKt$runningFold$lambda10$$inlined$collect$1(Ref.ObjectRef objectRef, Function3 function3, FlowCollector flowCollector) {
        this.a = objectRef;
        this.b = function3;
        this.c = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        FlowKt__TransformKt$runningFold$lambda10$$inlined$collect$1<T> flowKt__TransformKt$runningFold$lambda10$$inlined$collect$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.b = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        T t2 = (T) anonymousClass1.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.b;
        if (i2 != 0) {
            if (i2 == 1) {
                objectRef = (Ref.ObjectRef) anonymousClass1.e;
                flowKt__TransformKt$runningFold$lambda10$$inlined$collect$1 = (FlowKt__TransformKt$runningFold$lambda10$$inlined$collect$1) anonymousClass1.d;
                ResultKt.throwOnFailure(t2);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(t2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(t2);
        Ref.ObjectRef objectRef2 = this.a;
        Function3 function3 = this.b;
        T t3 = objectRef2.element;
        anonymousClass1.d = this;
        anonymousClass1.e = objectRef2;
        anonymousClass1.b = 1;
        InlineMarker.mark(6);
        Object objInvoke = function3.invoke(t3, t, anonymousClass1);
        InlineMarker.mark(7);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        flowKt__TransformKt$runningFold$lambda10$$inlined$collect$1 = this;
        t2 = (T) objInvoke;
        objectRef = objectRef2;
        objectRef.element = t2;
        FlowCollector flowCollector = flowKt__TransformKt$runningFold$lambda10$$inlined$collect$1.c;
        T t4 = flowKt__TransformKt$runningFold$lambda10$$inlined$collect$1.a.element;
        anonymousClass1.d = null;
        anonymousClass1.e = null;
        anonymousClass1.b = 2;
        if (flowCollector.emit(t4, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
