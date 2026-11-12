package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Ref;
import kotlin.math.c;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aa\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0019\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001at\u0010#\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c2\u001d\u0010\u001e\u001a\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000H\u0002\u001aE\u0010%\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u001d\u0010$\u001a\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0002\u001a\\\u0010'\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u001d\u0010$\u001a\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c2\u001d\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c2\u0006\u0010&\u001a\u00020\u0003H\u0002\"\u001c\u0010+\u001a\u0004\u0018\u00010(*\u00020\u00158B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u001c\u0010/\u001a\u00020,*\u0004\u0018\u00010(8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u001c\u00103\u001a\u000200*\u0004\u0018\u00010(8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\"\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010(8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\"\u001c\u00106\u001a\u000200*\u0004\u0018\u00010(8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00102\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangement", "Landroidx/compose/ui/unit/Dp;", "arrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisSize", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy-TDGSqEk", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "MinIntrinsicWidthMeasureBlock", "MinIntrinsicHeightMeasureBlock", "MaxIntrinsicWidthMeasureBlock", "MaxIntrinsicHeightMeasureBlock", "children", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "intrinsicMainSize", "intrinsicCrossSize", "crossAxisAvailable", "mainAxisSpacing", "layoutOrientation", "intrinsicOrientation", "intrinsicSize", "mainAxisSize", "intrinsicMainAxisSize", "mainAxisAvailable", "intrinsicCrossAxisSize", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "data", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "weight", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "fill", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 5, 1})
public final class RowColumnImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData == null) {
            return null;
        }
        return rowColumnParentData.getCrossAxisAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RowColumnParentData getData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData == null) {
            return true;
        }
        return rowColumnParentData.getFill();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData == null) {
            return 0.0f;
        }
        return rowColumnParentData.getWeight();
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function3, int i) {
        int i2;
        int iMax;
        float f;
        int size = list.size() - 1;
        int iRoundToInt = Integer.MAX_VALUE;
        int i3 = 0;
        if (size >= 0) {
            int i4 = 0;
            i2 = 0;
            iMax = 0;
            f = 0.0f;
            while (true) {
                int i5 = i4 + 1;
                IntrinsicMeasurable intrinsicMeasurable = list.get(i4);
                float weight = getWeight(getData(intrinsicMeasurable));
                if (weight == 0.0f) {
                    int iMin = Math.min(function2.invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue(), i - i2);
                    i2 += iMin;
                    iMax = Math.max(iMax, function3.invoke(intrinsicMeasurable, Integer.valueOf(iMin)).intValue());
                } else if (weight > 0.0f) {
                    f += weight;
                }
                if (i5 > size) {
                    break;
                }
                i4 = i5;
            }
        } else {
            i2 = 0;
            iMax = 0;
            f = 0.0f;
        }
        if (f == 0.0f) {
            iRoundToInt = 0;
        } else if (i != Integer.MAX_VALUE) {
            iRoundToInt = c.roundToInt(Math.max(i - i2, 0) / f);
        }
        int size2 = list.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i6 = i3 + 1;
                IntrinsicMeasurable intrinsicMeasurable2 = list.get(i3);
                float weight2 = getWeight(getData(intrinsicMeasurable2));
                if (weight2 > 0.0f) {
                    iMax = Math.max(iMax, function3.invoke(intrinsicMeasurable2, Integer.valueOf(c.roundToInt(iRoundToInt * weight2))).intValue());
                }
                if (i6 > size2) {
                    break;
                }
                i3 = i6;
            }
        }
        return iMax;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, int i, int i2) {
        int i3;
        int size = list.size() - 1;
        float f = 0.0f;
        int i4 = 0;
        if (size >= 0) {
            int i5 = 0;
            i3 = 0;
            float f2 = 0.0f;
            int iMax = 0;
            while (true) {
                int i6 = i5 + 1;
                IntrinsicMeasurable intrinsicMeasurable = list.get(i5);
                float weight = getWeight(getData(intrinsicMeasurable));
                int iIntValue = function2.invoke(intrinsicMeasurable, Integer.valueOf(i)).intValue();
                if (weight == 0.0f) {
                    i3 += iIntValue;
                } else if (weight > 0.0f) {
                    f2 += weight;
                    iMax = Math.max(iMax, c.roundToInt(iIntValue / weight));
                }
                if (i6 > size) {
                    break;
                }
                i5 = i6;
            }
            f = f2;
            i4 = iMax;
        } else {
            i3 = 0;
        }
        return c.roundToInt(i4 * f) + i3 + ((list.size() - 1) * i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function3, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        return layoutOrientation == layoutOrientation2 ? intrinsicMainAxisSize(list, function2, i, i2) : intrinsicCrossAxisSize(list, function3, function2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment == null) {
            return false;
        }
        return crossAxisAlignment.isRelative$foundation_layout_release();
    }

    @NotNull
    /* JADX INFO: renamed from: rowColumnMeasurePolicy-TDGSqEk, reason: not valid java name */
    public static final MeasurePolicy m306rowColumnMeasurePolicyTDGSqEk(@NotNull final LayoutOrientation layoutOrientation, @NotNull final Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> function5, final float f, @NotNull final SizeMode sizeMode, @NotNull final CrossAxisAlignment crossAxisAlignment) {
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
                return ((Number) RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo188roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
                return ((Number) RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo188roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo6measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull final List<? extends Measurable> list, long j) {
                int i;
                int i2;
                int i3;
                float f2;
                int iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
                boolean z;
                int iCoerceAtMost;
                int iMax;
                int i4;
                int i5;
                List<? extends Measurable> list2 = list;
                OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j, layoutOrientation, null);
                int iMo188roundToPx0680j_4 = measureScope.mo188roundToPx0680j_4(f);
                int size = list.size();
                final Placeable[] placeableArr = new Placeable[size];
                int size2 = list.size();
                RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size2];
                for (int i6 = 0; i6 < size2; i6++) {
                    rowColumnParentDataArr[i6] = RowColumnImplKt.getData(list2.get(i6));
                }
                int size3 = list.size() - 1;
                int i7 = Integer.MAX_VALUE;
                if (size3 >= 0) {
                    i = 0;
                    i2 = 0;
                    int i8 = 0;
                    f2 = 0.0f;
                    int i9 = 0;
                    iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize = 0;
                    z = false;
                    while (true) {
                        int i10 = i8 + 1;
                        Measurable measurable = list2.get(i8);
                        RowColumnParentData rowColumnParentData = rowColumnParentDataArr[i8];
                        float weight = RowColumnImplKt.getWeight(rowColumnParentData);
                        if (weight > 0.0f) {
                            f2 += weight;
                            i9++;
                            i5 = size3;
                        } else {
                            int mainAxisMax = orientationIndependentConstraints.getMainAxisMax();
                            int i11 = i2;
                            int i12 = i8;
                            int i13 = size3;
                            Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, mainAxisMax == i7 ? Integer.MAX_VALUE : mainAxisMax - iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize, 0, 0, 8, null).m273toBoxConstraintsOenEA2s(layoutOrientation));
                            int iMin = Math.min(iMo188roundToPx0680j_4, (mainAxisMax - iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize) - RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeableMo2468measureBRTryo0, layoutOrientation));
                            iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize += RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeableMo2468measureBRTryo0, layoutOrientation) + iMin;
                            int iMax2 = Math.max(i11, RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeableMo2468measureBRTryo0, layoutOrientation));
                            boolean z2 = z || RowColumnImplKt.isRelative(rowColumnParentData);
                            placeableArr[i12] = placeableMo2468measureBRTryo0;
                            i = iMin;
                            i2 = iMax2;
                            z = z2;
                            i5 = i13;
                        }
                        if (i10 > i5) {
                            break;
                        }
                        size3 = i5;
                        i8 = i10;
                        rowColumnParentDataArr = rowColumnParentDataArr;
                        i7 = Integer.MAX_VALUE;
                    }
                    i3 = i9;
                } else {
                    rowColumnParentDataArr = rowColumnParentDataArr;
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    f2 = 0.0f;
                    iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize = 0;
                    z = false;
                }
                if (i3 == 0) {
                    iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize -= i;
                    iCoerceAtMost = 0;
                } else {
                    int i14 = iMo188roundToPx0680j_4 * (i3 - 1);
                    int mainAxisMin = (((f2 <= 0.0f || orientationIndependentConstraints.getMainAxisMax() == Integer.MAX_VALUE) ? orientationIndependentConstraints.getMainAxisMin() : orientationIndependentConstraints.getMainAxisMax()) - iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize) - i14;
                    float f3 = f2 > 0.0f ? mainAxisMin / f2 : 0.0f;
                    int iRoundToInt = 0;
                    for (int i15 = 0; i15 < size2; i15++) {
                        iRoundToInt += c.roundToInt(RowColumnImplKt.getWeight(rowColumnParentDataArr[i15]) * f3);
                    }
                    int i16 = mainAxisMin - iRoundToInt;
                    int size4 = list.size() - 1;
                    int i17 = 0;
                    if (size4 >= 0) {
                        int iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize2 = 0;
                        while (true) {
                            int i18 = i17 + 1;
                            if (placeableArr[i17] == null) {
                                Measurable measurable2 = list2.get(i17);
                                RowColumnParentData rowColumnParentData2 = rowColumnParentDataArr[i17];
                                float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                                if (!(weight2 > 0.0f)) {
                                    throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                                }
                                int sign = c.getSign(i16);
                                int i19 = i16 - sign;
                                int iMax3 = Math.max(0, c.roundToInt(weight2 * f3) + sign);
                                Placeable placeableMo2468measureBRTryo1 = measurable2.mo2468measureBRTryo0(new OrientationIndependentConstraints((!RowColumnImplKt.getFill(rowColumnParentData2) || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3, iMax3, 0, orientationIndependentConstraints.getCrossAxisMax()).m273toBoxConstraintsOenEA2s(layoutOrientation));
                                iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize2 += RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeableMo2468measureBRTryo1, layoutOrientation);
                                int iMax4 = Math.max(i2, RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeableMo2468measureBRTryo1, layoutOrientation));
                                boolean z3 = z || RowColumnImplKt.isRelative(rowColumnParentData2);
                                placeableArr[i17] = placeableMo2468measureBRTryo1;
                                i16 = i19;
                                z = z3;
                                i2 = iMax4;
                            }
                            if (i18 > size4) {
                                i17 = iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize2;
                                break;
                            }
                            list2 = list;
                            f3 = f3;
                            i17 = i18;
                        }
                    }
                    iCoerceAtMost = e.coerceAtMost(i17 + i14, orientationIndependentConstraints.getMainAxisMax() - iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize);
                }
                final Ref.IntRef intRef = new Ref.IntRef();
                if (!z || (i4 = size - 1) < 0) {
                    iMax = 0;
                } else {
                    int i20 = 0;
                    iMax = 0;
                    while (true) {
                        int i21 = i20 + 1;
                        Placeable placeable = placeableArr[i20];
                        CrossAxisAlignment crossAxisAlignment2 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr[i20]);
                        Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment2 == null ? null : crossAxisAlignment2.calculateAlignmentLinePosition$foundation_layout_release(placeable);
                        if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                            int i22 = intRef.element;
                            int iIntValue = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                            if (iIntValue == Integer.MIN_VALUE) {
                                iIntValue = 0;
                            }
                            intRef.element = Math.max(i22, iIntValue);
                            int iRowColumnMeasurePolicy_TDGSqEk$crossAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, layoutOrientation);
                            LayoutOrientation layoutOrientation2 = layoutOrientation;
                            int iIntValue2 = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                            if (iIntValue2 == Integer.MIN_VALUE) {
                                iIntValue2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, layoutOrientation2);
                            }
                            iMax = Math.max(iMax, iRowColumnMeasurePolicy_TDGSqEk$crossAxisSize - iIntValue2);
                        }
                        if (i21 > i4) {
                            break;
                        }
                        i20 = i21;
                    }
                }
                final int iMax5 = Math.max(iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize + iCoerceAtMost, orientationIndependentConstraints.getMainAxisMin());
                final int iMax6 = (orientationIndependentConstraints.getCrossAxisMax() == Integer.MAX_VALUE || sizeMode != SizeMode.Expand) ? Math.max(i2, Math.max(orientationIndependentConstraints.getCrossAxisMin(), intRef.element + iMax)) : orientationIndependentConstraints.getCrossAxisMax();
                LayoutOrientation layoutOrientation3 = layoutOrientation;
                LayoutOrientation layoutOrientation4 = LayoutOrientation.Horizontal;
                int i23 = layoutOrientation3 == layoutOrientation4 ? iMax5 : iMax6;
                int i24 = layoutOrientation3 == layoutOrientation4 ? iMax6 : iMax5;
                int size5 = list.size();
                final int[] iArr = new int[size5];
                for (int i25 = 0; i25 < size5; i25++) {
                    iArr[i25] = 0;
                }
                final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function6 = function5;
                final LayoutOrientation layoutOrientation5 = layoutOrientation;
                final CrossAxisAlignment crossAxisAlignment3 = crossAxisAlignment;
                final RowColumnParentData[] rowColumnParentDataArr2 = rowColumnParentDataArr;
                return MeasureScope.DefaultImpls.layout$default(measureScope, i23, i24, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        int size6 = list.size();
                        int[] iArr2 = new int[size6];
                        int i26 = 0;
                        for (int i27 = 0; i27 < size6; i27++) {
                            iArr2[i27] = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeableArr[i27], layoutOrientation5);
                        }
                        function6.invoke(Integer.valueOf(iMax5), iArr2, measureScope.getLayoutDirection(), measureScope, iArr);
                        Placeable[] placeableArr2 = placeableArr;
                        RowColumnParentData[] rowColumnParentDataArr3 = rowColumnParentDataArr2;
                        CrossAxisAlignment crossAxisAlignment4 = crossAxisAlignment3;
                        int i28 = iMax6;
                        LayoutOrientation layoutOrientation6 = layoutOrientation5;
                        MeasureScope measureScope2 = measureScope;
                        Ref.IntRef intRef2 = intRef;
                        int[] iArr3 = iArr;
                        int length = placeableArr2.length;
                        int i29 = 0;
                        while (i26 < length) {
                            Placeable placeable2 = placeableArr2[i26];
                            int i30 = i29 + 1;
                            CrossAxisAlignment crossAxisAlignment5 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr3[i29]);
                            if (crossAxisAlignment5 == null) {
                                crossAxisAlignment5 = crossAxisAlignment4;
                            }
                            int iRowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 = i28 - RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable2, layoutOrientation6);
                            LayoutOrientation layoutOrientation7 = LayoutOrientation.Horizontal;
                            Placeable[] placeableArr3 = placeableArr2;
                            int iAlign$foundation_layout_release = crossAxisAlignment5.align$foundation_layout_release(iRowColumnMeasurePolicy_TDGSqEk$crossAxisSize2, layoutOrientation6 == layoutOrientation7 ? LayoutDirection.Ltr : measureScope2.getLayoutDirection(), placeable2, intRef2.element);
                            if (layoutOrientation6 == layoutOrientation7) {
                                Placeable.PlacementScope.place$default(placementScope, placeable2, iArr3[i29], iAlign$foundation_layout_release, 0.0f, 4, null);
                            } else {
                                Placeable.PlacementScope.place$default(placementScope, placeable2, iAlign$foundation_layout_release, iArr3[i29], 0.0f, 4, null);
                            }
                            i26++;
                            i29 = i30;
                            placeableArr2 = placeableArr3;
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
                return ((Number) RowColumnImplKt.MinIntrinsicHeightMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo188roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
                return ((Number) RowColumnImplKt.MinIntrinsicWidthMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo188roundToPx0680j_4(f)))).intValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }
}
