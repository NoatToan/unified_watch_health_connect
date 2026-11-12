package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0007\u001a\"\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0007\u001a>\u0010\u0010\u001a\u00020\u00042!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0007ø\u0001\u0000\u001a>\u0010\u0012\u001a\u00020\u00072!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0007ø\u0001\u0000\u001aT\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007ø\u0001\u0000\u001aT\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00132#\b\u0002\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007ø\u0001\u0000\u001aT\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u001c2#\b\u0002\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001d0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007ø\u0001\u0000\u001aT\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020!2#\b\u0002\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u001d0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007ø\u0001\u0000\u001aT\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u001c2#\b\u0002\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001d0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007ø\u0001\u0000\u001aT\u0010(\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020!2#\b\u0002\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u001d0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007ø\u0001\u0000\u001a@\u0010*\u001a\u00020\u00042#\b\u0002\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001d0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0007ø\u0001\u0000\u001a@\u0010,\u001a\u00020\u00042#\b\u0002\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u001d0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0007ø\u0001\u0000\u001a@\u0010.\u001a\u00020\u00072#\b\u0002\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001d0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0007ø\u0001\u0000\u001a@\u00100\u001a\u00020\u00072#\b\u0002\u0010/\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u001d0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0007ø\u0001\u0000\u001a\f\u00101\u001a\u00020\u0013*\u00020\u001cH\u0002\u001a\f\u00101\u001a\u00020\u0013*\u00020!H\u0002\u001a)\u00107\u001a\u000206*\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0007H\u0001¢\u0006\u0004\b7\u00108\u001a:\u0010<\u001a\u000206*\u0002062\f\u00109\u001a\b\u0012\u0004\u0012\u000203022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:H\u0002\u001a:\u0010@\u001a\u000206*\u0002062\f\u00109\u001a\b\u0012\u0004\u0012\u000203022\u000e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0:2\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0:H\u0002\"\u001f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0A8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bB\u0010C\"\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0A8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bD\u0010C\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"", "initialAlpha", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "Landroidx/compose/animation/EnterTransition;", "fadeIn", "targetAlpha", "Landroidx/compose/animation/ExitTransition;", "fadeOut", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "fullSize", "Landroidx/compose/ui/unit/IntOffset;", "initialOffset", "slideIn", "targetOffset", "slideOut", "Landroidx/compose/ui/Alignment;", "expandFrom", "initialSize", "", "clip", "expandIn", "shrinkTowards", "targetSize", "shrinkOut", "Landroidx/compose/ui/Alignment$Horizontal;", "", "fullWidth", "initialWidth", "expandHorizontally", "Landroidx/compose/ui/Alignment$Vertical;", "fullHeight", "initialHeight", "expandVertically", "targetWidth", "shrinkHorizontally", "targetHeight", "shrinkVertically", "initialOffsetX", "slideInHorizontally", "initialOffsetY", "slideInVertically", "targetOffsetX", "slideOutHorizontally", "targetOffsetY", "slideOutVertically", "toAlignment", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "Landroidx/compose/ui/Modifier;", "createModifier", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "transition", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/Slide;", "slideInOut", "Landroidx/compose/animation/ChangeSize;", "expand", "shrink", "shrinkExpand", "Landroidx/compose/animation/core/SpringSpec;", "defaultOffsetAnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "defaultSizeAnimationSpec", "animation_release"}, k = 2, mv = {1, 5, 1})
public final class EnterExitTransitionKt {

