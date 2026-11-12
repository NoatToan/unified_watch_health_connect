package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.C;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
public final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ int $$dirty2;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ boolean $drawerGesturesEnabled;
    public final /* synthetic */ long $drawerScrimColor;
    public final /* synthetic */ Shape $drawerShape;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    public final /* synthetic */ CoroutineScope $scope;
    public final /* synthetic */ long $sheetBackgroundColor;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
    public final /* synthetic */ long $sheetContentColor;
    public final /* synthetic */ float $sheetElevation;
    public final /* synthetic */ boolean $sheetGesturesEnabled;
    public final /* synthetic */ float $sheetPeekHeight;
    public final /* synthetic */ Shape $sheetShape;
    public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1(BottomSheetScaffoldState bottomSheetScaffoldState, boolean z, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, boolean z2, Shape shape, float f, long j, long j2, long j3, int i, float f2, CoroutineScope coroutineScope, int i2, int i3, long j4, long j5, int i4, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function4, Shape shape2, long j6, long j7, float f3, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function7) {
        super(3);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$sheetGesturesEnabled = z;
        this.$drawerContent = function3;
        this.$drawerGesturesEnabled = z2;
        this.$drawerShape = shape;
        this.$drawerElevation = f;
        this.$drawerBackgroundColor = j;
        this.$drawerContentColor = j2;
        this.$drawerScrimColor = j3;
        this.$$dirty1 = i;
        this.$sheetPeekHeight = f2;
        this.$scope = coroutineScope;
        this.$floatingActionButtonPosition = i2;
        this.$$dirty = i3;
        this.$backgroundColor = j4;
        this.$contentColor = j5;
        this.$$dirty2 = i4;
        this.$topBar = function2;
        this.$content = function4;
        this.$sheetShape = shape2;
        this.$sheetBackgroundColor = j6;
        this.$sheetContentColor = j7;
        this.$sheetElevation = f3;
        this.$sheetContent = function5;
        this.$floatingActionButton = function6;
        this.$snackbarHost = function7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
    public static final float m599invoke$lambda2(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-3, reason: not valid java name */
    public static final void m600invoke$lambda3(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (((i2 & 91) ^ 18) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        float fM2934getMaxHeightimpl = Constraints.m2934getMaxHeightimpl(boxWithConstraintsScope.getConstraints());
        final float fMo193toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(this.$sheetPeekHeight);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Float.valueOf(fM2934getMaxHeightimpl), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, this.$scaffoldState.getBottomSheetState().getNestedScrollConnection(), null, 2, null);
        BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
        Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(fM2934getMaxHeightimpl - fMo193toPx0680j_4), BottomSheetValue.Collapsed), TuplesKt.to(Float.valueOf(fM2934getMaxHeightimpl - m599invoke$lambda2(mutableState)), BottomSheetValue.Expanded));
        Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(modifierNestedScroll$default, bottomSheetState, mapMapOf, Orientation.Vertical, (32 & 8) != 0 ? true : this.$sheetGesturesEnabled, (32 & 16) != 0 ? false : false, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final FixedThreshold invoke(T t, T t2) {
                return new FixedThreshold(Dp.m2965constructorimpl(56), null);
            }
        } : null, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
        final BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
        final CoroutineScope coroutineScope = this.$scope;
        final Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM819swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (fMo193toPx0680j_4 == BottomSheetScaffoldKt$BottomSheetScaffold$1.m599invoke$lambda2(mutableState)) {
                    return;
                }
                if (bottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                    final BottomSheetScaffoldState bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1.1

                        /* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
                        public static final class C00441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00441(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation<? super C00441> continuation) {
                                super(2, continuation);
                                this.$scaffoldState = bottomSheetScaffoldState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C00441(this.$scaffoldState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((C00441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
                                    this.label = 1;
                                    if (bottomSheetState.expand(this) == coroutine_suspended) {
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
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* JADX INFO: renamed from: invoke */
                        public final Boolean getA() {
                            if (bottomSheetScaffoldState2.getBottomSheetState().getConfirmStateChange$material_release().invoke(BottomSheetValue.Expanded).booleanValue()) {
                                e.f(coroutineScope2, null, null, new C00441(bottomSheetScaffoldState2, null), 3, null);
                            }
                            return Boolean.TRUE;
                        }
                    }, 1, null);
                } else {
                    final BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldState;
                    final CoroutineScope coroutineScope3 = coroutineScope;
                    SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1.2

                        /* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1$2$1, reason: invalid class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$scaffoldState = bottomSheetScaffoldState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$scaffoldState, continuation);
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
                                    BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
                                    this.label = 1;
                                    if (bottomSheetState.collapse(this) == coroutine_suspended) {
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
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* JADX INFO: renamed from: invoke */
                        public final Boolean getA() {
                            if (bottomSheetScaffoldState3.getBottomSheetState().getConfirmStateChange$material_release().invoke(BottomSheetValue.Collapsed).booleanValue()) {
                                e.f(coroutineScope3, null, null, new AnonymousClass1(bottomSheetScaffoldState3, null), 3, null);
                            }
                            return Boolean.TRUE;
                        }
                    }, 1, null);
                }
            }
        }, 1, null);
        final BottomSheetScaffoldState bottomSheetScaffoldState2 = this.$scaffoldState;
        final int i3 = this.$floatingActionButtonPosition;
        final int i4 = this.$$dirty;
        final long j = this.$backgroundColor;
        final long j2 = this.$contentColor;
        final int i5 = this.$$dirty2;
        final Function2<Composer, Integer, Unit> function2 = this.$topBar;
        final Function3<PaddingValues, Composer, Integer, Unit> function3 = this.$content;
        final float f = this.$sheetPeekHeight;
        final Shape shape = this.$sheetShape;
        final long j3 = this.$sheetBackgroundColor;
        final long j4 = this.$sheetContentColor;
        final float f2 = this.$sheetElevation;
        final int i6 = this.$$dirty1;
        final Function3<ColumnScope, Composer, Integer, Unit> function4 = this.$sheetContent;
        final Function2<Composer, Integer, Unit> function5 = this.$floatingActionButton;
        final Function3<SnackbarHostState, Composer, Integer, Unit> function6 = this.$snackbarHost;
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -819899396, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer2, int i7) {
                if (((i7 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                final long j5 = j;
                final long j6 = j2;
                final int i8 = i5;
                final Function2<Composer, Integer, Unit> function7 = function2;
                final int i9 = i4;
                final Function3<PaddingValues, Composer, Integer, Unit> function8 = function3;
                final float f3 = f;
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -819899585, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i10) {
                        if (((i10 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        long j7 = j5;
                        long j8 = j6;
                        final Function2<Composer, Integer, Unit> function9 = function7;
                        final int i11 = i9;
                        final Function3<PaddingValues, Composer, Integer, Unit> function10 = function8;
                        final float f4 = f3;
                        final int i12 = i8;
                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, -819900219, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.1.child.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i13) {
                                if (((i13 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Function2<Composer, Integer, Unit> function11 = function9;
                                int i14 = i11;
                                Function3<PaddingValues, Composer, Integer, Unit> function12 = function10;
                                float f5 = f4;
                                int i15 = i12;
                                composer4.startReplaceableGroup(-1113031299);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                composer4.startReplaceableGroup(1376089335);
                                Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer4.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                composer4.startReplaceableGroup(276693241);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer4.startReplaceableGroup(-1579943837);
                                if (function11 == null) {
                                    composer4.startReplaceableGroup(-1733618442);
                                } else {
                                    composer4.startReplaceableGroup(-1579943829);
                                    function11.invoke(composer4, Integer.valueOf((i14 >> 9) & 14));
                                }
                                composer4.endReplaceableGroup();
                                function12.invoke(PaddingKt.m278PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f5, 7, null), composer4, Integer.valueOf((i15 >> 3) & 112));
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                            }
                        });
                        int i13 = i8;
                        SurfaceKt.m815SurfaceFjzlyU((Modifier) null, (Shape) null, j7, j8, (BorderStroke) null, 0.0f, composableLambda3, composer3, 1572864 | ((i13 << 6) & 896) | ((i13 << 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 51);
                    }
                });
                final Modifier modifier = modifierSemantics$default;
                final float f4 = f;
                final MutableState<Float> mutableState2 = mutableState;
                final Shape shape2 = shape;
                final long j7 = j3;
                final long j8 = j4;
                final float f5 = f2;
                final int i10 = i4;
                final int i11 = i6;
                final Function3<ColumnScope, Composer, Integer, Unit> function9 = function4;
                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer2, -819899921, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i12) {
                        if (((i12 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        Modifier modifierM314requiredHeightInVpY3zN4$default = SizeKt.m314requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f4, 0.0f, 2, null);
                        final MutableState<Float> mutableState3 = mutableState2;
                        composer3.startReplaceableGroup(-3686930);
                        boolean zChanged = composer3.changed(mutableState3);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull LayoutCoordinates layoutCoordinates) {
                                    BottomSheetScaffoldKt$BottomSheetScaffold$1.m600invoke$lambda3(mutableState3, IntSize.m3084getHeightimpl(layoutCoordinates.mo2480getSizeYbymL2g()));
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM314requiredHeightInVpY3zN4$default, (Function1) objRememberedValue2);
                        Shape shape3 = shape2;
                        long j9 = j7;
                        long j10 = j8;
                        float f6 = f5;
                        final Function3<ColumnScope, Composer, Integer, Unit> function10 = function9;
                        final int i13 = i10;
                        ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composer3, -819896533, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.1.child.1.2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i14) {
                                if (((i14 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function11 = function10;
                                int i15 = (i13 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                composer4.startReplaceableGroup(-1113031299);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                int i16 = i15 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i16 & 112) | (i16 & 14));
                                composer4.startReplaceableGroup(1376089335);
                                Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
                                int i17 = (((i15 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                composer4.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, Integer.valueOf((i17 >> 3) & 112));
                                composer4.startReplaceableGroup(2058660585);
                                composer4.startReplaceableGroup(276693241);
                                if (((((i17 >> 9) & 14) & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                } else {
                                    function11.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i15 >> 6) & 112) | 6));
                                }
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                            }
                        });
                        int i14 = i10;
                        int i15 = i11;
                        SurfaceKt.m815SurfaceFjzlyU(modifierOnGloballyPositioned, shape3, j9, j10, (BorderStroke) null, f6, composableLambda4, composer3, 1572864 | ((i14 >> 21) & 112) | ((i15 << 6) & 896) | ((i15 << 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i14 >> 12) & 458752), 16);
                    }
                });
                final Function2<Composer, Integer, Unit> function10 = function5;
                final int i12 = i4;
                ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composer2, -819897194, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i13) {
                        if (((i13 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        Function2<Composer, Integer, Unit> function11 = function10;
                        int i14 = i12;
                        composer3.startReplaceableGroup(-1990474327);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(1376089335);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer3);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer3.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(2068277740);
                        if (function11 == null) {
                            composer3.startReplaceableGroup(-307898817);
                        } else {
                            composer3.startReplaceableGroup(2068277762);
                            function11.invoke(composer3, Integer.valueOf((i14 >> 15) & 14));
                        }
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                    }
                });
                final Function3<SnackbarHostState, Composer, Integer, Unit> function11 = function6;
                final BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                final int i13 = i4;
                BottomSheetScaffoldKt.m595BottomSheetScaffoldStackSlNgfk0(composableLambda2, composableLambda3, composableLambda4, ComposableLambdaKt.composableLambda(composer2, -819897283, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i14) {
                        if (((i14 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        Function3<SnackbarHostState, Composer, Integer, Unit> function12 = function11;
                        BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState3;
                        int i15 = i13;
                        composer3.startReplaceableGroup(-1990474327);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(1376089335);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer3);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer3.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(2068277895);
                        function12.invoke(bottomSheetScaffoldState4.getSnackbarHostState(), composer3, Integer.valueOf((i15 >> 9) & 112));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                    }
                }), bottomSheetScaffoldState2.getBottomSheetState().getOffset(), i3, composer2, (458752 & (i4 >> 3)) | 3510);
            }
        });
        if (this.$drawerContent == null) {
            composer.startReplaceableGroup(-249545651);
            composableLambda.invoke(composer, 6);
            composer.endReplaceableGroup();
            return;
        }
        composer.startReplaceableGroup(-249545614);
        Function3<ColumnScope, Composer, Integer, Unit> function7 = this.$drawerContent;
        DrawerState drawerState = this.$scaffoldState.getDrawerState();
        boolean z = this.$drawerGesturesEnabled;
        Shape shape2 = this.$drawerShape;
        float f3 = this.$drawerElevation;
        long j5 = this.$drawerBackgroundColor;
        long j6 = this.$drawerContentColor;
        long j7 = this.$drawerScrimColor;
        int i7 = this.$$dirty1;
        DrawerKt.m680ModalDrawerGs3lGvM(function7, null, drawerState, z, shape2, f3, j5, j6, j7, composableLambda, composer, ((i7 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i7 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i7 >> 3) & 57344) | ((i7 >> 3) & 458752) | ((i7 >> 3) & 3670016) | ((i7 >> 3) & 29360128) | ((i7 >> 3) & 234881024), 2);
        composer.endReplaceableGroup();
    }
}
