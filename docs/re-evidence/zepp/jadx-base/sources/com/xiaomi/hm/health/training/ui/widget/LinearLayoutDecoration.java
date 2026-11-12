package com.xiaomi.hm.health.training.ui.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public class LinearLayoutDecoration extends RecyclerView.ItemDecoration {
    private static final int[] i = {R.attr.listDivider};
    private Context a;
    private Drawable b;
    private int c;
    private Paint d;
    private int e;
    private int f;
    private int g;
    private Paint h;

    private LinearLayoutDecoration(Context context, int i2) {
        this.e = 2;
        this.a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i);
        this.b = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(i2);
    }

    private void a(Canvas canvas, int i2, int i3, int i4, int i5) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(i2, i4, i3, i5);
            this.b.draw(canvas);
        }
        Paint paint = this.d;
        if (paint != null) {
            canvas.drawRect(i2, i4, i3, i5, paint);
        }
    }

    private void b(Canvas canvas, int i2, int i3, int i4, int i5) {
        Paint paint = this.h;
        if (paint != null) {
            canvas.drawRect(i2, i4, i3, i5, paint);
        }
    }

    private boolean c(int i2, int i3) {
        return i3 == 0 || (i2 + 1) % i3 == 0;
    }

    private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int i3 = right + this.e;
            a(canvas, right, i3, paddingTop, height);
            b(canvas, right, i3, 0, this.f);
            b(canvas, right, i3, height - this.g, height);
        }
    }

    private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            int i3 = bottom + this.e;
            a(canvas, paddingLeft, width, bottom, i3);
            b(canvas, 0, this.f, bottom, i3);
            b(canvas, width - this.g, width, bottom, i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (c(recyclerView.getChildLayoutPosition(view), recyclerView.getAdapter().getItemCount())) {
            return;
        }
        if (this.c == 1) {
            rect.set(0, 0, 0, this.e);
        } else {
            rect.set(0, 0, this.e, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.c == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }

    public void setExtraColor(@ColorRes int i2) {
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setColor(ContextCompat.getColor(this.a, i2));
        this.h.setStyle(Paint.Style.FILL);
    }

    public void setExtraPaddingEnd(@DimenRes int i2) {
        this.g = this.a.getResources().getDimensionPixelOffset(i2);
    }

    public void setExtraPaddingStart(@DimenRes int i2) {
        this.f = this.a.getResources().getDimensionPixelOffset(i2);
    }

    public void setOrientation(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        this.c = i2;
    }

    public LinearLayoutDecoration(Context context, int i2, int i3) {
        this(context, i2);
        Drawable drawable = ContextCompat.getDrawable(context, i3);
        this.b = drawable;
        this.e = drawable.getIntrinsicHeight();
    }

    public LinearLayoutDecoration(Context context, int i2, @DimenRes int i3, @ColorRes int i4) {
        this(context, i2);
        this.b = null;
        this.e = context.getResources().getDimensionPixelSize(i3);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(ContextCompat.getColor(context, i4));
        this.d.setStyle(Paint.Style.FILL);
    }
}
