package com.huami.widget.hrsection;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes17.dex */
class DividerDecoration extends RecyclerView.ItemDecoration {
    private Paint a;
    private Style b;

    public static class Style {
        private boolean a = false;

        @ColorInt
        private int b;

        @Px
        private int c;

        @Px
        private int d;

        public Style setDividerColor(@ColorInt int i) {
            this.b = i;
            return this;
        }

        public Style setDividerPadding(@Px int i) {
            this.d = i;
            return this;
        }

        public Style setDividerSize(@Px int i) {
            this.c = i;
            return this;
        }

        public Style setShowHorizontal(boolean z) {
            this.a = z;
            return this;
        }
    }

    public DividerDecoration(Style style) {
        this.b = style;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(this.b.b);
        this.a.setStyle(Paint.Style.FILL);
    }

    private void a(Canvas canvas, RecyclerView recyclerView, GridLayoutManager gridLayoutManager) {
        int childCount = recyclerView.getChildCount();
        int itemCount = recyclerView.getAdapter().getItemCount();
        int spanCount = gridLayoutManager.getSpanCount();
        int i = itemCount / spanCount;
        int i2 = (itemCount % spanCount > 0 ? 1 : 0) + i;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            int viewAdapterPosition = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewAdapterPosition();
            int i4 = viewAdapterPosition % spanCount;
            boolean z = i4 == 0;
            boolean z2 = i4 == spanCount + (-1);
            boolean z3 = viewAdapterPosition >= i * spanCount;
            if (this.b.a) {
                if (spanCount > 1 && !z2) {
                    int right = childAt.getRight();
                    canvas.drawRect(right, childAt.getTop() + this.b.d, this.b.c + right, childAt.getBottom() - this.b.d, this.a);
                }
            } else if (i2 > 1 && !z3) {
                int left = childAt.getLeft() + (z ? this.b.d : 0);
                int right2 = childAt.getRight() - (z2 ? this.b.d : 0);
                int bottom = childAt.getBottom();
                canvas.drawRect(left, bottom, right2, this.b.c + bottom, this.a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            a(canvas, recyclerView, (GridLayoutManager) layoutManager);
        }
    }
}
