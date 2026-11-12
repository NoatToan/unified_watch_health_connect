package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes22.dex */
public class MyItemDecoration extends RecyclerView.ItemDecoration {
    private Context a;
    private Drawable b;
    private int c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;

    public MyItemDecoration(Context context) {
        this(context, true, true, null, 0);
    }

    private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft() + this.f;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.g;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            this.b.setBounds(paddingLeft, bottom, width, this.c + bottom);
            this.b.draw(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(0, 0, 0, this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        drawVertical(canvas, recyclerView);
    }

    public void setHasLeftPadding(boolean z) {
        this.d = z;
    }

    public void setHasRightPadding(boolean z) {
        this.e = z;
    }

    public void setPaddingLeft(int i) {
        this.f = i;
    }

    public void setPaddingRight(int i) {
        this.g = i;
    }

    public MyItemDecoration(Context context, boolean z, boolean z2) {
        this(context, z, z2, null, 0);
    }

    public MyItemDecoration(Context context, boolean z, boolean z2, Drawable drawable) {
        this(context, z, z2, drawable, 0);
    }

    public MyItemDecoration(Context context, boolean z, boolean z2, Drawable drawable, int i) {
        this.a = context;
        this.d = z;
        this.e = z2;
        if (drawable == null) {
            this.b = ContextCompat.getDrawable(context, R.drawable.bg_divider);
        } else {
            this.b = drawable;
        }
        if (i == 0) {
            this.c = context.getResources().getDimensionPixelSize(R.dimen.divider_size);
        } else {
            this.c = i;
        }
        Resources resources = context.getResources();
        int i2 = R.dimen.item_horizontal_margin;
        this.f = resources.getDimensionPixelSize(i2);
        this.g = context.getResources().getDimensionPixelSize(i2);
    }
}
