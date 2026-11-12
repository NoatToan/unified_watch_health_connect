package com.huawei.ui.commonui.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class PermissionTipScrollView extends ScrollView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23876c;

    public PermissionTipScrollView(Context context) {
        super(context);
        c(context);
    }

    public PermissionTipScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    private void c(Context context) {
        int i = context.getResources().getDisplayMetrics().heightPixels;
        int i2 = (int) ((i * 2.0f) / 3.0f);
        this.f23876c = i2;
        LogUtil.b("PermissionTipScrollView", "init screenHeight:", Integer.valueOf(i), " maxHeight:", Integer.valueOf(i2));
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            measureChild(childAt, i, i2);
            int measuredHeight = childAt.getMeasuredHeight();
            LogUtil.b("PermissionTipScrollView", "onMeasure contentHeight:", Integer.valueOf(measuredHeight));
            int i3 = this.f23876c;
            if (measuredHeight >= i3) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 0);
            }
        }
        super.onMeasure(i, i2);
    }
}
