package com.xiaomi.fitness.baseui.recyclerview.decoration;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/decoration/GridVerticalDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "Landroid/graphics/Canvas;", PluginDeviceInfo.FICONON, "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "dividerWidthPx", "I", "totalGapPx", "vPaddingPx", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "", "halfGap", "F", "halfLine", "color", "<init>", "(IIII)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class GridVerticalDividerItemDecoration extends RecyclerView.n {
    private final int dividerWidthPx;
    private final float halfGap;
    private final float halfLine;

    @NotNull
    private final Paint paint;
    private final int totalGapPx;
    private final int vPaddingPx;

    public /* synthetic */ GridVerticalDividerItemDecoration(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i5 & 2) != 0 ? ExtUtilsKt.getDp(Float.valueOf(0.4f)) : i2, (i5 & 4) != 0 ? ExtUtilsKt.getDp(Float.valueOf(80.0f)) : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.o layoutManager = parent.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int iU = gridLayoutManager.u();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int iA = ((RecyclerView.LayoutParams) layoutParams).a() % iU;
        boolean z = false;
        if (c.A(parent) != 1 ? iA == 0 : iA == iU - 1) {
            z = true;
        }
        int i = (int) (this.halfGap + this.halfLine);
        if (z) {
            outRect.right = i;
        } else {
            outRect.left = i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas c, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.o layoutManager = parent.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int iU = gridLayoutManager.u();
        boolean z = c.A(parent) == 1;
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int iA = ((RecyclerView.LayoutParams) layoutParams).a();
            if (iA != -1) {
                int i2 = iA % iU;
                if (z) {
                    if (i2 != 0) {
                        float right = (childAt.getRight() + this.halfGap) - this.halfLine;
                        c.drawRect(right, childAt.getTop() + childAt.getPaddingTop() + this.vPaddingPx, right + this.dividerWidthPx, (childAt.getBottom() - childAt.getPaddingTop()) - this.vPaddingPx, this.paint);
                    }
                } else if (i2 != iU - 1) {
                    float right2 = (childAt.getRight() + this.halfGap) - this.halfLine;
                    c.drawRect(right2, childAt.getTop() + childAt.getPaddingTop() + this.vPaddingPx, right2 + this.dividerWidthPx, (childAt.getBottom() - childAt.getPaddingTop()) - this.vPaddingPx, this.paint);
                }
            }
        }
    }

    public GridVerticalDividerItemDecoration(int i, int i2, int i3, int i4) {
        this.dividerWidthPx = i2;
        this.totalGapPx = i3;
        this.vPaddingPx = i4;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.paint = paint;
        this.halfGap = i3 / 2.0f;
        this.halfLine = i2 / 2.0f;
    }
}
