package com.xiaomi.fitness.baseui.recyclerview.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0017\u0012\b\b\u0002\u0010!\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/decoration/GridItemSpace;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "position", "spanCount", "childCount", "", "isLastColumn", "(III)Z", "isLastRow", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "getSpanCount", "(Landroidx/recyclerview/widget/RecyclerView;)I", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "horizontalDivider", "F", "getHorizontalDivider", "()F", "setHorizontalDivider", "(F)V", "verticalDivider", "getVerticalDivider", "setVerticalDivider", "mLastOffset", "Z", "offsetBottom", "getOffsetBottom", "()Z", "setOffsetBottom", "(Z)V", "<init>", "(FFZ)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class GridItemSpace extends RecyclerView.n {
    private float horizontalDivider;
    private boolean mLastOffset;
    private boolean offsetBottom;
    private float verticalDivider;

    public GridItemSpace() {
        this(0.0f, 0.0f, false, 7, null);
    }

    private final int getSpanCount(RecyclerView parent) {
        RecyclerView.o layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).u();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).L();
        }
        throw new UnsupportedOperationException("the GridDividerItemDecoration can only be used in the RecyclerView which use a GridLayoutManager or StaggeredGridLayoutManager");
    }

    private final boolean isLastColumn(int position, int spanCount, int childCount) {
        return (position + 1) % spanCount == 0;
    }

    private final boolean isLastRow(int position, int spanCount, int childCount) {
        int i = childCount % spanCount;
        if (i != 0) {
            spanCount = i;
        }
        return position >= childCount - spanCount;
    }

    public final float getHorizontalDivider() {
        return this.horizontalDivider;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int spanCount = getSpanCount(parent);
        RecyclerView.Adapter adapter = parent.getAdapter();
        Intrinsics.checkNotNull(adapter);
        int itemCount = adapter.getItemCount();
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        outRect.set(0, 0, MathKt__MathJVMKt.roundToInt(this.horizontalDivider), MathKt__MathJVMKt.roundToInt(this.verticalDivider));
        if (isLastRow(childAdapterPosition, spanCount, itemCount) && (!this.mLastOffset || !this.offsetBottom)) {
            outRect.bottom = 0;
        }
        if (!isLastColumn(childAdapterPosition, spanCount, itemCount) || this.mLastOffset) {
            return;
        }
        outRect.right = 0;
    }

    public final boolean getOffsetBottom() {
        return this.offsetBottom;
    }

    public final float getVerticalDivider() {
        return this.verticalDivider;
    }

    public final void setHorizontalDivider(float f) {
        this.horizontalDivider = f;
    }

    public final void setOffsetBottom(boolean z) {
        this.offsetBottom = z;
    }

    public final void setVerticalDivider(float f) {
        this.verticalDivider = f;
    }

    public /* synthetic */ GridItemSpace(float f, float f2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? true : z);
    }

    public GridItemSpace(float f, float f2, boolean z) {
        this.horizontalDivider = f;
        this.verticalDivider = f2;
        this.mLastOffset = z;
        this.offsetBottom = true;
    }
}
