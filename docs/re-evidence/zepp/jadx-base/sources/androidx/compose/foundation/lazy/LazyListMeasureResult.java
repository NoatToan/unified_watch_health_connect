package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.Placeable;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0088\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b\"\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0016\u0012\u0006\u0010*\u001a\u00020\u0007\u0012\u0006\u0010,\u001a\u00020\u0007\u0012\u0006\u0010.\u001a\u00020\u0007¢\u0006\u0004\b0\u00101R\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000bR\u0019\u0010\u001d\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000bR*\u0010#\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b\"8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00168\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u001c\u0010*\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000bR\u001c\u0010,\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b-\u0010\u000bR\u001c\u0010.\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b/\u0010\u000b¨\u00062"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "firstVisibleItem", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "getFirstVisibleItem", "()Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "", "firstVisibleItemScrollOffset", LogUtil.I, "getFirstVisibleItemScrollOffset", "()I", "", "canScrollForward", "Z", "getCanScrollForward", "()Z", "", "consumedScroll", "F", "getConsumedScroll", "()F", "", "composedButNotVisibleItems", "Ljava/util/List;", "getComposedButNotVisibleItems", "()Ljava/util/List;", "layoutWidth", "getLayoutWidth", "layoutHeight", "getLayoutHeight", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Lkotlin/jvm/functions/Function1;", "getPlacementBlock", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "visibleItemsInfo", "getVisibleItemsInfo", "viewportStartOffset", "getViewportStartOffset", "viewportEndOffset", "getViewportEndOffset", "totalItemsCount", "getTotalItemsCount", "<init>", "(Landroidx/compose/foundation/lazy/LazyMeasuredItem;IZFLjava/util/List;IILkotlin/jvm/functions/Function1;Ljava/util/List;III)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class LazyListMeasureResult implements LazyListLayoutInfo {
    private final boolean canScrollForward;

    @Nullable
    private final List<LazyMeasuredItem> composedButNotVisibleItems;
    private final float consumedScroll;

    @Nullable
    private final LazyMeasuredItem firstVisibleItem;
    private final int firstVisibleItemScrollOffset;
    private final int layoutHeight;
    private final int layoutWidth;

    @NotNull
    private final Function1<Placeable.PlacementScope, Unit> placementBlock;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;

    @NotNull
    private final List<LazyListItemInfo> visibleItemsInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListMeasureResult(@Nullable LazyMeasuredItem lazyMeasuredItem, int i, boolean z, float f, @Nullable List<LazyMeasuredItem> list, int i2, int i3, @NotNull Function1<? super Placeable.PlacementScope, Unit> function1, @NotNull List<? extends LazyListItemInfo> list2, int i4, int i5, int i6) {
        this.firstVisibleItem = lazyMeasuredItem;
        this.firstVisibleItemScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.composedButNotVisibleItems = list;
        this.layoutWidth = i2;
        this.layoutHeight = i3;
        this.placementBlock = function1;
        this.visibleItemsInfo = list2;
        this.viewportStartOffset = i4;
        this.viewportEndOffset = i5;
        this.totalItemsCount = i6;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @Nullable
    public final List<LazyMeasuredItem> getComposedButNotVisibleItems() {
        return this.composedButNotVisibleItems;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @Nullable
    public final LazyMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    public final int getLayoutHeight() {
        return this.layoutHeight;
    }

    public final int getLayoutWidth() {
        return this.layoutWidth;
    }

    @NotNull
    public final Function1<Placeable.PlacementScope, Unit> getPlacementBlock() {
        return this.placementBlock;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @NotNull
    public List<LazyListItemInfo> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }
}
