package com.xiaomi.fitness.common.recycer;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/GridItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "position", "Landroidx/recyclerview/widget/GridLayoutManager$b;", "spanSizeLookup", "", "isColTopV2", "(ILandroidx/recyclerview/widget/GridLayoutManager$b;)Z", "isColBottom", "(I)Z", "isRowStartV2", "isRowEndV2", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "itemSize", "I", "getItemSize", "()I", "colCount", "getColCount", "horizontalEdge", "horizontalInBetween", "getHorizontalInBetween", "verticalEdge", "verticalInBetween", "getVerticalInBetween", "rowCount", "<init>", "(IIIIII)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GridItemDecoration extends RecyclerView.n {
    private final int colCount;
    private final int horizontalEdge;
    private final int horizontalInBetween;
    private final int itemSize;
    private final int rowCount;
    private final int verticalEdge;
    private final int verticalInBetween;

    public GridItemDecoration(int i, int i2, int i3, int i4, int i5, int i6) {
        this.itemSize = i;
        this.colCount = i2;
        this.horizontalEdge = i3;
        this.horizontalInBetween = i4;
        this.verticalEdge = i5;
        this.verticalInBetween = i6;
        this.rowCount = i / i2;
    }

    private final boolean isColBottom(int position) {
        return position >= this.colCount * (this.rowCount - 1);
    }

    private final boolean isColTopV2(int position, GridLayoutManager.b spanSizeLookup) {
        if (position < 1) {
            return true;
        }
        int spanSize = 0;
        for (int i = 0; i < position; i++) {
            spanSize += spanSizeLookup.getSpanSize(i);
        }
        return spanSize < this.colCount;
    }

    private final boolean isRowEndV2(int position, GridLayoutManager.b spanSizeLookup) {
        if (position <= 0) {
            return false;
        }
        int spanSize = 0;
        for (int i = 0; i < position; i++) {
            spanSize += spanSizeLookup.getSpanSize(i);
        }
        int i2 = this.colCount;
        return spanSize % i2 == i2 - 1;
    }

    private final boolean isRowStartV2(int position, GridLayoutManager.b spanSizeLookup) {
        if (position <= 0) {
            return true;
        }
        int spanSize = 0;
        for (int i = 0; i < position; i++) {
            spanSize += spanSizeLookup.getSpanSize(i);
        }
        return spanSize % this.colCount == 0;
    }

    public final int getColCount() {
        return this.colCount;
    }

    public final int getHorizontalInBetween() {
        return this.horizontalInBetween;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        boolean zIsRTLDirection = AppUtil.isRTLDirection();
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.o layoutManager = parent.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager.b bVarY = ((GridLayoutManager) layoutManager).y();
        if (zIsRTLDirection) {
            Intrinsics.checkNotNull(bVarY);
            if (isRowStartV2(childAdapterPosition, bVarY)) {
                outRect.right = this.horizontalEdge;
            } else {
                outRect.right = this.horizontalInBetween;
            }
            if (isRowEndV2(childAdapterPosition, bVarY)) {
                outRect.left = this.horizontalEdge;
            }
        } else {
            Intrinsics.checkNotNull(bVarY);
            if (isRowStartV2(childAdapterPosition, bVarY)) {
                outRect.left = this.horizontalEdge;
            } else {
                outRect.left = this.horizontalInBetween;
            }
            if (isRowEndV2(childAdapterPosition, bVarY)) {
                outRect.right = this.horizontalEdge;
            }
        }
        if (isColTopV2(childAdapterPosition, bVarY)) {
            outRect.top = this.verticalEdge;
        } else {
            outRect.top = this.verticalInBetween;
        }
        if (isColBottom(childAdapterPosition)) {
            outRect.bottom = this.verticalEdge;
        }
    }

    public final int getItemSize() {
        return this.itemSize;
    }

    public final int getVerticalInBetween() {
        return this.verticalInBetween;
    }
}
