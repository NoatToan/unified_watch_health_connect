package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014Jt\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042P\u0010\u0010\u001aL\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "Landroidx/compose/material/InputPhase;", "inputState", "", "showLabel", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "Landroidx/compose/ui/unit/Dp;", "indicatorWidth", "placeholderOpacity", "", "Landroidx/compose/runtime/Composable;", "content", "Transition", "(Landroidx/compose/material/InputPhase;ZLkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
final class TextFieldTransitionScope {

    @NotNull
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            iArr[InputPhase.Focused.ordinal()] = 1;
            iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    /* JADX INFO: renamed from: Transition$lambda-1, reason: not valid java name */
    private static final float m865Transition$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: renamed from: Transition$lambda-3, reason: not valid java name */
    private static final float m866Transition$lambda3(State<Dp> state) {
        return state.getValue().m2979unboximpl();
    }

    /* JADX INFO: renamed from: Transition$lambda-5, reason: not valid java name */
    private static final float m867Transition$lambda5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01db  */
    /* JADX WARN: Code duplicated, block: B:87:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
    @Composable
    public final void Transition(@NotNull final InputPhase inputPhase, final boolean z, @NotNull final Function5<? super Float, ? super Dp, ? super Float, ? super Composer, ? super Integer, Unit> function5, @Nullable Composer composer, final int i) {
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        float f4;
        int i4;
        float f5;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1836668067);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(inputPhase) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(function5) ? 256 : 128;
        }
        if (((i2 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Transition transitionUpdateTransition = TransitionKt.updateTransition(inputPhase, (String) null, composerStartRestartGroup, i2 & 14, 2);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i6) {
                    composer2.startReplaceableGroup(337279065);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    composer2.endReplaceableGroup();
                    return tweenSpecTween$default;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1399888299);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(1847721878);
            InputPhase inputPhase2 = (InputPhase) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(337279121);
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i6 = iArr[inputPhase2.ordinal()];
            float f6 = 0.0f;
            if (i6 == 1) {
                f = 1.0f;
            } else if (i6 != 2) {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf = Float.valueOf(f);
            InputPhase inputPhase3 = (InputPhase) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(337279121);
            int i7 = iArr[inputPhase3.ordinal()];
            if (i7 == 1) {
                f2 = 1.0f;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$indicatorWidth$2 textFieldTransitionScope$Transition$indicatorWidth$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Dp>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$indicatorWidth$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Dp> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Dp> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i8) {
                    composer2.startReplaceableGroup(337279393);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    composer2.endReplaceableGroup();
                    return tweenSpecTween$default;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-307434510);
            TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(Dp.INSTANCE);
            composerStartRestartGroup.startReplaceableGroup(1847721878);
            InputPhase inputPhase4 = (InputPhase) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(337279449);
            int i8 = iArr[inputPhase4.ordinal()];
            if (i8 == 1) {
                i3 = 3;
                f3 = TextFieldImplKt.IndicatorFocusedWidth;
            } else if (i8 != 2) {
                i3 = 3;
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f3 = TextFieldImplKt.IndicatorUnfocusedWidth;
            } else {
                i3 = 3;
                f3 = TextFieldImplKt.IndicatorUnfocusedWidth;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Dp dpM2963boximpl = Dp.m2963boximpl(f3);
            InputPhase inputPhase5 = (InputPhase) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(337279449);
            int i9 = iArr[inputPhase5.ordinal()];
            if (i9 == 1) {
                f4 = TextFieldImplKt.IndicatorFocusedWidth;
            } else {
                if (i9 != 2 && i9 != i3) {
                    throw new NoWhenBranchMatchedException();
                }
                f4 = TextFieldImplKt.IndicatorUnfocusedWidth;
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, dpM2963boximpl, Dp.m2963boximpl(f4), textFieldTransitionScope$Transition$indicatorWidth$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "DpAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i10) {
                    FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                    composer2.startReplaceableGroup(337279789);
                    InputPhase inputPhase6 = InputPhase.Focused;
                    InputPhase inputPhase7 = InputPhase.UnfocusedEmpty;
                    if (segment.isTransitioningTo(inputPhase6, inputPhase7)) {
                        finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                    } else {
                        finiteAnimationSpecTween = (segment.isTransitioningTo(inputPhase7, inputPhase6) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase7)) ? AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing()) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    composer2.endReplaceableGroup();
                    return finiteAnimationSpecTween;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1399888299);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(1847721878);
            InputPhase inputPhase6 = (InputPhase) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(337280593);
            int i10 = iArr[inputPhase6.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    i4 = 3;
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i4 = 3;
                    if (z) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Float fValueOf2 = Float.valueOf(f5);
                    InputPhase inputPhase7 = (InputPhase) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(337280593);
                    i5 = iArr[inputPhase7.ordinal()];
                    if (i5 == 1) {
                        f6 = 1.0f;
                    } else if (i5 != 2) {
                        if (i5 != i4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z) {
                        f6 = 1.0f;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f6), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "FloatAnimation", composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function5.invoke(Float.valueOf(m865Transition$lambda1(stateCreateTransitionAnimation)), Dp.m2963boximpl(m866Transition$lambda3(stateCreateTransitionAnimation2)), Float.valueOf(m867Transition$lambda5(stateCreateTransitionAnimation3)), composerStartRestartGroup, Integer.valueOf((i2 << 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                }
                f5 = 0.0f;
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf3 = Float.valueOf(f5);
                InputPhase inputPhase8 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(337280593);
                i5 = iArr[inputPhase8.ordinal()];
                if (i5 == 1) {
                    f6 = 1.0f;
                } else if (i5 != 2) {
                    if (i5 != i4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z) {
                    f6 = 1.0f;
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f6), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "FloatAnimation", composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function5.invoke(Float.valueOf(m865Transition$lambda1(stateCreateTransitionAnimation)), Dp.m2963boximpl(m866Transition$lambda3(stateCreateTransitionAnimation2)), Float.valueOf(m867Transition$lambda5(stateCreateTransitionAnimation4)), composerStartRestartGroup, Integer.valueOf((i2 << 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            } else {
                i4 = 3;
            }
            f5 = 1.0f;
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf4 = Float.valueOf(f5);
            InputPhase inputPhase9 = (InputPhase) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(337280593);
            i5 = iArr[inputPhase9.ordinal()];
            if (i5 == 1) {
                f6 = 1.0f;
            } else if (i5 != 2) {
                if (i5 != i4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z) {
                f6 = 1.0f;
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf4, Float.valueOf(f6), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            function5.invoke(Float.valueOf(m865Transition$lambda1(stateCreateTransitionAnimation)), Dp.m2963boximpl(m866Transition$lambda3(stateCreateTransitionAnimation2)), Float.valueOf(m867Transition$lambda5(stateCreateTransitionAnimation5)), composerStartRestartGroup, Integer.valueOf((i2 << 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldTransitionScope.Transition.1
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

            public final void invoke(@Nullable Composer composer2, int i11) {
                TextFieldTransitionScope.this.Transition(inputPhase, z, function5, composer2, i | 1);
            }
        });
    }
}
