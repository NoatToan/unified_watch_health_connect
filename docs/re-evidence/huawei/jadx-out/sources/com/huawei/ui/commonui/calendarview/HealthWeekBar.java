package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.lrd;
import defpackage.qjj;
import defpackage.qjo;

/* JADX INFO: loaded from: classes16.dex */
public class HealthWeekBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f23347a = "com.huawei.ui.commonui.calendarview.HealthWeekBar";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qjo f23348c;
    private int d;

    public HealthWeekBar(Context context) {
        super(context);
        if (f23347a.equals(getClass().getName())) {
            LayoutInflater.from(context).inflate(R.layout.health_calendar_view_week_bar, (ViewGroup) this, true);
        }
        qjj.e();
        this.d = getResources().getDimensionPixelSize(R.dimen.health_calendarview_item_width);
    }

    void a(qjo qjoVar) {
        this.f23348c = qjoVar;
        if (f23347a.equalsIgnoreCase(getClass().getName())) {
            setWeekBarTextSize(this.f23348c.ah());
            setWeekBarTextColor(this.f23348c.ad());
            setBackgroundColor(this.f23348c.u());
            setPadding(this.f23348c.d(), 0, this.f23348c.a(), 0);
        }
    }

    protected void setWeekBarTextColor(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof HealthTextView) {
                ((HealthTextView) childAt).setTextColor(i);
            }
        }
    }

    protected void setWeekBarTextSize(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof HealthTextView) {
                ((HealthTextView) childAt).setTextSize(0, i);
            }
        }
    }

    protected void b(int i) {
        if (f23347a.equalsIgnoreCase(getClass().getName())) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof HealthTextView) {
                    ((HealthTextView) childAt).setText(qjj.e(getContext(), i2, i));
                    lrd.d(childAt, qjj.b(i2, i), false);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth == 0) {
            return;
        }
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int childCount = getChildCount();
        int i3 = childCount - 1;
        int i4 = (((measuredWidth - paddingStart) - paddingEnd) - (this.d * childCount)) / i3;
        int i5 = (int) (i4 / 2.0f);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (i6 == 0) {
                    layoutParams.width = this.d;
                    layoutParams.setMarginEnd(i5);
                } else if (i6 == i3) {
                    layoutParams.width = this.d;
                    layoutParams.setMarginStart(i5);
                } else {
                    layoutParams.width = this.d + i4;
                }
                childAt.setLayoutParams(layoutParams);
            }
        }
        super.onMeasure(i, i2);
    }
}
