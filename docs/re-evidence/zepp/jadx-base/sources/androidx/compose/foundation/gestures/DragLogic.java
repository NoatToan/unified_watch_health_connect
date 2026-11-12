package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B£\u0001\u0012<\u0010\u0014\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u0013\u0012<\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u0013\u0012\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\"ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fRU\u0010\u0014\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u00138\u0006@\u0006ø\u0001\u0000ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017RR\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u00138\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/foundation/gestures/DragLogic;", "", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "event", "", "processDragStart", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "processDragStop", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragCancel", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "Lkotlin/jvm/functions/Function3;", "getOnDragStarted", "()Lkotlin/jvm/functions/Function3;", "", "velocity", "onDragStopped", "getOnDragStopped", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "dragStartInteraction", "Landroidx/compose/runtime/MutableState;", "getDragStartInteraction", "()Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
final class DragLogic {

    @NotNull
    private final MutableState<DragInteraction.Start> dragStartInteraction;

    @Nullable
    private final MutableInteractionSource interactionSource;

    @NotNull
    private final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> onDragStarted;

    @NotNull
    private final Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> onDragStopped;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragLogic$processDragCancel$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", i = {0, 0}, l = {375, 378}, m = "processDragCancel", n = {"this", "$this$processDragCancel"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragLogic.this.processDragCancel(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragLogic$processDragStart$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {357, 360, 362}, m = "processDragStart", n = {"this", "$this$processDragStart", "event", "this", "$this$processDragStart", "event", "interaction"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class C13261 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C13261(Continuation<? super C13261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragLogic.this.processDragStart(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragLogic$processDragStop$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", i = {0, 0, 0}, l = {367, 370}, m = "processDragStop", n = {"this", "$this$processDragStop", "event"}, s = {"L$0", "L$1", "L$2"})
    public static final class C13271 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C13271(Continuation<? super C13271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragLogic.this.processDragStop(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragLogic(@NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function4, @NotNull MutableState<DragInteraction.Start> mutableState, @Nullable MutableInteractionSource mutableInteractionSource) {
        this.onDragStarted = function3;
        this.onDragStopped = function4;
        this.dragStartInteraction = mutableState;
        this.interactionSource = mutableInteractionSource;
    }

    @NotNull
    public final MutableState<DragInteraction.Start> getDragStartInteraction() {
        return this.dragStartInteraction;
    }

    @Nullable
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @NotNull
    public final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> getOnDragStarted() {
        return this.onDragStarted;
    }

    @NotNull
    public final Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> getOnDragStopped() {
        return this.onDragStopped;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object processDragCancel(@NotNull CoroutineScope coroutineScope, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        DragLogic dragLogic;
        Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> onDragStopped;
        Float fBoxFloat;
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
            if (i2 == 1) {
                coroutineScope = (CoroutineScope) anonymousClass1.L$1;
                dragLogic = (DragLogic) anonymousClass1.L$0;
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
        DragInteraction.Start value = getDragStartInteraction().getValue();
        if (value == null) {
            dragLogic = this;
        } else {
            MutableInteractionSource interactionSource = getInteractionSource();
            if (interactionSource != null) {
                DragInteraction.Cancel cancel = new DragInteraction.Cancel(value);
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = coroutineScope;
                anonymousClass1.label = 1;
                if (interactionSource.emit(cancel, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            dragLogic = this;
        }
        onDragStopped = dragLogic.getOnDragStopped();
        fBoxFloat = Boxing.boxFloat(0.0f);
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        if (onDragStopped.invoke(coroutineScope, fBoxFloat, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        dragLogic.getDragStartInteraction().setValue(null);
        onDragStopped = dragLogic.getOnDragStopped();
        fBoxFloat = Boxing.boxFloat(0.0f);
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        if (onDragStopped.invoke(coroutineScope, fBoxFloat, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object processDragStart(@NotNull CoroutineScope coroutineScope, @NotNull DragEvent.DragStarted dragStarted, @NotNull Continuation<? super Unit> continuation) {
        C13261 c13261;
        MutableInteractionSource interactionSource;
        DragLogic dragLogic;
        DragInteraction.Start start;
        DragLogic dragLogic2;
        CoroutineScope coroutineScope2;
        DragInteraction.Start start2;
        Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> onDragStarted;
        Offset offsetM972boximpl;
        if (continuation instanceof C13261) {
            c13261 = (C13261) continuation;
            int i = c13261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13261.label = i - Integer.MIN_VALUE;
            } else {
                c13261 = new C13261(continuation);
            }
        } else {
            c13261 = new C13261(continuation);
        }
        Object obj = c13261.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = c13261.label;
        if (i2 != 0) {
            if (i2 == 1) {
                dragStarted = (DragEvent.DragStarted) c13261.L$2;
                coroutineScope = (CoroutineScope) c13261.L$1;
                dragLogic = (DragLogic) c13261.L$0;
                ResultKt.throwOnFailure(obj);
            } else if (i2 == 2) {
                start2 = (DragInteraction.Start) c13261.L$3;
                dragStarted = (DragEvent.DragStarted) c13261.L$2;
                coroutineScope2 = (CoroutineScope) c13261.L$1;
                dragLogic2 = (DragLogic) c13261.L$0;
                ResultKt.throwOnFailure(obj);
                start = start2;
                coroutineScope = coroutineScope2;
                dragLogic = dragLogic2;
                dragLogic.getDragStartInteraction().setValue(start);
                onDragStarted = dragLogic.getOnDragStarted();
                offsetM972boximpl = Offset.m972boximpl(dragStarted.getStartPoint());
                c13261.L$0 = null;
                c13261.L$1 = null;
                c13261.L$2 = null;
                c13261.L$3 = null;
                c13261.label = 3;
                if (onDragStarted.invoke(coroutineScope, offsetM972boximpl, c13261) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        DragInteraction.Start value = getDragStartInteraction().getValue();
        if (value != null && (interactionSource = getInteractionSource()) != null) {
            DragInteraction.Cancel cancel = new DragInteraction.Cancel(value);
            c13261.L$0 = this;
            c13261.L$1 = coroutineScope;
            c13261.L$2 = dragStarted;
            c13261.label = 1;
            if (interactionSource.emit(cancel, c13261) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        dragLogic = this;
        start = new DragInteraction.Start();
        MutableInteractionSource interactionSource2 = dragLogic.getInteractionSource();
        if (interactionSource2 != null) {
            c13261.L$0 = dragLogic;
            c13261.L$1 = coroutineScope;
            c13261.L$2 = dragStarted;
            c13261.L$3 = start;
            c13261.label = 2;
            if (interactionSource2.emit(start, c13261) == coroutine_suspended) {
                return coroutine_suspended;
            }
            dragLogic2 = dragLogic;
            coroutineScope2 = coroutineScope;
            start2 = start;
            start = start2;
            coroutineScope = coroutineScope2;
            dragLogic = dragLogic2;
        }
        dragLogic.getDragStartInteraction().setValue(start);
        onDragStarted = dragLogic.getOnDragStarted();
        offsetM972boximpl = Offset.m972boximpl(dragStarted.getStartPoint());
        c13261.L$0 = null;
        c13261.L$1 = null;
        c13261.L$2 = null;
        c13261.L$3 = null;
        c13261.label = 3;
        if (onDragStarted.invoke(coroutineScope, offsetM972boximpl, c13261) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object processDragStop(@NotNull CoroutineScope coroutineScope, @NotNull DragEvent.DragStopped dragStopped, @NotNull Continuation<? super Unit> continuation) {
        C13271 c13271;
        DragLogic dragLogic;
        Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> onDragStopped;
        Float fBoxFloat;
        if (continuation instanceof C13271) {
            c13271 = (C13271) continuation;
            int i = c13271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13271.label = i - Integer.MIN_VALUE;
            } else {
                c13271 = new C13271(continuation);
            }
        } else {
            c13271 = new C13271(continuation);
        }
        Object obj = c13271.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = c13271.label;
        if (i2 != 0) {
            if (i2 == 1) {
                DragEvent.DragStopped dragStopped2 = (DragEvent.DragStopped) c13271.L$2;
                CoroutineScope coroutineScope2 = (CoroutineScope) c13271.L$1;
                dragLogic = (DragLogic) c13271.L$0;
                ResultKt.throwOnFailure(obj);
                dragStopped = dragStopped2;
                coroutineScope = coroutineScope2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        DragInteraction.Start value = getDragStartInteraction().getValue();
        if (value == null) {
            dragLogic = this;
        } else {
            MutableInteractionSource interactionSource = getInteractionSource();
            if (interactionSource != null) {
                DragInteraction.Stop stop = new DragInteraction.Stop(value);
                c13271.L$0 = this;
                c13271.L$1 = coroutineScope;
                c13271.L$2 = dragStopped;
                c13271.label = 1;
                if (interactionSource.emit(stop, c13271) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            dragLogic = this;
        }
        onDragStopped = dragLogic.getOnDragStopped();
        fBoxFloat = Boxing.boxFloat(dragStopped.getVelocity());
        c13271.L$0 = null;
        c13271.L$1 = null;
        c13271.L$2 = null;
        c13271.label = 2;
        if (onDragStopped.invoke(coroutineScope, fBoxFloat, c13271) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        dragLogic.getDragStartInteraction().setValue(null);
        onDragStopped = dragLogic.getOnDragStopped();
        fBoxFloat = Boxing.boxFloat(dragStopped.getVelocity());
        c13271.L$0 = null;
        c13271.L$1 = null;
        c13271.L$2 = null;
        c13271.label = 2;
        if (onDragStopped.invoke(coroutineScope, fBoxFloat, c13271) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
