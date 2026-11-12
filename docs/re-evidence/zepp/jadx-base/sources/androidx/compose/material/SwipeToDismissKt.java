package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0083\u0001\u0010\u0016\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00022\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u00132\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0002¨\u0006\u001b"}, d2 = {"Landroidx/compose/material/DismissValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/DismissState;", "rememberDismissState", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "Landroidx/compose/material/DismissDirection;", "directions", "Landroidx/compose/material/ThresholdConfig;", "dismissThresholds", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "background", "dismissContent", "SwipeToDismiss", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "from", "to", "getDismissDirection", "material_release"}, k = 2, mv = {1, 5, 1})
public final class SwipeToDismissKt {
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterialApi
    public static final void SwipeToDismiss(@NotNull final DismissState dismissState, @Nullable Modifier modifier, @Nullable Set<? extends DismissDirection> set, @Nullable Function1<? super DismissDirection, ? extends ThresholdConfig> function1, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super DismissDirection, ? extends ThresholdConfig> function2;
        int i5;
        int i6;
        Modifier modifier3;
        final Set<? extends DismissDirection> of;
        final Function1<? super DismissDirection, ? extends ThresholdConfig> function5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1831183526);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(dismissState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    function2 = function1;
                    int i8 = composerStartRestartGroup.changed(function2) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    function2 = function1;
                }
                i3 |= i8;
            } else {
                function2 = function1;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((458752 & i) == 0) {
                if (composerStartRestartGroup.changed(function4)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((4 & (~i2)) != 0 && ((374491 & i3) ^ 74898) == 0 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                of = set;
                modifier4 = modifier2;
                function5 = function2;
            } else {
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        of = y.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                        i3 &= -897;
                    } else {
                        of = set;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        function2 = new Function1<DismissDirection, FractionalThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final FractionalThreshold invoke(@NotNull DismissDirection dismissDirection) {
                                return new FractionalThreshold(0.5f);
                            }
                        };
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipCurrentGroup();
                    if (i4 != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    of = set;
                }
                final Function1<? super DismissDirection, ? extends ThresholdConfig> function6 = function2;
                final Set<? extends DismissDirection> set2 = of;
                final int i9 = i3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888366, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i10) {
                        int i11;
                        if ((i10 & 14) == 0) {
                            i11 = i10 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if (((i11 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        float fM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(boxWithConstraintsScope.getConstraints());
                        boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Float fValueOf = Float.valueOf(0.0f);
                        DismissValue dismissValue = DismissValue.Default;
                        Map mapMutableMapOf = r.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                        Set<DismissDirection> set3 = set2;
                        DismissDirection dismissDirection = DismissDirection.StartToEnd;
                        if (set3.contains(dismissDirection)) {
                            Pair pair = TuplesKt.to(Float.valueOf(fM2935getMaxWidthimpl), DismissValue.DismissedToEnd);
                            mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                        }
                        Set<DismissDirection> set4 = set2;
                        DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                        if (set4.contains(dismissDirection2)) {
                            Pair pair2 = TuplesKt.to(Float.valueOf(-fM2935getMaxWidthimpl), DismissValue.DismissedToStart);
                            mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                        }
                        final Function1<DismissDirection, ThresholdConfig> function7 = function6;
                        composer2.startReplaceableGroup(-3686930);
                        boolean zChanged = composer2.changed(function7);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DismissValue dismissValue2, @NotNull DismissValue dismissValue3) {
                                    return function7.invoke(SwipeToDismissKt.getDismissDirection(dismissValue2, dismissValue3));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        Function2 function8 = (Function2) objRememberedValue;
                        float f = set2.contains(dismissDirection2) ? 10.0f : 20.0f;
                        float f2 = set2.contains(dismissDirection) ? 10.0f : 20.0f;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, dismissState, mapMutableMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : dismissState.getCurrentValue() == dismissValue, (32 & 16) != 0 ? false : z, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(T t, T t2) {
                                return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                            }
                        } : function8, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM2935getMaxWidthimpl, f, f2), (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                        Function3<RowScope, Composer, Integer, Unit> function9 = function3;
                        int i12 = i9;
                        final DismissState dismissState2 = dismissState;
                        Function3<RowScope, Composer, Integer, Unit> function10 = function4;
                        composer2.startReplaceableGroup(-1990474327);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(565741125);
                        Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion);
                        int i13 = (i12 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        composer2.startReplaceableGroup(-1989997546);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        int i14 = i13 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i14 & 14) | (i14 & 112));
                        composer2.startReplaceableGroup(1376089335);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierMatchParentSize);
                        int i15 = (((i13 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i15 >> 3) & 112));
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        if (((((i15 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function9.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-3686930);
                        boolean zChanged2 = composer2.changed(dismissState2);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                    return IntOffset.m3034boximpl(m817invokeBjo55l4(density3));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m817invokeBjo55l4(@NotNull Density density3) {
                                    return IntOffsetKt.IntOffset(c.roundToInt(dismissState2.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                        int i16 = (i12 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        composer2.startReplaceableGroup(-1989997546);
                        int i17 = i16 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i17 & 112) | (i17 & 14));
                        composer2.startReplaceableGroup(1376089335);
                        Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierOffset);
                        int i18 = (((i16 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i18 >> 3) & 112));
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        if (((((i18 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function10.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i16 >> 6) & 112) | 6));
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                function5 = function6;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.3
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

                public final void invoke(@Nullable Composer composer2, int i10) {
                    SwipeToDismissKt.SwipeToDismiss(dismissState, modifier4, of, function5, function3, function4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
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
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (composerStartRestartGroup.changed(function4)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((4 & (~i2)) != 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    of = y.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    i3 &= -897;
                } else {
                    of = set;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    function2 = new Function1<DismissDirection, FractionalThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final FractionalThreshold invoke(@NotNull DismissDirection dismissDirection) {
                            return new FractionalThreshold(0.5f);
                        }
                    };
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    of = y.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    i3 &= -897;
                } else {
                    of = set;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    function2 = new Function1<DismissDirection, FractionalThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final FractionalThreshold invoke(@NotNull DismissDirection dismissDirection) {
                            return new FractionalThreshold(0.5f);
                        }
                    };
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            final Function1<? super DismissDirection, ? extends ThresholdConfig> function7 = function2;
            final Set<? extends DismissDirection> set3 = of;
            final int i10 = i3;
            BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888366, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i11) {
                    int i12;
                    if ((i11 & 14) == 0) {
                        i12 = i11 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                    } else {
                        i12 = i11;
                    }
                    if (((i12 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    float fM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(boxWithConstraintsScope.getConstraints());
                    boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                    Float fValueOf = Float.valueOf(0.0f);
                    DismissValue dismissValue = DismissValue.Default;
                    Map mapMutableMapOf = r.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                    Set<DismissDirection> set4 = set3;
                    DismissDirection dismissDirection = DismissDirection.StartToEnd;
                    if (set4.contains(dismissDirection)) {
                        Pair pair = TuplesKt.to(Float.valueOf(fM2935getMaxWidthimpl), DismissValue.DismissedToEnd);
                        mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                    }
                    Set<DismissDirection> set5 = set3;
                    DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                    if (set5.contains(dismissDirection2)) {
                        Pair pair2 = TuplesKt.to(Float.valueOf(-fM2935getMaxWidthimpl), DismissValue.DismissedToStart);
                        mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                    }
                    final Function1<? super DismissDirection, ? extends ThresholdConfig> function8 = function7;
                    composer2.startReplaceableGroup(-3686930);
                    boolean zChanged = composer2.changed(function8);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ThresholdConfig invoke(@NotNull DismissValue dismissValue2, @NotNull DismissValue dismissValue3) {
                                return function8.invoke(SwipeToDismissKt.getDismissDirection(dismissValue2, dismissValue3));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    Function2 function9 = (Function2) objRememberedValue;
                    float f = set3.contains(dismissDirection2) ? 10.0f : 20.0f;
                    float f2 = set3.contains(dismissDirection) ? 10.0f : 20.0f;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, dismissState, mapMutableMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : dismissState.getCurrentValue() == dismissValue, (32 & 16) != 0 ? false : z, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(T t, T t2) {
                            return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                        }
                    } : function9, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM2935getMaxWidthimpl, f, f2), (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Function3<RowScope, Composer, Integer, Unit> function10 = function3;
                    int i13 = i10;
                    final DismissState dismissState2 = dismissState;
                    Function3<RowScope, Composer, Integer, Unit> function11 = function4;
                    composer2.startReplaceableGroup(-1990474327);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(565741125);
                    Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion);
                    int i14 = (i13 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                    composer2.startReplaceableGroup(-1989997546);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    int i15 = i14 >> 3;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                    composer2.startReplaceableGroup(1376089335);
                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierMatchParentSize);
                    int i16 = (((i14 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i16 >> 3) & 112));
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-326682743);
                    if (((((i16 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        function10.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-3686930);
                    boolean zChanged2 = composer2.changed(dismissState2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m3034boximpl(m817invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m817invokeBjo55l4(@NotNull Density density3) {
                                return IntOffsetKt.IntOffset(c.roundToInt(dismissState2.getOffset().getValue().floatValue()), 0);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                    int i17 = (i13 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                    composer2.startReplaceableGroup(-1989997546);
                    int i18 = i17 >> 3;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                    composer2.startReplaceableGroup(1376089335);
                    Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierOffset);
                    int i19 = (((i17 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer2);
                    Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i19 >> 3) & 112));
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-326682743);
                    if (((((i19 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        function11.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            }), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
            function5 = function7;
            modifier4 = modifier2;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    of = y.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    i3 &= -897;
                } else {
                    of = set;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    function2 = new Function1<DismissDirection, FractionalThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final FractionalThreshold invoke(@NotNull DismissDirection dismissDirection) {
                            return new FractionalThreshold(0.5f);
                        }
                    };
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    of = y.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    i3 &= -897;
                } else {
                    of = set;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    function2 = new Function1<DismissDirection, FractionalThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final FractionalThreshold invoke(@NotNull DismissDirection dismissDirection) {
                            return new FractionalThreshold(0.5f);
                        }
                    };
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            final Function1<? super DismissDirection, ? extends ThresholdConfig> function8 = function2;
            final Set<? extends DismissDirection> set4 = of;
            final int i11 = i3;
            BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888366, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i12) {
                    int i13;
                    if ((i12 & 14) == 0) {
                        i13 = i12 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                    } else {
                        i13 = i12;
                    }
                    if (((i13 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    float fM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(boxWithConstraintsScope.getConstraints());
                    boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                    Float fValueOf = Float.valueOf(0.0f);
                    DismissValue dismissValue = DismissValue.Default;
                    Map mapMutableMapOf = r.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                    Set<DismissDirection> set5 = set4;
                    DismissDirection dismissDirection = DismissDirection.StartToEnd;
                    if (set5.contains(dismissDirection)) {
                        Pair pair = TuplesKt.to(Float.valueOf(fM2935getMaxWidthimpl), DismissValue.DismissedToEnd);
                        mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                    }
                    Set<DismissDirection> set6 = set4;
                    DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                    if (set6.contains(dismissDirection2)) {
                        Pair pair2 = TuplesKt.to(Float.valueOf(-fM2935getMaxWidthimpl), DismissValue.DismissedToStart);
                        mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                    }
                    final Function1<? super DismissDirection, ? extends ThresholdConfig> function9 = function8;
                    composer2.startReplaceableGroup(-3686930);
                    boolean zChanged = composer2.changed(function9);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ThresholdConfig invoke(@NotNull DismissValue dismissValue2, @NotNull DismissValue dismissValue3) {
                                return function9.invoke(SwipeToDismissKt.getDismissDirection(dismissValue2, dismissValue3));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    Function2 function10 = (Function2) objRememberedValue;
                    float f = set4.contains(dismissDirection2) ? 10.0f : 20.0f;
                    float f2 = set4.contains(dismissDirection) ? 10.0f : 20.0f;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, dismissState, mapMutableMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : dismissState.getCurrentValue() == dismissValue, (32 & 16) != 0 ? false : z, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(T t, T t2) {
                            return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                        }
                    } : function10, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM2935getMaxWidthimpl, f, f2), (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Function3<RowScope, Composer, Integer, Unit> function11 = function3;
                    int i14 = i11;
                    final DismissState dismissState2 = dismissState;
                    Function3<RowScope, Composer, Integer, Unit> function12 = function4;
                    composer2.startReplaceableGroup(-1990474327);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(565741125);
                    Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion);
                    int i15 = (i14 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                    composer2.startReplaceableGroup(-1989997546);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    int i16 = i15 >> 3;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i16 & 14) | (i16 & 112));
                    composer2.startReplaceableGroup(1376089335);
                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierMatchParentSize);
                    int i17 = (((i15 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i17 >> 3) & 112));
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-326682743);
                    if (((((i17 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        function11.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i15 >> 6) & 112) | 6));
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-3686930);
                    boolean zChanged2 = composer2.changed(dismissState2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m3034boximpl(m817invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m817invokeBjo55l4(@NotNull Density density3) {
                                return IntOffsetKt.IntOffset(c.roundToInt(dismissState2.getOffset().getValue().floatValue()), 0);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                    int i18 = (i14 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                    composer2.startReplaceableGroup(-1989997546);
                    int i19 = i18 >> 3;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i19 & 112) | (i19 & 14));
                    composer2.startReplaceableGroup(1376089335);
                    Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierOffset);
                    int i110 = (((i18 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer2);
                    Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i110 >> 3) & 112));
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-326682743);
                    if (((((i110 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        function12.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i18 >> 6) & 112) | 6));
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            }), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
            function5 = function8;
            modifier4 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.3
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                SwipeToDismissKt.SwipeToDismiss(dismissState, modifier4, of, function5, function3, function4, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DismissDirection getDismissDirection(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        DismissValue dismissValue3 = DismissValue.Default;
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == dismissValue3) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == dismissValue3) {
            return DismissDirection.EndToStart;
        }
        return null;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final DismissState rememberDismissState(@Nullable final DismissValue dismissValue, @Nullable final Function1<? super DismissValue, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1491560617);
        if ((i2 & 1) != 0) {
            dismissValue = DismissValue.Default;
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<DismissValue, Boolean>() { // from class: androidx.compose.material.SwipeToDismissKt.rememberDismissState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DismissValue dismissValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        DismissState dismissState = (DismissState) RememberSaveableKt.m912rememberSaveable(new Object[0], (Saver) DismissState.INSTANCE.Saver(function1), (String) null, (Function0) new Function0<DismissState>() { // from class: androidx.compose.material.SwipeToDismissKt.rememberDismissState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DismissState getA() {
                return new DismissState(dismissValue, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return dismissState;
    }
}
