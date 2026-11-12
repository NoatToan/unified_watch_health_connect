package com.huawei.openalliance.ad.views.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class WrapContentHeightGalleryView extends e {
    @Override // com.huawei.openalliance.ad.views.viewpager.e, android.view.View
    protected void onMeasure(int i, int i2) {
        int iMax = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
    }

    public WrapContentHeightGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WrapContentHeightGalleryView(Context context) {
        super(context);
    }
}
