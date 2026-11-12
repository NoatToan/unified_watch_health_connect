package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qrs;

/* JADX INFO: loaded from: classes10.dex */
public class TrackShareViewGroup extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11356c;
    private Context d;

    public TrackShareViewGroup(Context context) {
        super(context);
        this.f11356c = 0;
        this.f11354a = 0;
        this.f11355b = 0;
        this.d = null;
        d(context);
    }

    public TrackShareViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11356c = 0;
        this.f11354a = 0;
        this.f11355b = 0;
        this.d = null;
        d(context);
    }

    private void d(Context context) {
        if (context == null) {
            return;
        }
        this.d = context;
        setOrientation(1);
        this.f11356c = qrs.d(this.d, 16.0f);
        this.f11355b = qrs.d(this.d, 24.0f);
        this.f11354a = qrs.d(this.d, 8.0f);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i6 > 0 && i6 < childCount - 1) {
                i5 += this.f11354a;
                int i7 = this.f11355b;
                childAt.layout(i7, i5, measuredWidth + i7, measuredHeight + i5);
            } else {
                childAt.layout(0, i5, measuredWidth, measuredHeight + i5);
            }
            i5 += measuredHeight;
        }
        LogUtil.a("Track_TrackShareViewGroup", "height = ", Integer.valueOf(i5));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (i3 == 0) {
                measureChild(childAt, i, iMakeMeasureSpec);
            } else if (i3 == childCount - 1) {
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(size, mode), iMakeMeasureSpec);
            } else {
                int i4 = this.f11355b;
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec((size - i4) - i4, mode), iMakeMeasureSpec);
            }
        }
        int measuredHeight = 0;
        int measuredWidth = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            measuredHeight += getChildAt(i5).getMeasuredHeight();
            if (getChildAt(i5).getMeasuredWidth() > measuredWidth) {
                measuredWidth = getChildAt(i5).getMeasuredWidth();
            }
        }
        int i6 = childCount - 2;
        if (i6 >= 1) {
            measuredHeight += (i6 * this.f11356c) / 2;
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public void setAllChildViewBackgroudSource(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        int i4 = i2 <= 1 ? 0 : i2;
        while (true) {
            i3 = childCount - 1;
            if (i4 >= i3) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt != null) {
                childAt.setBackgroundResource(i);
            }
            i4++;
        }
        if (i2 != 1 || childCount < 1) {
            return;
        }
        getChildAt(i3).setBackground(this.d.getResources().getDrawable(R.drawable.track_share_watch_all_bg));
    }
}
