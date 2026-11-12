package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    private static int resolveGravity(int i14) {
        if (i14 == 0) {
            return 8388659;
        }
        return i14;
    }

    public abstract View findFirstDependency(List<View> list);

    public final int getOverlapPixelsForOffset(View view2) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view2);
        int i14 = this.overlayTop;
        return g7.a.b((int) (overlapRatioForOffset * i14), 0, i14);
    }

    public float getOverlapRatioForOffset(View view2) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public int getScrollRange(View view2) {
        return view2.getMeasuredHeight();
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(CoordinatorLayout coordinatorLayout, View view2, int i14) {
        View viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view2));
        if (viewFindFirstDependency == null) {
            super.layoutChild(coordinatorLayout, view2, i14);
            this.verticalLayoutGap = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view2.getLayoutParams();
        Rect rect = this.tempRect1;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewFindFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((viewFindFirstDependency.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        m1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (coordinatorLayout.getFitsSystemWindows() && !view2.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        Rect rect2 = this.tempRect2;
        Gravity.apply(resolveGravity(fVar.f6352c), view2.getMeasuredWidth(), view2.getMeasuredHeight(), rect, rect2, i14);
        int overlapPixelsForOffset = getOverlapPixelsForOffset(viewFindFirstDependency);
        view2.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
        this.verticalLayoutGap = rect2.top - viewFindFirstDependency.getBottom();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view2, int i14, int i15, int i16, int i17) {
        View viewFindFirstDependency;
        m1 lastWindowInsets;
        int i18 = view2.getLayoutParams().height;
        if ((i18 != -1 && i18 != -2) || (viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view2))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i16);
        if (size > 0) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (viewFindFirstDependency.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int scrollRange = size + getScrollRange(viewFindFirstDependency);
        int measuredHeight = viewFindFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view2.setTranslationY(-measuredHeight);
        } else {
            view2.setTranslationY(0.0f);
            scrollRange -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view2, i14, i15, View.MeasureSpec.makeMeasureSpec(scrollRange, i18 == -1 ? 1073741824 : Integer.MIN_VALUE), i17);
        return true;
    }

    public final void setOverlayTop(int i14) {
        this.overlayTop = i14;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }
}
