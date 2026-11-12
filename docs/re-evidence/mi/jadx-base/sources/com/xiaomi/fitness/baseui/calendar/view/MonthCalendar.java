package com.xiaomi.fitness.baseui.calendar.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.a8h;
import defpackage.g9h;
import defpackage.m22;
import defpackage.o93;
import defpackage.u7g;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class MonthCalendar extends BaseCalendar implements a8h, ValueAnimator.AnimatorUpdateListener {
    public MonthCalendar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.BaseCalendar
    public m22 U(Context context, o93 o93Var, LocalDate localDate) {
        return new u7g(context, o93Var, localDate, this);
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.BaseCalendar
    public LocalDate V(LocalDate localDate, int i) {
        return localDate.plusMonths(i);
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.BaseCalendar
    public LocalDate W(LocalDate localDate) {
        return localDate.plusMonths(-1);
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.BaseCalendar
    public LocalDate X(LocalDate localDate) {
        return localDate.plusMonths(1);
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.BaseCalendar
    public int Z(LocalDate localDate, LocalDate localDate2, int i) {
        return TimeDateUtil.getIntervalMonths(localDate, localDate2);
    }

    @Override // defpackage.a8h
    public void a(LocalDate localDate) {
        if (c0(localDate)) {
            e0(localDate, -1);
        } else {
            g0(localDate);
        }
    }

    @Override // defpackage.a8h
    public void b(LocalDate localDate) {
        if (c0(localDate)) {
            e0(localDate, 0);
        } else {
            g0(localDate);
        }
    }

    @Override // defpackage.a8h
    public void c(LocalDate localDate) {
        if (c0(localDate)) {
            e0(localDate, 1);
        } else {
            g0(localDate);
        }
    }

    public int getMonthCalendarOffset() {
        BaseCalendarView baseCalendarView = this.l0;
        if (baseCalendarView != null) {
            return baseCalendarView.getMonthCalendarOffset();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.BaseCalendar
    public void h0(LocalDate localDate, boolean z) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        setY((((Float) valueAnimator.getAnimatedValue()).floatValue() - getY()) + getY());
    }

    public void setOnMonthSelectListener(g9h g9hVar) {
    }
}
