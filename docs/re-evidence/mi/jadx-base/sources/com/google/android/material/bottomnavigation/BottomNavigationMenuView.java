package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.e;
import androidx.core.view.c;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import defpackage.pmi;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationMenuView extends NavigationBarMenuView {
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public boolean I;
    public int[] J;

    public BottomNavigationMenuView(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.E = resources.getDimensionPixelSize(pmi.d);
        this.F = resources.getDimensionPixelSize(pmi.e);
        this.G = resources.getDimensionPixelSize(pmi.f30543b);
        this.H = resources.getDimensionPixelSize(pmi.c);
        this.J = new int[5];
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public NavigationBarItemView g(Context context) {
        return new BottomNavigationItemView(context);
    }

    public boolean n() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (c.A(this) == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        e menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.G().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (h(getLabelVisibilityMode(), size2) && n()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int iMax = this.H;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.G, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i3 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.F * i3), Math.min(iMax, this.G));
            int i4 = size - iMin;
            int iMin2 = Math.min(i4 / (i3 == 0 ? 1 : i3), this.E);
            int i5 = i4 - (i3 * iMin2);
            int i6 = 0;
            while (i6 < childCount) {
                if (getChildAt(i6).getVisibility() != 8) {
                    this.J[i6] = i6 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i5 > 0) {
                        int[] iArr = this.J;
                        iArr[i6] = iArr[i6] + 1;
                        i5--;
                    }
                } else {
                    this.J[i6] = 0;
                }
                i6++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), this.G);
            int i7 = size - (size2 * iMin3);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr2 = this.J;
                    iArr2[i8] = iMin3;
                    if (i7 > 0) {
                        iArr2[i8] = iMin3 + 1;
                        i7--;
                    }
                } else {
                    this.J[i8] = 0;
                }
            }
        }
        int measuredWidth = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.J[i9], 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(measuredWidth, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.I = z;
    }
}
