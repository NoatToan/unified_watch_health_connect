package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0085\u0001\u0010\u0012\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t21\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aU\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142>\b\u0002\u0010\u001a\u001a8\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00190\u000bH\u0007ø\u0001\u0000\u001a\u0015\u0010 \u001a\u00020\u0006*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0087\u0004\u001a\u0087\u0001\u0010\u0012\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t21\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {ExifInterface.LATITUDE_SOUTH, "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Lkotlin/ParameterName;", "name", "", "Landroidx/compose/runtime/Composable;", "content", "AnimatedContent", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "", "clip", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeAnimationSpec", "Landroidx/compose/animation/SizeTransform;", "SizeTransform", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "exit", JsonPOJOBuilder.DEFAULT_WITH_PREFIX, "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "animation_release"}, k = 2, mv = {1, 5, 1})
public final class AnimatedContentKt {
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalAnimationApi
    public static final <S> void AnimatedContent(final S s, @Nullable Modifier modifier, @Nullable Function1<? super AnimatedContentScope<S>, ContentTransform> function1, @Nullable Alignment alignment, @NotNull final Function4<? super AnimatedVisibilityScope, ? super S, ? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Function1<? super AnimatedContentScope<S>, ContentTransform> function2;
        Alignment alignment2;
        int i4;
        Modifier modifier3;
        Function1<? super AnimatedContentScope<S>, ContentTransform> function3;
        Alignment topStart;
        int i5;
        Alignment alignment3;
        final Function1<? super AnimatedContentScope<S>, ContentTransform> function5;
        final Alignment alignment4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-441539576);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    function2 = function1;
                    int i7 = composerStartRestartGroup.changed(function2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    function2 = function1;
                }
                i3 |= i7;
            } else {
                function2 = function1;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    alignment2 = alignment;
                    int i8 = composerStartRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    alignment2 = alignment;
                }
                i3 |= i8;
            } else {
                alignment2 = alignment;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(function4)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if (((46811 & i3) ^ 9362) == 0 || !composerStartRestartGroup.getSkipping()) {
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        function3 = new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final ContentTransform invoke(@NotNull AnimatedContentScope<S> animatedContentScope) {
                                return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(0.0f, AnimationSpecKt.tween$default(220, 90, null, 4, null), 1, null), EnterExitTransitionKt.fadeOut$default(0.0f, AnimationSpecKt.tween$default(90, 0, null, 6, null), 1, null));
                            }
                        };
                        i3 &= -897;
                    } else {
                        function3 = function2;
                    }
                    if ((i2 & 8) != 0) {
                        topStart = Alignment.INSTANCE.getTopStart();
                        i3 &= -7169;
                    } else {
                        topStart = alignment2;
                    }
                    composerStartRestartGroup.endDefaults();
                    Modifier modifier5 = modifier3;
                    i5 = i3;
                    alignment3 = topStart;
                    function2 = function3;
                    modifier2 = modifier5;
                } else {
                    composerStartRestartGroup.skipCurrentGroup();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i5 = i3;
                    alignment3 = alignment2;
                }
                AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, "AnimatedContent", composerStartRestartGroup, (i5 & 8) | 48 | (i5 & 14), 0), modifier2, (Function1) function2, alignment3, (Function4) function4, composerStartRestartGroup, (i5 & 112) | (i5 & 896) | (i5 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i5 & 57344), 0);
                function5 = function2;
                Modifier modifier6 = modifier2;
                alignment4 = alignment3;
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                function5 = function2;
                alignment4 = alignment2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.2
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    AnimatedContentKt.AnimatedContent(s, modifier4, function5, alignment4, function4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changed(function2)) {
                }
                i3 |= i7;
            } else {
                function2 = function1;
            }
            i3 |= i7;
        } else {
            function2 = function1;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                alignment2 = alignment;
                if (composerStartRestartGroup.changed(alignment2)) {
                }
                i3 |= i8;
            } else {
                alignment2 = alignment;
            }
            i3 |= i8;
        } else {
            alignment2 = alignment;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            if (composerStartRestartGroup.changed(function4)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if (((46811 & i3) ^ 9362) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    function3 = new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final ContentTransform invoke(@NotNull AnimatedContentScope<S> animatedContentScope) {
                            return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(0.0f, AnimationSpecKt.tween$default(220, 90, null, 4, null), 1, null), EnterExitTransitionKt.fadeOut$default(0.0f, AnimationSpecKt.tween$default(90, 0, null, 6, null), 1, null));
                        }
                    };
                    i3 &= -897;
                } else {
                    function3 = function2;
                }
                if ((i2 & 8) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= -7169;
                } else {
                    topStart = alignment2;
                }
                composerStartRestartGroup.endDefaults();
                Modifier modifier7 = modifier3;
                i5 = i3;
                alignment3 = topStart;
                function2 = function3;
                modifier2 = modifier7;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    function3 = new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final ContentTransform invoke(@NotNull AnimatedContentScope<S> animatedContentScope) {
                            return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(0.0f, AnimationSpecKt.tween$default(220, 90, null, 4, null), 1, null), EnterExitTransitionKt.fadeOut$default(0.0f, AnimationSpecKt.tween$default(90, 0, null, 6, null), 1, null));
                        }
                    };
                    i3 &= -897;
                } else {
                    function3 = function2;
                }
                if ((i2 & 8) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= -7169;
                } else {
                    topStart = alignment2;
                }
                composerStartRestartGroup.endDefaults();
                Modifier modifier8 = modifier3;
                i5 = i3;
                alignment3 = topStart;
                function2 = function3;
                modifier2 = modifier8;
            }
            AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, "AnimatedContent", composerStartRestartGroup, (i5 & 8) | 48 | (i5 & 14), 0), modifier2, (Function1) function2, alignment3, (Function4) function4, composerStartRestartGroup, (i5 & 112) | (i5 & 896) | (i5 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i5 & 57344), 0);
            function5 = function2;
            Modifier modifier9 = modifier2;
            alignment4 = alignment3;
            modifier4 = modifier9;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    function3 = new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final ContentTransform invoke(@NotNull AnimatedContentScope<S> animatedContentScope) {
                            return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(0.0f, AnimationSpecKt.tween$default(220, 90, null, 4, null), 1, null), EnterExitTransitionKt.fadeOut$default(0.0f, AnimationSpecKt.tween$default(90, 0, null, 6, null), 1, null));
                        }
                    };
                    i3 &= -897;
                } else {
                    function3 = function2;
                }
                if ((i2 & 8) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= -7169;
                } else {
                    topStart = alignment2;
                }
                composerStartRestartGroup.endDefaults();
                Modifier modifier10 = modifier3;
                i5 = i3;
                alignment3 = topStart;
                function2 = function3;
                modifier2 = modifier10;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    function3 = new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final ContentTransform invoke(@NotNull AnimatedContentScope<S> animatedContentScope) {
                            return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(0.0f, AnimationSpecKt.tween$default(220, 90, null, 4, null), 1, null), EnterExitTransitionKt.fadeOut$default(0.0f, AnimationSpecKt.tween$default(90, 0, null, 6, null), 1, null));
                        }
                    };
                    i3 &= -897;
                } else {
                    function3 = function2;
                }
                if ((i2 & 8) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= -7169;
                } else {
                    topStart = alignment2;
                }
                composerStartRestartGroup.endDefaults();
                Modifier modifier11 = modifier3;
                i5 = i3;
                alignment3 = topStart;
                function2 = function3;
                modifier2 = modifier11;
            }
            AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, "AnimatedContent", composerStartRestartGroup, (i5 & 8) | 48 | (i5 & 14), 0), modifier2, (Function1) function2, alignment3, (Function4) function4, composerStartRestartGroup, (i5 & 112) | (i5 & 896) | (i5 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i5 & 57344), 0);
            function5 = function2;
            Modifier modifier12 = modifier2;
            alignment4 = alignment3;
            modifier4 = modifier12;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.2
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

            public final void invoke(@Nullable Composer composer2, int i9) {
                AnimatedContentKt.AnimatedContent(s, modifier4, function5, alignment4, function4, composer2, i | 1, i2);
            }
        });
    }

    @ExperimentalAnimationApi
    @NotNull
    public static final SizeTransform SizeTransform(boolean z, @NotNull Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> function2) {
        return new SizeTransformImpl(z, function2);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = new Function2<IntSize, IntSize, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt.SizeTransform.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                    return m7invokeTemP2vQ(intSize.getPackedValue(), intSize2.getPackedValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final SpringSpec<IntSize> m7invokeTemP2vQ(long j, long j2) {
                    return AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m3077boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);
                }
            };
        }
        return SizeTransform(z, function2);
    }

    @ExperimentalAnimationApi
    @NotNull
    public static final ContentTransform with(@NotNull EnterTransition enterTransition, @NotNull ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0161  */
    /* JADX WARN: Code duplicated, block: B:104:0x017d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0183  */
    /* JADX WARN: Code duplicated, block: B:108:0x0191  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:129:0x0230  */
    /* JADX WARN: Code duplicated, block: B:132:0x0254  */
    /* JADX WARN: Code duplicated, block: B:134:0x025c  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:147:0x030f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0319  */
    /* JADX WARN: Code duplicated, block: B:154:0x0346  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0137  */
    /* JADX WARN: Code duplicated, block: B:99:0x0159  */
    @Composable
    @ExperimentalAnimationApi
    public static final <S> void AnimatedContent(@NotNull final Transition<S> transition, @Nullable Modifier modifier, @Nullable Function1<? super AnimatedContentScope<S>, ContentTransform> function1, @Nullable Alignment alignment, @NotNull final Function4<? super AnimatedVisibilityScope, ? super S, ? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Function1<? super AnimatedContentScope<S>, ContentTransform> function2;
        final Alignment alignment2;
        int i4;
        Modifier modifier3;
        Function1<? super AnimatedContentScope<S>, ContentTransform> function3;
        Alignment topStart;
        int i5;
        Modifier modifier4;
        Function1<? super AnimatedContentScope<S>, ContentTransform> function5;
        Alignment alignment3;
        LayoutDirection layoutDirection;
        boolean zChanged;
        Object objRememberedValue;
        AnimatedContentScope animatedContentScope;
        boolean zChanged2;
        Object objRememberedValue2;
        SnapshotStateList snapshotStateList;
        boolean zChanged3;
        Object objRememberedValue3;
        Map map;
        final SnapshotStateList snapshotStateList2;
        AnimatedContentScope animatedContentScope2;
        Alignment alignment4;
        int i6;
        Map map2;
        final AnimatedContentScope animatedContentScope3;
        boolean zChanged4;
        ContentTransform contentTransformRememberedValue;
        Function0<ComposeUiNode> constructor;
        Function2 function6;
        int size;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-441518579);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 1;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    function2 = function1;
                    int i8 = composerStartRestartGroup.changed(function2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    function2 = function1;
                }
                i3 |= i8;
            } else {
                function2 = function1;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    alignment2 = alignment;
                    int i9 = composerStartRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i3 |= i9;
                } else {
                    alignment2 = alignment;
                }
                i3 |= i9;
            } else {
                alignment2 = alignment;
            }
            if ((i2 & 8) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(function4)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if (((46811 & i3) ^ 9362) != 0 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipCurrentGroup();
                    if ((i2 & 2) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -7169;
                    }
                    i5 = i3;
                    modifier4 = modifier2;
                    function5 = function2;
                    alignment3 = alignment2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        function3 = new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.3
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final ContentTransform invoke(@NotNull AnimatedContentScope<S> animatedContentScope4) {
                                return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(0.0f, AnimationSpecKt.tween$default(220, 90, null, 4, null), 1, null), EnterExitTransitionKt.fadeOut$default(0.0f, AnimationSpecKt.tween$default(90, 0, null, 6, null), 1, null));
                            }
                        };
                        i3 &= -897;
                    } else {
                        function3 = function2;
                    }
                    if ((i2 & 4) != 0) {
                        topStart = Alignment.INSTANCE.getTopStart();
                        i3 &= -7169;
                    } else {
                        topStart = alignment2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i5 = i3;
                    modifier4 = modifier3;
                    function5 = function3;
                    alignment3 = topStart;
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(transition);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new AnimatedContentScope(transition, alignment3, layoutDirection);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                animatedContentScope = (AnimatedContentScope) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged2 = composerStartRestartGroup.changed(transition);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged3 = composerStartRestartGroup.changed(transition);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new LinkedHashMap();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                map = (Map) objRememberedValue3;
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    if (snapshotStateList.size() == 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition.getCurrentState())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition.getCurrentState());
                    }
                    if (map.size() == 1 || map.containsKey(transition.getCurrentState())) {
                        map.clear();
                    }
                    animatedContentScope.setContentAlignment$animation_release(alignment3);
                    animatedContentScope.setLayoutDirection$animation_release(layoutDirection);
                }
                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && !snapshotStateList.contains(transition.getTargetState())) {
                    snapshotStateList.add(transition.getTargetState());
                }
                if (!map.containsKey(transition.getTargetState()) || (size = snapshotStateList.size() - 1) < 0) {
                    snapshotStateList2 = snapshotStateList;
                    animatedContentScope2 = animatedContentScope;
                    alignment4 = alignment3;
                    i6 = 0;
                    map2 = map;
                } else {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        final T t = snapshotStateList.get(i10);
                        int i12 = size;
                        alignment4 = alignment3;
                        map2 = map;
                        final int i13 = i5;
                        snapshotStateList2 = snapshotStateList;
                        final Function1<? super AnimatedContentScope<S>, ContentTransform> function7 = function5;
                        int i14 = i5;
                        final AnimatedContentScope animatedContentScope4 = animatedContentScope;
                        i6 = 0;
                        animatedContentScope2 = animatedContentScope;
                        map2.put(t, ComposableLambdaKt.composableLambdaInstance(-985562708, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
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

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i15) {
                                if (((i15 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Function1<AnimatedContentScope<S>, ContentTransform> function8 = function7;
                                Object obj = animatedContentScope4;
                                composer2.startReplaceableGroup(-3687241);
                                ContentTransform contentTransformRememberedValue2 = composer2.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (contentTransformRememberedValue2 == companion.getEmpty()) {
                                    contentTransformRememberedValue2 = function8.invoke(obj);
                                    composer2.updateRememberedValue(contentTransformRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                final ContentTransform contentTransform = (ContentTransform) contentTransformRememberedValue2;
                                Boolean boolValueOf = Boolean.valueOf(Intrinsics.areEqual(transition.getSegment().getTargetState(), t));
                                Function1<AnimatedContentScope<S>, ContentTransform> function9 = function7;
                                Object obj2 = animatedContentScope4;
                                composer2.startReplaceableGroup(-3686930);
                                boolean zChanged5 = composer2.changed(boolValueOf);
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged5 || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = function9.invoke(obj2).getInitialContentExit();
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                ExitTransition exitTransition = (ExitTransition) objRememberedValue4;
                                S s = t;
                                Transition<S> transition2 = transition;
                                composer2.startReplaceableGroup(-3687241);
                                Object objRememberedValue5 = composer2.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new AnimatedContentScope.ChildData(Intrinsics.areEqual(s, transition2.getTargetState()));
                                    composer2.updateRememberedValue(objRememberedValue5);
                                }
                                composer2.endReplaceableGroup();
                                AnimatedContentScope.ChildData childData = (AnimatedContentScope.ChildData) objRememberedValue5;
                                EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                                Modifier modifierLayout = LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1.1
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                        return m5invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                    }

                                    @NotNull
                                    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                                    public final MeasureResult m5invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                                        final Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(j);
                                        int width = placeableMo2468measureBRTryo0.getWidth();
                                        int height = placeableMo2468measureBRTryo0.getHeight();
                                        final ContentTransform contentTransform2 = contentTransform;
                                        return MeasureScope.DefaultImpls.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.4.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                invoke2(placementScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                placementScope.place(placeableMo2468measureBRTryo0, 0, 0, contentTransform2.getTargetContentZIndex());
                                            }
                                        }, 4, null);
                                    }
                                });
                                childData.setTarget(Intrinsics.areEqual(t, transition.getTargetState()));
                                Unit unit = Unit.INSTANCE;
                                Modifier modifierThen = modifierLayout.then(childData);
                                Transition<S> transition3 = transition;
                                final S s2 = t;
                                Function1<S, Boolean> function10 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function1
                                    @NotNull
                                    public final Boolean invoke(S s3) {
                                        return Boolean.valueOf(Intrinsics.areEqual(s3, s2));
                                    }
                                };
                                final AnimatedContentScope<S> animatedContentScope5 = animatedContentScope4;
                                final S s3 = t;
                                final Function4<AnimatedVisibilityScope, S, Composer, Integer, Unit> function11 = function4;
                                final int i16 = i13;
                                final SnapshotStateList<S> snapshotStateList3 = snapshotStateList2;
                                AnimatedVisibilityKt.AnimatedVisibility(transition3, function10, modifierThen, targetContentEnter, exitTransition, ComposableLambdaKt.composableLambda(composer2, -819916650, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1.4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                        invoke(animatedVisibilityScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Composable
                                    public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer3, int i17) {
                                        if ((i17 & 14) == 0) {
                                            i17 |= composer3.changed(animatedVisibilityScope) ? 4 : 2;
                                        }
                                        if (((i17 & 91) ^ 18) == 0 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        final SnapshotStateList<S> snapshotStateList4 = snapshotStateList3;
                                        final S s4 = s3;
                                        final AnimatedContentScope<S> animatedContentScope6 = animatedContentScope5;
                                        int i18 = i17 & 14;
                                        EffectsKt.DisposableEffect(animatedVisibilityScope, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.4.1.4.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            @NotNull
                                            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                                                final SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                                final S s5 = s4;
                                                final AnimatedContentScope<S> animatedContentScope7 = animatedContentScope6;
                                                return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1$4$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        snapshotStateList5.remove(s5);
                                                        animatedContentScope7.getTargetSizeMap$animation_release().remove(s5);
                                                    }
                                                };
                                            }
                                        }, composer3, i18);
                                        animatedContentScope5.getTargetSizeMap$animation_release().put(s3, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation_release());
                                        function11.invoke(animatedVisibilityScope, s3, composer3, Integer.valueOf(i18 | ((i16 >> 6) & 896)));
                                    }
                                }), composer2, (i13 & 14) | 196608, 0);
                            }
                        }));
                        if (i11 > i12) {
                            break;
                        }
                        i5 = i14;
                        i10 = i11;
                        size = i12;
                        map = map2;
                        snapshotStateList = snapshotStateList2;
                        animatedContentScope = animatedContentScope2;
                        alignment3 = alignment4;
                    }
                }
                Transition.Segment<S> segment = transition.getSegment();
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                animatedContentScope3 = animatedContentScope2;
                zChanged4 = composerStartRestartGroup.changed(segment) | composerStartRestartGroup.changed(animatedContentScope3);
                contentTransformRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged4 || contentTransformRememberedValue == Composer.INSTANCE.getEmpty()) {
                    contentTransformRememberedValue = function5.invoke(animatedContentScope3);
                    composerStartRestartGroup.updateRememberedValue(contentTransformRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen = modifier4.then(animatedContentScope3.createSizeAnimationModifier$animation_release((ContentTransform) contentTransformRememberedValue, composerStartRestartGroup, 72));
                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.5
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                        return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i15);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                        return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i15);
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
                    public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        Placeable placeable;
                        int size2 = list.size();
                        final Placeable[] placeableArr = new Placeable[size2];
                        int size3 = list.size() - 1;
                        Placeable placeable2 = null;
                        int i15 = 1;
                        if (size3 >= 0) {
                            int i16 = 0;
                            while (true) {
                                int i17 = i16 + 1;
                                Measurable measurable = list.get(i16);
                                Object parentData = measurable.getParentData();
                                AnimatedContentScope.ChildData childData = parentData instanceof AnimatedContentScope.ChildData ? (AnimatedContentScope.ChildData) parentData : null;
                                if (childData != null && childData.isTarget()) {
                                    placeableArr[i16] = measurable.mo2468measureBRTryo0(j);
                                }
                                if (i17 > size3) {
                                    break;
                                }
                                i16 = i17;
                            }
                        }
                        int size4 = list.size() - 1;
                        if (size4 >= 0) {
                            int i18 = 0;
                            while (true) {
                                int i19 = i18 + 1;
                                Measurable measurable2 = list.get(i18);
                                if (placeableArr[i18] == null) {
                                    placeableArr[i18] = measurable2.mo2468measureBRTryo0(j);
                                }
                                if (i19 > size4) {
                                    break;
                                }
                                i18 = i19;
                            }
                        }
                        if (!(size2 == 0)) {
                            placeable = placeableArr[0];
                            int lastIndex = ArraysKt___ArraysKt.getLastIndex(placeableArr);
                            if (lastIndex != 0) {
                                int width = placeable == null ? 0 : placeable.getWidth();
                                if (1 <= lastIndex) {
                                    int i20 = 1;
                                    while (true) {
                                        Placeable placeable3 = placeableArr[i20];
                                        int width2 = placeable3 == null ? 0 : placeable3.getWidth();
                                        if (width < width2) {
                                            placeable = placeable3;
                                            width = width2;
                                        }
                                        if (i20 == lastIndex) {
                                            break;
                                        }
                                        i20++;
                                    }
                                }
                            }
                        } else {
                            placeable = null;
                        }
                        final int width3 = placeable == null ? 0 : placeable.getWidth();
                        if (!(size2 == 0)) {
                            placeable2 = placeableArr[0];
                            int lastIndex2 = ArraysKt___ArraysKt.getLastIndex(placeableArr);
                            if (lastIndex2 != 0) {
                                int height = placeable2 == null ? 0 : placeable2.getHeight();
                                if (1 <= lastIndex2) {
                                    while (true) {
                                        Placeable placeable4 = placeableArr[i15];
                                        int height2 = placeable4 == null ? 0 : placeable4.getHeight();
                                        if (height < height2) {
                                            placeable2 = placeable4;
                                            height = height2;
                                        }
                                        if (i15 == lastIndex2) {
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                            }
                        }
                        final int height3 = placeable2 == null ? 0 : placeable2.getHeight();
                        animatedContentScope3.m19setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(width3, height3));
                        final AnimatedContentScope<S> animatedContentScope5 = animatedContentScope3;
                        return MeasureScope.DefaultImpls.layout$default(measureScope, width3, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$measure$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                Placeable[] placeableArr2 = placeableArr;
                                AnimatedContentScope<S> animatedContentScope6 = animatedContentScope5;
                                int i21 = width3;
                                int i22 = height3;
                                for (Placeable placeable5 : placeableArr2) {
                                    if (placeable5 != null) {
                                        long jMo915alignKFBX0sM = animatedContentScope6.getContentAlignment().mo915alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i21, i22), LayoutDirection.Ltr);
                                        Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m3043getXimpl(jMo915alignKFBX0sM), IntOffset.m3044getYimpl(jMo915alignKFBX0sM), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                        return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i15);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                        return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i15);
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i6));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-740843327);
                for (Object obj : snapshotStateList2) {
                    composerStartRestartGroup.startMovableGroup(-1739566579, obj);
                    function6 = (Function2) map2.get(obj);
                    if (function6 == null) {
                        composerStartRestartGroup.startReplaceableGroup(1908012326);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1739566533);
                        function6.invoke(composerStartRestartGroup, Integer.valueOf(i6));
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endMovableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                alignment2 = alignment4;
                modifier2 = modifier4;
                function2 = function5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.7
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

                public final void invoke(@Nullable Composer composer2, int i15) {
                    AnimatedContentKt.AnimatedContent((Transition) transition, modifier2, (Function1) function2, alignment2, (Function4) function4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changed(function2)) {
                }
                i3 |= i8;
            } else {
                function2 = function1;
            }
            i3 |= i8;
        } else {
            function2 = function1;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                alignment2 = alignment;
                if (composerStartRestartGroup.changed(alignment2)) {
                }
                i3 |= i9;
            } else {
                alignment2 = alignment;
            }
            i3 |= i9;
        } else {
            alignment2 = alignment;
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changed(function4)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if (((46811 & i3) ^ 9362) != 0) {
            if ((i & 1) == 0) {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    function3 = new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.3
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final ContentTransform invoke(@NotNull AnimatedContentScope<S> animatedContentScope5) {
                            return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(0.0f, AnimationSpecKt.tween$default(220, 90, null, 4, null), 1, null), EnterExitTransitionKt.fadeOut$default(0.0f, AnimationSpecKt.tween$default(90, 0, null, 6, null), 1, null));
                        }
                    };
                    i3 &= -897;
                } else {
                    function3 = function2;
                }
                if ((i2 & 4) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= -7169;
                } else {
                    topStart = alignment2;
                }
                composerStartRestartGroup.endDefaults();
                i5 = i3;
                modifier4 = modifier3;
                function5 = function3;
                alignment3 = topStart;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    function3 = new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.3
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final ContentTransform invoke(@NotNull AnimatedContentScope<S> animatedContentScope5) {
                            return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(0.0f, AnimationSpecKt.tween$default(220, 90, null, 4, null), 1, null), EnterExitTransitionKt.fadeOut$default(0.0f, AnimationSpecKt.tween$default(90, 0, null, 6, null), 1, null));
                        }
                    };
                    i3 &= -897;
                } else {
                    function3 = function2;
                }
                if ((i2 & 4) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= -7169;
                } else {
                    topStart = alignment2;
                }
                composerStartRestartGroup.endDefaults();
                i5 = i3;
                modifier4 = modifier3;
                function5 = function3;
                alignment3 = topStart;
            }
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged = composerStartRestartGroup.changed(transition);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new AnimatedContentScope(transition, alignment3, layoutDirection);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new AnimatedContentScope(transition, alignment3, layoutDirection);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            animatedContentScope = (AnimatedContentScope) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged2 = composerStartRestartGroup.changed(transition);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged2) {
                objRememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged3 = composerStartRestartGroup.changed(transition);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChanged3) {
                objRememberedValue3 = new LinkedHashMap();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new LinkedHashMap();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            map = (Map) objRememberedValue3;
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                if (snapshotStateList.size() == 1) {
                    snapshotStateList.clear();
                    snapshotStateList.add(transition.getCurrentState());
                } else {
                    snapshotStateList.clear();
                    snapshotStateList.add(transition.getCurrentState());
                }
                if (map.size() == 1) {
                    map.clear();
                } else {
                    map.clear();
                }
                animatedContentScope.setContentAlignment$animation_release(alignment3);
                animatedContentScope.setLayoutDirection$animation_release(layoutDirection);
            }
            if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                snapshotStateList.add(transition.getTargetState());
            }
            if (map.containsKey(transition.getTargetState())) {
                snapshotStateList2 = snapshotStateList;
                animatedContentScope2 = animatedContentScope;
                alignment4 = alignment3;
                i6 = 0;
                map2 = map;
            } else {
                snapshotStateList2 = snapshotStateList;
                animatedContentScope2 = animatedContentScope;
                alignment4 = alignment3;
                i6 = 0;
                map2 = map;
            }
            Transition.Segment<S> segment2 = transition.getSegment();
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            animatedContentScope3 = animatedContentScope2;
            zChanged4 = composerStartRestartGroup.changed(segment2) | composerStartRestartGroup.changed(animatedContentScope3);
            contentTransformRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged4) {
                contentTransformRememberedValue = function5.invoke(animatedContentScope3);
                composerStartRestartGroup.updateRememberedValue(contentTransformRememberedValue);
            } else {
                contentTransformRememberedValue = function5.invoke(animatedContentScope3);
                composerStartRestartGroup.updateRememberedValue(contentTransformRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen2 = modifier4.then(animatedContentScope3.createSizeAnimationModifier$animation_release((ContentTransform) contentTransformRememberedValue, composerStartRestartGroup, 72));
            MeasurePolicy measurePolicy2 = new MeasurePolicy() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.5
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i15);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
                public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                    Placeable placeable;
                    int size2 = list.size();
                    final Placeable[] placeableArr = new Placeable[size2];
                    int size3 = list.size() - 1;
                    Placeable placeable2 = null;
                    int i15 = 1;
                    if (size3 >= 0) {
                        int i16 = 0;
                        while (true) {
                            int i17 = i16 + 1;
                            Measurable measurable = list.get(i16);
                            Object parentData = measurable.getParentData();
                            AnimatedContentScope.ChildData childData = parentData instanceof AnimatedContentScope.ChildData ? (AnimatedContentScope.ChildData) parentData : null;
                            if (childData != null && childData.isTarget()) {
                                placeableArr[i16] = measurable.mo2468measureBRTryo0(j);
                            }
                            if (i17 > size3) {
                                break;
                            }
                            i16 = i17;
                        }
                    }
                    int size4 = list.size() - 1;
                    if (size4 >= 0) {
                        int i18 = 0;
                        while (true) {
                            int i19 = i18 + 1;
                            Measurable measurable2 = list.get(i18);
                            if (placeableArr[i18] == null) {
                                placeableArr[i18] = measurable2.mo2468measureBRTryo0(j);
                            }
                            if (i19 > size4) {
                                break;
                            }
                            i18 = i19;
                        }
                    }
                    if (!(size2 == 0)) {
                        placeable = placeableArr[0];
                        int lastIndex = ArraysKt___ArraysKt.getLastIndex(placeableArr);
                        if (lastIndex != 0) {
                            int width = placeable == null ? 0 : placeable.getWidth();
                            if (1 <= lastIndex) {
                                int i20 = 1;
                                while (true) {
                                    Placeable placeable3 = placeableArr[i20];
                                    int width2 = placeable3 == null ? 0 : placeable3.getWidth();
                                    if (width < width2) {
                                        placeable = placeable3;
                                        width = width2;
                                    }
                                    if (i20 == lastIndex) {
                                        break;
                                    }
                                    i20++;
                                }
                            }
                        }
                    } else {
                        placeable = null;
                    }
                    final int width3 = placeable == null ? 0 : placeable.getWidth();
                    if (!(size2 == 0)) {
                        placeable2 = placeableArr[0];
                        int lastIndex2 = ArraysKt___ArraysKt.getLastIndex(placeableArr);
                        if (lastIndex2 != 0) {
                            int height = placeable2 == null ? 0 : placeable2.getHeight();
                            if (1 <= lastIndex2) {
                                while (true) {
                                    Placeable placeable4 = placeableArr[i15];
                                    int height2 = placeable4 == null ? 0 : placeable4.getHeight();
                                    if (height < height2) {
                                        placeable2 = placeable4;
                                        height = height2;
                                    }
                                    if (i15 == lastIndex2) {
                                        break;
                                    }
                                    i15++;
                                }
                            }
                        }
                    }
                    final int height3 = placeable2 == null ? 0 : placeable2.getHeight();
                    animatedContentScope3.m19setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(width3, height3));
                    final AnimatedContentScope<S> animatedContentScope5 = animatedContentScope3;
                    return MeasureScope.DefaultImpls.layout$default(measureScope, width3, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$measure$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                            Placeable[] placeableArr2 = placeableArr;
                            AnimatedContentScope<S> animatedContentScope6 = animatedContentScope5;
                            int i21 = width3;
                            int i22 = height3;
                            for (Placeable placeable5 : placeableArr2) {
                                if (placeable5 != null) {
                                    long jMo915alignKFBX0sM = animatedContentScope6.getContentAlignment().mo915alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i21, i22), LayoutDirection.Ltr);
                                    Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m3043getXimpl(jMo915alignKFBX0sM), IntOffset.m3044getYimpl(jMo915alignKFBX0sM), 0.0f, 4, null);
                                }
                            }
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i15);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierThen2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl2, measurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection3, companion2.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i6));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-740843327);
            while (r0.hasNext()) {
                composerStartRestartGroup.startMovableGroup(-1739566579, obj);
                function6 = (Function2) map2.get(obj);
                if (function6 == null) {
                    composerStartRestartGroup.startReplaceableGroup(1908012326);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1739566533);
                    function6.invoke(composerStartRestartGroup, Integer.valueOf(i6));
                    composerStartRestartGroup.endReplaceableGroup();
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endMovableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            alignment2 = alignment4;
            modifier2 = modifier4;
            function2 = function5;
        } else {
            if ((i & 1) == 0) {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    function3 = new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.3
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final ContentTransform invoke(@NotNull AnimatedContentScope<S> animatedContentScope5) {
                            return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(0.0f, AnimationSpecKt.tween$default(220, 90, null, 4, null), 1, null), EnterExitTransitionKt.fadeOut$default(0.0f, AnimationSpecKt.tween$default(90, 0, null, 6, null), 1, null));
                        }
                    };
                    i3 &= -897;
                } else {
                    function3 = function2;
                }
                if ((i2 & 4) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= -7169;
                } else {
                    topStart = alignment2;
                }
                composerStartRestartGroup.endDefaults();
                i5 = i3;
                modifier4 = modifier3;
                function5 = function3;
                alignment3 = topStart;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    function3 = new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.3
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final ContentTransform invoke(@NotNull AnimatedContentScope<S> animatedContentScope5) {
                            return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(0.0f, AnimationSpecKt.tween$default(220, 90, null, 4, null), 1, null), EnterExitTransitionKt.fadeOut$default(0.0f, AnimationSpecKt.tween$default(90, 0, null, 6, null), 1, null));
                        }
                    };
                    i3 &= -897;
                } else {
                    function3 = function2;
                }
                if ((i2 & 4) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= -7169;
                } else {
                    topStart = alignment2;
                }
                composerStartRestartGroup.endDefaults();
                i5 = i3;
                modifier4 = modifier3;
                function5 = function3;
                alignment3 = topStart;
            }
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged = composerStartRestartGroup.changed(transition);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new AnimatedContentScope(transition, alignment3, layoutDirection);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new AnimatedContentScope(transition, alignment3, layoutDirection);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            animatedContentScope = (AnimatedContentScope) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged2 = composerStartRestartGroup.changed(transition);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged2) {
                objRememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged3 = composerStartRestartGroup.changed(transition);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChanged3) {
                objRememberedValue3 = new LinkedHashMap();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new LinkedHashMap();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            map = (Map) objRememberedValue3;
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                if (snapshotStateList.size() == 1) {
                    snapshotStateList.clear();
                    snapshotStateList.add(transition.getCurrentState());
                } else {
                    snapshotStateList.clear();
                    snapshotStateList.add(transition.getCurrentState());
                }
                if (map.size() == 1) {
                    map.clear();
                } else {
                    map.clear();
                }
                animatedContentScope.setContentAlignment$animation_release(alignment3);
                animatedContentScope.setLayoutDirection$animation_release(layoutDirection);
            }
            if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                snapshotStateList.add(transition.getTargetState());
            }
            if (map.containsKey(transition.getTargetState())) {
                snapshotStateList2 = snapshotStateList;
                animatedContentScope2 = animatedContentScope;
                alignment4 = alignment3;
                i6 = 0;
                map2 = map;
            } else {
                snapshotStateList2 = snapshotStateList;
                animatedContentScope2 = animatedContentScope;
                alignment4 = alignment3;
                i6 = 0;
                map2 = map;
            }
            Transition.Segment<S> segment3 = transition.getSegment();
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            animatedContentScope3 = animatedContentScope2;
            zChanged4 = composerStartRestartGroup.changed(segment3) | composerStartRestartGroup.changed(animatedContentScope3);
            contentTransformRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged4) {
                contentTransformRememberedValue = function5.invoke(animatedContentScope3);
                composerStartRestartGroup.updateRememberedValue(contentTransformRememberedValue);
            } else {
                contentTransformRememberedValue = function5.invoke(animatedContentScope3);
                composerStartRestartGroup.updateRememberedValue(contentTransformRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen3 = modifier4.then(animatedContentScope3.createSizeAnimationModifier$animation_release((ContentTransform) contentTransformRememberedValue, composerStartRestartGroup, 72));
            MeasurePolicy measurePolicy3 = new MeasurePolicy() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.5
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i15);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
                public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                    Placeable placeable;
                    int size2 = list.size();
                    final Placeable[] placeableArr = new Placeable[size2];
                    int size3 = list.size() - 1;
                    Placeable placeable2 = null;
                    int i15 = 1;
                    if (size3 >= 0) {
                        int i16 = 0;
                        while (true) {
                            int i17 = i16 + 1;
                            Measurable measurable = list.get(i16);
                            Object parentData = measurable.getParentData();
                            AnimatedContentScope.ChildData childData = parentData instanceof AnimatedContentScope.ChildData ? (AnimatedContentScope.ChildData) parentData : null;
                            if (childData != null && childData.isTarget()) {
                                placeableArr[i16] = measurable.mo2468measureBRTryo0(j);
                            }
                            if (i17 > size3) {
                                break;
                            }
                            i16 = i17;
                        }
                    }
                    int size4 = list.size() - 1;
                    if (size4 >= 0) {
                        int i18 = 0;
                        while (true) {
                            int i19 = i18 + 1;
                            Measurable measurable2 = list.get(i18);
                            if (placeableArr[i18] == null) {
                                placeableArr[i18] = measurable2.mo2468measureBRTryo0(j);
                            }
                            if (i19 > size4) {
                                break;
                            }
                            i18 = i19;
                        }
                    }
                    if (!(size2 == 0)) {
                        placeable = placeableArr[0];
                        int lastIndex = ArraysKt___ArraysKt.getLastIndex(placeableArr);
                        if (lastIndex != 0) {
                            int width = placeable == null ? 0 : placeable.getWidth();
                            if (1 <= lastIndex) {
                                int i20 = 1;
                                while (true) {
                                    Placeable placeable3 = placeableArr[i20];
                                    int width2 = placeable3 == null ? 0 : placeable3.getWidth();
                                    if (width < width2) {
                                        placeable = placeable3;
                                        width = width2;
                                    }
                                    if (i20 == lastIndex) {
                                        break;
                                    }
                                    i20++;
                                }
                            }
                        }
                    } else {
                        placeable = null;
                    }
                    final int width3 = placeable == null ? 0 : placeable.getWidth();
                    if (!(size2 == 0)) {
                        placeable2 = placeableArr[0];
                        int lastIndex2 = ArraysKt___ArraysKt.getLastIndex(placeableArr);
                        if (lastIndex2 != 0) {
                            int height = placeable2 == null ? 0 : placeable2.getHeight();
                            if (1 <= lastIndex2) {
                                while (true) {
                                    Placeable placeable4 = placeableArr[i15];
                                    int height2 = placeable4 == null ? 0 : placeable4.getHeight();
                                    if (height < height2) {
                                        placeable2 = placeable4;
                                        height = height2;
                                    }
                                    if (i15 == lastIndex2) {
                                        break;
                                    }
                                    i15++;
                                }
                            }
                        }
                    }
                    final int height3 = placeable2 == null ? 0 : placeable2.getHeight();
                    animatedContentScope3.m19setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(width3, height3));
                    final AnimatedContentScope<S> animatedContentScope5 = animatedContentScope3;
                    return MeasureScope.DefaultImpls.layout$default(measureScope, width3, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$measure$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                            Placeable[] placeableArr2 = placeableArr;
                            AnimatedContentScope<S> animatedContentScope6 = animatedContentScope5;
                            int i21 = width3;
                            int i22 = height3;
                            for (Placeable placeable5 : placeableArr2) {
                                if (placeable5 != null) {
                                    long jMo915alignKFBX0sM = animatedContentScope6.getContentAlignment().mo915alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i21, i22), LayoutDirection.Ltr);
                                    Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m3043getXimpl(jMo915alignKFBX0sM), IntOffset.m3044getYimpl(jMo915alignKFBX0sM), 0.0f, 4, null);
                                }
                            }
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i15);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierThen3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl3, measurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection4, companion3.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i6));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-740843327);
            while (r0.hasNext()) {
                composerStartRestartGroup.startMovableGroup(-1739566579, obj);
                function6 = (Function2) map2.get(obj);
                if (function6 == null) {
                    composerStartRestartGroup.startReplaceableGroup(1908012326);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1739566533);
                    function6.invoke(composerStartRestartGroup, Integer.valueOf(i6));
                    composerStartRestartGroup.endReplaceableGroup();
                    Unit unit3 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endMovableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            alignment2 = alignment4;
            modifier2 = modifier4;
            function2 = function5;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.7
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

            public final void invoke(@Nullable Composer composer2, int i15) {
                AnimatedContentKt.AnimatedContent((Transition) transition, modifier2, (Function1) function2, alignment2, (Function4) function4, composer2, i | 1, i2);
            }
        });
    }
}
