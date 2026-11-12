package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes10.dex */
public class DetailItemContainer extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11253c;
    private int d;

    public DetailItemContainer(Context context) {
        super(context);
        this.f11253c = 2;
        this.d = 0;
        this.f11252b = LanguageUtil.ba(context);
    }

    public DetailItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DetailItemContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11253c = 2;
        this.d = 0;
        this.f11252b = LanguageUtil.ba(context);
    }

    public void b(int i) {
        this.f11253c = i;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        if (childCount > 0) {
            int measuredWidth = this.d;
            if (measuredWidth == 0) {
                measuredWidth = getChildAt(0).getMeasuredWidth() * this.f11253c;
            }
            int i4 = this.f11253c;
            if (i4 < 1) {
                LogUtil.e("Track_DetailItemContainer", "mNumberOfLine is error");
                return;
            }
            int i5 = i4 + 1;
            int i6 = childCount / i5;
            if (childCount % i5 != 0) {
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                int iMax = 0;
                for (int i10 = 0; i8 < childCount && i10 < this.f11253c + 1; i10++) {
                    iMax = Math.max(iMax, getChildAt(i8).getMeasuredHeight());
                    i8++;
                }
                i7 += iMax;
            }
            if (this.f11253c == 1) {
                measuredHeight = 0;
                while (i3 < childCount) {
                    measuredHeight += getChildAt(i3).getMeasuredHeight();
                    i3++;
                }
                i3 = measuredWidth;
            } else {
                i3 = measuredWidth;
                measuredHeight = i7;
            }
        } else {
            measuredHeight = 0;
        }
        setMeasuredDimension(i3, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f11253c;
        if (i5 < 1) {
            LogUtil.e("Track_DetailItemContainer", "mNumberOfLine is error");
            return;
        }
        boolean z2 = this.f11252b && childCount % (i5 + 1) == 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            int measuredWidth2 = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i7 >= measuredWidth || this.f11253c == 1) {
                i8 += i9;
                i7 = 0;
                i9 = 0;
            }
            int i10 = measuredWidth2 + i7;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
            if (i6 != childCount - 1 || !z2) {
                childAt.layout(i7, i8, i10, measuredHeight + i8);
            }
            i6++;
            i7 = i10;
        }
        if (z2) {
            View childAt2 = getChildAt(childCount - 1);
            childAt2.layout(measuredWidth - childAt2.getMeasuredWidth(), i8, measuredWidth, childAt2.getMeasuredHeight() + i8);
        }
    }

    public void setTextColor(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ImageView) {
                ((ImageView) childAt).setBackgroundColor(i);
            } else if (childAt instanceof SportDetailItem) {
                ((SportDetailItem) childAt).setTextColor(i);
            } else {
                LogUtil.e("Track_DetailItemContainer", "unexpected item type");
            }
        }
    }
}
