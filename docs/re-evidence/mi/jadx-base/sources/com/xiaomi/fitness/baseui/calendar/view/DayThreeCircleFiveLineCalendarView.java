package com.xiaomi.fitness.baseui.calendar.view;

import android.content.Context;
import android.util.AttributeSet;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class DayThreeCircleFiveLineCalendarView extends DayThreeCircleCalendarView {
    public int o;

    public DayThreeCircleFiveLineCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = 5;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), (int) (this.o * ((int) (this.h.m * 2.0f)) * 1.5f));
    }

    public void setLine(int i) {
        this.o = i;
        Logger.i("DayThreeCircleFiveLineCalendarView", "initContentView " + this.o);
        requestLayout();
    }
}
