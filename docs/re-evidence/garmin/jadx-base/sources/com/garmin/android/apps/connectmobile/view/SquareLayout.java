package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class SquareLayout extends FrameLayout {
    public SquareLayout(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        int iMax = Math.max(getMinimumWidth(), getMinimumHeight());
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            childAt.measure(i14, View.MeasureSpec.makeMeasureSpec(0, 0));
            int iMax2 = Math.max(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            if (iMax2 > iMax) {
                iMax = iMax2;
            }
        }
        if (iMax > 0) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
    }

    public SquareLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
