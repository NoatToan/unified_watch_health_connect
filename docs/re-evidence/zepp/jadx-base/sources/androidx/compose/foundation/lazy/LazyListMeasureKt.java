package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u009f\u0001\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001ab\u0010%\u001a\u00020$2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "itemProvider", "mainAxisMaxSize", "startContentPadding", "endContentPadding", "Landroidx/compose/foundation/lazy/DataIndex;", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "", "headerIndexes", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-9CW8viI", "(ILandroidx/compose/foundation/lazy/LazyMeasuredItemProvider;IIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "items", "mainAxisLayoutSize", "usedMainAxisSize", "itemsScrollOffset", "", "calculateItemsOffsets", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class LazyListMeasureKt {
    private static final void calculateItemsOffsets(List<LazyMeasuredItem> list, int i, int i2, int i3, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LayoutDirection layoutDirection) {
        int i4 = 0;
        boolean z3 = i2 < i;
        if (z3) {
            if (!(i3 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (z3) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr[i5] = list.get(!z2 ? i5 : (size - i5) - 1).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i6 = 0; i6 < size; i6++) {
                iArr2[i6] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                horizontal.arrange(density, i, iArr, layoutDirection, iArr2);
            }
            int i7 = 0;
            while (i4 < size) {
                int size2 = iArr2[i4];
                int i8 = i7 + 1;
                if (z2) {
                    i7 = (size - i7) - 1;
                }
                LazyMeasuredItem lazyMeasuredItem = list.get(i7);
                if (z2) {
                    size2 = (i - size2) - lazyMeasuredItem.getSize();
                }
                lazyMeasuredItem.setOffset(size2);
                i4++;
                i7 = i8;
            }
            return;
        }
        int size3 = list.size() - 1;
        if (size3 < 0) {
            return;
        }
        int sizeWithSpacings = i3;
        while (true) {
            int i9 = i4 + 1;
            LazyMeasuredItem lazyMeasuredItem2 = list.get(i4);
            lazyMeasuredItem2.setOffset(sizeWithSpacings);
            sizeWithSpacings += lazyMeasuredItem2.getSizeWithSpacings();
            if (i9 > size3) {
                return;
            } else {
                i4 = i9;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0202  */
    /* JADX WARN: Code duplicated, block: B:103:0x0209  */
    /* JADX WARN: Code duplicated, block: B:106:0x0212  */
    /* JADX WARN: Code duplicated, block: B:107:0x0215  */
    /* JADX WARN: Code duplicated, block: B:66:0x0158 A[PHI: r7 r8 r9 r11
      0x0158: PHI (r7v10 int) = (r7v9 int), (r7v17 int) binds: [B:50:0x0110, B:64:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0158: PHI (r8v3 int) = (r8v2 int), (r8v7 int) binds: [B:50:0x0110, B:64:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0158: PHI (r9v5 int) = (r9v4 int), (r9v16 int) binds: [B:50:0x0110, B:64:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0158: PHI (r11v3 int) = (r11v2 int), (r11v9 int) binds: [B:50:0x0110, B:64:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:99:0x01de  */
    @NotNull
    /* JADX INFO: renamed from: measureLazyList-9CW8viI, reason: not valid java name */
    public static final LazyListMeasureResult m356measureLazyList9CW8viI(int i, @NotNull LazyMeasuredItemProvider lazyMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, float f, long j, boolean z, @NotNull List<Integer> list, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, boolean z2, @NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        int i7;
        int i8;
        int iM337constructorimpl;
        int i9;
        int i10;
        int i11;
        LazyMeasuredItem lazyMeasuredItem;
        int i12;
        int i13;
        final int iM2949constrainWidthK40F9xA;
        int i14;
        final int iM2948constrainHeightK40F9xA;
        int i15;
        final LazyMeasuredItem lazyMeasuredItemFindOrComposeLazyListHeader;
        boolean z3;
        int size;
        int i16 = i;
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i16 <= 0) {
            return new LazyListMeasureResult(null, 0, false, 0.0f, null, Constraints.m2937getMinWidthimpl(j), Constraints.m2936getMinHeightimpl(j), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                }
            }, CollectionsKt__CollectionsKt.emptyList(), -i3, i4, 0);
        }
        int iM337constructorimpl2 = i5;
        if (iM337constructorimpl2 >= i16) {
            iM337constructorimpl2 = DataIndex.m337constructorimpl(i16 - 1);
            i7 = 0;
        } else {
            i7 = i6;
        }
        int iRoundToInt = c.roundToInt(f);
        int i17 = i7 - iRoundToInt;
        if (DataIndex.m340equalsimpl0(iM337constructorimpl2, DataIndex.m337constructorimpl(0)) && i17 < 0) {
            iRoundToInt += i17;
            i17 = 0;
        }
        final ArrayList arrayList = new ArrayList();
        int sizeWithSpacings = i17 - i3;
        int i18 = -i3;
        int iMax = 0;
        while (sizeWithSpacings < 0 && iM337constructorimpl2 - DataIndex.m337constructorimpl(0) > 0) {
            iM337constructorimpl2 = DataIndex.m337constructorimpl(iM337constructorimpl2 - 1);
            LazyMeasuredItem lazyMeasuredItemM364getAndMeasureZjPyQlc = lazyMeasuredItemProvider.m364getAndMeasureZjPyQlc(iM337constructorimpl2);
            arrayList.add(0, lazyMeasuredItemM364getAndMeasureZjPyQlc);
            iMax = Math.max(iMax, lazyMeasuredItemM364getAndMeasureZjPyQlc.getCrossAxisSize());
            sizeWithSpacings += lazyMeasuredItemM364getAndMeasureZjPyQlc.getSizeWithSpacings();
        }
        if (sizeWithSpacings < i18) {
            iRoundToInt += sizeWithSpacings;
            sizeWithSpacings = i18;
        }
        int sizeWithSpacings2 = sizeWithSpacings + i3;
        int i19 = i2 + i4;
        int sizeWithSpacings3 = -sizeWithSpacings2;
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            iM337constructorimpl = iM337constructorimpl2;
            int i20 = 0;
            while (true) {
                i8 = iM337constructorimpl2;
                int i21 = i20 + 1;
                LazyMeasuredItem lazyMeasuredItem2 = (LazyMeasuredItem) arrayList.get(i20);
                iM337constructorimpl = DataIndex.m337constructorimpl(iM337constructorimpl + 1);
                sizeWithSpacings3 += lazyMeasuredItem2.getSizeWithSpacings();
                if (i21 > size2) {
                    break;
                }
                i20 = i21;
                iM337constructorimpl2 = i8;
            }
        } else {
            i8 = iM337constructorimpl2;
            iM337constructorimpl = i8;
        }
        int iM337constructorimpl3 = i8;
        int iM337constructorimpl4 = iM337constructorimpl;
        ArrayList arrayList2 = null;
        while (sizeWithSpacings3 <= i19 && iM337constructorimpl4 < i16) {
            LazyMeasuredItem lazyMeasuredItemM364getAndMeasureZjPyQlc2 = lazyMeasuredItemProvider.m364getAndMeasureZjPyQlc(iM337constructorimpl4);
            sizeWithSpacings3 += lazyMeasuredItemM364getAndMeasureZjPyQlc2.getSizeWithSpacings();
            if (sizeWithSpacings3 < i18) {
                iM337constructorimpl3 = DataIndex.m337constructorimpl(iM337constructorimpl4 + 1);
                sizeWithSpacings2 -= lazyMeasuredItemM364getAndMeasureZjPyQlc2.getSizeWithSpacings();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(lazyMeasuredItemM364getAndMeasureZjPyQlc2);
            } else {
                int i22 = iM337constructorimpl3;
                int iMax2 = Math.max(iMax, lazyMeasuredItemM364getAndMeasureZjPyQlc2.getCrossAxisSize());
                arrayList.add(lazyMeasuredItemM364getAndMeasureZjPyQlc2);
                iMax = iMax2;
                iM337constructorimpl3 = i22;
            }
            iM337constructorimpl4 = DataIndex.m337constructorimpl(iM337constructorimpl4 + 1);
            i16 = i;
        }
        int i23 = iM337constructorimpl3;
        if (sizeWithSpacings3 < i2) {
            int i24 = i2 - sizeWithSpacings3;
            sizeWithSpacings2 -= i24;
            sizeWithSpacings3 += i24;
            int iM337constructorimpl5 = i23;
            while (sizeWithSpacings2 < 0 && iM337constructorimpl5 - DataIndex.m337constructorimpl(0) > 0) {
                iM337constructorimpl5 = DataIndex.m337constructorimpl(iM337constructorimpl5 - 1);
                int lastIndex = arrayList2 == null ? -1 : CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                LazyMeasuredItem lazyMeasuredItemM364getAndMeasureZjPyQlc3 = lastIndex >= 0 ? (LazyMeasuredItem) arrayList2.remove(lastIndex) : lazyMeasuredItemProvider.m364getAndMeasureZjPyQlc(iM337constructorimpl5);
                arrayList.add(0, lazyMeasuredItemM364getAndMeasureZjPyQlc3);
                iMax = Math.max(iMax, lazyMeasuredItemM364getAndMeasureZjPyQlc3.getCrossAxisSize());
                sizeWithSpacings2 += lazyMeasuredItemM364getAndMeasureZjPyQlc3.getSizeWithSpacings();
            }
            iRoundToInt += i24;
            if (sizeWithSpacings2 < 0) {
                iRoundToInt += sizeWithSpacings2;
                i9 = sizeWithSpacings3 + sizeWithSpacings2;
                sizeWithSpacings2 = 0;
            } else {
                i9 = sizeWithSpacings3;
            }
        } else {
            i9 = sizeWithSpacings3;
        }
        float f2 = (c.getSign(c.roundToInt(f)) != c.getSign(iRoundToInt) || Math.abs(c.roundToInt(f)) < Math.abs(iRoundToInt)) ? f : iRoundToInt;
        int i25 = -sizeWithSpacings2;
        LazyMeasuredItem lazyMeasuredItem3 = (LazyMeasuredItem) CollectionsKt.firstOrNull((List) arrayList);
        if (i3 > 0 && (size = arrayList.size() - 1) >= 0) {
            int i26 = 0;
            while (true) {
                LazyMeasuredItem lazyMeasuredItem4 = lazyMeasuredItem3;
                int i27 = i26 + 1;
                i10 = iMax;
                int sizeWithSpacings4 = ((LazyMeasuredItem) arrayList.get(i26)).getSizeWithSpacings();
                i11 = i18;
                if (sizeWithSpacings4 > sizeWithSpacings2 || i26 == CollectionsKt__CollectionsKt.getLastIndex(arrayList)) {
                    lazyMeasuredItem = lazyMeasuredItem4;
                } else {
                    sizeWithSpacings2 -= sizeWithSpacings4;
                    LazyMeasuredItem lazyMeasuredItem5 = (LazyMeasuredItem) arrayList.get(i27);
                    if (i27 > size) {
                        i12 = sizeWithSpacings2;
                        lazyMeasuredItem = lazyMeasuredItem5;
                        break;
                    }
                    i26 = i27;
                    lazyMeasuredItem3 = lazyMeasuredItem5;
                    i18 = i11;
                    iMax = i10;
                }
            }
            if (z) {
                i13 = i10;
            } else {
                i13 = i9;
            }
            iM2949constrainWidthK40F9xA = ConstraintsKt.m2949constrainWidthK40F9xA(j, i13);
            if (z) {
                i14 = i9;
            } else {
                i14 = i10;
            }
            iM2948constrainHeightK40F9xA = ConstraintsKt.m2948constrainHeightK40F9xA(j, i14);
            if (z) {
                i15 = iM2948constrainHeightK40F9xA;
            } else {
                i15 = iM2949constrainWidthK40F9xA;
            }
            float f3 = f2;
            calculateItemsOffsets(arrayList, i15, i9, i25, z, vertical, horizontal, z2, density, layoutDirection);
            if (!list.isEmpty()) {
                lazyMeasuredItemFindOrComposeLazyListHeader = LazyListHeadersKt.findOrComposeLazyListHeader(arrayList, arrayList2, lazyMeasuredItemProvider, list, i3);
            } else {
                lazyMeasuredItemFindOrComposeLazyListHeader = null;
            }
            int iMin = Math.min(i9, i2) + i4;
            if (i9 > i2) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new LazyListMeasureResult(lazyMeasuredItem, i12, z3, f3, arrayList2, iM2949constrainWidthK40F9xA, iM2948constrainHeightK40F9xA, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
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
                    List<LazyMeasuredItem> list2 = arrayList;
                    LazyMeasuredItem lazyMeasuredItem6 = lazyMeasuredItemFindOrComposeLazyListHeader;
                    int i28 = iM2949constrainWidthK40F9xA;
                    int i29 = iM2948constrainHeightK40F9xA;
                    int size3 = list2.size() - 1;
                    if (size3 >= 0) {
                        int i30 = 0;
                        while (true) {
                            int i31 = i30 + 1;
                            LazyMeasuredItem lazyMeasuredItem7 = list2.get(i30);
                            if (lazyMeasuredItem7 != lazyMeasuredItem6) {
                                lazyMeasuredItem7.place(placementScope, i28, i29);
                            }
                            if (i31 > size3) {
                                break;
                            } else {
                                i30 = i31;
                            }
                        }
                    }
                    LazyMeasuredItem lazyMeasuredItem8 = lazyMeasuredItemFindOrComposeLazyListHeader;
                    if (lazyMeasuredItem8 == null) {
                        return;
                    }
                    lazyMeasuredItem8.place(placementScope, iM2949constrainWidthK40F9xA, iM2948constrainHeightK40F9xA);
                }
            }, arrayList, i11, iMin, i);
        }
        i10 = iMax;
        i11 = i18;
        lazyMeasuredItem = lazyMeasuredItem3;
        i12 = sizeWithSpacings2;
        if (z) {
            i13 = i10;
        } else {
            i13 = i9;
        }
        iM2949constrainWidthK40F9xA = ConstraintsKt.m2949constrainWidthK40F9xA(j, i13);
        if (z) {
            i14 = i9;
        } else {
            i14 = i10;
        }
        iM2948constrainHeightK40F9xA = ConstraintsKt.m2948constrainHeightK40F9xA(j, i14);
        if (z) {
            i15 = iM2948constrainHeightK40F9xA;
        } else {
            i15 = iM2949constrainWidthK40F9xA;
        }
        float f4 = f2;
        calculateItemsOffsets(arrayList, i15, i9, i25, z, vertical, horizontal, z2, density, layoutDirection);
        if (!list.isEmpty()) {
            lazyMeasuredItemFindOrComposeLazyListHeader = LazyListHeadersKt.findOrComposeLazyListHeader(arrayList, arrayList2, lazyMeasuredItemProvider, list, i3);
        } else {
            lazyMeasuredItemFindOrComposeLazyListHeader = null;
        }
        int iMin2 = Math.min(i9, i2) + i4;
        if (i9 > i2) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new LazyListMeasureResult(lazyMeasuredItem, i12, z3, f4, arrayList2, iM2949constrainWidthK40F9xA, iM2948constrainHeightK40F9xA, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
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
                List<LazyMeasuredItem> list2 = arrayList;
                LazyMeasuredItem lazyMeasuredItem6 = lazyMeasuredItemFindOrComposeLazyListHeader;
                int i28 = iM2949constrainWidthK40F9xA;
                int i29 = iM2948constrainHeightK40F9xA;
                int size3 = list2.size() - 1;
                if (size3 >= 0) {
                    int i30 = 0;
                    while (true) {
                        int i31 = i30 + 1;
                        LazyMeasuredItem lazyMeasuredItem7 = list2.get(i30);
                        if (lazyMeasuredItem7 != lazyMeasuredItem6) {
                            lazyMeasuredItem7.place(placementScope, i28, i29);
                        }
                        if (i31 > size3) {
                            break;
                        } else {
                            i30 = i31;
                        }
                    }
                }
                LazyMeasuredItem lazyMeasuredItem8 = lazyMeasuredItemFindOrComposeLazyListHeader;
                if (lazyMeasuredItem8 == null) {
                    return;
                }
                lazyMeasuredItem8.place(placementScope, iM2949constrainWidthK40F9xA, iM2948constrainHeightK40F9xA);
            }
        }, arrayList, i11, iMin2, i);
    }
}
