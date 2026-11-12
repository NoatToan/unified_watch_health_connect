package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
public final class SwipeableState$animateTo$$inlined$collect$1<T> implements FlowCollector<Map<Float, ? extends T>> {
    public final /* synthetic */ AnimationSpec $anim$inlined;
    public final /* synthetic */ Object $targetValue$inlined;
    public final /* synthetic */ SwipeableState this$0;

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1", f = "Swipeable.kt", i = {0, 0}, l = {140}, m = "emit", n = {"this", "anchors"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
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
            return SwipeableState$animateTo$$inlined$collect$1.this.emit(null, this);
        }
    }

    public SwipeableState$animateTo$$inlined$collect$1(Object obj, SwipeableState swipeableState, AnimationSpec animationSpec) {
        this.$targetValue$inlined = obj;
        this.this$0 = swipeableState;
        this.$anim$inlined = animationSpec;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0111  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Map<Float, ? extends T> map, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Map<Float, ? extends T> map2;
        SwipeableState$animateTo$$inlined$collect$1<T> swipeableState$animateTo$$inlined$collect$1;
        float fFloatValue;
        LinkedHashMap linkedHashMap;
        Object objFirstOrNull;
        boolean z;
        float fFloatValue2;
        LinkedHashMap linkedHashMap2;
        Object objFirstOrNull2;
        boolean z2;
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
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map2 = (Map) anonymousClass1.L$1;
            swipeableState$animateTo$$inlined$collect$1 = (SwipeableState$animateTo$$inlined$collect$1) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                fFloatValue2 = ((Number) swipeableState$animateTo$$inlined$collect$1.this$0.absoluteOffset.getValue()).floatValue();
                linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<Float, ? extends T> entry : map2.entrySet()) {
                    if (Math.abs(entry.getKey().floatValue() - fFloatValue2) < 0.5f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                objFirstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap2.values());
                if (objFirstOrNull2 == null) {
                    objFirstOrNull2 = swipeableState$animateTo$$inlined$collect$1.this$0.getCurrentValue();
                }
                swipeableState$animateTo$$inlined$collect$1.this$0.setCurrentValue(objFirstOrNull2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                fFloatValue = ((Number) swipeableState$animateTo$$inlined$collect$1.this$0.absoluteOffset.getValue()).floatValue();
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Float, ? extends T> entry2 : map2.entrySet()) {
                    if (Math.abs(entry2.getKey().floatValue() - fFloatValue) < 0.5f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                objFirstOrNull = CollectionsKt.firstOrNull(linkedHashMap.values());
                if (objFirstOrNull == null) {
                    objFirstOrNull = swipeableState$animateTo$$inlined$collect$1.this$0.getCurrentValue();
                }
                swipeableState$animateTo$$inlined$collect$1.this$0.setCurrentValue(objFirstOrNull);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        map2 = map;
        try {
            Float offset = SwipeableKt.getOffset(map2, this.$targetValue$inlined);
            if (offset == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
            }
            SwipeableState swipeableState = this.this$0;
            float fFloatValue3 = offset.floatValue();
            AnimationSpec animationSpec = this.$anim$inlined;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = map2;
            anonymousClass1.label = 1;
            if (swipeableState.animateInternalToOffset(fFloatValue3, animationSpec, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            swipeableState$animateTo$$inlined$collect$1 = this;
            fFloatValue2 = ((Number) swipeableState$animateTo$$inlined$collect$1.this$0.absoluteOffset.getValue()).floatValue();
            linkedHashMap2 = new LinkedHashMap();
            while (r9.hasNext()) {
                if (Math.abs(entry.getKey().floatValue() - fFloatValue2) < 0.5f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            objFirstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap2.values());
            if (objFirstOrNull2 == null) {
                objFirstOrNull2 = swipeableState$animateTo$$inlined$collect$1.this$0.getCurrentValue();
            }
            swipeableState$animateTo$$inlined$collect$1.this$0.setCurrentValue(objFirstOrNull2);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            swipeableState$animateTo$$inlined$collect$1 = this;
            fFloatValue = ((Number) swipeableState$animateTo$$inlined$collect$1.this$0.absoluteOffset.getValue()).floatValue();
            linkedHashMap = new LinkedHashMap();
            while (r9.hasNext()) {
                if (Math.abs(entry2.getKey().floatValue() - fFloatValue) < 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            objFirstOrNull = CollectionsKt.firstOrNull(linkedHashMap.values());
            if (objFirstOrNull == null) {
                objFirstOrNull = swipeableState$animateTo$$inlined$collect$1.this$0.getCurrentValue();
            }
            swipeableState$animateTo$$inlined$collect$1.this$0.setCurrentValue(objFirstOrNull);
            throw th;
        }
    }
}
