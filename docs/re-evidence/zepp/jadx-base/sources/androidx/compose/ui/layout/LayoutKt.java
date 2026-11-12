package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureBlocks;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a8\u0010\b\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u009a\u0002\u0010\b\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022-\u0010\u0011\u001a)\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f¢\u0006\u0002\b\u00102-\u0010\u0012\u001a)\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f¢\u0006\u0002\b\u00102-\u0010\u0013\u001a)\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f¢\u0006\u0002\b\u00102-\u0010\u0014\u001a)\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042-\u0010\u001a\u001a)\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\nj\u0002`\u0019¢\u0006\u0002\b\u0010H\u0001ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u001b\u001aö\u0001\u0010\u001d\u001a\u00020\u001c2-\u0010\u0011\u001a)\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f¢\u0006\u0002\b\u00102-\u0010\u0012\u001a)\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f¢\u0006\u0002\b\u00102-\u0010\u0013\u001a)\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f¢\u0006\u0002\b\u00102-\u0010\u0014\u001a)\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f¢\u0006\u0002\b\u00102-\u0010\u001a\u001a)\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\nj\u0002`\u0019¢\u0006\u0002\b\u0010H\u0001ø\u0001\u0001\u001a6\u0010!\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a4\u0010#\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010$\u001a:\u0010%\u001a\u00020\u001c2-\u0010\u001a\u001a)\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\nj\u0002`\u0019¢\u0006\u0002\b\u0010H\u0001ø\u0001\u0001\u001aX\u0010+\u001a\u00020\u000e*\u00020&2)\u0010\u001a\u001a%\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\n¢\u0006\u0002\b\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0001\u001aX\u0010-\u001a\u00020\u000e*\u00020&2)\u0010\u001a\u001a%\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\n¢\u0006\u0002\b\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0001\u001aX\u0010.\u001a\u00020\u000e*\u00020&2)\u0010\u001a\u001a%\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\n¢\u0006\u0002\b\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0001\u001aX\u0010/\u001a\u00020\u000e*\u00020&2)\u0010\u001a\u001a%\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\n¢\u0006\u0002\b\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Layout", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "Landroidx/compose/ui/layout/IntrinsicMeasureBlock;", "Lkotlin/ExtensionFunctionType;", "minIntrinsicWidthMeasureBlock", "minIntrinsicHeightMeasureBlock", "maxIntrinsicWidthMeasureBlock", "maxIntrinsicHeightMeasureBlock", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureBlock;", "measureBlock", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/node/MeasureBlocks;", "measureBlocksOf", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "materializerOf", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "MeasuringIntrinsicsMeasureBlocks", "Landroidx/compose/ui/unit/Density;", "measurables", "h", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "MeasuringMinIntrinsicWidth", "w", "MeasuringMinIntrinsicHeight", "MeasuringMaxIntrinsicWidth", "MeasuringMaxIntrinsicHeight", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class LayoutKt {
    @Composable
    public static final void Layout(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @NotNull MeasurePolicy measurePolicy, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1376089335);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = materializerOf(modifier);
        int i3 = (i << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer);
        Updater.m906setimpl(composerM899constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        composer.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, Integer.valueOf((i3 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((i3 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Deprecated(message = "MeasuringIntrinsicsMeasureBlocks was deprecated. Please use MeasurePolicy instead.")
    @NotNull
    public static final MeasureBlocks MeasuringIntrinsicsMeasureBlocks(@NotNull final Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3) {
        return new MeasureBlocks() { // from class: androidx.compose.ui.layout.LayoutKt.MeasuringIntrinsicsMeasureBlocks.1
            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int w) {
                return LayoutKt.MeasuringMaxIntrinsicHeight(intrinsicMeasureScope, function3, measurables, w, intrinsicMeasureScope.getLayoutDirection());
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int h) {
                return LayoutKt.MeasuringMaxIntrinsicWidth(intrinsicMeasureScope, function3, measurables, h, intrinsicMeasureScope.getLayoutDirection());
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
            public MeasureResult mo2485measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> measurables, long constraints) {
                return function3.invoke(measureScope, measurables, Constraints.m2923boximpl(constraints));
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int w) {
                return LayoutKt.MeasuringMinIntrinsicHeight(intrinsicMeasureScope, function3, measurables, w, intrinsicMeasureScope.getLayoutDirection());
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int h) {
                return LayoutKt.MeasuringMinIntrinsicWidth(intrinsicMeasureScope, function3, measurables, h, intrinsicMeasureScope.getLayoutDirection());
            }

            @NotNull
            public String toString() {
                return JvmActuals_jvmKt.simpleIdentityToString(this, "MeasuringIntrinsicsMeasureBlocks") + "{ measureBlock=" + JvmActuals_jvmKt.simpleIdentityToString(function3, null) + " }";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMaxIntrinsicHeight(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m2923boximpl(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))).getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMaxIntrinsicWidth(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m2923boximpl(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))).getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMinIntrinsicHeight(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m2923boximpl(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))).getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMinIntrinsicWidth(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m2923boximpl(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))).getWidth();
    }

    @Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    @Composable
    public static final void MultiMeasureLayout(@Nullable Modifier modifier, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final MeasurePolicy measurePolicy, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-850549424);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(measurePolicy) ? 256 : 128;
        }
        if (((i3 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifierMaterialize = ComposedModifierKt.materialize(composerStartRestartGroup, modifier);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Function0<LayoutNode> constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
            int i5 = (i3 << 3) & 896;
            composerStartRestartGroup.startReplaceableGroup(1546167211);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor$ui_release);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Updater.m906setimpl(composerM899constructorimpl, modifierMaterialize, companion.getSetModifier());
            Updater.m906setimpl(composerM899constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m903initimpl(composerM899constructorimpl, new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                    invoke2(layoutNode);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode layoutNode) {
                    layoutNode.setCanMultiMeasure$ui_release(true);
                }
            });
            composerStartRestartGroup.enableReusing();
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.2
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

            public final void invoke(@Nullable Composer composer2, int i6) {
                LayoutKt.MultiMeasureLayout(modifier2, function2, measurePolicy, composer2, i | 1, i2);
            }
        });
    }

    @PublishedApi
    @NotNull
    public static final Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf(@NotNull final Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-985535743, true, new Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.materializerOf.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
                m2486invokeDeg8D_g(skippableUpdater.getComposer(), composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            /* JADX INFO: renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m2486invokeDeg8D_g(@NotNull Composer composer, @Nullable Composer composer2, int i) {
                Modifier modifierMaterialize = ComposedModifierKt.materialize(composer2, modifier);
                composer.startReplaceableGroup(509942095);
                Updater.m906setimpl(Updater.m899constructorimpl(composer), modifierMaterialize, ComposeUiNode.INSTANCE.getSetModifier());
                composer.endReplaceableGroup();
            }
        });
    }

    @Deprecated(message = "MeasureBlocks was deprecated. Please use MeasurePolicy and the Layout overloads using it instead.")
    @NotNull
    public static final MeasureBlocks measureBlocksOf(@NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> function3, @NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> function4, @NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> function5, @NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> function6, @NotNull final Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function7) {
        return new MeasureBlocks() { // from class: androidx.compose.ui.layout.LayoutKt.measureBlocksOf.1
            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int w) {
                return function6.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(w)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int h) {
                return function5.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(h)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo2485measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> measurables, long constraints) {
                return function7.invoke(measureScope, measurables, Constraints.m2923boximpl(constraints));
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int w) {
                return function4.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(w)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int h) {
                return function3.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(h)).intValue();
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x0136  */
    /* JADX WARN: Code duplicated, block: B:92:0x0142  */
    /* JADX WARN: Code duplicated, block: B:93:0x0146  */
    /* JADX WARN: Code duplicated, block: B:98:0x019c  */
    @Deprecated(message = "This composable was deprecated. Please use the alternative Layout overloads instead.")
    @Composable
    public static final void Layout(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> function3, @NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> function4, @NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> function5, @NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> function6, @Nullable Modifier modifier, @NotNull final Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function7, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        Modifier modifier3;
        Function0<ComposeUiNode> constructor;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1376090121);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(function3) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 896) == 0) {
                    if (composerStartRestartGroup.changed(function4)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i3 |= i4;
                }
                if ((i2 & 8) != 0) {
                    if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        if (composerStartRestartGroup.changed(function5)) {
                            i5 = 2048;
                        } else {
                            i5 = 1024;
                        }
                        i3 |= i5;
                    }
                    if ((i2 & 16) != 0) {
                        if ((57344 & i) == 0) {
                            if (composerStartRestartGroup.changed(function6)) {
                                i6 = 16384;
                            } else {
                                i6 = 8192;
                            }
                            i3 |= i6;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            if ((458752 & i) == 0) {
                                modifier2 = modifier;
                                if (composerStartRestartGroup.changed(modifier2)) {
                                    i8 = 131072;
                                } else {
                                    i8 = 65536;
                                }
                                i3 |= i8;
                            }
                            if ((i2 & 64) != 0) {
                                i3 |= 1572864;
                            } else if ((3670016 & i) == 0) {
                                if (composerStartRestartGroup.changed(function7)) {
                                    i9 = 1048576;
                                } else {
                                    i9 = 524288;
                                }
                                i3 |= i9;
                            }
                            if (((2995931 & i3) ^ 599186) != 0 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                            } else {
                                if (i7 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                                        return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i10)).intValue();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                                        return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i10)).intValue();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                    @NotNull
                                    /* JADX INFO: renamed from: measure-3p2s80s */
                                    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                        return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                                    }

                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                                        return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i10)).intValue();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                                        return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i10)).intValue();
                                    }
                                };
                                composerStartRestartGroup.startReplaceableGroup(1376089335);
                                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = materializerOf(modifier3);
                                int i10 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composerStartRestartGroup.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i10 >> 3) & 112));
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                function2.invoke(composerStartRestartGroup, Integer.valueOf((i10 >> 9) & 14));
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            final Modifier modifier4 = modifier3;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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
                                    LayoutKt.Layout(function2, function3, function4, function5, function6, modifier4, function7, composer2, i | 1, i2);
                                }
                            });
                        }
                        i3 |= 196608;
                        modifier2 = modifier;
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            if (composerStartRestartGroup.changed(function7)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if (((2995931 & i3) ^ 599186) != 0) {
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            MeasurePolicy measurePolicy2 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11) {
                                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11) {
                                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                @NotNull
                                /* JADX INFO: renamed from: measure-3p2s80s */
                                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11) {
                                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11) {
                                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11)).intValue();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = materializerOf(modifier3);
                            int i11 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 112));
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 9) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            MeasurePolicy measurePolicy3 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i12) {
                                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i12)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i12) {
                                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i12)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                @NotNull
                                /* JADX INFO: renamed from: measure-3p2s80s */
                                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i12) {
                                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i12)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i12) {
                                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i12)).intValue();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = materializerOf(modifier3);
                            int i12 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i12 >> 3) & 112));
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier5 = modifier3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                            public final void invoke(@Nullable Composer composer2, int i13) {
                                LayoutKt.Layout(function2, function3, function4, function5, function6, modifier5, function7, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 24576;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((458752 & i) == 0) {
                            modifier2 = modifier;
                            if (composerStartRestartGroup.changed(modifier2)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i3 |= i8;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            if (composerStartRestartGroup.changed(function7)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if (((2995931 & i3) ^ 599186) != 0) {
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            MeasurePolicy measurePolicy4 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i13) {
                                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i13)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i13) {
                                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i13)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                @NotNull
                                /* JADX INFO: renamed from: measure-3p2s80s */
                                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i13) {
                                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i13)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i13) {
                                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i13)).intValue();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            constructor = companion4.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = materializerOf(modifier3);
                            int i13 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Composer composerM899constructorimpl4 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl4, measurePolicy4, companion4.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl4, density4, companion4.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl4, layoutDirection4, companion4.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf4.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i13 >> 3) & 112));
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i13 >> 9) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            MeasurePolicy measurePolicy5 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i14) {
                                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i14)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i14) {
                                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i14)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                @NotNull
                                /* JADX INFO: renamed from: measure-3p2s80s */
                                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i14) {
                                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i14)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i14) {
                                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i14)).intValue();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            constructor = companion5.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = materializerOf(modifier3);
                            int i14 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Composer composerM899constructorimpl5 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl5, measurePolicy5, companion5.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl5, density5, companion5.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl5, layoutDirection5, companion5.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf5.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i14 >> 3) & 112));
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 9) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier6 = modifier3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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
                                LayoutKt.Layout(function2, function3, function4, function5, function6, modifier6, function7, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 196608;
                    modifier2 = modifier;
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy6 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i15)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i15)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i15)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i15)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        constructor = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = materializerOf(modifier3);
                        int i15 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl6 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl6, measurePolicy6, companion6.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl6, density6, companion6.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl6, layoutDirection6, companion6.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf6.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i15 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy7 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i16) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i16)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i16) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i16)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i16) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i16)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i16) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i16)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        constructor = companion7.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = materializerOf(modifier3);
                        int i16 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl7 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl7, measurePolicy7, companion7.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl7, density7, companion7.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl7, layoutDirection7, companion7.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf7.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i16 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier7 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                        public final void invoke(@Nullable Composer composer2, int i17) {
                            LayoutKt.Layout(function2, function3, function4, function5, function6, modifier7, function7, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 3072;
                if ((i2 & 16) != 0) {
                    if ((57344 & i) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i6 = 16384;
                        } else {
                            i6 = 8192;
                        }
                        i3 |= i6;
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((458752 & i) == 0) {
                            modifier2 = modifier;
                            if (composerStartRestartGroup.changed(modifier2)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i3 |= i8;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            if (composerStartRestartGroup.changed(function7)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if (((2995931 & i3) ^ 599186) != 0) {
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            MeasurePolicy measurePolicy8 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i17) {
                                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i17)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i17) {
                                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i17)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                @NotNull
                                /* JADX INFO: renamed from: measure-3p2s80s */
                                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i17) {
                                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i17)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i17) {
                                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i17)).intValue();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                            constructor = companion8.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = materializerOf(modifier3);
                            int i17 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Composer composerM899constructorimpl8 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl8, measurePolicy8, companion8.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl8, density8, companion8.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl8, layoutDirection8, companion8.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf8.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i17 >> 3) & 112));
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i17 >> 9) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            MeasurePolicy measurePolicy9 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i18) {
                                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i18)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i18) {
                                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i18)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                @NotNull
                                /* JADX INFO: renamed from: measure-3p2s80s */
                                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i18) {
                                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i18)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i18) {
                                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i18)).intValue();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                            constructor = companion9.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = materializerOf(modifier3);
                            int i18 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Composer composerM899constructorimpl9 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl9, measurePolicy9, companion9.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl9, density9, companion9.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl9, layoutDirection9, companion9.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf9.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i18 >> 3) & 112));
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i18 >> 9) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier8 = modifier3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                            public final void invoke(@Nullable Composer composer2, int i19) {
                                LayoutKt.Layout(function2, function3, function4, function5, function6, modifier8, function7, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 196608;
                    modifier2 = modifier;
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy10 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i19) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i19)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i19) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i19)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i19) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i19)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i19) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i19)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        constructor = companion10.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = materializerOf(modifier3);
                        int i19 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl10 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl10, measurePolicy10, companion10.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl10, density10, companion10.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl10, layoutDirection10, companion10.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf10.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i19 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i19 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy11 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i110) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i110)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i110) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i110)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i110) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i110)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i110) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i110)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                        constructor = companion11.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = materializerOf(modifier3);
                        int i110 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl11 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11, measurePolicy11, companion11.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl11, density11, companion11.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl11, layoutDirection11, companion11.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf11.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i110 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i110 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier9 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                        public final void invoke(@Nullable Composer composer2, int i111) {
                            LayoutKt.Layout(function2, function3, function4, function5, function6, modifier9, function7, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((458752 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy12 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                        constructor = companion12.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = materializerOf(modifier3);
                        int i111 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl12 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl12, measurePolicy12, companion12.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl12, density12, companion12.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl12, layoutDirection12, companion12.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf12.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i111 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy13 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i112) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i112)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i112) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i112)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i112) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i112)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i112) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i112)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                        constructor = companion13.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = materializerOf(modifier3);
                        int i112 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl13 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl13, measurePolicy13, companion13.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl13, density13, companion13.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl13, layoutDirection13, companion13.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf13.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i112 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i112 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier10 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                        public final void invoke(@Nullable Composer composer2, int i113) {
                            LayoutKt.Layout(function2, function3, function4, function5, function6, modifier10, function7, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy14 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i113) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i113)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i113) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i113)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i113) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i113)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i113) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i113)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    constructor = companion14.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = materializerOf(modifier3);
                    int i113 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl14 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl14, measurePolicy14, companion14.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl14, density14, companion14.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl14, layoutDirection14, companion14.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf14.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i113 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i113 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy15 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i114) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i114)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i114) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i114)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i114) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i114)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i114) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i114)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    constructor = companion15.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = materializerOf(modifier3);
                    int i114 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl15 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl15, measurePolicy15, companion15.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl15, density15, companion15.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl15, layoutDirection15, companion15.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf15.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i114 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i114 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier11 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                    public final void invoke(@Nullable Composer composer2, int i115) {
                        LayoutKt.Layout(function2, function3, function4, function5, function6, modifier11, function7, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            if ((i2 & 8) != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(function5)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    if ((57344 & i) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i6 = 16384;
                        } else {
                            i6 = 8192;
                        }
                        i3 |= i6;
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((458752 & i) == 0) {
                            modifier2 = modifier;
                            if (composerStartRestartGroup.changed(modifier2)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i3 |= i8;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            if (composerStartRestartGroup.changed(function7)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if (((2995931 & i3) ^ 599186) != 0) {
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            MeasurePolicy measurePolicy16 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i115) {
                                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i115)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i115) {
                                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i115)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                @NotNull
                                /* JADX INFO: renamed from: measure-3p2s80s */
                                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i115) {
                                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i115)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i115) {
                                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i115)).intValue();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection16 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                            constructor = companion16.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = materializerOf(modifier3);
                            int i115 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Composer composerM899constructorimpl16 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl16, measurePolicy16, companion16.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl16, density16, companion16.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl16, layoutDirection16, companion16.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf16.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i115 >> 3) & 112));
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i115 >> 9) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            MeasurePolicy measurePolicy17 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i116) {
                                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i116)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i116) {
                                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i116)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                @NotNull
                                /* JADX INFO: renamed from: measure-3p2s80s */
                                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i116) {
                                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i116)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i116) {
                                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i116)).intValue();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection17 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                            constructor = companion17.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf17 = materializerOf(modifier3);
                            int i116 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Composer composerM899constructorimpl17 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl17, measurePolicy17, companion17.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl17, density17, companion17.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl17, layoutDirection17, companion17.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf17.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i116 >> 3) & 112));
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i116 >> 9) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier12 = modifier3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                            public final void invoke(@Nullable Composer composer2, int i117) {
                                LayoutKt.Layout(function2, function3, function4, function5, function6, modifier12, function7, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 196608;
                    modifier2 = modifier;
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy18 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i117) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i117)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i117) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i117)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i117) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i117)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i117) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i117)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection18 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                        constructor = companion18.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf18 = materializerOf(modifier3);
                        int i117 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl18 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl18, measurePolicy18, companion18.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl18, density18, companion18.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl18, layoutDirection18, companion18.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf18.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i117 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i117 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy19 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i118) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i118)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i118) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i118)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i118) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i118)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i118) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i118)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection19 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                        constructor = companion19.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf19 = materializerOf(modifier3);
                        int i118 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl19 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl19, measurePolicy19, companion19.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl19, density19, companion19.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl19, layoutDirection19, companion19.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf19.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i118 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i118 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier13 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                        public final void invoke(@Nullable Composer composer2, int i119) {
                            LayoutKt.Layout(function2, function3, function4, function5, function6, modifier13, function7, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((458752 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy110 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i119) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i119)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i119) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i119)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i119) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i119)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i119) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i119)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                        constructor = companion110.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf110 = materializerOf(modifier3);
                        int i119 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl110 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl110, measurePolicy110, companion110.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl110, density110, companion110.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl110, layoutDirection110, companion110.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf110.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i119 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i119 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy111 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1110) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1110)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1110) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1110)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1110) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1110)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1110) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1110)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                        constructor = companion111.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111 = materializerOf(modifier3);
                        int i1110 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl111 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl111, measurePolicy111, companion111.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl111, density111, companion111.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl111, layoutDirection111, companion111.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf111.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1110 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i1110 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier14 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                        public final void invoke(@Nullable Composer composer2, int i1111) {
                            LayoutKt.Layout(function2, function3, function4, function5, function6, modifier14, function7, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy112 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                    constructor = companion112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf112 = materializerOf(modifier3);
                    int i1111 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl112 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl112, measurePolicy112, companion112.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl112, density112, companion112.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl112, layoutDirection112, companion112.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf112.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1111 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i1111 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy113 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1112) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1112)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1112) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1112)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1112) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1112)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1112) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1112)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                    constructor = companion113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf113 = materializerOf(modifier3);
                    int i1112 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl113 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl113, measurePolicy113, companion113.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl113, density113, companion113.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl113, layoutDirection113, companion113.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf113.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1112 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i1112 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier15 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                    public final void invoke(@Nullable Composer composer2, int i1113) {
                        LayoutKt.Layout(function2, function3, function4, function5, function6, modifier15, function7, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            if ((i2 & 16) != 0) {
                if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(function6)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((458752 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy114 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1113) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1113)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1113) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1113)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1113) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1113)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1113) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1113)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                        constructor = companion114.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf114 = materializerOf(modifier3);
                        int i1113 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl114 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl114, measurePolicy114, companion114.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl114, density114, companion114.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl114, layoutDirection114, companion114.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf114.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1113 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i1113 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy115 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1114) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1114)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1114) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1114)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1114) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1114)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1114) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1114)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                        constructor = companion115.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf115 = materializerOf(modifier3);
                        int i1114 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl115 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl115, measurePolicy115, companion115.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl115, density115, companion115.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl115, layoutDirection115, companion115.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf115.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1114 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i1114 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier16 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                        public final void invoke(@Nullable Composer composer2, int i1115) {
                            LayoutKt.Layout(function2, function3, function4, function5, function6, modifier16, function7, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy116 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1115) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1115)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1115) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1115)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1115) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1115)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1115) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1115)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                    constructor = companion116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf116 = materializerOf(modifier3);
                    int i1115 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl116 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl116, measurePolicy116, companion116.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl116, density116, companion116.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl116, layoutDirection116, companion116.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf116.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1115 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i1115 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy117 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1116) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1116)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1116) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1116)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1116) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1116)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1116) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1116)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                    constructor = companion117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf117 = materializerOf(modifier3);
                    int i1116 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl117 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl117, measurePolicy117, companion117.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl117, density117, companion117.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl117, layoutDirection117, companion117.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf117.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1116 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i1116 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier17 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                    public final void invoke(@Nullable Composer composer2, int i1117) {
                        LayoutKt.Layout(function2, function3, function4, function5, function6, modifier17, function7, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((458752 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy118 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1117) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1117)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1117) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1117)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1117) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1117)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1117) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1117)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                    constructor = companion118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf118 = materializerOf(modifier3);
                    int i1117 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl118 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl118, measurePolicy118, companion118.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl118, density118, companion118.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl118, layoutDirection118, companion118.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf118.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1117 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i1117 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy119 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1118) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1118)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1118) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1118)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1118) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1118)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1118) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1118)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                    constructor = companion119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf119 = materializerOf(modifier3);
                    int i1118 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl119 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl119, measurePolicy119, companion119.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl119, density119, companion119.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl119, layoutDirection119, companion119.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf119.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1118 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i1118 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier18 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                    public final void invoke(@Nullable Composer composer2, int i1119) {
                        LayoutKt.Layout(function2, function3, function4, function5, function6, modifier18, function7, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(function7)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if (((2995931 & i3) ^ 599186) != 0) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                MeasurePolicy measurePolicy1110 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1119) {
                        return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1119)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1119) {
                        return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1119)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1119) {
                        return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1119)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1119) {
                        return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1119)).intValue();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density1110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                constructor = companion1110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1110 = materializerOf(modifier3);
                int i1119 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl1110 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1110, measurePolicy1110, companion1110.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl1110, density1110, companion1110.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl1110, layoutDirection1110, companion1110.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf1110.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1119 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i1119 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                MeasurePolicy measurePolicy1111 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11110) {
                        return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11110)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11110) {
                        return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11110)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11110) {
                        return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11110)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11110) {
                        return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11110)).intValue();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density1111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
                constructor = companion1111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111 = materializerOf(modifier3);
                int i11110 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl1111 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1111, measurePolicy1111, companion1111.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl1111, density1111, companion1111.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl1111, layoutDirection1111, companion1111.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf1111.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11110 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i11110 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier19 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                public final void invoke(@Nullable Composer composer2, int i11111) {
                    LayoutKt.Layout(function2, function3, function4, function5, function6, modifier19, function7, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        if ((i2 & 4) != 0) {
            if ((i & 896) == 0) {
                if (composerStartRestartGroup.changed(function4)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i2 & 8) != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(function5)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    if ((57344 & i) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i6 = 16384;
                        } else {
                            i6 = 8192;
                        }
                        i3 |= i6;
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((458752 & i) == 0) {
                            modifier2 = modifier;
                            if (composerStartRestartGroup.changed(modifier2)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i3 |= i8;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            if (composerStartRestartGroup.changed(function7)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if (((2995931 & i3) ^ 599186) != 0) {
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            MeasurePolicy measurePolicy1112 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111) {
                                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111) {
                                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                @NotNull
                                /* JADX INFO: renamed from: measure-3p2s80s */
                                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111) {
                                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111) {
                                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111)).intValue();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density1112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection1112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
                            constructor = companion1112.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1112 = materializerOf(modifier3);
                            int i11111 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Composer composerM899constructorimpl1112 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl1112, measurePolicy1112, companion1112.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl1112, density1112, companion1112.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl1112, layoutDirection1112, companion1112.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf1112.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11111 >> 3) & 112));
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i11111 >> 9) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            MeasurePolicy measurePolicy1113 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11112) {
                                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11112)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11112) {
                                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11112)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                @NotNull
                                /* JADX INFO: renamed from: measure-3p2s80s */
                                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11112) {
                                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11112)).intValue();
                                }

                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11112) {
                                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11112)).intValue();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density1113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection1113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion1113 = ComposeUiNode.INSTANCE;
                            constructor = companion1113.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1113 = materializerOf(modifier3);
                            int i11112 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Composer composerM899constructorimpl1113 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl1113, measurePolicy1113, companion1113.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl1113, density1113, companion1113.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl1113, layoutDirection1113, companion1113.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf1113.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11112 >> 3) & 112));
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i11112 >> 9) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier110 = modifier3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                            public final void invoke(@Nullable Composer composer2, int i11113) {
                                LayoutKt.Layout(function2, function3, function4, function5, function6, modifier110, function7, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 196608;
                    modifier2 = modifier;
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy1114 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11113) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11113)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11113) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11113)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11113) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11113)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11113) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11113)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density1114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion1114 = ComposeUiNode.INSTANCE;
                        constructor = companion1114.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1114 = materializerOf(modifier3);
                        int i11113 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl1114 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1114, measurePolicy1114, companion1114.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl1114, density1114, companion1114.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl1114, layoutDirection1114, companion1114.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1114.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11113 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i11113 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy1115 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11114) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11114)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11114) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11114)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11114) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11114)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11114) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11114)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density1115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion1115 = ComposeUiNode.INSTANCE;
                        constructor = companion1115.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1115 = materializerOf(modifier3);
                        int i11114 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl1115 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1115, measurePolicy1115, companion1115.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl1115, density1115, companion1115.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl1115, layoutDirection1115, companion1115.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1115.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11114 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i11114 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier111 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                        public final void invoke(@Nullable Composer composer2, int i11115) {
                            LayoutKt.Layout(function2, function3, function4, function5, function6, modifier111, function7, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((458752 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy1116 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11115) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11115)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11115) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11115)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11115) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11115)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11115) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11115)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density1116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion1116 = ComposeUiNode.INSTANCE;
                        constructor = companion1116.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1116 = materializerOf(modifier3);
                        int i11115 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl1116 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1116, measurePolicy1116, companion1116.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl1116, density1116, companion1116.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl1116, layoutDirection1116, companion1116.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1116.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11115 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i11115 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy1117 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11116) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11116)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11116) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11116)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11116) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11116)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11116) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11116)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density1117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion1117 = ComposeUiNode.INSTANCE;
                        constructor = companion1117.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1117 = materializerOf(modifier3);
                        int i11116 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl1117 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1117, measurePolicy1117, companion1117.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl1117, density1117, companion1117.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl1117, layoutDirection1117, companion1117.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1117.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11116 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i11116 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier112 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                        public final void invoke(@Nullable Composer composer2, int i11117) {
                            LayoutKt.Layout(function2, function3, function4, function5, function6, modifier112, function7, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy1118 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11117) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11117)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11117) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11117)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11117) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11117)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11117) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11117)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density1118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection1118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion1118 = ComposeUiNode.INSTANCE;
                    constructor = companion1118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1118 = materializerOf(modifier3);
                    int i11117 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl1118 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl1118, measurePolicy1118, companion1118.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl1118, density1118, companion1118.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl1118, layoutDirection1118, companion1118.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf1118.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11117 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i11117 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy1119 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11118) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11118)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11118) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11118)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11118) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11118)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11118) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11118)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density1119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection1119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion1119 = ComposeUiNode.INSTANCE;
                    constructor = companion1119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1119 = materializerOf(modifier3);
                    int i11118 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl1119 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl1119, measurePolicy1119, companion1119.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl1119, density1119, companion1119.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl1119, layoutDirection1119, companion1119.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf1119.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11118 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i11118 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier113 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                    public final void invoke(@Nullable Composer composer2, int i11119) {
                        LayoutKt.Layout(function2, function3, function4, function5, function6, modifier113, function7, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            if ((i2 & 16) != 0) {
                if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(function6)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((458752 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy11110 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11119) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11119)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11119) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11119)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11119) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11119)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11119) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11119)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density11110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection11110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion11110 = ComposeUiNode.INSTANCE;
                        constructor = companion11110.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11110 = materializerOf(modifier3);
                        int i11119 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl11110 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11110, measurePolicy11110, companion11110.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl11110, density11110, companion11110.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl11110, layoutDirection11110, companion11110.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf11110.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11119 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i11119 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy11111 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111110) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111110)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111110) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111110)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111110) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111110)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111110) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111110)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density11111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection11111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion11111 = ComposeUiNode.INSTANCE;
                        constructor = companion11111.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11111 = materializerOf(modifier3);
                        int i111110 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl11111 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11111, measurePolicy11111, companion11111.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl11111, density11111, companion11111.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl11111, layoutDirection11111, companion11111.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf11111.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111110 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i111110 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier114 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                        public final void invoke(@Nullable Composer composer2, int i111111) {
                            LayoutKt.Layout(function2, function3, function4, function5, function6, modifier114, function7, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy11112 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111111) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111111)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111111) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111111)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111111) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111111)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111111) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111111)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density11112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion11112 = ComposeUiNode.INSTANCE;
                    constructor = companion11112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11112 = materializerOf(modifier3);
                    int i111111 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl11112 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11112, measurePolicy11112, companion11112.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl11112, density11112, companion11112.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl11112, layoutDirection11112, companion11112.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11112.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111111 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i111111 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy11113 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111112) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111112)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111112) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111112)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111112) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111112)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111112) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111112)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density11113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion11113 = ComposeUiNode.INSTANCE;
                    constructor = companion11113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11113 = materializerOf(modifier3);
                    int i111112 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl11113 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11113, measurePolicy11113, companion11113.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl11113, density11113, companion11113.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl11113, layoutDirection11113, companion11113.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11113.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111112 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i111112 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier115 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                    public final void invoke(@Nullable Composer composer2, int i111113) {
                        LayoutKt.Layout(function2, function3, function4, function5, function6, modifier115, function7, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((458752 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy11114 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111113) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111113)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111113) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111113)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111113) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111113)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111113) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111113)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density11114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion11114 = ComposeUiNode.INSTANCE;
                    constructor = companion11114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11114 = materializerOf(modifier3);
                    int i111113 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl11114 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11114, measurePolicy11114, companion11114.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl11114, density11114, companion11114.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl11114, layoutDirection11114, companion11114.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11114.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111113 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i111113 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy11115 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111114) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111114)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111114) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111114)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111114) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111114)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111114) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111114)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density11115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion11115 = ComposeUiNode.INSTANCE;
                    constructor = companion11115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11115 = materializerOf(modifier3);
                    int i111114 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl11115 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11115, measurePolicy11115, companion11115.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl11115, density11115, companion11115.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl11115, layoutDirection11115, companion11115.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11115.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111114 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i111114 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier116 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                    public final void invoke(@Nullable Composer composer2, int i111115) {
                        LayoutKt.Layout(function2, function3, function4, function5, function6, modifier116, function7, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(function7)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if (((2995931 & i3) ^ 599186) != 0) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                MeasurePolicy measurePolicy11116 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111115) {
                        return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111115)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111115) {
                        return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111115)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111115) {
                        return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111115)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111115) {
                        return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111115)).intValue();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density11116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion11116 = ComposeUiNode.INSTANCE;
                constructor = companion11116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11116 = materializerOf(modifier3);
                int i111115 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl11116 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl11116, measurePolicy11116, companion11116.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl11116, density11116, companion11116.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl11116, layoutDirection11116, companion11116.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf11116.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111115 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i111115 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                MeasurePolicy measurePolicy11117 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111116) {
                        return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111116)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111116) {
                        return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111116)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111116) {
                        return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111116)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111116) {
                        return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111116)).intValue();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density11117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion11117 = ComposeUiNode.INSTANCE;
                constructor = companion11117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11117 = materializerOf(modifier3);
                int i111116 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl11117 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl11117, measurePolicy11117, companion11117.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl11117, density11117, companion11117.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl11117, layoutDirection11117, companion11117.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf11117.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111116 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i111116 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier117 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                public final void invoke(@Nullable Composer composer2, int i111117) {
                    LayoutKt.Layout(function2, function3, function4, function5, function6, modifier117, function7, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(function5)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(function6)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((458752 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy11118 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111117) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111117)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111117) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111117)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111117) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111117)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111117) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111117)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density11118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection11118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion11118 = ComposeUiNode.INSTANCE;
                        constructor = companion11118.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11118 = materializerOf(modifier3);
                        int i111117 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl11118 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11118, measurePolicy11118, companion11118.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl11118, density11118, companion11118.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl11118, layoutDirection11118, companion11118.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf11118.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111117 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i111117 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        MeasurePolicy measurePolicy11119 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111118) {
                                return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111118)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111118) {
                                return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111118)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            @NotNull
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111118) {
                                return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111118)).intValue();
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111118) {
                                return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111118)).intValue();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density11119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection11119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion11119 = ComposeUiNode.INSTANCE;
                        constructor = companion11119.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11119 = materializerOf(modifier3);
                        int i111118 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Composer composerM899constructorimpl11119 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11119, measurePolicy11119, companion11119.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl11119, density11119, companion11119.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl11119, layoutDirection11119, companion11119.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf11119.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111118 >> 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i111118 >> 9) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier118 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                        public final void invoke(@Nullable Composer composer2, int i111119) {
                            LayoutKt.Layout(function2, function3, function4, function5, function6, modifier118, function7, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy111110 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111119) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111119)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111119) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111119)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111119) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111119)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i111119) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i111119)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111110 = ComposeUiNode.INSTANCE;
                    constructor = companion111110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111110 = materializerOf(modifier3);
                    int i111119 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl111110 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111110, measurePolicy111110, companion111110.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111110, density111110, companion111110.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111110, layoutDirection111110, companion111110.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111110.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111119 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i111119 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy111111 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111110) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111110)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111110) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111110)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111110) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111110)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111110) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111110)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111111 = ComposeUiNode.INSTANCE;
                    constructor = companion111111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111111 = materializerOf(modifier3);
                    int i1111110 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl111111 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111111, measurePolicy111111, companion111111.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111111, density111111, companion111111.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111111, layoutDirection111111, companion111111.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111111.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1111110 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i1111110 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier119 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                    public final void invoke(@Nullable Composer composer2, int i1111111) {
                        LayoutKt.Layout(function2, function3, function4, function5, function6, modifier119, function7, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((458752 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy111112 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111111) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111111)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111111) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111111)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111111) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111111)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111111) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111111)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111112 = ComposeUiNode.INSTANCE;
                    constructor = companion111112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111112 = materializerOf(modifier3);
                    int i1111111 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl111112 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111112, measurePolicy111112, companion111112.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111112, density111112, companion111112.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111112, layoutDirection111112, companion111112.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111112.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1111111 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i1111111 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy111113 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111112) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111112)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111112) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111112)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111112) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111112)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111112) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111112)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111113 = ComposeUiNode.INSTANCE;
                    constructor = companion111113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111113 = materializerOf(modifier3);
                    int i1111112 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl111113 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111113, measurePolicy111113, companion111113.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111113, density111113, companion111113.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111113, layoutDirection111113, companion111113.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111113.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1111112 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i1111112 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier1110 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                    public final void invoke(@Nullable Composer composer2, int i1111113) {
                        LayoutKt.Layout(function2, function3, function4, function5, function6, modifier1110, function7, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(function7)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if (((2995931 & i3) ^ 599186) != 0) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                MeasurePolicy measurePolicy111114 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111113) {
                        return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111113)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111113) {
                        return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111113)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111113) {
                        return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111113)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111113) {
                        return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111113)).intValue();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density111114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion111114 = ComposeUiNode.INSTANCE;
                constructor = companion111114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111114 = materializerOf(modifier3);
                int i1111113 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl111114 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111114, measurePolicy111114, companion111114.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl111114, density111114, companion111114.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl111114, layoutDirection111114, companion111114.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111114.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1111113 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i1111113 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                MeasurePolicy measurePolicy111115 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111114) {
                        return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111114)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111114) {
                        return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111114)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111114) {
                        return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111114)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111114) {
                        return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111114)).intValue();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density111115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion111115 = ComposeUiNode.INSTANCE;
                constructor = companion111115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111115 = materializerOf(modifier3);
                int i1111114 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl111115 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111115, measurePolicy111115, companion111115.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl111115, density111115, companion111115.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl111115, layoutDirection111115, companion111115.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111115.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1111114 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i1111114 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier1111 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                public final void invoke(@Nullable Composer composer2, int i1111115) {
                    LayoutKt.Layout(function2, function3, function4, function5, function6, modifier1111, function7, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        if ((i2 & 16) != 0) {
            if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(function6)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((458752 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy111116 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111115) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111115)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111115) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111115)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111115) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111115)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111115) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111115)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111116 = ComposeUiNode.INSTANCE;
                    constructor = companion111116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111116 = materializerOf(modifier3);
                    int i1111115 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl111116 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111116, measurePolicy111116, companion111116.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111116, density111116, companion111116.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111116, layoutDirection111116, companion111116.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111116.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1111115 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i1111115 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    MeasurePolicy measurePolicy111117 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111116) {
                            return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111116)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111116) {
                            return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111116)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        @NotNull
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                            return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111116) {
                            return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111116)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111116) {
                            return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111116)).intValue();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111117 = ComposeUiNode.INSTANCE;
                    constructor = companion111117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111117 = materializerOf(modifier3);
                    int i1111116 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Composer composerM899constructorimpl111117 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111117, measurePolicy111117, companion111117.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111117, density111117, companion111117.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111117, layoutDirection111117, companion111117.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111117.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1111116 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i1111116 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier1112 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                    public final void invoke(@Nullable Composer composer2, int i1111117) {
                        LayoutKt.Layout(function2, function3, function4, function5, function6, modifier1112, function7, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(function7)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if (((2995931 & i3) ^ 599186) != 0) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                MeasurePolicy measurePolicy111118 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111117) {
                        return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111117)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111117) {
                        return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111117)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111117) {
                        return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111117)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111117) {
                        return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111117)).intValue();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density111118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion111118 = ComposeUiNode.INSTANCE;
                constructor = companion111118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111118 = materializerOf(modifier3);
                int i1111117 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl111118 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111118, measurePolicy111118, companion111118.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl111118, density111118, companion111118.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl111118, layoutDirection111118, companion111118.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111118.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1111117 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i1111117 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                MeasurePolicy measurePolicy111119 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111118) {
                        return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111118)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111118) {
                        return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111118)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111118) {
                        return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111118)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111118) {
                        return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111118)).intValue();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density111119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion111119 = ComposeUiNode.INSTANCE;
                constructor = companion111119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111119 = materializerOf(modifier3);
                int i1111118 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl111119 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111119, measurePolicy111119, companion111119.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl111119, density111119, companion111119.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl111119, layoutDirection111119, companion111119.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111119.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1111118 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i1111118 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier1113 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                public final void invoke(@Nullable Composer composer2, int i1111119) {
                    LayoutKt.Layout(function2, function3, function4, function5, function6, modifier1113, function7, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        i7 = i2 & 32;
        if (i7 != 0) {
            if ((458752 & i) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(function7)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if (((2995931 & i3) ^ 599186) != 0) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                MeasurePolicy measurePolicy1111110 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111119) {
                        return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111119)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111119) {
                        return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111119)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111119) {
                        return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111119)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i1111119) {
                        return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i1111119)).intValue();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density1111110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1111110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion1111110 = ComposeUiNode.INSTANCE;
                constructor = companion1111110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111110 = materializerOf(modifier3);
                int i1111119 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl1111110 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1111110, measurePolicy1111110, companion1111110.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl1111110, density1111110, companion1111110.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl1111110, layoutDirection1111110, companion1111110.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf1111110.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1111119 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i1111119 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                MeasurePolicy measurePolicy1111111 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111110) {
                        return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111110)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111110) {
                        return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111110)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111110) {
                        return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111110)).intValue();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111110) {
                        return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111110)).intValue();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density1111111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1111111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion1111111 = ComposeUiNode.INSTANCE;
                constructor = companion1111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111111 = materializerOf(modifier3);
                int i11111110 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl1111111 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1111111, measurePolicy1111111, companion1111111.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl1111111, density1111111, companion1111111.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl1111111, layoutDirection1111111, companion1111111.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf1111111.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11111110 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i11111110 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier1114 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

                public final void invoke(@Nullable Composer composer2, int i11111111) {
                    LayoutKt.Layout(function2, function3, function4, function5, function6, modifier1114, function7, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (composerStartRestartGroup.changed(function7)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if (((2995931 & i3) ^ 599186) != 0) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            MeasurePolicy measurePolicy1111112 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111111) {
                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111111)).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111111) {
                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111111)).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111111) {
                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111111)).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111111) {
                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111111)).intValue();
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density1111112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1111112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion1111112 = ComposeUiNode.INSTANCE;
            constructor = companion1111112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111112 = materializerOf(modifier3);
            int i11111111 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
            Composer composerM899constructorimpl1111112 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl1111112, measurePolicy1111112, companion1111112.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl1111112, density1111112, companion1111112.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl1111112, layoutDirection1111112, companion1111112.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf1111112.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11111111 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i11111111 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            MeasurePolicy measurePolicy1111113 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111112) {
                    return function6.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111112)).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111112) {
                    return function5.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111112)).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                    return function7.invoke(measureScope, list, Constraints.m2923boximpl(j));
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111112) {
                    return function4.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111112)).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i11111112) {
                    return function3.invoke(intrinsicMeasureScope, list, Integer.valueOf(i11111112)).intValue();
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density1111113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1111113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion1111113 = ComposeUiNode.INSTANCE;
            constructor = companion1111113.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111113 = materializerOf(modifier3);
            int i11111112 = ((((i3 >> 12) & 112) | (i3 & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
            Composer composerM899constructorimpl1111113 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl1111113, measurePolicy1111113, companion1111113.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl1111113, density1111113, companion1111113.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl1111113, layoutDirection1111113, companion1111113.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf1111113.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i11111112 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i11111112 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier1115 = modifier3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.Layout.2
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

            public final void invoke(@Nullable Composer composer2, int i11111113) {
                LayoutKt.Layout(function2, function3, function4, function5, function6, modifier1115, function7, composer2, i | 1, i2);
            }
        });
    }
}
