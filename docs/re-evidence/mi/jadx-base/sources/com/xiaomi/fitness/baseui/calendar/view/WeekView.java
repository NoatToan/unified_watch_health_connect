package com.xiaomi.fitness.baseui.calendar.view;

import com.xiaomi.fitness.baseui.calendar.entity.NDate;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class WeekView extends BaseCalendarView {
    @Override // com.xiaomi.fitness.baseui.calendar.view.BaseCalendarView
    public boolean c(LocalDate localDate, LocalDate localDate2) {
        return this.d.contains(new NDate(localDate));
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.BaseCalendarView
    public void d(LocalDate localDate, LocalDate localDate2) {
        throw null;
    }
}
