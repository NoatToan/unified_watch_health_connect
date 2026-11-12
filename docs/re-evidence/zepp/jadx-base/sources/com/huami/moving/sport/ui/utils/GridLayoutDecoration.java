package com.huami.moving.sport.ui.utils;

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
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class GridLayoutDecoration extends RecyclerView.ItemDecoration {
    private Drawable a;
    private Paint b;
    private final int c;

    public GridLayoutDecoration(Context context, @DrawableRes int i) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        this.a = drawable;
        this.c = drawable.getIntrinsicWidth();
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
        return -1;
    }

    private boolean c(RecyclerView recyclerView, int i, int i2, int i3) {
        return (recyclerView.getLayoutManager() instanceof GridLayoutManager) && (i + 1) % i2 == 0;
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
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (c(recyclerView, ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), b(recyclerView), recyclerView.getAdapter().getA())) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, this.c, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        drawVertical(canvas, recyclerView);
    }

    public GridLayoutDecoration(Context context, @DimenRes int i, @ColorRes int i2) {
        this.c = context.getResources().getDimensionPixelSize(i);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(ContextCompat.getColor(context, i2));
        this.b.setStyle(Paint.Style.FILL);
    }
}
