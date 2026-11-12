package androidx.compose.foundation.lazy;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u001b\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010%\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\bJ%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ#\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fR-\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0013\u0010!\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0013\u0010#\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "", "Landroidx/compose/foundation/lazy/DataIndex;", "index", "", "scrollOffset", "", "update-AhXoVpI", "(II)V", "update", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureResult", "updateFromMeasureResult", "requestPosition-AhXoVpI", "requestPosition", "Landroidx/compose/foundation/lazy/LazyListItemsProvider;", "itemsProvider", "updateScrollPositionIfTheFirstItemWasMoved", "<set-?>", LogUtil.I, "getIndex-jQJCoq8", "()I", "getScrollOffset", "Landroidx/compose/runtime/MutableState;", "indexState", "Landroidx/compose/runtime/MutableState;", "scrollOffsetState", "", "hadFirstNotEmptyLayout", "Z", "lastKnownFirstItemKey", "Ljava/lang/Object;", "getObservableIndex", "observableIndex", "getObservableScrollOffset", "observableScrollOffset", "initialIndex", "initialScrollOffset", "<init>", "Companion", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class LazyListScrollPosition {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private boolean hadFirstNotEmptyLayout;
    private int index;

    @NotNull
    private final MutableState<Integer> indexState;

    @Nullable
    private Object lastKnownFirstItemKey;
    private int scrollOffset;

    @NotNull
    private final MutableState<Integer> scrollOffsetState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\t\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollPosition$Companion;", "", "key", "Landroidx/compose/foundation/lazy/DataIndex;", "lastKnownIndex", "Landroidx/compose/foundation/lazy/LazyListItemsProvider;", "itemsProvider", "findLazyListIndexByKey-KXnL5Ic", "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/LazyListItemsProvider;)I", "findLazyListIndexByKey", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: findLazyListIndexByKey-KXnL5Ic, reason: not valid java name */
        public final int m362findLazyListIndexByKeyKXnL5Ic(Object key, int lastKnownIndex, LazyListItemsProvider itemsProvider) {
            if (key == null) {
                return lastKnownIndex;
            }
            int itemsCount = itemsProvider.getItemsCount();
            if (lastKnownIndex < itemsCount && Intrinsics.areEqual(key, itemsProvider.getKey(lastKnownIndex))) {
                return lastKnownIndex;
            }
            int iMin = Math.min(itemsCount - 1, lastKnownIndex - 1);
            int i = lastKnownIndex + 1;
            while (true) {
                if (iMin < 0 && i >= itemsCount) {
                    return lastKnownIndex;
                }
                if (iMin >= 0) {
                    if (Intrinsics.areEqual(key, itemsProvider.getKey(iMin))) {
                        return DataIndex.m337constructorimpl(iMin);
                    }
                    iMin--;
                }
                if (i < itemsCount) {
                    if (Intrinsics.areEqual(key, itemsProvider.getKey(i))) {
                        return DataIndex.m337constructorimpl(i);
                    }
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyListScrollPosition() {
        int i = 0;
        this(i, i, 3, null);
    }

    public LazyListScrollPosition(int i, int i2) {
        this.index = DataIndex.m337constructorimpl(i);
        this.scrollOffset = i2;
        this.indexState = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(getIndex()), null, 2, null);
        this.scrollOffsetState = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(this.scrollOffset), null, 2, null);
    }

    /* JADX INFO: renamed from: update-AhXoVpI, reason: not valid java name */
    private final void m358updateAhXoVpI(int index, int scrollOffset) {
        if (!(((float) index) >= 0.0f)) {
            throw new IllegalArgumentException(("Index should be non-negative (" + index + ')').toString());
        }
        if (!(((float) scrollOffset) >= 0.0f)) {
            throw new IllegalArgumentException(("scrollOffset should be non-negative (" + scrollOffset + ')').toString());
        }
        if (!DataIndex.m340equalsimpl0(index, getIndex())) {
            this.index = index;
            this.indexState.setValue(Integer.valueOf(index));
        }
        if (scrollOffset != this.scrollOffset) {
            this.scrollOffset = scrollOffset;
            this.scrollOffsetState.setValue(Integer.valueOf(scrollOffset));
        }
    }

    /* JADX INFO: renamed from: getIndex-jQJCoq8, reason: not valid java name and from getter */
    public final int getIndex() {
        return this.index;
    }

    public final int getObservableIndex() {
        return this.indexState.getValue().intValue();
    }

    public final int getObservableScrollOffset() {
        return this.scrollOffsetState.getValue().intValue();
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    /* JADX INFO: renamed from: requestPosition-AhXoVpI, reason: not valid java name */
    public final void m360requestPositionAhXoVpI(int index, int scrollOffset) {
        m358updateAhXoVpI(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(@NotNull LazyListMeasureResult measureResult) {
        LazyMeasuredItem firstVisibleItem = measureResult.getFirstVisibleItem();
        this.lastKnownFirstItemKey = firstVisibleItem == null ? null : firstVisibleItem.getKey();
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            LazyMeasuredItem firstVisibleItem2 = measureResult.getFirstVisibleItem();
            m358updateAhXoVpI(DataIndex.m337constructorimpl(firstVisibleItem2 == null ? 0 : firstVisibleItem2.getIndex()), measureResult.getFirstVisibleItemScrollOffset());
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyListItemsProvider itemsProvider) {
        m358updateAhXoVpI(Companion.m362findLazyListIndexByKeyKXnL5Ic(this.lastKnownFirstItemKey, getIndex(), itemsProvider), this.scrollOffset);
    }

    public /* synthetic */ LazyListScrollPosition(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
