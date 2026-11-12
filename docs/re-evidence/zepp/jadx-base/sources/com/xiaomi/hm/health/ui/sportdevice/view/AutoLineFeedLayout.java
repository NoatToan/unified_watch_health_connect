package com.xiaomi.hm.health.ui.sportdevice.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.huami.lib.view.ViewUtils;

/* JADX INFO: loaded from: classes22.dex */
public class AutoLineFeedLayout extends ViewGroup {
    private static final int a = 10;
    private static final int b = 10;

    public AutoLineFeedLayout(Context context) {
        this(context, null);
    }

    private int a(int viewGroupWidth) {
        int paddingStart = (viewGroupWidth - getPaddingStart()) - getPaddingEnd();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i = paddingStart;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i < measuredWidth) {
                paddingTop = paddingTop + measuredHeight + 10;
                i = paddingStart;
            }
            i -= measuredWidth + 10;
            paddingTop = Math.max(measuredHeight, paddingTop);
        }
        return paddingTop;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b2) {
        int i;
        int i2;
        int measuredWidth = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int i3 = measuredWidth;
        int i4 = 0;
        int iMax = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != null && 8 != childAt.getVisibility()) {
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i3 < measuredWidth2) {
                    i4 = i4 + 10 + iMax;
                    i3 = measuredWidth - measuredWidth2;
                    i5 = paddingStart;
                } else {
                    i3 -= measuredWidth2;
                    if (i6 == 0) {
                        i5 = paddingStart;
                        i4 = paddingTop;
                    } else {
                        i5 = i5 + measuredWidth2 + 10;
                    }
                    iMax = Math.max(iMax, measuredHeight);
                }
                if (ViewUtils.isRTL()) {
                    i = measuredWidth - i5;
                    i2 = i - measuredWidth2;
                } else {
                    i = i5 + measuredWidth2;
                    i2 = i5;
                }
                childAt.layout(i2, i4, i, measuredHeight + i4);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            measureChild(getChildAt(i), widthMeasureSpec, heightMeasureSpec);
        }
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(a(View.MeasureSpec.getSize(widthMeasureSpec)), 1073741824));
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public AutoLineFeedLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AutoLineFeedLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