    @NotNull
    private static final SpringSpec<IntOffset> defaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m3034boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);

    @NotNull
    private static final SpringSpec<IntSize> defaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m3077boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x010f  */
    @Composable
    @NotNull
    public static final Modifier createModifier(@NotNull Transition<EnterExitState> transition, @NotNull final EnterTransition enterTransition, @NotNull final ExitTransition exitTransition, @Nullable Composer composer, int i) {
        float alpha;
        composer.startReplaceableGroup(1657234972);
        Modifier modifierShrinkExpand = shrinkExpand(slideInOut(Modifier.INSTANCE, transition, SnapshotStateKt.rememberUpdatedState(enterTransition.getData().getSlide(), composer, 0), SnapshotStateKt.rememberUpdatedState(exitTransition.getData().getSlide(), composer, 0)), transition, SnapshotStateKt.rememberUpdatedState(enterTransition.getData().getChangeSize(), composer, 0), SnapshotStateKt.rememberUpdatedState(exitTransition.getData().getChangeSize(), composer, 0));
        int i2 = i & 14;
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        if (transition.getCurrentState() == transition.getTargetState()) {
            m44createModifier$lambda2(mutableState, false);
        } else if (enterTransition.getData().getFade() != null || exitTransition.getData().getFade() != null) {
            m44createModifier$lambda2(mutableState, true);
        }
        if (m43createModifier$lambda1(mutableState)) {
            composer.startReplaceableGroup(1657236134);
            Function3<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>> function3 = new Function3<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<EnterExitState> segment, @Nullable Composer composer2, int i3) {
                    FiniteAnimationSpec<Float> finiteAnimationSpecSpring$default;
                    Fade fade;
                    composer2.startReplaceableGroup(-9524727);
                    EnterExitState enterExitState = EnterExitState.PreEnter;
                    EnterExitState enterExitState2 = EnterExitState.Visible;
                    if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                        Fade fade2 = enterTransition.getData().getFade();
                        finiteAnimationSpecSpring$default = fade2 == null ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : fade2.getAnimationSpec();
                    } else {
                        finiteAnimationSpecSpring$default = (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit) || (fade = exitTransition.getData().getFade()) == null) ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : fade.getAnimationSpec();
                    }
                    composer2.endReplaceableGroup();
                    return finiteAnimationSpecSpring$default;
                }
            };
            int i3 = i2 | 384;
            composer.startReplaceableGroup(1399888299);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            int i4 = i3 & 14;
            int i5 = i3 << 3;
            int i6 = (i5 & 57344) | i4 | (i5 & 896) | (i5 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
            composer.startReplaceableGroup(1847721878);
            EnterExitState currentState = transition.getCurrentState();
            composer.startReplaceableGroup(-9524285);
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i7 = iArr[currentState.ordinal()];
            float alpha2 = 1.0f;
            if (i7 == 1) {
                alpha = 1.0f;
            } else if (i7 == 2) {
                Fade fade = enterTransition.getData().getFade();
                if (fade == null) {
                    alpha = 1.0f;
                } else {
                    alpha = fade.getAlpha();
                }
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Fade fade2 = exitTransition.getData().getFade();
                if (fade2 == null) {
                    alpha = 1.0f;
                } else {
                    alpha = fade2.getAlpha();
                }
            }
            composer.endReplaceableGroup();
            Float fValueOf = Float.valueOf(alpha);
            EnterExitState targetState = transition.getTargetState();
            composer.startReplaceableGroup(-9524285);
            int i8 = iArr[targetState.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    Fade fade3 = enterTransition.getData().getFade();
                    if (fade3 != null) {
                        alpha2 = fade3.getAlpha();
                    }
                } else {
                    if (i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Fade fade4 = exitTransition.getData().getFade();
                    if (fade4 != null) {
                        alpha2 = fade4.getAlpha();
                    }
                }
            }
            composer.endReplaceableGroup();
            final State stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(alpha2), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & 112)), vectorConverter, "alpha", composer, (i6 & 14) | ((i6 << 9) & 57344) | ((i6 << 6) & 458752));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            modifierShrinkExpand = GraphicsLayerModifierKt.graphicsLayer(modifierShrinkExpand, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt.createModifier.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.setAlpha(EnterExitTransitionKt.m45createModifier$lambda4(stateCreateTransitionAnimation));
                }
            });
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1657236970);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        return modifierShrinkExpand;
    }

    /* JADX INFO: renamed from: createModifier$lambda-1, reason: not valid java name */
    private static final boolean m43createModifier$lambda1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: createModifier$lambda-2, reason: not valid java name */
    private static final void m44createModifier$lambda2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createModifier$lambda-4, reason: not valid java name */
    public static final float m45createModifier$lambda4(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final EnterTransition expandHorizontally(@NotNull Alignment.Horizontal horizontal, @NotNull final Function1<? super Integer, Integer> function1, @NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        return expandIn(toAlignment(horizontal), new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3077boximpl(m46invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m46invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(function1.invoke(Integer.valueOf(IntSize.m3085getWidthimpl(j))).intValue(), IntSize.m3084getHeightimpl(j));
            }
        }, finiteAnimationSpec, z);
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(Alignment.Horizontal horizontal, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m3077boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return expandHorizontally(horizontal, function1, finiteAnimationSpec, z);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final EnterTransition expandIn(@NotNull Alignment alignment, @NotNull Function1<? super IntSize, IntSize> function1, @NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, function1, finiteAnimationSpec, z), 3, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 2) != 0) {
            function1 = new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandIn.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m3077boximpl(m47invokemzRDjE0(intSize.getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m47invokemzRDjE0(long j) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m3077boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return expandIn(alignment, function1, finiteAnimationSpec, z);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final EnterTransition expandVertically(@NotNull Alignment.Vertical vertical, @NotNull final Function1<? super Integer, Integer> function1, @NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        return expandIn(toAlignment(vertical), new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3077boximpl(m48invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m48invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m3085getWidthimpl(j), function1.invoke(Integer.valueOf(IntSize.m3084getHeightimpl(j))).intValue());
            }
        }, finiteAnimationSpec, z);
    }

    public static /* synthetic */ EnterTransition expandVertically$default(Alignment.Vertical vertical, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m3077boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return expandVertically(vertical, function1, finiteAnimationSpec, z);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final EnterTransition fadeIn(float f, @NotNull FiniteAnimationSpec<Float> finiteAnimationSpec) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, 6, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(float f, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return fadeIn(f, finiteAnimationSpec);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final ExitTransition fadeOut(float f, @NotNull FiniteAnimationSpec<Float> finiteAnimationSpec) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, 6, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(float f, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return fadeOut(f, finiteAnimationSpec);
    }

    private static final Modifier shrinkExpand(Modifier modifier, final Transition<EnterExitState> transition, final State<ChangeSize> state, final State<ChangeSize> state2) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkExpand.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
            private static final boolean m49invoke$lambda1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
            private static final void m50invoke$lambda2(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                Modifier modifierThen;
                Alignment alignment;
                composer.startReplaceableGroup(-1553223082);
                Transition<EnterExitState> transition2 = transition;
                composer.startReplaceableGroup(-3686930);
                boolean zChanged = composer.changed(transition2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                boolean z = true;
                if (transition.getCurrentState() == transition.getTargetState()) {
                    m50invoke$lambda2(mutableState, false);
                } else if (state.getValue() != null || state2.getValue() != null) {
                    m50invoke$lambda2(mutableState, true);
                }
                if (m49invoke$lambda1(mutableState)) {
                    composer.startReplaceableGroup(-1553222564);
                    boolean zIsTransitioningTo = transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible);
                    State<ChangeSize> state3 = state;
                    State<ChangeSize> state4 = state2;
                    if (zIsTransitioningTo) {
                        ChangeSize value = state3.getValue();
                        if (value == null && (value = state4.getValue()) == null) {
                            alignment = null;
                        } else {
                            alignment = value.getAlignment();
                        }
                    } else {
                        ChangeSize value2 = state4.getValue();
                        if (value2 == null && (value2 = state3.getValue()) == null) {
                            alignment = null;
                        } else {
                            alignment = value2.getAlignment();
                        }
                    }
                    State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(alignment, composer, 0);
                    Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), "shrink/expand", composer, 448, 0);
                    composer.startMovableGroup(-1553221953, Boolean.valueOf(transition.getCurrentState() == transition.getTargetState()));
                    Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), "InterruptionHandlingOffset", composer, 448, 0);
                    composer.endMovableGroup();
                    Transition<EnterExitState> transition3 = transition;
                    State<ChangeSize> state5 = state;
                    State<ChangeSize> state6 = state2;
                    composer.startReplaceableGroup(-3686930);
                    boolean zChanged2 = composer.changed(transition3);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ExpandShrinkModifier(deferredAnimationCreateDeferredAnimation, deferredAnimationCreateDeferredAnimation2, state5, state6, stateRememberUpdatedState);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    ExpandShrinkModifier expandShrinkModifier = (ExpandShrinkModifier) objRememberedValue2;
                    if (transition.getCurrentState() == transition.getTargetState()) {
                        expandShrinkModifier.setCurrentAlignment(null);
                    } else if (expandShrinkModifier.getCurrentAlignment() == null) {
                        Alignment topStart = (Alignment) stateRememberUpdatedState.getValue();
                        if (topStart == null) {
                            topStart = Alignment.INSTANCE.getTopStart();
                        }
                        expandShrinkModifier.setCurrentAlignment(topStart);
                    }
                    ChangeSize value3 = state.getValue();
                    if (!((value3 == null || value3.getClip()) ? false : true)) {
                        ChangeSize value4 = state2.getValue();
                        if (!((value4 == null || value4.getClip()) ? false : true)) {
                            z = false;
                        }
                    }
                    Modifier modifierClipToBounds = Modifier.INSTANCE;
                    if (!z) {
                        modifierClipToBounds = ClipKt.clipToBounds(modifierClipToBounds);
                    }
                    modifierThen = modifier2.then(modifierClipToBounds).then(expandShrinkModifier);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-1553220993);
                    composer.endReplaceableGroup();
                    modifierThen = modifier2;
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final ExitTransition shrinkHorizontally(@NotNull Alignment.Horizontal horizontal, @NotNull final Function1<? super Integer, Integer> function1, @NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        return shrinkOut(toAlignment(horizontal), new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3077boximpl(m51invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m51invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(function1.invoke(Integer.valueOf(IntSize.m3085getWidthimpl(j))).intValue(), IntSize.m3084getHeightimpl(j));
            }
        }, finiteAnimationSpec, z);
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(Alignment.Horizontal horizontal, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m3077boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return shrinkHorizontally(horizontal, function1, finiteAnimationSpec, z);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final ExitTransition shrinkOut(@NotNull Alignment alignment, @NotNull Function1<? super IntSize, IntSize> function1, @NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, function1, finiteAnimationSpec, z), 3, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 2) != 0) {
            function1 = new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m3077boximpl(m52invokemzRDjE0(intSize.getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m52invokemzRDjE0(long j) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m3077boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return shrinkOut(alignment, function1, finiteAnimationSpec, z);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final ExitTransition shrinkVertically(@NotNull Alignment.Vertical vertical, @NotNull final Function1<? super Integer, Integer> function1, @NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        return shrinkOut(toAlignment(vertical), new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3077boximpl(m53invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m53invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m3085getWidthimpl(j), function1.invoke(Integer.valueOf(IntSize.m3084getHeightimpl(j))).intValue());
            }
        }, finiteAnimationSpec, z);
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(Alignment.Vertical vertical, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m3077boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return shrinkVertically(vertical, function1, finiteAnimationSpec, z);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final EnterTransition slideIn(@NotNull Function1<? super IntSize, IntOffset> function1, @NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(function1, finiteAnimationSpec), null, 5, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(Function1 function1, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m3034boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        return slideIn(function1, finiteAnimationSpec);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final EnterTransition slideInHorizontally(@NotNull final Function1<? super Integer, Integer> function1, @NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return slideIn(new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3034boximpl(m54invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m54invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(function1.invoke(Integer.valueOf(IntSize.m3085getWidthimpl(j))).intValue(), 0);
            }
        }, finiteAnimationSpec);
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(Function1 function1, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1
                @NotNull
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m3034boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        return slideInHorizontally(function1, finiteAnimationSpec);
    }

    private static final Modifier slideInOut(Modifier modifier, final Transition<EnterExitState> transition, final State<Slide> state, final State<Slide> state2) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInOut.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
            private static final boolean m55invoke$lambda1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
            private static final void m56invoke$lambda2(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceableGroup(905891773);
                Transition<EnterExitState> transition2 = transition;
                composer.startReplaceableGroup(-3686930);
                boolean zChanged = composer.changed(transition2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                if (transition.getCurrentState() == transition.getTargetState()) {
                    m56invoke$lambda2(mutableState, false);
                } else if (state.getValue() != null || state2.getValue() != null) {
                    m56invoke$lambda2(mutableState, true);
                }
                if (m55invoke$lambda1(mutableState)) {
                    composer.startReplaceableGroup(905892282);
                    Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), "slide", composer, 448, 0);
                    Transition<EnterExitState> transition3 = transition;
                    State<Slide> state3 = state;
                    State<Slide> state4 = state2;
                    composer.startReplaceableGroup(-3686930);
                    boolean zChanged2 = composer.changed(transition3);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new SlideModifier(deferredAnimationCreateDeferredAnimation, state3, state4);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    modifier2 = modifier2.then((SlideModifier) objRememberedValue2);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(905892530);
                    composer.endReplaceableGroup();
                }
                composer.endReplaceableGroup();
                return modifier2;
            }
        }, 1, null);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final EnterTransition slideInVertically(@NotNull final Function1<? super Integer, Integer> function1, @NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return slideIn(new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3034boximpl(m57invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m57invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(0, function1.invoke(Integer.valueOf(IntSize.m3084getHeightimpl(j))).intValue());
            }
        }, finiteAnimationSpec);
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(Function1 function1, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1
                @NotNull
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m3034boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        return slideInVertically(function1, finiteAnimationSpec);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final ExitTransition slideOut(@NotNull Function1<? super IntSize, IntOffset> function1, @NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return new ExitTransitionImpl(new TransitionData(null, new Slide(function1, finiteAnimationSpec), null, 5, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(Function1 function1, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m3034boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        return slideOut(function1, finiteAnimationSpec);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final ExitTransition slideOutHorizontally(@NotNull final Function1<? super Integer, Integer> function1, @NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return slideOut(new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3034boximpl(m58invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m58invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(function1.invoke(Integer.valueOf(IntSize.m3085getWidthimpl(j))).intValue(), 0);
            }
        }, finiteAnimationSpec);
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(Function1 function1, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1
                @NotNull
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m3034boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        return slideOutHorizontally(function1, finiteAnimationSpec);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    public static final ExitTransition slideOutVertically(@NotNull final Function1<? super Integer, Integer> function1, @NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return slideOut(new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3034boximpl(m59invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m59invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(0, function1.invoke(Integer.valueOf(IntSize.m3084getHeightimpl(j))).intValue());
            }
        }, finiteAnimationSpec);
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(Function1 function1, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1
                @NotNull
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m3034boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        return slideOutVertically(function1, finiteAnimationSpec);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.INSTANCE;
        if (Intrinsics.areEqual(horizontal, companion.getStart())) {
            return companion.getCenterStart();
        }
        return Intrinsics.areEqual(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.INSTANCE;
        if (Intrinsics.areEqual(vertical, companion.getTop())) {
            return companion.getTopCenter();
        }
        return Intrinsics.areEqual(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }
}
