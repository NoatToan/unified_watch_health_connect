package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.layout.AlignmentLineKt;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.exoplayer2.text.ttml.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a~\u0010\u000f\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0011\u001a\u00020\u0001*\u00020\u00102\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"\u0019\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0019\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010\u001f\"\u0019\u0010!\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\u001f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", MessengerShareContentUtility.BUTTONS, "Landroidx/compose/ui/Modifier;", "modifier", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", b.H, "contentColor", "AlertDialogContent-WMdw5o4", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "AlertDialogContent", "Landroidx/compose/foundation/layout/ColumnScope;", "AlertDialogBaselineLayout", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogFlowRow", "TitlePadding", "Landroidx/compose/ui/Modifier;", "TextPadding", "Landroidx/compose/ui/unit/TextUnit;", "TitleBaselineDistanceFromTop", "J", "TextBaselineDistanceFromTitle", "TextBaselineDistanceFromTop", "material_release"}, k = 2, mv = {1, 5, 1})
public final class AlertDialogKt {
    private static final long TextBaselineDistanceFromTitle;
    private static final long TextBaselineDistanceFromTop;

    @NotNull
    private static final Modifier TextPadding;
    private static final long TitleBaselineDistanceFromTop;

    @NotNull
    private static final Modifier TitlePadding;

    static {
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 24;
        TitlePadding = PaddingKt.m285paddingqDBjuR0$default(companion, Dp.m2965constructorimpl(f), 0.0f, Dp.m2965constructorimpl(f), 0.0f, 10, null);
        TextPadding = PaddingKt.m285paddingqDBjuR0$default(companion, Dp.m2965constructorimpl(f), 0.0f, Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(28), 2, null);
        TitleBaselineDistanceFromTop = TextUnitKt.getSp(40);
        TextBaselineDistanceFromTitle = TextUnitKt.getSp(36);
        TextBaselineDistanceFromTop = TextUnitKt.getSp(38);
    }

