package com.huami.watch.companion.ximalaya;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/* JADX INFO: loaded from: classes16.dex */
public class RadiogroupCL extends RadioGroup {
    private static final String b = "RadiogroupCL";
    private String[] a;

    public RadiogroupCL(Context context) {
        this(context, null);
    }

    public String[] getDatas() {
        return this.a;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iMax = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (marginLayoutParams.leftMargin + paddingLeft + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin + getPaddingRight() > i3 - i) {
                paddingLeft = getPaddingLeft();
                paddingTop += iMax;
                iMax = getChildAt(i5).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int i6 = marginLayoutParams.leftMargin + paddingLeft;
            int i7 = marginLayoutParams.topMargin + paddingTop;
            childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            paddingLeft += marginLayoutParams.leftMargin + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        measureChildren(i, i2);
        int childCount = getChildCount();
        int iMax = 0;
        int i4 = 0;
        int iMax2 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i7 = i5 + measuredWidth;
            if (getPaddingLeft() + i7 + getPaddingRight() > size) {
                int iMax3 = Math.max(i5, iMax);
                i4 += iMax2;
                iMax2 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                Log.d(b, "maxHeight:" + i4 + "---maxWidth:" + iMax3);
                i3 = iMax3;
                i5 = measuredWidth;
            } else {
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                i3 = iMax;
                i5 = i7;
            }
            if (i6 == childCount - 1) {
                i4 += iMax2;
                iMax = Math.max(i5, iMax);
            } else {
                iMax = i3;
            }
        }
        int paddingLeft = iMax + getPaddingLeft() + getPaddingRight();
        int paddingTop = i4 + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            size = paddingLeft;
        }
        if (mode2 != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    public void setDatas(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.a = strArr;
    }

    public RadiogroupCL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }
}
