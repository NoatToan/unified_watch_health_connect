package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\n\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0000¨\u0006\u000b"}, d2 = {"", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "composedVisibleItems", "", "notUsedButComposedItems", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "itemProvider", "", "headerIndexes", "startContentPadding", "findOrComposeLazyListHeader", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class LazyListHeadersKt {
    @Nullable
    public static final LazyMeasuredItem findOrComposeLazyListHeader(@NotNull List<LazyMeasuredItem> list, @Nullable List<LazyMeasuredItem> list2, @NotNull LazyMeasuredItemProvider lazyMeasuredItemProvider, @NotNull List<Integer> list3, int i) {
        int iIntValue;
        int iIntValue2;
        int offset;
        int offset2;
        LazyMeasuredItem lazyMeasuredItem;
        int index = ((LazyMeasuredItem) CollectionsKt.first((List) list)).getIndex();
        int size = list3.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            iIntValue = -1;
            iIntValue2 = -1;
            while (true) {
                int i3 = i2 + 1;
                if (list3.get(i2).intValue() > index) {
                    break;
                }
                iIntValue = list3.get(i2).intValue();
                iIntValue2 = ((i3 < 0 || i3 > CollectionsKt__CollectionsKt.getLastIndex(list3)) ? -1 : list3.get(i3)).intValue();
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        } else {
            iIntValue = -1;
            iIntValue2 = -1;
        }
        int size2 = list.size() - 1;
        LazyMeasuredItem lazyMeasuredItem2 = null;
        LazyMeasuredItem lazyMeasuredItemM364getAndMeasureZjPyQlc = null;
        if (size2 >= 0) {
            int i4 = 0;
            offset = Integer.MIN_VALUE;
            offset2 = Integer.MIN_VALUE;
            while (true) {
                int i5 = i4 + 1;
                LazyMeasuredItem lazyMeasuredItem3 = list.get(i4);
                if (lazyMeasuredItem3.getIndex() == iIntValue) {
                    offset = lazyMeasuredItem3.getOffset();
                    lazyMeasuredItemM364getAndMeasureZjPyQlc = lazyMeasuredItem3;
                } else if (lazyMeasuredItem3.getIndex() == iIntValue2) {
                    offset2 = lazyMeasuredItem3.getOffset();
                }
                if (i5 > size2) {
                    break;
                }
                i4 = i5;
            }
        } else {
            offset = Integer.MIN_VALUE;
            offset2 = Integer.MIN_VALUE;
        }
        if (iIntValue == -1) {
            return null;
        }
        if (lazyMeasuredItemM364getAndMeasureZjPyQlc == null) {
            if (list2 != null) {
                int size3 = list2.size() - 1;
                if (size3 < 0) {
                    lazyMeasuredItem = null;
                    break;
                }
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    lazyMeasuredItem = list2.get(i6);
                    if (lazyMeasuredItem.getIndex() == iIntValue) {
                        break;
                    }
                    if (i7 > size3) {
                        lazyMeasuredItem = null;
                        break;
                    }
                    i6 = i7;
                }
                LazyMeasuredItem lazyMeasuredItem4 = lazyMeasuredItem;
                if (lazyMeasuredItem4 != null) {
                    list.add(0, lazyMeasuredItem4);
                    lazyMeasuredItem2 = lazyMeasuredItem4;
                }
            }
            if (lazyMeasuredItem2 == null) {
                lazyMeasuredItemM364getAndMeasureZjPyQlc = lazyMeasuredItemProvider.m364getAndMeasureZjPyQlc(DataIndex.m337constructorimpl(iIntValue));
                list.add(0, lazyMeasuredItemM364getAndMeasureZjPyQlc);
            } else {
                lazyMeasuredItemM364getAndMeasureZjPyQlc = lazyMeasuredItem2;
            }
        }
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i, offset) : -i;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - lazyMeasuredItemM364getAndMeasureZjPyQlc.getSize());
        }
        lazyMeasuredItemM364getAndMeasureZjPyQlc.setOffset(iMax);
        return lazyMeasuredItemM364getAndMeasureZjPyQlc;
    }
}
