package com.xiaomi.fitness.baseui.calendar.view;

import android.content.Context;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.a8h;
import defpackage.o93;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class MonthView extends BaseCalendarView {
    public a8h i;

    public MonthView(Context context, LocalDate localDate, o93 o93Var, int i, a8h a8hVar) {
        super(context, localDate, o93Var, i);
        this.i = a8hVar;
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.BaseCalendarView
    public boolean c(LocalDate localDate, LocalDate localDate2) {
        return TimeDateUtil.isEqualsMonth(localDate, localDate2);
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.BaseCalendarView
    public void d(LocalDate localDate, LocalDate localDate2) {
        if (TimeDateUtil.isLastMonth(localDate2, localDate)) {
            this.i.a(localDate);
        } else if (TimeDateUtil.isNextMonth(localDate2, localDate)) {
            this.i.c(localDate);
        } else {
            this.i.b(localDate);
        }
    }
}
