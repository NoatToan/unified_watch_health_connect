package com.xiaomi.fitness.baseui.calendar.view;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes7.dex */
public class DayThreeCircleFourLineCalendarView extends DayThreeCircleCalendarView {
    public DayThreeCircleFourLineCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), (int) (((int) (this.h.m * 2.0f)) * 1.5f * 4.0f));
    }
}
