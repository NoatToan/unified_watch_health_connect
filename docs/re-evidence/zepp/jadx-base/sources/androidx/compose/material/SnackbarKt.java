package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.b;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a{\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ac\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\"\u0010\u0018\u001a\u00020\u00032\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001b\u001a\u00020\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a5\u0010\u001d\u001a\u00020\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001c\"\u0019\u0010\u001e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0019\u0010 \u001a\u00020\r8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010\u001f\"\u0019\u0010!\u001a\u00020\r8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\u001f\"\u0019\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\"\u0010\u001f\"\u0019\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010\u001f\"\u0019\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b$\u0010\u001f\"\u0019\u0010%\u001a\u00020\r8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b%\u0010\u001f\"\u0019\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b&\u0010\u001f\"\u0019\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b'\u0010\u001f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "action", "", "actionOnNewLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", b.H, "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "content", "Snackbar-7zSek6w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Snackbar", "Landroidx/compose/material/SnackbarData;", "snackbarData", "actionColor", "Snackbar-sPrSdHI", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V", "TextOnlySnackbar", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "text", "NewLineButtonSnackbar", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "HeightToFirstLine", "F", "HorizontalSpacing", "HorizontalSpacingButtonSide", "SeparateButtonExtraY", "SnackbarVerticalPadding", "TextEndExtraSpacing", "LongButtonVerticalOffset", "SnackbarMinHeightOneLine", "SnackbarMinHeightTwoLines", "material_release"}, k = 2, mv = {1, 5, 1})
public final class SnackbarKt {
    private static final float HeightToFirstLine = Dp.m2965constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m2965constructorimpl(16);
    private static final float HorizontalSpacingButtonSide;
    private static final float LongButtonVerticalOffset;
    private static final float SeparateButtonExtraY;
    private static final float SnackbarMinHeightOneLine;
    private static final float SnackbarMinHeightTwoLines;
    private static final float SnackbarVerticalPadding;
    private static final float TextEndExtraSpacing;

    static {
        float f = 8;
        HorizontalSpacingButtonSide = Dp.m2965constructorimpl(f);
        SeparateButtonExtraY = Dp.m2965constructorimpl(f);
        float fM2965constructorimpl = Dp.m2965constructorimpl(6);
        SnackbarVerticalPadding = fM2965constructorimpl;
        TextEndExtraSpacing = Dp.m2965constructorimpl(f);
        LongButtonVerticalOffset = Dp.m2965constructorimpl(18);
        float f2 = 2;
        SnackbarMinHeightOneLine = Dp.m2965constructorimpl(Dp.m2965constructorimpl(48) - Dp.m2965constructorimpl(fM2965constructorimpl * f2));
        SnackbarMinHeightTwoLines = Dp.m2965constructorimpl(Dp.m2965constructorimpl(68) - Dp.m2965constructorimpl(fM2965constructorimpl * f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void NewLineButtonSnackbar(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-829912256);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(function3) ? 32 : 16;
        }
        if (((i2 & 91) ^ 18) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f = HorizontalSpacing;
            float f2 = HorizontalSpacingButtonSide;
            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(modifierFillMaxWidth$default, f, 0.0f, f2, SeparateButtonExtraY, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-1113031299);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
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
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(276693241);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(71171644);
            Modifier modifierM285paddingqDBjuR0$default2 = PaddingKt.m285paddingqDBjuR0$default(AlignmentLineKt.m225paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, f2, 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(683214592);
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierAlign = columnScopeInstance.align(companion, companion2.getEnd());
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierAlign);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            composerStartRestartGroup.startReplaceableGroup(683214646);
            function3.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.NewLineButtonSnackbar.2
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

            public final void invoke(@Nullable Composer composer2, int i3) {
                SnackbarKt.NewLineButtonSnackbar(function2, function3, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void OneRowSnackbar(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1143069246);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(function3) ? 32 : 16;
        }
        if (((i2 & 91) ^ 18) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            final String str = "text";
            final String str2 = "action";
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = HorizontalSpacing;
            float f2 = HorizontalSpacingButtonSide;
            float f3 = SnackbarVerticalPadding;
            Modifier modifierM284paddingqDBjuR0 = PaddingKt.m284paddingqDBjuR0(companion, f, f3, f2, f3);
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt.OneRowSnackbar.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                    int iMax;
                    final int height;
                    final int i3;
                    String str3 = str2;
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), str3)) {
                            final Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(j);
                            int iCoerceAtLeast = e.coerceAtLeast((Constraints.m2935getMaxWidthimpl(j) - placeableMo2468measureBRTryo0.getWidth()) - measureScope.mo188roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing), Constraints.m2937getMinWidthimpl(j));
                            String str4 = str;
                            for (Measurable measurable2 : list) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), str4)) {
                                    final Placeable placeableMo2468measureBRTryo1 = measurable2.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j, 0, iCoerceAtLeast, 0, 0, 9, null));
                                    int i4 = placeableMo2468measureBRTryo1.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                    if (!(i4 != Integer.MIN_VALUE)) {
                                        throw new IllegalArgumentException("No baselines for text".toString());
                                    }
                                    int i5 = placeableMo2468measureBRTryo1.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                                    if (!(i5 != Integer.MIN_VALUE)) {
                                        throw new IllegalArgumentException("No baselines for text".toString());
                                    }
                                    boolean z = i4 == i5;
                                    final int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j) - placeableMo2468measureBRTryo0.getWidth();
                                    if (z) {
                                        int iMax2 = Math.max(measureScope.mo188roundToPx0680j_4(SnackbarKt.SnackbarMinHeightOneLine), placeableMo2468measureBRTryo0.getHeight());
                                        int height2 = (iMax2 - placeableMo2468measureBRTryo1.getHeight()) / 2;
                                        int i6 = placeableMo2468measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                        int i7 = i6 != Integer.MIN_VALUE ? (i4 + height2) - i6 : 0;
                                        iMax = iMax2;
                                        i3 = height2;
                                        height = i7;
                                    } else {
                                        int iMo188roundToPx0680j_4 = (measureScope.mo188roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i4) - measureScope.mo188roundToPx0680j_4(SnackbarKt.SnackbarVerticalPadding);
                                        iMax = Math.max(measureScope.mo188roundToPx0680j_4(SnackbarKt.SnackbarMinHeightTwoLines), placeableMo2468measureBRTryo1.getHeight() + iMo188roundToPx0680j_4);
                                        height = (iMax - placeableMo2468measureBRTryo0.getHeight()) / 2;
                                        i3 = iMo188roundToPx0680j_4;
                                    }
                                    return MeasureScope.DefaultImpls.layout$default(measureScope, Constraints.m2935getMaxWidthimpl(j), iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$measure$4
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
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo1, 0, i3, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, iM2935getMaxWidthimpl, height, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM284paddingqDBjuR0);
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
            Updater.m906setimpl(composerM899constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-849178856);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "text");
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierLayoutId);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-202240421);
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, "action");
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierLayoutId2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl3, density3, companion2.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion2.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            composerStartRestartGroup.startReplaceableGroup(-202240364);
            function3.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.OneRowSnackbar.3
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

            public final void invoke(@Nullable Composer composer2, int i3) {
                SnackbarKt.OneRowSnackbar(function2, function3, composer2, i | 1);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:113:0x014d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0152  */
    /* JADX WARN: Code duplicated, block: B:119:0x0157  */
    /* JADX WARN: Code duplicated, block: B:120:0x0164  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:127:0x0183  */
    /* JADX WARN: Code duplicated, block: B:129:0x0187  */
    /* JADX WARN: Code duplicated, block: B:130:0x018e  */
    /* JADX WARN: Code duplicated, block: B:136:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d  */
    @Composable
    /* JADX INFO: renamed from: Snackbar-7zSek6w, reason: not valid java name */
    public static final void m799Snackbar7zSek6w(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z, @Nullable Shape shape, long j, long j2, float f, @NotNull final Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Function2<? super Composer, ? super Integer, Unit> function4;
        int i4;
        final boolean z2;
        int i5;
        Shape shape2;
        long backgroundColor;
        int i6;
        int i7;
        final Function2<? super Composer, ? super Integer, Unit> function5;
        int i8;
        final Modifier modifier2;
        Shape small;
        long jM642getSurface0d7_KjU;
        float fM2965constructorimpl;
        final int i9;
        long j3;
        float f2;
        final float f3;
        final Shape shape3;
        final Function2<? super Composer, ? super Integer, Unit> function6;
        final long j4;
        final boolean z3;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(895524162);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 112) == 0) {
                function4 = function2;
                i3 |= composerStartRestartGroup.changed(function4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i14 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i14;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i14;
                } else {
                    shape2 = shape;
                }
                if ((57344 & i) == 0) {
                    backgroundColor = j;
                    if ((i2 & 16) == 0 || !composerStartRestartGroup.changed(backgroundColor)) {
                        i11 = 8192;
                    } else {
                        i11 = 16384;
                    }
                    i3 |= i11;
                } else {
                    backgroundColor = j;
                }
                if ((i & 458752) != 0) {
                    if ((i2 & 32) == 0 || !composerStartRestartGroup.changed(j2)) {
                        i10 = 65536;
                    } else {
                        i10 = 131072;
                    }
                    i3 |= i10;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                    function5 = function3;
                } else {
                    function5 = function3;
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changed(function5)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                }
                if (((23967451 & i3) ^ 4793490) == 0 || !composerStartRestartGroup.getSkipping()) {
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM642getSurface0d7_KjU = j2;
                        }
                        if (i6 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(6);
                        } else {
                            fM2965constructorimpl = f;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        shape2 = small;
                        j3 = jM642getSurface0d7_KjU;
                        f2 = fM2965constructorimpl;
                    } else {
                        composerStartRestartGroup.skipCurrentGroup();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier2 = modifier;
                        j3 = j2;
                        f2 = f;
                        i9 = i3;
                    }
                    long j6 = backgroundColor;
                    int i15 = i9 >> 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, j6, j3, (BorderStroke) null, f2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890581, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                        public final void invoke(@Nullable Composer composer2, int i16) {
                            if (((i16 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))};
                            final Function2<Composer, Integer, Unit> function7 = function4;
                            final Function2<Composer, Integer, Unit> function8 = function5;
                            final int i17 = i9;
                            final boolean z4 = z2;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890248, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                public final void invoke(@Nullable Composer composer3, int i18) {
                                    if (((i18 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 0).getBody2();
                                    final Function2<Composer, Integer, Unit> function9 = function7;
                                    final Function2<Composer, Integer, Unit> function10 = function8;
                                    final int i19 = i17;
                                    final boolean z5 = z4;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, -819890387, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i20) {
                                            if (((i20 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (function9 == null) {
                                                composer4.startReplaceableGroup(59708346);
                                                SnackbarKt.TextOnlySnackbar(function10, composer4, (i19 >> 21) & 14);
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            if (z5) {
                                                composer4.startReplaceableGroup(59708411);
                                                Function2<Composer, Integer, Unit> function11 = function10;
                                                Function2<Composer, Integer, Unit> function12 = function9;
                                                int i21 = i19;
                                                SnackbarKt.NewLineButtonSnackbar(function11, function12, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.startReplaceableGroup(59708478);
                                            Function2<Composer, Integer, Unit> function13 = function10;
                                            Function2<Composer, Integer, Unit> function14 = function9;
                                            int i22 = i19;
                                            SnackbarKt.OneRowSnackbar(function13, function14, composer4, (i22 & 112) | ((i22 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        }
                                    }), composer3, 48);
                                }
                            }), composer2, 56);
                        }
                    }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i9 >> 3) & 458752), 16);
                    f3 = f2;
                    shape3 = shape2;
                    function6 = function4;
                    j4 = j6;
                    z3 = z2;
                    j5 = j3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    f3 = f;
                    function6 = function4;
                    z3 = z2;
                    shape3 = shape2;
                    j4 = backgroundColor;
                    j5 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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

                    public final void invoke(@Nullable Composer composer2, int i16) {
                        SnackbarKt.m799Snackbar7zSek6w(modifier2, function6, z3, shape3, j4, j5, f3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            z2 = z;
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i14;
                } else {
                    shape2 = shape;
                }
                i3 |= i14;
            } else {
                shape2 = shape;
            }
            if ((57344 & i) == 0) {
                backgroundColor = j;
                if ((i2 & 16) == 0) {
                    i11 = 8192;
                } else {
                    i11 = 8192;
                }
                i3 |= i11;
            } else {
                backgroundColor = j;
            }
            if ((i & 458752) != 0) {
                if ((i2 & 32) == 0) {
                    i10 = 65536;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
                function5 = function3;
            } else {
                function5 = function3;
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changed(function5)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
            }
            if (((23967451 & i3) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM642getSurface0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    shape2 = small;
                    j3 = jM642getSurface0d7_KjU;
                    f2 = fM2965constructorimpl;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM642getSurface0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    shape2 = small;
                    j3 = jM642getSurface0d7_KjU;
                    f2 = fM2965constructorimpl;
                }
                long j7 = backgroundColor;
                int i16 = i9 >> 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, j7, j3, (BorderStroke) null, f2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890581, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                    public final void invoke(@Nullable Composer composer2, int i17) {
                        if (((i17 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))};
                        final Function2<? super Composer, ? super Integer, Unit> function7 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function8 = function5;
                        final int i18 = i9;
                        final boolean z4 = z2;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890248, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i19) {
                                if (((i19 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 0).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function9 = function7;
                                final Function2<? super Composer, ? super Integer, Unit> function10 = function8;
                                final int i110 = i18;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, -819890387, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i20) {
                                        if (((i20 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (function9 == null) {
                                            composer4.startReplaceableGroup(59708346);
                                            SnackbarKt.TextOnlySnackbar(function10, composer4, (i110 >> 21) & 14);
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        if (z5) {
                                            composer4.startReplaceableGroup(59708411);
                                            Function2<Composer, Integer, Unit> function11 = function10;
                                            Function2<Composer, Integer, Unit> function12 = function9;
                                            int i21 = i110;
                                            SnackbarKt.NewLineButtonSnackbar(function11, function12, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.startReplaceableGroup(59708478);
                                        Function2<Composer, Integer, Unit> function13 = function10;
                                        Function2<Composer, Integer, Unit> function14 = function9;
                                        int i22 = i110;
                                        SnackbarKt.OneRowSnackbar(function13, function14, composer4, (i22 & 112) | ((i22 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                    }
                                }), composer3, 48);
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i16 & 112) | (i16 & 896) | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i9 >> 3) & 458752), 16);
                f3 = f2;
                shape3 = shape2;
                function6 = function4;
                j4 = j7;
                z3 = z2;
                j5 = j3;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM642getSurface0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    shape2 = small;
                    j3 = jM642getSurface0d7_KjU;
                    f2 = fM2965constructorimpl;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM642getSurface0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    shape2 = small;
                    j3 = jM642getSurface0d7_KjU;
                    f2 = fM2965constructorimpl;
                }
                long j8 = backgroundColor;
                int i17 = i9 >> 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, j8, j3, (BorderStroke) null, f2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890581, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                    public final void invoke(@Nullable Composer composer2, int i18) {
                        if (((i18 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))};
                        final Function2<? super Composer, ? super Integer, Unit> function7 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function8 = function5;
                        final int i19 = i9;
                        final boolean z4 = z2;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890248, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i110) {
                                if (((i110 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 0).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function9 = function7;
                                final Function2<? super Composer, ? super Integer, Unit> function10 = function8;
                                final int i111 = i19;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, -819890387, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i20) {
                                        if (((i20 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (function9 == null) {
                                            composer4.startReplaceableGroup(59708346);
                                            SnackbarKt.TextOnlySnackbar(function10, composer4, (i111 >> 21) & 14);
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        if (z5) {
                                            composer4.startReplaceableGroup(59708411);
                                            Function2<Composer, Integer, Unit> function11 = function10;
                                            Function2<Composer, Integer, Unit> function12 = function9;
                                            int i21 = i111;
                                            SnackbarKt.NewLineButtonSnackbar(function11, function12, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.startReplaceableGroup(59708478);
                                        Function2<Composer, Integer, Unit> function13 = function10;
                                        Function2<Composer, Integer, Unit> function14 = function9;
                                        int i22 = i111;
                                        SnackbarKt.OneRowSnackbar(function13, function14, composer4, (i22 & 112) | ((i22 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                    }
                                }), composer3, 48);
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i17 & 112) | (i17 & 896) | (i17 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i9 >> 3) & 458752), 16);
                f3 = f2;
                shape3 = shape2;
                function6 = function4;
                j4 = j8;
                z3 = z2;
                j5 = j3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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

                public final void invoke(@Nullable Composer composer2, int i18) {
                    SnackbarKt.m799Snackbar7zSek6w(modifier2, function6, z3, shape3, j4, j5, f3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        function4 = function2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i14;
                } else {
                    shape2 = shape;
                }
                i3 |= i14;
            } else {
                shape2 = shape;
            }
            if ((57344 & i) == 0) {
                backgroundColor = j;
                if ((i2 & 16) == 0) {
                    i11 = 8192;
                } else {
                    i11 = 8192;
                }
                i3 |= i11;
            } else {
                backgroundColor = j;
            }
            if ((i & 458752) != 0) {
                if ((i2 & 32) == 0) {
                    i10 = 65536;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
                function5 = function3;
            } else {
                function5 = function3;
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changed(function5)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
            }
            if (((23967451 & i3) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM642getSurface0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    shape2 = small;
                    j3 = jM642getSurface0d7_KjU;
                    f2 = fM2965constructorimpl;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM642getSurface0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    shape2 = small;
                    j3 = jM642getSurface0d7_KjU;
                    f2 = fM2965constructorimpl;
                }
                long j9 = backgroundColor;
                int i18 = i9 >> 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, j9, j3, (BorderStroke) null, f2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890581, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                    public final void invoke(@Nullable Composer composer2, int i19) {
                        if (((i19 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))};
                        final Function2<? super Composer, ? super Integer, Unit> function7 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function8 = function5;
                        final int i110 = i9;
                        final boolean z4 = z2;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890248, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i111) {
                                if (((i111 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 0).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function9 = function7;
                                final Function2<? super Composer, ? super Integer, Unit> function10 = function8;
                                final int i112 = i110;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, -819890387, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i20) {
                                        if (((i20 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (function9 == null) {
                                            composer4.startReplaceableGroup(59708346);
                                            SnackbarKt.TextOnlySnackbar(function10, composer4, (i112 >> 21) & 14);
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        if (z5) {
                                            composer4.startReplaceableGroup(59708411);
                                            Function2<Composer, Integer, Unit> function11 = function10;
                                            Function2<Composer, Integer, Unit> function12 = function9;
                                            int i21 = i112;
                                            SnackbarKt.NewLineButtonSnackbar(function11, function12, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.startReplaceableGroup(59708478);
                                        Function2<Composer, Integer, Unit> function13 = function10;
                                        Function2<Composer, Integer, Unit> function14 = function9;
                                        int i22 = i112;
                                        SnackbarKt.OneRowSnackbar(function13, function14, composer4, (i22 & 112) | ((i22 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                    }
                                }), composer3, 48);
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i18 & 112) | (i18 & 896) | (i18 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i9 >> 3) & 458752), 16);
                f3 = f2;
                shape3 = shape2;
                function6 = function4;
                j4 = j9;
                z3 = z2;
                j5 = j3;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM642getSurface0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    shape2 = small;
                    j3 = jM642getSurface0d7_KjU;
                    f2 = fM2965constructorimpl;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM642getSurface0d7_KjU = j2;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    shape2 = small;
                    j3 = jM642getSurface0d7_KjU;
                    f2 = fM2965constructorimpl;
                }
                long j10 = backgroundColor;
                int i19 = i9 >> 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, j10, j3, (BorderStroke) null, f2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890581, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                    public final void invoke(@Nullable Composer composer2, int i110) {
                        if (((i110 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))};
                        final Function2<? super Composer, ? super Integer, Unit> function7 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function8 = function5;
                        final int i111 = i9;
                        final boolean z4 = z2;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890248, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i112) {
                                if (((i112 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 0).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function9 = function7;
                                final Function2<? super Composer, ? super Integer, Unit> function10 = function8;
                                final int i113 = i111;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, -819890387, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i20) {
                                        if (((i20 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (function9 == null) {
                                            composer4.startReplaceableGroup(59708346);
                                            SnackbarKt.TextOnlySnackbar(function10, composer4, (i113 >> 21) & 14);
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        if (z5) {
                                            composer4.startReplaceableGroup(59708411);
                                            Function2<Composer, Integer, Unit> function11 = function10;
                                            Function2<Composer, Integer, Unit> function12 = function9;
                                            int i21 = i113;
                                            SnackbarKt.NewLineButtonSnackbar(function11, function12, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.startReplaceableGroup(59708478);
                                        Function2<Composer, Integer, Unit> function13 = function10;
                                        Function2<Composer, Integer, Unit> function14 = function9;
                                        int i22 = i113;
                                        SnackbarKt.OneRowSnackbar(function13, function14, composer4, (i22 & 112) | ((i22 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                    }
                                }), composer3, 48);
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i19 & 112) | (i19 & 896) | (i19 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i9 >> 3) & 458752), 16);
                f3 = f2;
                shape3 = shape2;
                function6 = function4;
                j4 = j10;
                z3 = z2;
                j5 = j3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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

                public final void invoke(@Nullable Composer composer2, int i110) {
                    SnackbarKt.m799Snackbar7zSek6w(modifier2, function6, z3, shape3, j4, j5, f3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        z2 = z;
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i14;
            } else {
                shape2 = shape;
            }
            i3 |= i14;
        } else {
            shape2 = shape;
        }
        if ((57344 & i) == 0) {
            backgroundColor = j;
            if ((i2 & 16) == 0) {
                i11 = 8192;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        } else {
            backgroundColor = j;
        }
        if ((i & 458752) != 0) {
            if ((i2 & 32) == 0) {
                i10 = 65536;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
            function5 = function3;
        } else {
            function5 = function3;
            if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changed(function5)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
        }
        if (((23967451 & i3) ^ 4793490) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM642getSurface0d7_KjU = j2;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(6);
                } else {
                    fM2965constructorimpl = f;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                shape2 = small;
                j3 = jM642getSurface0d7_KjU;
                f2 = fM2965constructorimpl;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM642getSurface0d7_KjU = j2;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(6);
                } else {
                    fM2965constructorimpl = f;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                shape2 = small;
                j3 = jM642getSurface0d7_KjU;
                f2 = fM2965constructorimpl;
            }
            long j11 = backgroundColor;
            int i110 = i9 >> 6;
            SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, j11, j3, (BorderStroke) null, f2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890581, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                public final void invoke(@Nullable Composer composer2, int i111) {
                    if (((i111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))};
                    final Function2<? super Composer, ? super Integer, Unit> function7 = function4;
                    final Function2<? super Composer, ? super Integer, Unit> function8 = function5;
                    final int i112 = i9;
                    final boolean z4 = z2;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890248, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                        public final void invoke(@Nullable Composer composer3, int i113) {
                            if (((i113 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 0).getBody2();
                            final Function2<? super Composer, ? super Integer, Unit> function9 = function7;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function8;
                            final int i114 = i112;
                            final boolean z5 = z4;
                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, -819890387, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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
                                public final void invoke(@Nullable Composer composer4, int i20) {
                                    if (((i20 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (function9 == null) {
                                        composer4.startReplaceableGroup(59708346);
                                        SnackbarKt.TextOnlySnackbar(function10, composer4, (i114 >> 21) & 14);
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    if (z5) {
                                        composer4.startReplaceableGroup(59708411);
                                        Function2<Composer, Integer, Unit> function11 = function10;
                                        Function2<Composer, Integer, Unit> function12 = function9;
                                        int i21 = i114;
                                        SnackbarKt.NewLineButtonSnackbar(function11, function12, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.startReplaceableGroup(59708478);
                                    Function2<Composer, Integer, Unit> function13 = function10;
                                    Function2<Composer, Integer, Unit> function14 = function9;
                                    int i22 = i114;
                                    SnackbarKt.OneRowSnackbar(function13, function14, composer4, (i22 & 112) | ((i22 >> 21) & 14));
                                    composer4.endReplaceableGroup();
                                }
                            }), composer3, 48);
                        }
                    }), composer2, 56);
                }
            }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i110 & 112) | (i110 & 896) | (i110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i9 >> 3) & 458752), 16);
            f3 = f2;
            shape3 = shape2;
            function6 = function4;
            j4 = j11;
            z3 = z2;
            j5 = j3;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM642getSurface0d7_KjU = j2;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(6);
                } else {
                    fM2965constructorimpl = f;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                shape2 = small;
                j3 = jM642getSurface0d7_KjU;
                f2 = fM2965constructorimpl;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM642getSurface0d7_KjU = j2;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(6);
                } else {
                    fM2965constructorimpl = f;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                shape2 = small;
                j3 = jM642getSurface0d7_KjU;
                f2 = fM2965constructorimpl;
            }
            long j12 = backgroundColor;
            int i111 = i9 >> 6;
            SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, j12, j3, (BorderStroke) null, f2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890581, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                public final void invoke(@Nullable Composer composer2, int i112) {
                    if (((i112 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))};
                    final Function2<? super Composer, ? super Integer, Unit> function7 = function4;
                    final Function2<? super Composer, ? super Integer, Unit> function8 = function5;
                    final int i113 = i9;
                    final boolean z4 = z2;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890248, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                        public final void invoke(@Nullable Composer composer3, int i114) {
                            if (((i114 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 0).getBody2();
                            final Function2<? super Composer, ? super Integer, Unit> function9 = function7;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function8;
                            final int i115 = i113;
                            final boolean z5 = z4;
                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, -819890387, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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
                                public final void invoke(@Nullable Composer composer4, int i20) {
                                    if (((i20 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (function9 == null) {
                                        composer4.startReplaceableGroup(59708346);
                                        SnackbarKt.TextOnlySnackbar(function10, composer4, (i115 >> 21) & 14);
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    if (z5) {
                                        composer4.startReplaceableGroup(59708411);
                                        Function2<Composer, Integer, Unit> function11 = function10;
                                        Function2<Composer, Integer, Unit> function12 = function9;
                                        int i21 = i115;
                                        SnackbarKt.NewLineButtonSnackbar(function11, function12, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.startReplaceableGroup(59708478);
                                    Function2<Composer, Integer, Unit> function13 = function10;
                                    Function2<Composer, Integer, Unit> function14 = function9;
                                    int i22 = i115;
                                    SnackbarKt.OneRowSnackbar(function13, function14, composer4, (i22 & 112) | ((i22 >> 21) & 14));
                                    composer4.endReplaceableGroup();
                                }
                            }), composer3, 48);
                        }
                    }), composer2, 56);
                }
            }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i111 & 112) | (i111 & 896) | (i111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i9 >> 3) & 458752), 16);
            f3 = f2;
            shape3 = shape2;
            function6 = function4;
            j4 = j12;
            z3 = z2;
            j5 = j3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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

            public final void invoke(@Nullable Composer composer2, int i112) {
                SnackbarKt.m799Snackbar7zSek6w(modifier2, function6, z3, shape3, j4, j5, f3, function3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x014b  */
    /* JADX WARN: Code duplicated, block: B:115:0x014e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0152  */
    /* JADX WARN: Code duplicated, block: B:121:0x0157  */
    /* JADX WARN: Code duplicated, block: B:122:0x0164  */
    /* JADX WARN: Code duplicated, block: B:125:0x0169  */
    /* JADX WARN: Code duplicated, block: B:126:0x0172  */
    /* JADX WARN: Code duplicated, block: B:129:0x0178  */
    /* JADX WARN: Code duplicated, block: B:132:0x0188  */
    /* JADX WARN: Code duplicated, block: B:133:0x0191  */
    /* JADX WARN: Code duplicated, block: B:135:0x0194  */
    /* JADX WARN: Code duplicated, block: B:136:0x019b  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:146:0x0220  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    @Composable
    /* JADX INFO: renamed from: Snackbar-sPrSdHI, reason: not valid java name */
    public static final void m800SnackbarsPrSdHI(@NotNull final SnackbarData snackbarData, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, long j, long j2, long j3, float f, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Shape shape2;
        long jM642getSurface0d7_KjU;
        long j4;
        int i6;
        final float f2;
        int i7;
        Modifier modifier3;
        Shape small;
        long backgroundColor;
        long primaryActionColor;
        float fM2965constructorimpl;
        long j5;
        long j6;
        int i8;
        float f3;
        long j7;
        final String actionLabel;
        boolean z3;
        ComposableLambda composableLambda;
        final Shape shape3;
        final long j8;
        final long j9;
        final Modifier modifier4;
        final boolean z4;
        final long j10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(895527353);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i11 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((i & 57344) != 0) {
                    i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        jM642getSurface0d7_KjU = j2;
                        int i12 = composerStartRestartGroup.changed(jM642getSurface0d7_KjU) ? 131072 : 65536;
                        i3 |= i12;
                    } else {
                        jM642getSurface0d7_KjU = j2;
                    }
                    i3 |= i12;
                } else {
                    jM642getSurface0d7_KjU = j2;
                }
                if ((i & 3670016) == 0) {
                    j4 = j3;
                    if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(j4)) {
                        i9 = 524288;
                    } else {
                        i9 = 1048576;
                    }
                    i3 |= i9;
                } else {
                    j4 = j3;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i3 |= i7;
                    }
                }
                if (((i3 & 23967451) ^ 4793490) == 0 || !composerStartRestartGroup.getSkipping()) {
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                            i3 &= -57345;
                        } else {
                            backgroundColor = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                            i3 &= -3670017;
                        } else {
                            primaryActionColor = j4;
                        }
                        if (i6 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(6);
                        } else {
                            fM2965constructorimpl = f2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j5 = primaryActionColor;
                        j6 = jM642getSurface0d7_KjU;
                        i8 = i3;
                        shape2 = small;
                        f3 = fM2965constructorimpl;
                        modifier2 = modifier3;
                        j7 = backgroundColor;
                    } else {
                        composerStartRestartGroup.skipCurrentGroup();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        f3 = f2;
                        j5 = j4;
                        j6 = jM642getSurface0d7_KjU;
                        i8 = i3;
                        j7 = j;
                    }
                    actionLabel = snackbarData.getActionLabel();
                    if (actionLabel != null) {
                        final long j11 = j5;
                        final int i13 = i8;
                        z3 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889186, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i14) {
                                if (((i14 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                ButtonColors buttonColorsM609textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m609textButtonColorsRGew2ao(0L, j11, 0L, composer2, (i13 >> 15) & 112, 5);
                                final SnackbarData snackbarData2 = snackbarData;
                                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Unit getA() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        snackbarData2.performAction();
                                    }
                                };
                                final String str = actionLabel;
                                ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM609textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -819890024, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                        invoke(rowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer3, int i15) {
                                        if (((i15 & 81) ^ 16) == 0 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                        } else {
                                            TextKt.m869TextfLXpl1I(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 0, 64, 65534);
                                        }
                                    }
                                }), composer2, C.ENCODING_PCM_32BIT, 382);
                            }
                        });
                    } else {
                        z3 = true;
                        composableLambda = null;
                    }
                    Modifier modifier5 = modifier2;
                    m799Snackbar7zSek6w(PaddingKt.m281padding3ABfNKs(modifier2, Dp.m2965constructorimpl(12)), composableLambda, z2, shape2, j7, j6, f3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890114, z3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i14) {
                            if (((i14 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                TextKt.m869TextfLXpl1I(snackbarData.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 64, 65534);
                            }
                        }
                    }), composerStartRestartGroup, (i8 & 896) | 12582912 | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i8) | (458752 & i8) | ((i8 >> 3) & 3670016), 0);
                    f2 = f3;
                    shape3 = shape2;
                    j8 = j6;
                    j9 = j5;
                    long j12 = j7;
                    modifier4 = modifier5;
                    z4 = z2;
                    j10 = j12;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    z4 = z2;
                    shape3 = shape2;
                    j9 = j4;
                    j8 = jM642getSurface0d7_KjU;
                    j10 = j;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i14) {
                        SnackbarKt.m800SnackbarsPrSdHI(snackbarData, modifier4, z4, shape3, j10, j8, j9, f2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            z2 = z;
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                i3 |= i11;
            } else {
                shape2 = shape;
            }
            if ((i & 57344) != 0) {
                i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    jM642getSurface0d7_KjU = j2;
                    if (composerStartRestartGroup.changed(jM642getSurface0d7_KjU)) {
                    }
                    i3 |= i12;
                } else {
                    jM642getSurface0d7_KjU = j2;
                }
                i3 |= i12;
            } else {
                jM642getSurface0d7_KjU = j2;
            }
            if ((i & 3670016) == 0) {
                j4 = j3;
                if ((i2 & 64) == 0) {
                    i9 = 524288;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                j4 = j3;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                i3 |= 12582912;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
            }
            if (((i3 & 23967451) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j5 = primaryActionColor;
                    j6 = jM642getSurface0d7_KjU;
                    i8 = i3;
                    shape2 = small;
                    f3 = fM2965constructorimpl;
                    modifier2 = modifier3;
                    j7 = backgroundColor;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j5 = primaryActionColor;
                    j6 = jM642getSurface0d7_KjU;
                    i8 = i3;
                    shape2 = small;
                    f3 = fM2965constructorimpl;
                    modifier2 = modifier3;
                    j7 = backgroundColor;
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    final long j13 = j5;
                    final int i14 = i8;
                    z3 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889186, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i15) {
                            if (((i15 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ButtonColors buttonColorsM609textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m609textButtonColorsRGew2ao(0L, j13, 0L, composer2, (i14 >> 15) & 112, 5);
                            final SnackbarData snackbarData2 = snackbarData;
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snackbarData2.performAction();
                                }
                            };
                            final String str = actionLabel;
                            ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM609textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -819890024, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer3, int i16) {
                                    if (((i16 & 81) ^ 16) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        TextKt.m869TextfLXpl1I(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 0, 64, 65534);
                                    }
                                }
                            }), composer2, C.ENCODING_PCM_32BIT, 382);
                        }
                    });
                } else {
                    z3 = true;
                    composableLambda = null;
                }
                Modifier modifier6 = modifier2;
                m799Snackbar7zSek6w(PaddingKt.m281padding3ABfNKs(modifier2, Dp.m2965constructorimpl(12)), composableLambda, z2, shape2, j7, j6, f3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890114, z3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i15) {
                        if (((i15 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            TextKt.m869TextfLXpl1I(snackbarData.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 64, 65534);
                        }
                    }
                }), composerStartRestartGroup, (i8 & 896) | 12582912 | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i8) | (458752 & i8) | ((i8 >> 3) & 3670016), 0);
                f2 = f3;
                shape3 = shape2;
                j8 = j6;
                j9 = j5;
                long j14 = j7;
                modifier4 = modifier6;
                z4 = z2;
                j10 = j14;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j5 = primaryActionColor;
                    j6 = jM642getSurface0d7_KjU;
                    i8 = i3;
                    shape2 = small;
                    f3 = fM2965constructorimpl;
                    modifier2 = modifier3;
                    j7 = backgroundColor;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j5 = primaryActionColor;
                    j6 = jM642getSurface0d7_KjU;
                    i8 = i3;
                    shape2 = small;
                    f3 = fM2965constructorimpl;
                    modifier2 = modifier3;
                    j7 = backgroundColor;
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    final long j15 = j5;
                    final int i15 = i8;
                    z3 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889186, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i16) {
                            if (((i16 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ButtonColors buttonColorsM609textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m609textButtonColorsRGew2ao(0L, j15, 0L, composer2, (i15 >> 15) & 112, 5);
                            final SnackbarData snackbarData2 = snackbarData;
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snackbarData2.performAction();
                                }
                            };
                            final String str = actionLabel;
                            ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM609textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -819890024, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer3, int i17) {
                                    if (((i17 & 81) ^ 16) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        TextKt.m869TextfLXpl1I(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 0, 64, 65534);
                                    }
                                }
                            }), composer2, C.ENCODING_PCM_32BIT, 382);
                        }
                    });
                } else {
                    z3 = true;
                    composableLambda = null;
                }
                Modifier modifier7 = modifier2;
                m799Snackbar7zSek6w(PaddingKt.m281padding3ABfNKs(modifier2, Dp.m2965constructorimpl(12)), composableLambda, z2, shape2, j7, j6, f3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890114, z3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i16) {
                        if (((i16 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            TextKt.m869TextfLXpl1I(snackbarData.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 64, 65534);
                        }
                    }
                }), composerStartRestartGroup, (i8 & 896) | 12582912 | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i8) | (458752 & i8) | ((i8 >> 3) & 3670016), 0);
                f2 = f3;
                shape3 = shape2;
                j8 = j6;
                j9 = j5;
                long j16 = j7;
                modifier4 = modifier7;
                z4 = z2;
                j10 = j16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i16) {
                    SnackbarKt.m800SnackbarsPrSdHI(snackbarData, modifier4, z4, shape3, j10, j8, j9, f2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                i3 |= i11;
            } else {
                shape2 = shape;
            }
            if ((i & 57344) != 0) {
                i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    jM642getSurface0d7_KjU = j2;
                    if (composerStartRestartGroup.changed(jM642getSurface0d7_KjU)) {
                    }
                    i3 |= i12;
                } else {
                    jM642getSurface0d7_KjU = j2;
                }
                i3 |= i12;
            } else {
                jM642getSurface0d7_KjU = j2;
            }
            if ((i & 3670016) == 0) {
                j4 = j3;
                if ((i2 & 64) == 0) {
                    i9 = 524288;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                j4 = j3;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                i3 |= 12582912;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
            }
            if (((i3 & 23967451) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j5 = primaryActionColor;
                    j6 = jM642getSurface0d7_KjU;
                    i8 = i3;
                    shape2 = small;
                    f3 = fM2965constructorimpl;
                    modifier2 = modifier3;
                    j7 = backgroundColor;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j5 = primaryActionColor;
                    j6 = jM642getSurface0d7_KjU;
                    i8 = i3;
                    shape2 = small;
                    f3 = fM2965constructorimpl;
                    modifier2 = modifier3;
                    j7 = backgroundColor;
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    final long j17 = j5;
                    final int i16 = i8;
                    z3 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889186, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i17) {
                            if (((i17 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ButtonColors buttonColorsM609textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m609textButtonColorsRGew2ao(0L, j17, 0L, composer2, (i16 >> 15) & 112, 5);
                            final SnackbarData snackbarData2 = snackbarData;
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snackbarData2.performAction();
                                }
                            };
                            final String str = actionLabel;
                            ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM609textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -819890024, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer3, int i18) {
                                    if (((i18 & 81) ^ 16) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        TextKt.m869TextfLXpl1I(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 0, 64, 65534);
                                    }
                                }
                            }), composer2, C.ENCODING_PCM_32BIT, 382);
                        }
                    });
                } else {
                    z3 = true;
                    composableLambda = null;
                }
                Modifier modifier8 = modifier2;
                m799Snackbar7zSek6w(PaddingKt.m281padding3ABfNKs(modifier2, Dp.m2965constructorimpl(12)), composableLambda, z2, shape2, j7, j6, f3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890114, z3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i17) {
                        if (((i17 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            TextKt.m869TextfLXpl1I(snackbarData.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 64, 65534);
                        }
                    }
                }), composerStartRestartGroup, (i8 & 896) | 12582912 | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i8) | (458752 & i8) | ((i8 >> 3) & 3670016), 0);
                f2 = f3;
                shape3 = shape2;
                j8 = j6;
                j9 = j5;
                long j18 = j7;
                modifier4 = modifier8;
                z4 = z2;
                j10 = j18;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j5 = primaryActionColor;
                    j6 = jM642getSurface0d7_KjU;
                    i8 = i3;
                    shape2 = small;
                    f3 = fM2965constructorimpl;
                    modifier2 = modifier3;
                    j7 = backgroundColor;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(6);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j5 = primaryActionColor;
                    j6 = jM642getSurface0d7_KjU;
                    i8 = i3;
                    shape2 = small;
                    f3 = fM2965constructorimpl;
                    modifier2 = modifier3;
                    j7 = backgroundColor;
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    final long j19 = j5;
                    final int i17 = i8;
                    z3 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889186, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i18) {
                            if (((i18 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ButtonColors buttonColorsM609textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m609textButtonColorsRGew2ao(0L, j19, 0L, composer2, (i17 >> 15) & 112, 5);
                            final SnackbarData snackbarData2 = snackbarData;
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snackbarData2.performAction();
                                }
                            };
                            final String str = actionLabel;
                            ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM609textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -819890024, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer3, int i19) {
                                    if (((i19 & 81) ^ 16) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        TextKt.m869TextfLXpl1I(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 0, 64, 65534);
                                    }
                                }
                            }), composer2, C.ENCODING_PCM_32BIT, 382);
                        }
                    });
                } else {
                    z3 = true;
                    composableLambda = null;
                }
                Modifier modifier9 = modifier2;
                m799Snackbar7zSek6w(PaddingKt.m281padding3ABfNKs(modifier2, Dp.m2965constructorimpl(12)), composableLambda, z2, shape2, j7, j6, f3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890114, z3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i18) {
                        if (((i18 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            TextKt.m869TextfLXpl1I(snackbarData.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 64, 65534);
                        }
                    }
                }), composerStartRestartGroup, (i8 & 896) | 12582912 | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i8) | (458752 & i8) | ((i8 >> 3) & 3670016), 0);
                f2 = f3;
                shape3 = shape2;
                j8 = j6;
                j9 = j5;
                long j110 = j7;
                modifier4 = modifier9;
                z4 = z2;
                j10 = j110;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i18) {
                    SnackbarKt.m800SnackbarsPrSdHI(snackbarData, modifier4, z4, shape3, j10, j8, j9, f2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        z2 = z;
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i11;
            } else {
                shape2 = shape;
            }
            i3 |= i11;
        } else {
            shape2 = shape;
        }
        if ((i & 57344) != 0) {
            i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
        }
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                jM642getSurface0d7_KjU = j2;
                if (composerStartRestartGroup.changed(jM642getSurface0d7_KjU)) {
                }
                i3 |= i12;
            } else {
                jM642getSurface0d7_KjU = j2;
            }
            i3 |= i12;
        } else {
            jM642getSurface0d7_KjU = j2;
        }
        if ((i & 3670016) == 0) {
            j4 = j3;
            if ((i2 & 64) == 0) {
                i9 = 524288;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        } else {
            j4 = j3;
        }
        i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
        }
        if (((i3 & 23967451) ^ 4793490) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                    i3 &= -57345;
                } else {
                    backgroundColor = j;
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                    i3 &= -3670017;
                } else {
                    primaryActionColor = j4;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(6);
                } else {
                    fM2965constructorimpl = f2;
                }
                composerStartRestartGroup.endDefaults();
                j5 = primaryActionColor;
                j6 = jM642getSurface0d7_KjU;
                i8 = i3;
                shape2 = small;
                f3 = fM2965constructorimpl;
                modifier2 = modifier3;
                j7 = backgroundColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                    i3 &= -57345;
                } else {
                    backgroundColor = j;
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                    i3 &= -3670017;
                } else {
                    primaryActionColor = j4;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(6);
                } else {
                    fM2965constructorimpl = f2;
                }
                composerStartRestartGroup.endDefaults();
                j5 = primaryActionColor;
                j6 = jM642getSurface0d7_KjU;
                i8 = i3;
                shape2 = small;
                f3 = fM2965constructorimpl;
                modifier2 = modifier3;
                j7 = backgroundColor;
            }
            actionLabel = snackbarData.getActionLabel();
            if (actionLabel != null) {
                final long j111 = j5;
                final int i18 = i8;
                z3 = true;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889186, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i19) {
                        if (((i19 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ButtonColors buttonColorsM609textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m609textButtonColorsRGew2ao(0L, j111, 0L, composer2, (i18 >> 15) & 112, 5);
                        final SnackbarData snackbarData2 = snackbarData;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snackbarData2.performAction();
                            }
                        };
                        final String str = actionLabel;
                        ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM609textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -819890024, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer3, int i110) {
                                if (((i110 & 81) ^ 16) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    TextKt.m869TextfLXpl1I(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 0, 64, 65534);
                                }
                            }
                        }), composer2, C.ENCODING_PCM_32BIT, 382);
                    }
                });
            } else {
                z3 = true;
                composableLambda = null;
            }
            Modifier modifier10 = modifier2;
            m799Snackbar7zSek6w(PaddingKt.m281padding3ABfNKs(modifier2, Dp.m2965constructorimpl(12)), composableLambda, z2, shape2, j7, j6, f3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890114, z3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i19) {
                    if (((i19 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        TextKt.m869TextfLXpl1I(snackbarData.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 64, 65534);
                    }
                }
            }), composerStartRestartGroup, (i8 & 896) | 12582912 | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i8) | (458752 & i8) | ((i8 >> 3) & 3670016), 0);
            f2 = f3;
            shape3 = shape2;
            j8 = j6;
            j9 = j5;
            long j112 = j7;
            modifier4 = modifier10;
            z4 = z2;
            j10 = j112;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                    i3 &= -57345;
                } else {
                    backgroundColor = j;
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                    i3 &= -3670017;
                } else {
                    primaryActionColor = j4;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(6);
                } else {
                    fM2965constructorimpl = f2;
                }
                composerStartRestartGroup.endDefaults();
                j5 = primaryActionColor;
                j6 = jM642getSurface0d7_KjU;
                i8 = i3;
                shape2 = small;
                f3 = fM2965constructorimpl;
                modifier2 = modifier3;
                j7 = backgroundColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 0);
                    i3 &= -57345;
                } else {
                    backgroundColor = j;
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 0);
                    i3 &= -3670017;
                } else {
                    primaryActionColor = j4;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(6);
                } else {
                    fM2965constructorimpl = f2;
                }
                composerStartRestartGroup.endDefaults();
                j5 = primaryActionColor;
                j6 = jM642getSurface0d7_KjU;
                i8 = i3;
                shape2 = small;
                f3 = fM2965constructorimpl;
                modifier2 = modifier3;
                j7 = backgroundColor;
            }
            actionLabel = snackbarData.getActionLabel();
            if (actionLabel != null) {
                final long j113 = j5;
                final int i19 = i8;
                z3 = true;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889186, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i110) {
                        if (((i110 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ButtonColors buttonColorsM609textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m609textButtonColorsRGew2ao(0L, j113, 0L, composer2, (i19 >> 15) & 112, 5);
                        final SnackbarData snackbarData2 = snackbarData;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snackbarData2.performAction();
                            }
                        };
                        final String str = actionLabel;
                        ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM609textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -819890024, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer3, int i111) {
                                if (((i111 & 81) ^ 16) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    TextKt.m869TextfLXpl1I(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 0, 64, 65534);
                                }
                            }
                        }), composer2, C.ENCODING_PCM_32BIT, 382);
                    }
                });
            } else {
                z3 = true;
                composableLambda = null;
            }
            Modifier modifier11 = modifier2;
            m799Snackbar7zSek6w(PaddingKt.m281padding3ABfNKs(modifier2, Dp.m2965constructorimpl(12)), composableLambda, z2, shape2, j7, j6, f3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890114, z3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i110) {
                    if (((i110 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        TextKt.m869TextfLXpl1I(snackbarData.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 64, 65534);
                    }
                }
            }), composerStartRestartGroup, (i8 & 896) | 12582912 | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i8) | (458752 & i8) | ((i8 >> 3) & 3670016), 0);
            f2 = f3;
            shape3 = shape2;
            j8 = j6;
            j9 = j5;
            long j114 = j7;
            modifier4 = modifier11;
            z4 = z2;
            j10 = j114;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i110) {
                SnackbarKt.m800SnackbarsPrSdHI(snackbarData, modifier4, z4, shape3, j10, j8, j9, f2, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void TextOnlySnackbar(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-868771705);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((2 ^ (i2 & 11)) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = HorizontalSpacing;
            float f2 = SnackbarVerticalPadding;
            Modifier modifierM284paddingqDBjuR0 = PaddingKt.m284paddingqDBjuR0(companion, f, f2, f, f2);
            AnonymousClass1 anonymousClass1 = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt.TextOnlySnackbar.1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                    if (!(list.size() == 1)) {
                        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
                    }
                    final Placeable placeableMo2468measureBRTryo0 = ((Measurable) CollectionsKt.first((List) list)).mo2468measureBRTryo0(j);
                    int i3 = placeableMo2468measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                    int i4 = placeableMo2468measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                    if (!(i3 != Integer.MIN_VALUE)) {
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                    if (!(i4 != Integer.MIN_VALUE)) {
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                    final int iMax = Math.max(measureScope.mo188roundToPx0680j_4(i3 == i4 ? SnackbarKt.SnackbarMinHeightOneLine : SnackbarKt.SnackbarMinHeightTwoLines), placeableMo2468measureBRTryo0.getHeight());
                    return MeasureScope.DefaultImpls.layout$default(measureScope, Constraints.m2935getMaxWidthimpl(j), iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$1$measure$4
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
                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, (iMax - placeableMo2468measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM284paddingqDBjuR0);
            int i3 = ((i2 & 14) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
            Updater.m906setimpl(composerM899constructorimpl, anonymousClass1, companion2.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.TextOnlySnackbar.2
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

            public final void invoke(@Nullable Composer composer2, int i4) {
                SnackbarKt.TextOnlySnackbar(function2, composer2, i | 1);
            }
        });
    }
}