    @Composable
    public static final void AlertDialogBaselineLayout(@NotNull final ColumnScope columnScope, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable final Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1735756929);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(function3) ? 256 : 128;
        }
        if (((i2 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier modifierWeight = columnScope.weight(Modifier.INSTANCE, 1.0f, false);
            AnonymousClass2 anonymousClass2 = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt.AlertDialogBaselineLayout.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                /* JADX WARN: Code duplicated, block: B:33:0x0086  */
                /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
                /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                    Object next;
                    Object next2;
                    int iIntValue;
                    int iIntValue2;
                    int iIntValue3;
                    final int i3;
                    Iterator<T> it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), "title"));
                    Measurable measurable = (Measurable) next;
                    final Placeable placeableMo2468measureBRTryo0 = measurable == null ? null : measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                    Iterator<T> it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next2), "text"));
                    Measurable measurable2 = (Measurable) next2;
                    final Placeable placeableMo2468measureBRTryo1 = measurable2 == null ? null : measurable2.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                    int height = 0;
                    int iMax = Math.max(placeableMo2468measureBRTryo0 == null ? 0 : placeableMo2468measureBRTryo0.getWidth(), placeableMo2468measureBRTryo1 == null ? 0 : placeableMo2468measureBRTryo1.getWidth());
                    if (placeableMo2468measureBRTryo0 != null) {
                        int iIntValue4 = Integer.valueOf(placeableMo2468measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())).intValue();
                        Integer numValueOf = iIntValue4 == Integer.MIN_VALUE ? null : Integer.valueOf(iIntValue4);
                        if (numValueOf == null) {
                            iIntValue = 0;
                        } else {
                            iIntValue = numValueOf.intValue();
                        }
                    } else {
                        iIntValue = 0;
                    }
                    if (placeableMo2468measureBRTryo0 != null) {
                        int iIntValue5 = Integer.valueOf(placeableMo2468measureBRTryo0.get(AlignmentLineKt.getLastBaseline())).intValue();
                        Integer numValueOf2 = iIntValue5 == Integer.MIN_VALUE ? null : Integer.valueOf(iIntValue5);
                        if (numValueOf2 == null) {
                            iIntValue2 = 0;
                        } else {
                            iIntValue2 = numValueOf2.intValue();
                        }
                    } else {
                        iIntValue2 = 0;
                    }
                    final int iMo187roundToPxR2X_6o = measureScope.mo187roundToPxR2X_6o(AlertDialogKt.TitleBaselineDistanceFromTop) - iIntValue;
                    if (placeableMo2468measureBRTryo1 != null) {
                        int i4 = placeableMo2468measureBRTryo1.get(AlignmentLineKt.getFirstBaseline());
                        Integer numValueOf3 = i4 != Integer.MIN_VALUE ? Integer.valueOf(i4) : null;
                        if (numValueOf3 == null) {
                            iIntValue3 = 0;
                        } else {
                            iIntValue3 = numValueOf3.intValue();
                        }
                    } else {
                        iIntValue3 = 0;
                    }
                    int iMo187roundToPxR2X_6o2 = placeableMo2468measureBRTryo0 == null ? measureScope.mo187roundToPxR2X_6o(AlertDialogKt.TextBaselineDistanceFromTop) : measureScope.mo187roundToPxR2X_6o(AlertDialogKt.TextBaselineDistanceFromTitle);
                    int height2 = placeableMo2468measureBRTryo0 == null ? 0 : placeableMo2468measureBRTryo0.getHeight() + iMo187roundToPxR2X_6o;
                    if (placeableMo2468measureBRTryo0 == null) {
                        i3 = iMo187roundToPxR2X_6o2 - iIntValue3;
                    } else {
                        i3 = (iIntValue2 == 0 ? height2 - iIntValue3 : (iMo187roundToPxR2X_6o + iIntValue2) - iIntValue3) + iMo187roundToPxR2X_6o2;
                    }
                    if (placeableMo2468measureBRTryo1 != null) {
                        if (iIntValue2 == 0) {
                            height = (placeableMo2468measureBRTryo1.getHeight() + iMo187roundToPxR2X_6o2) - iIntValue3;
                        } else {
                            height = ((placeableMo2468measureBRTryo1.getHeight() + iMo187roundToPxR2X_6o2) - iIntValue3) - ((placeableMo2468measureBRTryo0 != null ? placeableMo2468measureBRTryo0.getHeight() : 0) - iIntValue2);
                        }
                    }
                    return MeasureScope.DefaultImpls.layout$default(measureScope, iMax, height + height2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
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
                            Placeable placeable = placeableMo2468measureBRTryo0;
                            if (placeable != null) {
                                Placeable.PlacementScope.place$default(placementScope, placeable, 0, iMo187roundToPxR2X_6o, 0.0f, 4, null);
                            }
                            Placeable placeable2 = placeableMo2468measureBRTryo1;
                            if (placeable2 == null) {
                                return;
                            }
                            Placeable.PlacementScope.place$default(placementScope, placeable2, 0, i3, 0.0f, 4, null);
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
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierWeight);
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
            Updater.m906setimpl(composerM899constructorimpl, anonymousClass2, companion.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1160646213);
            if (function2 == null) {
                composerStartRestartGroup.startReplaceableGroup(-1620294017);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1160646206);
                Modifier modifierLayoutId = LayoutIdKt.layoutId(TitlePadding, "title");
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Modifier modifierAlign = columnScope.align(modifierLayoutId, companion2.getStart());
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
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
                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl2, density2, companion.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-630329100);
                function2.invoke(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function3 == null) {
                composerStartRestartGroup.startReplaceableGroup(-1620288747);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1160646036);
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(TextPadding, "text");
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Modifier modifierAlign2 = columnScope.align(modifierLayoutId2, companion3.getStart());
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierAlign2);
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
                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl3, density3, companion.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-630328933);
                function3.invoke(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
            }
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt.AlertDialogBaselineLayout.3
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
                AlertDialogKt.AlertDialogBaselineLayout(columnScope, function2, function3, composer2, i | 1);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0126  */
    /* JADX WARN: Code duplicated, block: B:110:0x012c  */
    /* JADX WARN: Code duplicated, block: B:113:0x013d  */
    /* JADX WARN: Code duplicated, block: B:116:0x014d  */
    /* JADX WARN: Code duplicated, block: B:122:0x019c  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    @Composable
    /* JADX INFO: renamed from: AlertDialogContent-WMdw5o4, reason: not valid java name */
    public static final void m553AlertDialogContentWMdw5o4(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Shape shape, long j, long j2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function5;
        int i5;
        int i6;
        final Function2<? super Composer, ? super Integer, Unit> function6;
        int i7;
        Shape medium;
        long jM642getSurface0d7_KjU;
        long jM656contentColorForek8zF_U;
        final Shape shape2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function7;
        final Function2<? super Composer, ? super Integer, Unit> function8;
        final long j3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1208798579);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changed(function5)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        function6 = function4;
                        if (composerStartRestartGroup.changed(function6)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((57344 & i) == 0) {
                        if ((i2 & 16) == 0) {
                            medium = shape;
                            int i9 = composerStartRestartGroup.changed(medium) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            medium = shape;
                        }
                        i3 |= i9;
                    } else {
                        medium = shape;
                    }
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            jM642getSurface0d7_KjU = j;
                            int i10 = composerStartRestartGroup.changed(jM642getSurface0d7_KjU) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        i3 |= i10;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((3670016 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            jM656contentColorForek8zF_U = j2;
                            int i11 = composerStartRestartGroup.changed(jM656contentColorForek8zF_U) ? 1048576 : 524288;
                            i3 |= i11;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        i3 |= i11;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (((2995931 & i3) ^ 599186) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function5 = null;
                            }
                            if (i6 != 0) {
                                function6 = null;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            }
                            if ((i2 & 32) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                                i3 &= -3670017;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                        }
                        final int i12 = i3;
                        long j5 = jM642getSurface0d7_KjU;
                        long j6 = jM656contentColorForek8zF_U;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                            public final void invoke(@Nullable Composer composer2, int i13) {
                                if (((i13 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                final Function2<Composer, Integer, Unit> function9 = function5;
                                final Function2<Composer, Integer, Unit> function10 = function6;
                                Function2<Composer, Integer, Unit> function11 = function2;
                                final int i14 = i12;
                                composer2.startReplaceableGroup(-1113031299);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(276693241);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-80835772);
                                AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                    public final void invoke(@Nullable Composer composer3, int i15) {
                                        if (((i15 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                        final Function2<Composer, Integer, Unit> function12 = function9;
                                        final int i16 = i14;
                                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                            public final void invoke(@Nullable Composer composer4, int i17) {
                                                if (((i17 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                } else {
                                                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i16 >> 3) & 112);
                                                }
                                            }
                                        }), composer3, 56);
                                    }
                                }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                    public final void invoke(@Nullable Composer composer3, int i15) {
                                        if (((i15 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                        final Function2<Composer, Integer, Unit> function12 = function10;
                                        final int i16 = i14;
                                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                            public final void invoke(@Nullable Composer composer4, int i17) {
                                                if (((i17 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                } else {
                                                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i16 >> 6) & 112);
                                                }
                                            }
                                        }), composer3, 56);
                                    }
                                }) : null, composer2, 6);
                                function11.invoke(composer2, Integer.valueOf(i14 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i13 = 1572864 | ((i12 >> 3) & 14);
                        int i14 = i12 >> 9;
                        SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j5, j6, (BorderStroke) null, 0.0f, composableLambda, composerStartRestartGroup, i13 | (i14 & 112) | (i14 & 896) | (i14 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                        shape2 = medium;
                        modifier3 = modifier2;
                        function7 = function5;
                        function8 = function6;
                        j3 = j6;
                        j4 = j5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        function7 = function5;
                        function8 = function6;
                        shape2 = medium;
                        j4 = jM642getSurface0d7_KjU;
                        j3 = jM656contentColorForek8zF_U;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
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
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function2, modifier3, function7, function8, shape2, j4, j3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 3072;
                function6 = function4;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        medium = shape;
                        if (composerStartRestartGroup.changed(medium)) {
                        }
                        i3 |= i9;
                    } else {
                        medium = shape;
                    }
                    i3 |= i9;
                } else {
                    medium = shape;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jM642getSurface0d7_KjU = j;
                        if (composerStartRestartGroup.changed(jM642getSurface0d7_KjU)) {
                        }
                        i3 |= i10;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    i3 |= i10;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jM656contentColorForek8zF_U = j2;
                        if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                        }
                        i3 |= i11;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if (((2995931 & i3) ^ 599186) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i15 = i3;
                    long j7 = jM642getSurface0d7_KjU;
                    long j8 = jM656contentColorForek8zF_U;
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                            final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                            Function2<Composer, Integer, Unit> function11 = function2;
                            final int i17 = i15;
                            composer2.startReplaceableGroup(-1113031299);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(276693241);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-80835772);
                            AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                    final int i19 = i17;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i110) {
                                            if (((i110 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i19 >> 3) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                    final int i19 = i17;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i110) {
                                            if (((i110 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i19 >> 6) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }) : null, composer2, 6);
                            function11.invoke(composer2, Integer.valueOf(i17 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i16 = 1572864 | ((i15 >> 3) & 14);
                    int i17 = i15 >> 9;
                    SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j7, j8, (BorderStroke) null, 0.0f, composableLambda2, composerStartRestartGroup, i16 | (i17 & 112) | (i17 & 896) | (i17 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                    shape2 = medium;
                    modifier3 = modifier2;
                    function7 = function5;
                    function8 = function6;
                    j3 = j8;
                    j4 = j7;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i18 = i3;
                    long j9 = jM642getSurface0d7_KjU;
                    long j10 = jM656contentColorForek8zF_U;
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                            final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                            Function2<Composer, Integer, Unit> function11 = function2;
                            final int i110 = i18;
                            composer2.startReplaceableGroup(-1113031299);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(276693241);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-80835772);
                            AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                    final int i112 = i110;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i113) {
                                            if (((i113 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i112 >> 3) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                    final int i112 = i110;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i113) {
                                            if (((i113 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i112 >> 6) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }) : null, composer2, 6);
                            function11.invoke(composer2, Integer.valueOf(i110 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i19 = 1572864 | ((i18 >> 3) & 14);
                    int i110 = i18 >> 9;
                    SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j9, j10, (BorderStroke) null, 0.0f, composableLambda3, composerStartRestartGroup, i19 | (i110 & 112) | (i110 & 896) | (i110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                    shape2 = medium;
                    modifier3 = modifier2;
                    function7 = function5;
                    function8 = function6;
                    j3 = j10;
                    j4 = j9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
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
                        AlertDialogKt.m553AlertDialogContentWMdw5o4(function2, modifier3, function7, function8, shape2, j4, j3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            function5 = function3;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    function6 = function4;
                    if (composerStartRestartGroup.changed(function6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        medium = shape;
                        if (composerStartRestartGroup.changed(medium)) {
                        }
                        i3 |= i9;
                    } else {
                        medium = shape;
                    }
                    i3 |= i9;
                } else {
                    medium = shape;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jM642getSurface0d7_KjU = j;
                        if (composerStartRestartGroup.changed(jM642getSurface0d7_KjU)) {
                        }
                        i3 |= i10;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    i3 |= i10;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jM656contentColorForek8zF_U = j2;
                        if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                        }
                        i3 |= i11;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if (((2995931 & i3) ^ 599186) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i111 = i3;
                    long j11 = jM642getSurface0d7_KjU;
                    long j12 = jM656contentColorForek8zF_U;
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                            final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                            Function2<Composer, Integer, Unit> function11 = function2;
                            final int i113 = i111;
                            composer2.startReplaceableGroup(-1113031299);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(276693241);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-80835772);
                            AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                    final int i115 = i113;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i116) {
                                            if (((i116 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i115 >> 3) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                    final int i115 = i113;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i116) {
                                            if (((i116 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i115 >> 6) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }) : null, composer2, 6);
                            function11.invoke(composer2, Integer.valueOf(i113 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i112 = 1572864 | ((i111 >> 3) & 14);
                    int i113 = i111 >> 9;
                    SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j11, j12, (BorderStroke) null, 0.0f, composableLambda4, composerStartRestartGroup, i112 | (i113 & 112) | (i113 & 896) | (i113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                    shape2 = medium;
                    modifier3 = modifier2;
                    function7 = function5;
                    function8 = function6;
                    j3 = j12;
                    j4 = j11;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i114 = i3;
                    long j13 = jM642getSurface0d7_KjU;
                    long j14 = jM656contentColorForek8zF_U;
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                        public final void invoke(@Nullable Composer composer2, int i115) {
                            if (((i115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                            Function2<Composer, Integer, Unit> function11 = function2;
                            final int i116 = i114;
                            composer2.startReplaceableGroup(-1113031299);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(276693241);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-80835772);
                            AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i117) {
                                    if (((i117 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                    final int i118 = i116;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i119) {
                                            if (((i119 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i118 >> 3) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                public final void invoke(@Nullable Composer composer3, int i117) {
                                    if (((i117 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                    final int i118 = i116;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i119) {
                                            if (((i119 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i118 >> 6) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }) : null, composer2, 6);
                            function11.invoke(composer2, Integer.valueOf(i116 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i115 = 1572864 | ((i114 >> 3) & 14);
                    int i116 = i114 >> 9;
                    SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j13, j14, (BorderStroke) null, 0.0f, composableLambda5, composerStartRestartGroup, i115 | (i116 & 112) | (i116 & 896) | (i116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                    shape2 = medium;
                    modifier3 = modifier2;
                    function7 = function5;
                    function8 = function6;
                    j3 = j14;
                    j4 = j13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
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
                        AlertDialogKt.m553AlertDialogContentWMdw5o4(function2, modifier3, function7, function8, shape2, j4, j3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            function6 = function4;
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    medium = shape;
                    if (composerStartRestartGroup.changed(medium)) {
                    }
                    i3 |= i9;
                } else {
                    medium = shape;
                }
                i3 |= i9;
            } else {
                medium = shape;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jM642getSurface0d7_KjU = j;
                    if (composerStartRestartGroup.changed(jM642getSurface0d7_KjU)) {
                    }
                    i3 |= i10;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                i3 |= i10;
            } else {
                jM642getSurface0d7_KjU = j;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i3 |= i11;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if (((2995931 & i3) ^ 599186) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i117 = i3;
                long j15 = jM642getSurface0d7_KjU;
                long j16 = jM656contentColorForek8zF_U;
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                    public final void invoke(@Nullable Composer composer2, int i118) {
                        if (((i118 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                        Function2<Composer, Integer, Unit> function11 = function2;
                        final int i119 = i117;
                        composer2.startReplaceableGroup(-1113031299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(276693241);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-80835772);
                        AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i1110) {
                                if (((i1110 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                final int i1111 = i119;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i1112) {
                                        if (((i1112 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i1111 >> 3) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i1110) {
                                if (((i1110 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                final int i1111 = i119;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i1112) {
                                        if (((i1112 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i1111 >> 6) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }) : null, composer2, 6);
                        function11.invoke(composer2, Integer.valueOf(i119 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i118 = 1572864 | ((i117 >> 3) & 14);
                int i119 = i117 >> 9;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j15, j16, (BorderStroke) null, 0.0f, composableLambda6, composerStartRestartGroup, i118 | (i119 & 112) | (i119 & 896) | (i119 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                shape2 = medium;
                modifier3 = modifier2;
                function7 = function5;
                function8 = function6;
                j3 = j16;
                j4 = j15;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i1110 = i3;
                long j17 = jM642getSurface0d7_KjU;
                long j18 = jM656contentColorForek8zF_U;
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                    public final void invoke(@Nullable Composer composer2, int i1111) {
                        if (((i1111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                        Function2<Composer, Integer, Unit> function11 = function2;
                        final int i1112 = i1110;
                        composer2.startReplaceableGroup(-1113031299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(276693241);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-80835772);
                        AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i1113) {
                                if (((i1113 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                final int i1114 = i1112;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i1115) {
                                        if (((i1115 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i1114 >> 3) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i1113) {
                                if (((i1113 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                final int i1114 = i1112;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i1115) {
                                        if (((i1115 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i1114 >> 6) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }) : null, composer2, 6);
                        function11.invoke(composer2, Integer.valueOf(i1112 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i1111 = 1572864 | ((i1110 >> 3) & 14);
                int i1112 = i1110 >> 9;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j17, j18, (BorderStroke) null, 0.0f, composableLambda7, composerStartRestartGroup, i1111 | (i1112 & 112) | (i1112 & 896) | (i1112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                shape2 = medium;
                modifier3 = modifier2;
                function7 = function5;
                function8 = function6;
                j3 = j18;
                j4 = j17;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
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
                    AlertDialogKt.m553AlertDialogContentWMdw5o4(function2, modifier3, function7, function8, shape2, j4, j3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changed(function5)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    function6 = function4;
                    if (composerStartRestartGroup.changed(function6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        medium = shape;
                        if (composerStartRestartGroup.changed(medium)) {
                        }
                        i3 |= i9;
                    } else {
                        medium = shape;
                    }
                    i3 |= i9;
                } else {
                    medium = shape;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jM642getSurface0d7_KjU = j;
                        if (composerStartRestartGroup.changed(jM642getSurface0d7_KjU)) {
                        }
                        i3 |= i10;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    i3 |= i10;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jM656contentColorForek8zF_U = j2;
                        if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                        }
                        i3 |= i11;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if (((2995931 & i3) ^ 599186) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i1113 = i3;
                    long j19 = jM642getSurface0d7_KjU;
                    long j110 = jM656contentColorForek8zF_U;
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                        public final void invoke(@Nullable Composer composer2, int i1114) {
                            if (((i1114 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                            Function2<Composer, Integer, Unit> function11 = function2;
                            final int i1115 = i1113;
                            composer2.startReplaceableGroup(-1113031299);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(276693241);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-80835772);
                            AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i1116) {
                                    if (((i1116 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                    final int i1117 = i1115;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i1118) {
                                            if (((i1118 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i1117 >> 3) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                public final void invoke(@Nullable Composer composer3, int i1116) {
                                    if (((i1116 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                    final int i1117 = i1115;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i1118) {
                                            if (((i1118 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i1117 >> 6) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }) : null, composer2, 6);
                            function11.invoke(composer2, Integer.valueOf(i1115 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1114 = 1572864 | ((i1113 >> 3) & 14);
                    int i1115 = i1113 >> 9;
                    SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j19, j110, (BorderStroke) null, 0.0f, composableLambda8, composerStartRestartGroup, i1114 | (i1115 & 112) | (i1115 & 896) | (i1115 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                    shape2 = medium;
                    modifier3 = modifier2;
                    function7 = function5;
                    function8 = function6;
                    j3 = j110;
                    j4 = j19;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        }
                        if ((i2 & 32) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i1116 = i3;
                    long j111 = jM642getSurface0d7_KjU;
                    long j112 = jM656contentColorForek8zF_U;
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                        public final void invoke(@Nullable Composer composer2, int i1117) {
                            if (((i1117 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                            Function2<Composer, Integer, Unit> function11 = function2;
                            final int i1118 = i1116;
                            composer2.startReplaceableGroup(-1113031299);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(276693241);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-80835772);
                            AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i1119) {
                                    if (((i1119 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                    final int i11110 = i1118;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i11111) {
                                            if (((i11111 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i11110 >> 3) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                public final void invoke(@Nullable Composer composer3, int i1119) {
                                    if (((i1119 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                    final int i11110 = i1118;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i11111) {
                                            if (((i11111 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i11110 >> 6) & 112);
                                            }
                                        }
                                    }), composer3, 56);
                                }
                            }) : null, composer2, 6);
                            function11.invoke(composer2, Integer.valueOf(i1118 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1117 = 1572864 | ((i1116 >> 3) & 14);
                    int i1118 = i1116 >> 9;
                    SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j111, j112, (BorderStroke) null, 0.0f, composableLambda9, composerStartRestartGroup, i1117 | (i1118 & 112) | (i1118 & 896) | (i1118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                    shape2 = medium;
                    modifier3 = modifier2;
                    function7 = function5;
                    function8 = function6;
                    j3 = j112;
                    j4 = j111;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
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
                        AlertDialogKt.m553AlertDialogContentWMdw5o4(function2, modifier3, function7, function8, shape2, j4, j3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            function6 = function4;
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    medium = shape;
                    if (composerStartRestartGroup.changed(medium)) {
                    }
                    i3 |= i9;
                } else {
                    medium = shape;
                }
                i3 |= i9;
            } else {
                medium = shape;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jM642getSurface0d7_KjU = j;
                    if (composerStartRestartGroup.changed(jM642getSurface0d7_KjU)) {
                    }
                    i3 |= i10;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                i3 |= i10;
            } else {
                jM642getSurface0d7_KjU = j;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i3 |= i11;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if (((2995931 & i3) ^ 599186) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i1119 = i3;
                long j113 = jM642getSurface0d7_KjU;
                long j114 = jM656contentColorForek8zF_U;
                ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                    public final void invoke(@Nullable Composer composer2, int i11110) {
                        if (((i11110 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                        Function2<Composer, Integer, Unit> function11 = function2;
                        final int i11111 = i1119;
                        composer2.startReplaceableGroup(-1113031299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(276693241);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-80835772);
                        AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i11112) {
                                if (((i11112 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                final int i11113 = i11111;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i11114) {
                                        if (((i11114 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i11113 >> 3) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i11112) {
                                if (((i11112 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                final int i11113 = i11111;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i11114) {
                                        if (((i11114 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i11113 >> 6) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }) : null, composer2, 6);
                        function11.invoke(composer2, Integer.valueOf(i11111 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i11110 = 1572864 | ((i1119 >> 3) & 14);
                int i11111 = i1119 >> 9;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j113, j114, (BorderStroke) null, 0.0f, composableLambda10, composerStartRestartGroup, i11110 | (i11111 & 112) | (i11111 & 896) | (i11111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                shape2 = medium;
                modifier3 = modifier2;
                function7 = function5;
                function8 = function6;
                j3 = j114;
                j4 = j113;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i11112 = i3;
                long j115 = jM642getSurface0d7_KjU;
                long j116 = jM656contentColorForek8zF_U;
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                    public final void invoke(@Nullable Composer composer2, int i11113) {
                        if (((i11113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                        Function2<Composer, Integer, Unit> function11 = function2;
                        final int i11114 = i11112;
                        composer2.startReplaceableGroup(-1113031299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(276693241);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-80835772);
                        AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i11115) {
                                if (((i11115 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                final int i11116 = i11114;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i11117) {
                                        if (((i11117 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i11116 >> 3) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i11115) {
                                if (((i11115 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                final int i11116 = i11114;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i11117) {
                                        if (((i11117 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i11116 >> 6) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }) : null, composer2, 6);
                        function11.invoke(composer2, Integer.valueOf(i11114 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i11113 = 1572864 | ((i11112 >> 3) & 14);
                int i11114 = i11112 >> 9;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j115, j116, (BorderStroke) null, 0.0f, composableLambda11, composerStartRestartGroup, i11113 | (i11114 & 112) | (i11114 & 896) | (i11114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                shape2 = medium;
                modifier3 = modifier2;
                function7 = function5;
                function8 = function6;
                j3 = j116;
                j4 = j115;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
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
                    AlertDialogKt.m553AlertDialogContentWMdw5o4(function2, modifier3, function7, function8, shape2, j4, j3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        function5 = function3;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                function6 = function4;
                if (composerStartRestartGroup.changed(function6)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    medium = shape;
                    if (composerStartRestartGroup.changed(medium)) {
                    }
                    i3 |= i9;
                } else {
                    medium = shape;
                }
                i3 |= i9;
            } else {
                medium = shape;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jM642getSurface0d7_KjU = j;
                    if (composerStartRestartGroup.changed(jM642getSurface0d7_KjU)) {
                    }
                    i3 |= i10;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                i3 |= i10;
            } else {
                jM642getSurface0d7_KjU = j;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i3 |= i11;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if (((2995931 & i3) ^ 599186) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i11115 = i3;
                long j117 = jM642getSurface0d7_KjU;
                long j118 = jM656contentColorForek8zF_U;
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                    public final void invoke(@Nullable Composer composer2, int i11116) {
                        if (((i11116 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                        Function2<Composer, Integer, Unit> function11 = function2;
                        final int i11117 = i11115;
                        composer2.startReplaceableGroup(-1113031299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(276693241);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-80835772);
                        AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i11118) {
                                if (((i11118 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                final int i11119 = i11117;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i111110) {
                                        if (((i111110 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i11119 >> 3) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i11118) {
                                if (((i11118 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                final int i11119 = i11117;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i111110) {
                                        if (((i111110 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i11119 >> 6) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }) : null, composer2, 6);
                        function11.invoke(composer2, Integer.valueOf(i11117 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i11116 = 1572864 | ((i11115 >> 3) & 14);
                int i11117 = i11115 >> 9;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j117, j118, (BorderStroke) null, 0.0f, composableLambda12, composerStartRestartGroup, i11116 | (i11117 & 112) | (i11117 & 896) | (i11117 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                shape2 = medium;
                modifier3 = modifier2;
                function7 = function5;
                function8 = function6;
                j3 = j118;
                j4 = j117;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    }
                    if ((i2 & 32) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i11118 = i3;
                long j119 = jM642getSurface0d7_KjU;
                long j1110 = jM656contentColorForek8zF_U;
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                    public final void invoke(@Nullable Composer composer2, int i11119) {
                        if (((i11119 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                        Function2<Composer, Integer, Unit> function11 = function2;
                        final int i111110 = i11118;
                        composer2.startReplaceableGroup(-1113031299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(276693241);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-80835772);
                        AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i111111) {
                                if (((i111111 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                                final int i111112 = i111110;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i111113) {
                                        if (((i111113 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i111112 >> 3) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i111111) {
                                if (((i111111 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                final int i111112 = i111110;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i111113) {
                                        if (((i111113 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i111112 >> 6) & 112);
                                        }
                                    }
                                }), composer3, 56);
                            }
                        }) : null, composer2, 6);
                        function11.invoke(composer2, Integer.valueOf(i111110 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i11119 = 1572864 | ((i11118 >> 3) & 14);
                int i111110 = i11118 >> 9;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j119, j1110, (BorderStroke) null, 0.0f, composableLambda13, composerStartRestartGroup, i11119 | (i111110 & 112) | (i111110 & 896) | (i111110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
                shape2 = medium;
                modifier3 = modifier2;
                function7 = function5;
                function8 = function6;
                j3 = j1110;
                j4 = j119;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
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
                    AlertDialogKt.m553AlertDialogContentWMdw5o4(function2, modifier3, function7, function8, shape2, j4, j3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        function6 = function4;
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                medium = shape;
                if (composerStartRestartGroup.changed(medium)) {
                }
                i3 |= i9;
            } else {
                medium = shape;
            }
            i3 |= i9;
        } else {
            medium = shape;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                jM642getSurface0d7_KjU = j;
                if (composerStartRestartGroup.changed(jM642getSurface0d7_KjU)) {
                }
                i3 |= i10;
            } else {
                jM642getSurface0d7_KjU = j;
            }
            i3 |= i10;
        } else {
            jM642getSurface0d7_KjU = j;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                jM656contentColorForek8zF_U = j2;
                if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                }
                i3 |= i11;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            i3 |= i11;
        } else {
            jM656contentColorForek8zF_U = j2;
        }
        if (((2995931 & i3) ^ 599186) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if (i6 != 0) {
                    function6 = null;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -3670017;
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if (i6 != 0) {
                    function6 = null;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -3670017;
                }
                composerStartRestartGroup.endDefaults();
            }
            final int i111111 = i3;
            long j1111 = jM642getSurface0d7_KjU;
            long j1112 = jM656contentColorForek8zF_U;
            ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                public final void invoke(@Nullable Composer composer2, int i111112) {
                    if (((i111112 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                    Function2<Composer, Integer, Unit> function11 = function2;
                    final int i111113 = i111111;
                    composer2.startReplaceableGroup(-1113031299);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(276693241);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-80835772);
                    AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                        public final void invoke(@Nullable Composer composer3, int i111114) {
                            if (((i111114 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                            final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                            final int i111115 = i111113;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                public final void invoke(@Nullable Composer composer4, int i111116) {
                                    if (((i111116 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                    } else {
                                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i111115 >> 3) & 112);
                                    }
                                }
                            }), composer3, 56);
                        }
                    }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                        public final void invoke(@Nullable Composer composer3, int i111114) {
                            if (((i111114 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                            final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                            final int i111115 = i111113;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                public final void invoke(@Nullable Composer composer4, int i111116) {
                                    if (((i111116 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                    } else {
                                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i111115 >> 6) & 112);
                                    }
                                }
                            }), composer3, 56);
                        }
                    }) : null, composer2, 6);
                    function11.invoke(composer2, Integer.valueOf(i111113 & 14));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            });
            int i111112 = 1572864 | ((i111111 >> 3) & 14);
            int i111113 = i111111 >> 9;
            SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j1111, j1112, (BorderStroke) null, 0.0f, composableLambda14, composerStartRestartGroup, i111112 | (i111113 & 112) | (i111113 & 896) | (i111113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
            shape2 = medium;
            modifier3 = modifier2;
            function7 = function5;
            function8 = function6;
            j3 = j1112;
            j4 = j1111;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if (i6 != 0) {
                    function6 = null;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -3670017;
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if (i6 != 0) {
                    function6 = null;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                }
                if ((i2 & 32) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -3670017;
                }
                composerStartRestartGroup.endDefaults();
            }
            final int i111114 = i3;
            long j1113 = jM642getSurface0d7_KjU;
            long j1114 = jM656contentColorForek8zF_U;
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                public final void invoke(@Nullable Composer composer2, int i111115) {
                    if (((i111115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                    Function2<Composer, Integer, Unit> function11 = function2;
                    final int i111116 = i111114;
                    composer2.startReplaceableGroup(-1113031299);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(276693241);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-80835772);
                    AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function9 == null ? null : ComposableLambdaKt.composableLambdaInstance(-985531970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                        public final void invoke(@Nullable Composer composer3, int i111117) {
                            if (((i111117 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))};
                            final Function2<? super Composer, ? super Integer, Unit> function12 = function9;
                            final int i111118 = i111116;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892272, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                public final void invoke(@Nullable Composer composer4, int i111119) {
                                    if (((i111119 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                    } else {
                                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getSubtitle1(), function12, composer4, (i111118 >> 3) & 112);
                                    }
                                }
                            }), composer3, 56);
                        }
                    }), function10 != null ? ComposableLambdaKt.composableLambdaInstance(-985531593, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                        public final void invoke(@Nullable Composer composer3, int i111117) {
                            if (((i111117 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 0)))};
                            final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                            final int i111118 = i111116;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -819892861, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                public final void invoke(@Nullable Composer composer4, int i111119) {
                                    if (((i111119 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                    } else {
                                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 0).getBody2(), function12, composer4, (i111118 >> 6) & 112);
                                    }
                                }
                            }), composer3, 56);
                        }
                    }) : null, composer2, 6);
                    function11.invoke(composer2, Integer.valueOf(i111116 & 14));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            });
            int i111115 = 1572864 | ((i111114 >> 3) & 14);
            int i111116 = i111114 >> 9;
            SurfaceKt.m815SurfaceFjzlyU(modifier2, medium, j1113, j1114, (BorderStroke) null, 0.0f, composableLambda15, composerStartRestartGroup, i111115 | (i111116 & 112) | (i111116 & 896) | (i111116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 48);
            shape2 = medium;
            modifier3 = modifier2;
            function7 = function5;
            function8 = function6;
            j3 = j1114;
            j4 = j1113;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
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
                AlertDialogKt.m553AlertDialogContentWMdw5o4(function2, modifier3, function7, function8, shape2, j4, j3, composer2, i | 1, i2);
            }
        });
    }

    @Composable
    /* JADX INFO: renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m554AlertDialogFlowRowixp7dh8(final float f, final float f2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-489408515);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(function2) ? 256 : 128;
        }
        if (((i2 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1
                private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, long j, Placeable placeable) {
                    return list.isEmpty() || (intRef.element + measureScope.mo188roundToPx0680j_4(f3)) + placeable.getWidth() <= Constraints.m2935getMaxWidthimpl(j);
                }

                private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, List<Placeable> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                    if (!list.isEmpty()) {
                        intRef.element += measureScope.mo188roundToPx0680j_4(f3);
                    }
                    list.add(CollectionsKt___CollectionsKt.toList(list2));
                    list3.add(Integer.valueOf(intRef2.element));
                    list4.add(Integer.valueOf(intRef.element));
                    intRef.element += intRef2.element;
                    intRef3.element = Math.max(intRef3.element, intRef4.element);
                    list2.clear();
                    intRef4.element = 0;
                    intRef2.element = 0;
                }

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
                public final MeasureResult mo6measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                    Ref.IntRef intRef;
                    Ref.IntRef intRef2;
                    final ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    final ArrayList arrayList3 = new ArrayList();
                    Ref.IntRef intRef3 = new Ref.IntRef();
                    Ref.IntRef intRef4 = new Ref.IntRef();
                    ArrayList arrayList4 = new ArrayList();
                    Ref.IntRef intRef5 = new Ref.IntRef();
                    Ref.IntRef intRef6 = new Ref.IntRef();
                    long jConstraints$default = ConstraintsKt.Constraints$default(0, Constraints.m2935getMaxWidthimpl(j), 0, 0, 13, null);
                    Iterator<? extends Measurable> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Placeable placeableMo2468measureBRTryo0 = it2.next().mo2468measureBRTryo0(jConstraints$default);
                        long j2 = jConstraints$default;
                        if (measure_3p2s80s$canAddToCurrentSequence(arrayList4, intRef5, measureScope, f, j, placeableMo2468measureBRTryo0)) {
                            intRef = intRef5;
                        } else {
                            intRef = intRef5;
                            measure_3p2s80s$startNewSequence(arrayList, intRef4, measureScope, f2, arrayList4, arrayList2, intRef6, arrayList3, intRef3, intRef);
                        }
                        if (!arrayList4.isEmpty()) {
                            intRef2 = intRef;
                            intRef2.element += measureScope.mo188roundToPx0680j_4(f);
                        } else {
                            intRef2 = intRef;
                        }
                        ArrayList arrayList5 = arrayList4;
                        arrayList5.add(placeableMo2468measureBRTryo0);
                        intRef2.element += placeableMo2468measureBRTryo0.getWidth();
                        intRef6.element = Math.max(intRef6.element, placeableMo2468measureBRTryo0.getHeight());
                        intRef5 = intRef2;
                        intRef6 = intRef6;
                        arrayList2 = arrayList2;
                        arrayList4 = arrayList5;
                        jConstraints$default = j2;
                    }
                    ArrayList arrayList6 = arrayList4;
                    ArrayList arrayList7 = arrayList2;
                    Ref.IntRef intRef7 = intRef6;
                    Ref.IntRef intRef8 = intRef5;
                    if (!arrayList6.isEmpty()) {
                        measure_3p2s80s$startNewSequence(arrayList, intRef4, measureScope, f2, arrayList6, arrayList7, intRef7, arrayList3, intRef3, intRef8);
                    }
                    final int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j) != Integer.MAX_VALUE ? Constraints.m2935getMaxWidthimpl(j) : Math.max(intRef3.element, Constraints.m2937getMinWidthimpl(j));
                    int iMax = Math.max(intRef4.element, Constraints.m2936getMinHeightimpl(j));
                    final float f3 = f;
                    return MeasureScope.DefaultImpls.layout$default(measureScope, iM2935getMaxWidthimpl, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$measure$1
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
                            List<List<Placeable>> list2 = arrayList;
                            MeasureScope measureScope2 = measureScope;
                            float f4 = f3;
                            int i3 = iM2935getMaxWidthimpl;
                            List<Integer> list3 = arrayList3;
                            int size = list2.size() - 1;
                            if (size < 0) {
                                return;
                            }
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                List<Placeable> list4 = list2.get(i4);
                                int size2 = list4.size();
                                int[] iArr = new int[size2];
                                int i6 = 0;
                                while (i6 < size2) {
                                    iArr[i6] = list4.get(i6).getWidth() + (i6 < CollectionsKt__CollectionsKt.getLastIndex(list4) ? measureScope2.mo188roundToPx0680j_4(f4) : 0);
                                    i6++;
                                }
                                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                                int[] iArr2 = new int[size2];
                                for (int i7 = 0; i7 < size2; i7++) {
                                    iArr2[i7] = 0;
                                }
                                bottom.arrange(measureScope2, i3, iArr, iArr2);
                                int size3 = list4.size() - 1;
                                if (size3 >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        int i9 = i8 + 1;
                                        Placeable.PlacementScope.place$default(placementScope, list4.get(i8), iArr2[i8], list3.get(i4).intValue(), 0.0f, 4, null);
                                        if (i9 > size3) {
                                            break;
                                        } else {
                                            i8 = i9;
                                        }
                                    }
                                }
                                if (i5 > size) {
                                    return;
                                } else {
                                    i4 = i5;
                                }
                            }
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
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
            int i3 = (((i2 >> 6) & 14) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$2
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
                AlertDialogKt.m554AlertDialogFlowRowixp7dh8(f, f2, function2, composer2, i | 1);
            }
        });
    }
}
