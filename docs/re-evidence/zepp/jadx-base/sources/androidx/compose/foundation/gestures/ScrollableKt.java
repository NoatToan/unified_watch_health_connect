package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u001aG\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001e\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\"\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", Constants.ENABLED, "reverseDirection", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "scrollable", "controller", "touchScrollImplementation", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollLogic", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scrollableNestedScrollConnection", "Landroidx/compose/foundation/gestures/ScrollScope;", "NoOpScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class ScrollableKt {

    @NotNull
    private static final ScrollScope NoOpScrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float pixels) {
            return pixels;
        }
    };

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$scrollableNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "foundation_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 implements NestedScrollConnection {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ State<ScrollingLogic> $scrollLogic;

        public AnonymousClass1(boolean z, State<ScrollingLogic> state) {
            this.$enabled = z;
            this.$scrollLogic = state;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public Object mo197onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
            ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1;
            long jM3161getZero9UxMQ8M;
            if (continuation instanceof ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) {
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = (ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) continuation;
                int i = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label = i - Integer.MIN_VALUE;
                } else {
                    scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = new ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(this, continuation);
                }
            } else {
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = new ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(this, continuation);
            }
            Object objM202doFlingAnimationQWom1Mo = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.result;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i2 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objM202doFlingAnimationQWom1Mo);
                if (this.$enabled) {
                    ScrollingLogic value = this.$scrollLogic.getValue();
                    scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.J$0 = j2;
                    scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label = 1;
                    objM202doFlingAnimationQWom1Mo = value.m202doFlingAnimationQWom1Mo(j2, scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1);
                    if (objM202doFlingAnimationQWom1Mo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    jM3161getZero9UxMQ8M = Velocity.INSTANCE.m3161getZero9UxMQ8M();
                }
                return Velocity.m3141boximpl(jM3161getZero9UxMQ8M);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.J$0;
            ResultKt.throwOnFailure(objM202doFlingAnimationQWom1Mo);
            jM3161getZero9UxMQ8M = Velocity.m3153minusAH228Gc(j2, ((Velocity) objM202doFlingAnimationQWom1Mo).getPackedValue());
            return Velocity.m3141boximpl(jM3161getZero9UxMQ8M);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public long mo198onPostScrollDzOQY0M(long consumed, long available, int source) {
            if (!this.$enabled) {
                return Offset.INSTANCE.m999getZeroF1C5BW0();
            }
            NestedScrollSource.Companion companion = NestedScrollSource.INSTANCE;
            if (NestedScrollSource.m2348equalsimpl0(source, companion.m2353getDragWNlRxjI()) ? true : NestedScrollSource.m2348equalsimpl0(source, companion.m2354getFlingWNlRxjI())) {
                return this.$scrollLogic.getValue().m203performRawScrollMKHz9U(available);
            }
            if (NestedScrollSource.m2348equalsimpl0(source, companion.m2355getRelocateWNlRxjI())) {
                return this.$scrollLogic.getValue().m204performRelocationScrollMKHz9U(available);
            }
            throw new IllegalStateException((((Object) NestedScrollSource.m2350toStringimpl(source)) + " scroll not supported.").toString());
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public Object mo199onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.DefaultImpls.m2339onPreFlingQWom1Mo(this, j, continuation);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public long mo200onPreScrollOzD1aCk(long j, int i) {
            return NestedScrollConnection.DefaultImpls.m2340onPreScrollOzD1aCk(this, j, i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$touchScrollImplementation$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$touchScrollImplementation$3", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<NestedScrollDispatcher> $nestedScrollDispatcher;
        public final /* synthetic */ State<ScrollingLogic> $scrollLogic;
        public /* synthetic */ float F$0;
        public int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$touchScrollImplementation$3$1, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$touchScrollImplementation$3$1", f = "Scrollable.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ State<ScrollingLogic> $scrollLogic;
            public final /* synthetic */ float $velocity;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(State<ScrollingLogic> state, float f, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$scrollLogic = state;
                this.$velocity = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$scrollLogic, this.$velocity, continuation);
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
                    ScrollingLogic value = this.$scrollLogic.getValue();
                    float f = this.$velocity;
                    this.label = 1;
                    if (value.onDragStopped(f, this) == coroutine_suspended) {
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
        public AnonymousClass3(MutableState<NestedScrollDispatcher> mutableState, State<ScrollingLogic> state, Continuation<? super AnonymousClass3> continuation) {
            super(3, continuation);
            this.$nestedScrollDispatcher = mutableState;
            this.$scrollLogic = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
            return invoke(coroutineScope, f.floatValue(), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, float f, @Nullable Continuation<? super Unit> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$nestedScrollDispatcher, this.$scrollLogic, continuation);
            anonymousClass3.F$0 = f;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            e.f(this.$nestedScrollDispatcher.getValue().getCoroutineScope(), null, null, new AnonymousClass1(this.$scrollLogic, this.F$0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Modifier scrollable(@NotNull Modifier modifier, @NotNull final ScrollableState scrollableState, @NotNull final Orientation orientation, final boolean z, final boolean z2, @Nullable final FlingBehavior flingBehavior, @Nullable final MutableInteractionSource mutableInteractionSource) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("scrollable");
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("state", scrollableState);
                inspectorInfo.getProperties().set(Constants.ENABLED, Boolean.valueOf(z));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("flingBehavior", flingBehavior);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.ScrollableKt.scrollable.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float invoke$reverseIfNeeded(float f, boolean z3) {
                return z3 ? f * (-1) : f;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceableGroup(536296550);
                Modifier modifier3 = ScrollableKt.touchScrollImplementation(modifier2, mutableInteractionSource, orientation, z2, scrollableState, flingBehavior, z, composer, i & 14);
                Orientation orientation2 = orientation;
                final ScrollableState scrollableState2 = scrollableState;
                final boolean z3 = z2;
                Modifier modifierMouseScrollable = AndroidScrollable_androidKt.mouseScrollable(modifier3, orientation2, new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableKt.scrollable.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        scrollableState2.dispatchRawDelta(AnonymousClass2.invoke$reverseIfNeeded(f, z3));
                    }
                });
                composer.endReplaceableGroup();
                return modifierMouseScrollable;
            }
        });
    }

    private static final NestedScrollConnection scrollableNestedScrollConnection(State<ScrollingLogic> state, boolean z) {
        return new AnonymousClass1(z, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final Modifier touchScrollImplementation(Modifier modifier, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z, final ScrollableState scrollableState, FlingBehavior flingBehavior, boolean z2, Composer composer, int i) {
        FlingBehavior flingBehavior2;
        composer.startReplaceableGroup(-442064097);
        if (flingBehavior == null) {
            composer.startReplaceableGroup(-442063791);
            FlingBehavior flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composer, 0);
            composer.endReplaceableGroup();
            flingBehavior2 = flingBehavior3;
        } else {
            composer.startReplaceableGroup(-442063827);
            composer.endReplaceableGroup();
            flingBehavior2 = flingBehavior;
        }
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(new NestedScrollDispatcher(), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new ScrollingLogic(orientation, z, mutableState, scrollableState, flingBehavior2), composer, 0);
        Boolean boolValueOf = Boolean.valueOf(z2);
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(boolValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = scrollableNestedScrollConnection(stateRememberUpdatedState, z2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) objRememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new ScrollDraggableState(stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        Modifier modifierNestedScroll = NestedScrollModifierKt.nestedScroll(DraggableKt.draggable(modifier, (ScrollDraggableState) objRememberedValue3, new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt.touchScrollImplementation.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull PointerInputChange pointerInputChange) {
                return Boolean.valueOf(!PointerType.m2426equalsimpl0(pointerInputChange.getType(), PointerType.INSTANCE.m2431getMouseT8wyACA()));
            }
        }, orientation, (64 & 8) != 0 ? true : z2, (64 & 16) != 0 ? null : mutableInteractionSource, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt.touchScrollImplementation.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(scrollableState.isScrollInProgress());
            }
        }, (64 & 64) != 0 ? new DraggableKt.AnonymousClass5(null) : null, (64 & 128) != 0 ? new DraggableKt.AnonymousClass6(null) : new AnonymousClass3(mutableState, stateRememberUpdatedState, null), (64 & 256) != 0 ? false : false), nestedScrollConnection, (NestedScrollDispatcher) mutableState.getValue());
        composer.endReplaceableGroup();
        return modifierNestedScroll;
    }
}
