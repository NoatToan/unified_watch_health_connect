package com.huami.lib.qrcode.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SquareFrameLayout extends FrameLayout {
    public SquareFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size != 0 || size2 != 0) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size == 0 || size2 == 0) ? Math.max(size, size2) : Math.min(size, size2), 1073741824);
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
        } else {
            super.onMeasure(i, i2);
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        }
    }

    public SquareFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SquareFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
