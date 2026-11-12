package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final List<Integer> tempChildWidths;

    public BottomNavigationMenuView(Context context) {
        super(context);
        this.tempChildWidths = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public NavigationBarItemView createNavigationBarItemView(Context context) {
        return new BottomNavigationItemView(context);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int childCount = getChildCount();
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        int measuredWidth = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                if (getLayoutDirection() == 1) {
                    int i25 = i18 - measuredWidth;
                    childAt.layout(i25 - childAt.getMeasuredWidth(), 0, i25, i19);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i19);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        int i16;
        int i17;
        h menu = getMenu();
        int size = View.MeasureSpec.getSize(i14);
        int size2 = menu.getVisibleItems().size();
        int childCount = getChildCount();
        this.tempChildWidths.clear();
        int size3 = View.MeasureSpec.getSize(i15);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (isShifting(getLabelVisibilityMode(), size2) && isItemHorizontalTranslationEnabled()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int iMax = this.activeItemMinWidth;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i18 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.inactiveItemMinWidth * i18), Math.min(iMax, this.activeItemMaxWidth));
            int i19 = size - iMin;
            int iMin2 = Math.min(i19 / (i18 != 0 ? i18 : 1), this.inactiveItemMaxWidth);
            int i24 = i19 - (i18 * iMin2);
            int i25 = 0;
            while (i25 < childCount) {
                if (getChildAt(i25).getVisibility() != 8) {
                    i17 = i25 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i24 > 0) {
                        i17++;
                        i24--;
                    }
                } else {
                    i17 = 0;
                }
                this.tempChildWidths.add(Integer.valueOf(i17));
                i25++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), this.activeItemMaxWidth);
            int i26 = size - (size2 * iMin3);
            for (int i27 = 0; i27 < childCount; i27++) {
                if (getChildAt(i27).getVisibility() == 8) {
                    i16 = 0;
                } else if (i26 > 0) {
                    i16 = iMin3 + 1;
                    i26--;
                } else {
                    i16 = iMin3;
                }
                this.tempChildWidths.add(Integer.valueOf(i16));
            }
        }
        int measuredWidth = 0;
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt2 = getChildAt(i28);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.tempChildWidths.get(i28).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth = childAt2.getMeasuredWidth() + measuredWidth;
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z14) {
        this.itemHorizontalTranslationEnabled = z14;
    }
}
