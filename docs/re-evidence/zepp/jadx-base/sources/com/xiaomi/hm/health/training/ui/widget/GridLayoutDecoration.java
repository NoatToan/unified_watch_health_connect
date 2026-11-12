package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes22.dex */
public class GridLayoutDecoration extends RecyclerView.ItemDecoration {
    private Drawable a;
    private Paint b;
    private int c;
    private int d;

    public GridLayoutDecoration(Context context, @DrawableRes int i) {
        this.c = 0;
        this.d = 0;
        Drawable drawable = ContextCompat.getDrawable(context, i);
        this.a = drawable;
        this.c = drawable.getIntrinsicWidth();
        this.d = this.a.getIntrinsicHeight();
    }

    private void a(Canvas canvas, int i, int i2, int i3, int i4) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
            this.a.draw(canvas);
        }
        Paint paint = this.b;
        if (paint != null) {
            canvas.drawRect(i, i2, i3, i4, paint);
        }
    }

    private int b(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
        return -1;
    }

    private boolean c(RecyclerView recyclerView, int i, int i2, int i3) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return (i + 1) % i2 == 0;
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return false;
        }
        if (((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1) {
            return (i + 1) % i2 == 0;
        }
        return i >= i3 - (i3 % i2);
    }

    private boolean d(RecyclerView recyclerView, int i, int i2, int i3) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            int i4 = i3 % i2;
            if (i4 != 0) {
                i2 = i4;
            }
            return i >= i3 - i2;
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return false;
        }
        if (((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1) {
            return i >= i3 - (i3 % i2);
        }
        return (i + 1) % i2 == 0;
    }

    private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + this.c;
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            a(canvas, left, bottom, right, bottom + this.d);
        }
    }

    private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            a(canvas, right, top, right + this.c, bottom);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int iB = b(recyclerView);
        int a = recyclerView.getAdapter().getA();
        int viewLayoutPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        if (d(recyclerView, viewLayoutPosition, iB, a)) {
            rect.set(0, 0, this.c, 0);
        } else if (c(recyclerView, viewLayoutPosition, iB, a)) {
            rect.set(0, 0, 0, this.d);
        } else {
            rect.set(0, 0, this.c, this.d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        drawHorizontal(canvas, recyclerView);
        drawVertical(canvas, recyclerView);
    }

    public GridLayoutDecoration(Context context, @DimenRes int i, @DimenRes int i2, @ColorRes int i3) {
        this.c = 0;
        this.d = 0;
        this.c = context.getResources().getDimensionPixelSize(i);
        this.d = context.getResources().getDimensionPixelSize(i2);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(ContextCompat.getColor(context, i3));
        this.b.setStyle(Paint.Style.FILL);
    }
}
