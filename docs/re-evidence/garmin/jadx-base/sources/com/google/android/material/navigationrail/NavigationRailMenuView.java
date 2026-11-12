package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

/* JADX INFO: loaded from: classes14.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    private int itemMinimumHeight;
    private final FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(Context context) {
        super(context);
        this.itemMinimumHeight = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int makeSharedHeightSpec(int i14, int i15, int i16) {
        int iMax = i15 / Math.max(1, i16);
        int size = this.itemMinimumHeight;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i14);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    private int measureChildHeight(View view2, int i14, int i15) {
        if (view2.getVisibility() == 8) {
            return 0;
        }
        view2.measure(i14, i15);
        return view2.getMeasuredHeight();
    }

    private int measureSharedChildHeights(int i14, int i15, int i16, View view2) {
        int iMakeSharedHeightSpec = view2 == null ? makeSharedHeightSpec(i14, i15, i16) : View.MeasureSpec.makeMeasureSpec(view2.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int iMeasureChildHeight = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt != view2) {
                iMeasureChildHeight += measureChildHeight(childAt, i14, iMakeSharedHeightSpec);
            }
        }
        return iMeasureChildHeight;
    }

    private int measureShiftingChildHeights(int i14, int i15, int i16) {
        int iMeasureChildHeight;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            iMeasureChildHeight = measureChildHeight(childAt, i14, makeSharedHeightSpec(i14, i15, i16));
            i15 -= iMeasureChildHeight;
            i16--;
        } else {
            iMeasureChildHeight = 0;
        }
        return iMeasureChildHeight + measureSharedChildHeights(i14, i15, i16, childAt);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public NavigationBarItemView createNavigationBarItemView(Context context) {
        return new NavigationRailItemView(context);
    }

    public int getItemMinimumHeight() {
        return this.itemMinimumHeight;
    }

    public int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    public boolean isTopGravity() {
        return (this.layoutParams.gravity & 112) == 48;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int childCount = getChildCount();
        int i18 = i16 - i14;
        int i19 = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i19;
                childAt.layout(0, i19, i18, measuredHeight);
                i19 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        int size = View.MeasureSpec.getSize(i15);
        int size2 = getMenu().getVisibleItems().size();
        setMeasuredDimension(View.MeasureSpec.getSize(i14), View.resolveSizeAndState((size2 <= 1 || !isShifting(getLabelVisibilityMode(), size2)) ? measureSharedChildHeights(i14, size, size2, null) : measureShiftingChildHeights(i14, size, size2), i15, 0));
    }

    public void setItemMinimumHeight(int i14) {
        if (this.itemMinimumHeight != i14) {
            this.itemMinimumHeight = i14;
            requestLayout();
        }
    }

    public void setMenuGravity(int i14) {
        FrameLayout.LayoutParams layoutParams = this.layoutParams;
        if (layoutParams.gravity != i14) {
            layoutParams.gravity = i14;
            setLayoutParams(layoutParams);
        }
    }
}
