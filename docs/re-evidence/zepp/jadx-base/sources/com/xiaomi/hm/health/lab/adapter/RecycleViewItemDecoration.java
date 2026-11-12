package com.xiaomi.hm.health.lab.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class RecycleViewItemDecoration extends RecyclerView.ItemDecoration {
    private Drawable a;

    public RecycleViewItemDecoration(Context context, @DrawableRes int i) {
        this.a = ContextCompat.getDrawable(context, i);
    }

    private void a(Canvas canvas, RecyclerView recyclerView, int i) {
        int left;
        int right;
        int intrinsicHeight;
        int bottom;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount - i; i2++) {
            if (!e(recyclerView, i2, i, childCount)) {
                boolean zD = d(recyclerView, i2, i, childCount);
                View childAt = recyclerView.getChildAt(i2);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                    left = (childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + (zD ? 0 : this.a.getIntrinsicWidth());
                    bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    intrinsicHeight = this.a.getIntrinsicHeight() + bottom;
                } else {
                    left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    int bottom2 = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + (zD ? 0 : this.a.getIntrinsicWidth());
                    intrinsicHeight = bottom2 + this.a.getIntrinsicHeight();
                    bottom = bottom2;
                }
                this.a.setBounds(left, bottom, right, intrinsicHeight);
                this.a.draw(canvas);
            }
        }
    }

    private void b(Canvas canvas, RecyclerView recyclerView, int i) {
        int right;
        int top;
        int bottom;
        int intrinsicWidth;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (!d(recyclerView, i2, i, childCount)) {
                View childAt = recyclerView.getChildAt(i2);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                    right = childAt.getLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    intrinsicWidth = this.a.getIntrinsicWidth() + right;
                    bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                } else {
                    right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    intrinsicWidth = right + this.a.getIntrinsicWidth();
                }
                this.a.setBounds(right, top, intrinsicWidth, bottom);
                this.a.draw(canvas);
            }
        }
    }

    private int c(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
        return 1;
    }

    private boolean d(RecyclerView recyclerView, int i, int i2, int i3) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
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

    private boolean e(RecyclerView recyclerView, int i, int i2, int i3) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return i >= i3 - i2;
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return false;
        }
        if (((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1) {
            return i >= i3 - i2;
        }
        return (i + 1) % i2 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        int iC = c(recyclerView);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int a = adapter.getA();
        boolean zE = e(recyclerView, recyclerView.getChildLayoutPosition(view), iC, a);
        boolean zD = d(recyclerView, recyclerView.getChildLayoutPosition(view), iC, a);
        int intrinsicWidth = this.a.getIntrinsicWidth();
        int intrinsicHeight = this.a.getIntrinsicHeight();
        if (zE && zD) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (zE) {
            rect.set(0, 0, intrinsicWidth, 0);
        } else if (zD) {
            rect.set(0, 0, 0, intrinsicHeight);
        } else {
            rect.set(0, 0, intrinsicWidth, intrinsicHeight);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        int iC = c(recyclerView);
        a(canvas, recyclerView, iC);
        b(canvas, recyclerView, iC);
    }
}
