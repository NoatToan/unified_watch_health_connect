package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aÑ\u0001\u0010\u001e\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2>\b\u0002\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192>\b\u0002\u0010\u001c\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\fø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aë\u0001\u0010\u001e\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\"2>\b\u0002\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192>\b\u0002\u0010\u001c\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010#\u001a[\u0010'\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010&*\u00020$2\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u00000%2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\"0%2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aQ\u0010/\u001a\u00020\f*\u00020$2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010&2\u0006\u0010+\u001a\u00020*2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u001e\u00101\u001a\u00020\u0013*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a!\u00105\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a!\u00105\u001a\u00020\u0001*\u0002062\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00104\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lkotlin/Function1;", "", "", "onDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "DraggableState", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", Constants.ENABLED, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "velocity", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "canDrag", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/runtime/State;", "Lkotlin/Pair;", "awaitDownAndSlop", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dragStart", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "velocityTracker", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "channel", "awaitDrag", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/Pair;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toOffset", "(FLandroidx/compose/foundation/gestures/Orientation;)J", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "toFloat", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class DraggableKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", i = {0, 0, 0, 0, 1, 2}, l = {296, 309, 311}, m = "awaitDownAndSlop", n = {"$this$awaitDownAndSlop", "canDrag", "startDragImmediately", "orientation", "initialDelta", "initialDelta"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
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
            return DraggableKt.awaitDownAndSlop(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13281 extends SuspendLambda implements Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
        public int label;

        public C13281(Continuation<? super C13281> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
            return m173invoked4ec7I(coroutineScope, offset.getPackedValue(), continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m173invoked4ec7I(@NotNull CoroutineScope coroutineScope, long j, @Nullable Continuation<? super Unit> continuation) {
            return new C13281(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
            return invoke(coroutineScope, f.floatValue(), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, float f, @Nullable Continuation<? super Unit> continuation) {
            return new AnonymousClass2(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$5, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass5 extends SuspendLambda implements Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
            return m174invoked4ec7I(coroutineScope, offset.getPackedValue(), continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m174invoked4ec7I(@NotNull CoroutineScope coroutineScope, long j, @Nullable Continuation<? super Unit> continuation) {
            return new AnonymousClass5(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$6, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$6", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass6 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
            return invoke(coroutineScope, f.floatValue(), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, float f, @Nullable Continuation<? super Unit> continuation) {
            return new AnonymousClass6(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final DraggableState DraggableState(@NotNull Function1<? super Float, Unit> function1) {
        return new DefaultDraggableState(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitDownAndSlop(AwaitPointerEventScope awaitPointerEventScope, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, Continuation<? super Pair<PointerInputChange, Float>> continuation) {
        AnonymousClass1 anonymousClass1;
        Ref.FloatRef floatRef;
        PointerInputChange pointerInputChange;
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
        Object objAwaitFirstDown = anonymousClass1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirstDown);
            anonymousClass1.L$0 = awaitPointerEventScope;
            anonymousClass1.L$1 = state;
            anonymousClass1.L$2 = state2;
            anonymousClass1.L$3 = orientation;
            anonymousClass1.label = 1;
            objAwaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, anonymousClass1);
            if (objAwaitFirstDown == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    floatRef = (Ref.FloatRef) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(objAwaitFirstDown);
                    pointerInputChange = (PointerInputChange) objAwaitFirstDown;
                    if (pointerInputChange != null) {
                        return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
                    }
                    return null;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef = (Ref.FloatRef) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objAwaitFirstDown);
                pointerInputChange = (PointerInputChange) objAwaitFirstDown;
                if (pointerInputChange != null) {
                    return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
                }
                return null;
            }
            orientation = (Orientation) anonymousClass1.L$3;
            state2 = (State) anonymousClass1.L$2;
            state = (State) anonymousClass1.L$1;
            awaitPointerEventScope = (AwaitPointerEventScope) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objAwaitFirstDown);
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) objAwaitFirstDown;
        if (!state.getValue().invoke(pointerInputChange2).booleanValue()) {
            return null;
        }
        if (state2.getValue().getA().booleanValue()) {
            return TuplesKt.to(pointerInputChange2, Boxing.boxFloat(0.0f));
        }
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postTouchSlop$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3, Float f) {
                invoke(pointerInputChange3, f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PointerInputChange pointerInputChange3, float f) {
                PointerEventKt.consumePositionChange(pointerInputChange3);
                floatRef2.element = f;
            }
        };
        if (orientation == Orientation.Vertical) {
            long id = pointerInputChange2.getId();
            anonymousClass1.L$0 = floatRef2;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.label = 2;
            objAwaitFirstDown = DragGestureDetectorKt.m158awaitVerticalTouchSlopOrCancellationjO51t88(awaitPointerEventScope, id, function2, anonymousClass1);
            if (objAwaitFirstDown == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
            pointerInputChange = (PointerInputChange) objAwaitFirstDown;
            if (pointerInputChange != null) {
                return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
            }
            return null;
        }
        long id2 = pointerInputChange2.getId();
        anonymousClass1.L$0 = floatRef2;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 3;
        objAwaitFirstDown = DragGestureDetectorKt.m154awaitHorizontalTouchSlopOrCancellationjO51t88(awaitPointerEventScope, id2, function2, anonymousClass1);
        if (objAwaitFirstDown == coroutine_suspended) {
            return coroutine_suspended;
        }
        floatRef = floatRef2;
        pointerInputChange = (PointerInputChange) objAwaitFirstDown;
        if (pointerInputChange != null) {
            return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitDrag(AwaitPointerEventScope awaitPointerEventScope, Pair<PointerInputChange, Float> pair, final VelocityTracker velocityTracker, final SendChannel<? super DragEvent> sendChannel, final boolean z, final Orientation orientation, Continuation<? super Boolean> continuation) {
        float fFloatValue = pair.getSecond().floatValue();
        PointerInputChange first = pair.getFirst();
        velocityTracker.m2456addPositionUv8p0NA(first.getUptimeMillis(), first.getPosition());
        sendChannel.mo4435trySendJP2dKIU(new DragEvent.DragStarted(Offset.m987minusMKHz9U(first.getPosition(), Offset.m990timestuRUvjQ(toOffset(fFloatValue, orientation), Math.signum(m171toFloat3MmeM6k(first.getPosition(), orientation)))), null));
        if (z) {
            fFloatValue *= -1;
        }
        sendChannel.mo4435trySendJP2dKIU(new DragEvent.DragDelta(fFloatValue));
        Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$dragTick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                invoke2(pointerInputChange);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PointerInputChange pointerInputChange) {
                velocityTracker.m2456addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition());
                float fM171toFloat3MmeM6k = DraggableKt.m171toFloat3MmeM6k(PointerEventKt.positionChange(pointerInputChange), orientation);
                PointerEventKt.consumePositionChange(pointerInputChange);
                SendChannel<DragEvent> sendChannel2 = sendChannel;
                if (z) {
                    fM171toFloat3MmeM6k *= -1;
                }
                sendChannel2.mo4435trySendJP2dKIU(new DragEvent.DragDelta(fM171toFloat3MmeM6k));
            }
        };
        return orientation == Orientation.Vertical ? DragGestureDetectorKt.m163verticalDragjO51t88(awaitPointerEventScope, first.getId(), function1, continuation) : DragGestureDetectorKt.m161horizontalDragjO51t88(awaitPointerEventScope, first.getId(), function1, continuation);
    }

    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull DraggableState draggableState, @NotNull Orientation orientation, boolean z, @Nullable MutableInteractionSource mutableInteractionSource, final boolean z2, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function4, boolean z3) {
        return draggable(modifier, draggableState, new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.3
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull PointerInputChange pointerInputChange) {
                return Boolean.TRUE;
            }
        }, orientation, z, mutableInteractionSource, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Boolean getA() {
                return Boolean.valueOf(z2);
            }
        }, function3, function4, z3);
    }

    @Composable
    @NotNull
    public static final DraggableState rememberDraggableState(@NotNull Function1<? super Float, Unit> function1, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1066220250);
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, i & 14);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = DraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) objRememberedValue;
        composer.endReplaceableGroup();
        return draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m171toFloat3MmeM6k(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m984getYimpl(j) : Offset.m983getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m172toFloatsFctU(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m3151getYimpl(j) : Velocity.m3150getXimpl(j);
    }

    private static final long toOffset(float f, Orientation orientation) {
        return orientation == Orientation.Vertical ? OffsetKt.Offset(0.0f, f) : OffsetKt.Offset(f, 0.0f);
    }

    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull final DraggableState draggableState, @NotNull final Function1<? super PointerInputChange, Boolean> function1, @NotNull final Orientation orientation, final boolean z, @Nullable final MutableInteractionSource mutableInteractionSource, @NotNull final Function0<Boolean> function0, @NotNull final Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull final Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function4, final boolean z2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("draggable");
                inspectorInfo.getProperties().set("canDrag", function1);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set(Constants.ENABLED, Boolean.valueOf(z));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("startDragImmediately", function0);
                inspectorInfo.getProperties().set("onDragStarted", function3);
                inspectorInfo.getProperties().set("onDragStopped", function4);
                inspectorInfo.getProperties().set("state", draggableState);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.8

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$8$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$8$2", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {233, 235, 237, Constant.PLAIN_TEXT_MAX_LENGTH, Mtu.ATT_MTU_MAX, 251}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "event", "$this$LaunchedEffect", "event", "$this$LaunchedEffect", "event", "$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Channel<DragEvent> $channel;
                public final /* synthetic */ State<DragLogic> $dragLogic$delegate;
                public final /* synthetic */ DraggableState $state;
                private /* synthetic */ Object L$0;
                public Object L$1;
                public Object L$2;
                public int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$8$2$2, reason: invalid class name and collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$8$2$2", f = "Draggable.kt", i = {0}, l = {240}, m = "invokeSuspend", n = {"$this$drag"}, s = {"L$0"})
                public static final class C00142 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ Channel<DragEvent> $channel;
                    public final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
                    private /* synthetic */ Object L$0;
                    public Object L$1;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00142(Ref.ObjectRef<DragEvent> objectRef, Channel<DragEvent> channel, Continuation<? super C00142> continuation) {
                        super(2, continuation);
                        this.$event = objectRef;
                        this.$channel = channel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C00142 c00142 = new C00142(this.$event, this.$channel, continuation);
                        c00142.L$0 = obj;
                        return c00142;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C00142) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005b -> B:24:0x0061). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        DragScope dragScope;
                        C00142 c00142;
                        DragEvent dragEvent;
                        C00142 c00143;
                        T t;
                        DragScope dragScope2;
                        Ref.ObjectRef<DragEvent> objectRef;
                        Object obj2;
                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            dragScope = (DragScope) this.L$0;
                            c00142 = this;
                            dragEvent = c00142.$event.element;
                            if (!(dragEvent instanceof DragEvent.DragStopped) || (dragEvent instanceof DragEvent.DragCancelled)) {
                                return Unit.INSTANCE;
                            }
                            DragEvent.DragDelta dragDelta = dragEvent instanceof DragEvent.DragDelta ? (DragEvent.DragDelta) dragEvent : null;
                            if (dragDelta != null) {
                                dragScope.dragBy(dragDelta.getDelta());
                            }
                            Ref.ObjectRef<DragEvent> objectRef2 = c00142.$event;
                            Channel<DragEvent> channel = c00142.$channel;
                            c00142.L$0 = dragScope;
                            c00142.L$1 = objectRef2;
                            c00142.label = 1;
                            Object objReceive = channel.receive(c00142);
                            if (objReceive == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Object obj3 = coroutine_suspended;
                            c00143 = c00142;
                            t = objReceive;
                            dragScope2 = dragScope;
                            objectRef = objectRef2;
                            obj2 = obj3;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Ref.ObjectRef<DragEvent> objectRef3 = (Ref.ObjectRef) this.L$1;
                            DragScope dragScope3 = (DragScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            dragScope2 = dragScope3;
                            objectRef = objectRef3;
                            obj2 = coroutine_suspended;
                            c00143 = this;
                            t = obj;
                        }
                        objectRef.element = t;
                        c00142 = c00143;
                        coroutine_suspended = obj2;
                        dragScope = dragScope2;
                        dragEvent = c00142.$event.element;
                        if (dragEvent instanceof DragEvent.DragStopped) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Channel<DragEvent> channel, DraggableState draggableState, State<DragLogic> state, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$channel = channel;
                    this.$state = draggableState;
                    this.$dragLogic$delegate = state;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, this.$state, this.$dragLogic$delegate, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:24:0x006e  */
                /* JADX WARN: Code duplicated, block: B:26:0x0084 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:27:0x0085  */
                /* JADX WARN: Code duplicated, block: B:30:0x0093  */
                /* JADX WARN: Code duplicated, block: B:31:0x0096  */
                /* JADX WARN: Code duplicated, block: B:33:0x00af A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
                /* JADX WARN: Code duplicated, block: B:37:0x00c9 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[Catch: CancellationException -> 0x0104, TryCatch #3 {CancellationException -> 0x0104, blocks: (B:39:0x00cc, B:41:0x00d8, B:46:0x00ee, B:48:0x00f2), top: B:67:0x00cc }] */
                /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:46:0x00ee A[Catch: CancellationException -> 0x0104, TryCatch #3 {CancellationException -> 0x0104, blocks: (B:39:0x00cc, B:41:0x00d8, B:46:0x00ee, B:48:0x00f2), top: B:67:0x00cc }] */
                /* JADX WARN: Code duplicated, block: B:48:0x00f2 A[Catch: CancellationException -> 0x0104, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0104, blocks: (B:39:0x00cc, B:41:0x00d8, B:46:0x00ee, B:48:0x00f2), top: B:67:0x00cc }] */
                /* JADX WARN: Code duplicated, block: B:50:0x00ff A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:51:0x0100  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v11, types: [T] */
                /* JADX WARN: Type inference failed for: r10v15, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r10v17 */
                /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
                /* JADX WARN: Type inference failed for: r10v2, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r10v20 */
                /* JADX WARN: Type inference failed for: r10v25 */
                /* JADX WARN: Type inference failed for: r10v26 */
                /* JADX WARN: Type inference failed for: r10v27 */
                /* JADX WARN: Type inference failed for: r10v29 */
                /* JADX WARN: Type inference failed for: r10v30 */
                /* JADX WARN: Type inference failed for: r10v4 */
                /* JADX WARN: Type inference failed for: r10v6 */
                /* JADX WARN: Type inference failed for: r10v7 */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v12 */
                /* JADX WARN: Type inference failed for: r1v17 */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
                /* JADX WARN: Type inference failed for: r1v31 */
                /* JADX WARN: Type inference failed for: r1v34 */
                /* JADX WARN: Type inference failed for: r1v41 */
                /* JADX WARN: Type inference failed for: r1v42 */
                /* JADX WARN: Type inference failed for: r1v43 */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r3v18 */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
                /* JADX WARN: Type inference failed for: r3v5 */
                /* JADX WARN: Type inference failed for: r4v10 */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v12 */
                /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
                /* JADX WARN: Type inference failed for: r4v7 */
                /* JADX WARN: Type inference failed for: r8v2 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0093 -> B:22:0x0068). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0100 -> B:22:0x0068). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011c -> B:22:0x0068). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                    /*
                        Method dump skipped, instruction units count: 310
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass8.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$8$3, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$8$3", f = "Draggable.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                public final /* synthetic */ Channel<DragEvent> $channel;
                public final /* synthetic */ boolean $enabled;
                public final /* synthetic */ Orientation $orientation;
                public final /* synthetic */ boolean $reverseDirection;
                public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                private /* synthetic */ Object L$0;
                public int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$8$3$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$8$3$1", f = "Draggable.kt", i = {}, l = {258}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ PointerInputScope $$this$pointerInput;
                    public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                    public final /* synthetic */ Channel<DragEvent> $channel;
                    public final /* synthetic */ Orientation $orientation;
                    public final /* synthetic */ boolean $reverseDirection;
                    public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                    private /* synthetic */ Object L$0;
                    public int label;

                    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$8$3$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$8$3$1$1", f = "Draggable.kt", i = {}, l = {259}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C00151 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ CoroutineScope $$this$coroutineScope;
                        public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                        public final /* synthetic */ Channel<DragEvent> $channel;
                        public final /* synthetic */ Orientation $orientation;
                        public final /* synthetic */ boolean $reverseDirection;
                        public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                        private /* synthetic */ Object L$0;
                        public int label;

                        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$8$3$1$1$1, reason: invalid class name and collision with other inner class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$8$3$1$1$1", f = "Draggable.kt", i = {0, 0, 1, 1}, l = {261, WeightingState.state_weight_detail}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "velocityTracker", "velocityTracker", "isDragSuccessful"}, s = {"L$0", "L$1", "L$0", "I$0"})
                        public static final class C00161 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ CoroutineScope $$this$coroutineScope;
                            public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                            public final /* synthetic */ Channel<DragEvent> $channel;
                            public final /* synthetic */ Orientation $orientation;
                            public final /* synthetic */ boolean $reverseDirection;
                            public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                            public int I$0;
                            private /* synthetic */ Object L$0;
                            public Object L$1;
                            public Object L$2;
                            public Object L$3;
                            public boolean Z$0;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C00161(State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z, CoroutineScope coroutineScope, Continuation<? super C00161> continuation) {
                                super(2, continuation);
                                this.$canDragState = state;
                                this.$startImmediatelyState = state2;
                                this.$orientation = orientation;
                                this.$channel = channel;
                                this.$reverseDirection = z;
                                this.$$this$coroutineScope = coroutineScope;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                C00161 c00161 = new C00161(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, this.$$this$coroutineScope, continuation);
                                c00161.L$0 = obj;
                                return c00161;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((C00161) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
                            /* JADX WARN: Code duplicated, block: B:38:0x00be  */
                            /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
                            /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
                            /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[Catch: all -> 0x00f3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f3, blocks: (B:53:0x00e4, B:58:0x00f2), top: B:69:0x00e4 }] */
                            /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
                            /* JADX WARN: Code duplicated, block: B:64:0x0103  */
                            /* JADX WARN: Code duplicated, block: B:66:0x010b  */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                AwaitPointerEventScope awaitPointerEventScope;
                                Object objAwaitDownAndSlop;
                                VelocityTracker velocityTracker;
                                boolean z;
                                VelocityTracker velocityTracker2;
                                Channel<DragEvent> channel;
                                boolean z2;
                                Orientation orientation;
                                CoroutineScope coroutineScope;
                                CoroutineScope coroutineScope2;
                                Object objAwaitDrag;
                                int i;
                                DragEvent dragStopped;
                                DragEvent dragStopped2;
                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                int i2 = this.label;
                                int i3 = 0;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                    VelocityTracker velocityTracker3 = new VelocityTracker();
                                    State<Function1<PointerInputChange, Boolean>> state = this.$canDragState;
                                    State<Function0<Boolean>> state2 = this.$startImmediatelyState;
                                    Orientation orientation2 = this.$orientation;
                                    this.L$0 = awaitPointerEventScope;
                                    this.L$1 = velocityTracker3;
                                    this.label = 1;
                                    objAwaitDownAndSlop = DraggableKt.awaitDownAndSlop(awaitPointerEventScope, state, state2, orientation2, this);
                                    if (objAwaitDownAndSlop == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    velocityTracker = velocityTracker3;
                                } else {
                                    if (i2 != 1) {
                                        if (i2 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        int i4 = this.I$0;
                                        z2 = this.Z$0;
                                        coroutineScope2 = (CoroutineScope) this.L$3;
                                        orientation = (Orientation) this.L$2;
                                        channel = (Channel) this.L$1;
                                        velocityTracker2 = (VelocityTracker) this.L$0;
                                        try {
                                            ResultKt.throwOnFailure(obj);
                                            z = z2;
                                            i = i4;
                                            objAwaitDrag = obj;
                                            try {
                                                if (((Boolean) objAwaitDrag).booleanValue()) {
                                                    dragStopped2 = new DragEvent.DragStopped(DraggableKt.m172toFloatsFctU(velocityTracker2.m2457calculateVelocity9UxMQ8M(), orientation) * (z ? -1 : 1));
                                                } else {
                                                    dragStopped2 = DragEvent.DragCancelled.INSTANCE;
                                                }
                                                channel.mo4435trySendJP2dKIU(dragStopped2);
                                            } catch (CancellationException e) {
                                                e = e;
                                                z2 = z;
                                                try {
                                                    if (!CoroutineScopeKt.isActive(coroutineScope2)) {
                                                        throw e;
                                                    }
                                                    channel.mo4435trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (i3 != 0) {
                                                        dragStopped = new DragEvent.DragStopped(DraggableKt.m172toFloatsFctU(velocityTracker2.m2457calculateVelocity9UxMQ8M(), orientation) * (z2 ? -1 : 1));
                                                    } else {
                                                        dragStopped = DragEvent.DragCancelled.INSTANCE;
                                                    }
                                                    channel.mo4435trySendJP2dKIU(dragStopped);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                i3 = i;
                                                z2 = z;
                                                if (i3 != 0) {
                                                    dragStopped = new DragEvent.DragStopped(DraggableKt.m172toFloatsFctU(velocityTracker2.m2457calculateVelocity9UxMQ8M(), orientation) * (z2 ? -1 : 1));
                                                } else {
                                                    dragStopped = DragEvent.DragCancelled.INSTANCE;
                                                }
                                                channel.mo4435trySendJP2dKIU(dragStopped);
                                                throw th;
                                            }
                                        } catch (CancellationException e2) {
                                            e = e2;
                                            if (!CoroutineScopeKt.isActive(coroutineScope2)) {
                                                throw e;
                                            }
                                            channel.mo4435trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE);
                                            return Unit.INSTANCE;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            i3 = i4;
                                            if (i3 != 0) {
                                                dragStopped = new DragEvent.DragStopped(DraggableKt.m172toFloatsFctU(velocityTracker2.m2457calculateVelocity9UxMQ8M(), orientation) * (z2 ? -1 : 1));
                                            } else {
                                                dragStopped = DragEvent.DragCancelled.INSTANCE;
                                            }
                                            channel.mo4435trySendJP2dKIU(dragStopped);
                                            throw th;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    VelocityTracker velocityTracker4 = (VelocityTracker) this.L$1;
                                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    objAwaitDownAndSlop = obj;
                                    velocityTracker = velocityTracker4;
                                    awaitPointerEventScope = awaitPointerEventScope2;
                                }
                                Pair pair = (Pair) objAwaitDownAndSlop;
                                if (pair != null) {
                                    Channel<DragEvent> channel2 = this.$channel;
                                    z = this.$reverseDirection;
                                    Orientation orientation3 = this.$orientation;
                                    CoroutineScope coroutineScope3 = this.$$this$coroutineScope;
                                    boolean z3 = z;
                                    try {
                                        try {
                                            this.L$0 = velocityTracker;
                                            this.L$1 = channel2;
                                            this.L$2 = orientation3;
                                            this.L$3 = coroutineScope3;
                                            this.Z$0 = z;
                                            this.I$0 = 0;
                                            this.label = 2;
                                            coroutineScope = coroutineScope3;
                                            try {
                                                objAwaitDrag = DraggableKt.awaitDrag(awaitPointerEventScope, pair, velocityTracker, channel2, z3, orientation3, this);
                                                if (objAwaitDrag == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                velocityTracker2 = velocityTracker;
                                                channel = channel2;
                                                orientation = orientation3;
                                                coroutineScope2 = coroutineScope;
                                                i = 0;
                                                if (((Boolean) objAwaitDrag).booleanValue()) {
                                                    dragStopped2 = new DragEvent.DragStopped(DraggableKt.m172toFloatsFctU(velocityTracker2.m2457calculateVelocity9UxMQ8M(), orientation) * (z ? -1 : 1));
                                                } else {
                                                    dragStopped2 = DragEvent.DragCancelled.INSTANCE;
                                                }
                                                channel.mo4435trySendJP2dKIU(dragStopped2);
                                            } catch (CancellationException e3) {
                                                e = e3;
                                                velocityTracker2 = velocityTracker;
                                                channel = channel2;
                                                z2 = z;
                                                orientation = orientation3;
                                                coroutineScope2 = coroutineScope;
                                                if (!CoroutineScopeKt.isActive(coroutineScope2)) {
                                                    throw e;
                                                }
                                                channel.mo4435trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE);
                                                return Unit.INSTANCE;
                                            }
                                        } catch (CancellationException e4) {
                                            e = e4;
                                            coroutineScope = coroutineScope3;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        velocityTracker2 = velocityTracker;
                                        channel = channel2;
                                        z2 = z;
                                        orientation = orientation3;
                                        if (i3 != 0) {
                                            dragStopped = new DragEvent.DragStopped(DraggableKt.m172toFloatsFctU(velocityTracker2.m2457calculateVelocity9UxMQ8M(), orientation) * (z2 ? -1 : 1));
                                        } else {
                                            dragStopped = DragEvent.DragCancelled.INSTANCE;
                                        }
                                        channel.mo4435trySendJP2dKIU(dragStopped);
                                        throw th;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C00151(State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z, CoroutineScope coroutineScope, Continuation<? super C00151> continuation) {
                            super(2, continuation);
                            this.$canDragState = state;
                            this.$startImmediatelyState = state2;
                            this.$orientation = orientation;
                            this.$channel = channel;
                            this.$reverseDirection = z;
                            this.$$this$coroutineScope = coroutineScope;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            C00151 c00151 = new C00151(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, this.$$this$coroutineScope, continuation);
                            c00151.L$0 = obj;
                            return c00151;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((C00151) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                                C00161 c00161 = new C00161(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, this.$$this$coroutineScope, null);
                                this.label = 1;
                                if (pointerInputScope.awaitPointerEventScope(c00161, this) == coroutine_suspended) {
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
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(PointerInputScope pointerInputScope, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$$this$pointerInput = pointerInputScope;
                        this.$canDragState = state;
                        this.$startImmediatelyState = state2;
                        this.$orientation = orientation;
                        this.$channel = channel;
                        this.$reverseDirection = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                            PointerInputScope pointerInputScope = this.$$this$pointerInput;
                            C00151 c00151 = new C00151(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, coroutineScope, null);
                            this.label = 1;
                            if (ForEachGestureKt.forEachGesture(pointerInputScope, c00151, this) == coroutine_suspended) {
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
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass3(boolean z, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z2, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$enabled = z;
                    this.$canDragState = state;
                    this.$startImmediatelyState = state2;
                    this.$orientation = orientation;
                    this.$channel = channel;
                    this.$reverseDirection = z2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        if (!this.$enabled) {
                            return Unit.INSTANCE;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
            public static final DragLogic m176invoke$lambda2(State<DragLogic> state) {
                return state.getValue();
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceableGroup(-1197726693);
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) objRememberedValue;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                EffectsKt.DisposableEffect(mutableInteractionSource2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.8.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        final MutableState<DragInteraction.Start> mutableState2 = mutableState;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$8$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                DragInteraction.Start start = (DragInteraction.Start) mutableState2.getValue();
                                if (start == null) {
                                    return;
                                }
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                if (mutableInteractionSource4 != null) {
                                    mutableInteractionSource4.tryEmit(new DragInteraction.Cancel(start));
                                }
                                mutableState2.setValue(null);
                            }
                        };
                    }
                }, composer, 0);
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Channel channel = (Channel) objRememberedValue2;
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composer, 0);
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1, composer, 0);
                State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(new DragLogic(function3, function4, mutableState, mutableInteractionSource), composer, 0);
                DraggableState draggableState2 = draggableState;
                EffectsKt.LaunchedEffect(draggableState2, new AnonymousClass2(channel, draggableState2, stateRememberUpdatedState3, null), composer, 0);
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.INSTANCE, new Object[]{orientation, Boolean.valueOf(z), Boolean.valueOf(z2)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass3(z, stateRememberUpdatedState2, stateRememberUpdatedState, orientation, channel, z2, null));
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }
        });
    }
}
