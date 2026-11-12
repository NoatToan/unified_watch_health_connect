package com.huawei.phoneservice.feedback.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class AutoLineLayoutManager extends RecyclerView.LayoutManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21782c;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        super.onMeasure(recycler, state, i, i2);
        this.f21782c = (View.MeasureSpec.getSize(i) - getPaddingEnd()) - getPaddingStart();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        detachAndScrapAttachedViews(recycler);
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < getItemCount(); i6++) {
            View viewForPosition = recycler.getViewForPosition(i6);
            measureChildWithMargins(viewForPosition, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
            addView(viewForPosition);
            if (i4 + decoratedMeasuredWidth > this.f21782c) {
                i5 += decoratedMeasuredHeight;
                i4 = 0;
            }
            measureChildWithMargins(viewForPosition, 0, 0);
            if (d()) {
                int i7 = this.f21782c;
                i = i7 - i4;
                i2 = i5 + decoratedMeasuredHeight;
                i3 = i7 - (i4 + decoratedMeasuredWidth);
            } else {
                i = i4 + decoratedMeasuredWidth;
                i2 = i5 + decoratedMeasuredHeight;
                i3 = i4;
            }
            layoutDecoratedWithMargins(viewForPosition, i3, i5, i, i2);
            i4 += decoratedMeasuredWidth;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    protected boolean d() {
        return getLayoutDirection() == 1;
    }

    public AutoLineLayoutManager() {
        setAutoMeasureEnabled(true);
    }
}
