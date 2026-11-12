package com.huami.watch.companion.calendar;

import com.huami.watch.util.DateDay;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CalendarUtil {
    public static CalendarDate dateDayToDate(DateDay dateDay) {
        return new CalendarDate(dateDay.year(), dateDay.month(), dateDay.day());
    }

    public static List<CalendarDate> generateDayData(CalendarDate calendarDate) {
        ArrayList arrayList = new ArrayList();
        CalendarDate calendarDate2 = new CalendarDate(calendarDate.getYear(), calendarDate.getMonth(), 1);
        int weekIndex = getWeekIndex(calendarDate2);
        int daysOfMonth = getDaysOfMonth(calendarDate2);
        for (int i = 1; i < weekIndex; i++) {
            arrayList.add(new CalendarDate());
        }
        for (int i2 = 0; i2 < daysOfMonth; i2++) {
            arrayList.add(new CalendarDate(calendarDate2.getYear(), calendarDate2.getMonth(), calendarDate2.getDay() + i2));
        }
        return arrayList;
    }

    public static int getDaysOfMonth(CalendarDate calendarDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendarDate.getYear(), calendarDate.getMonth() - 1, calendarDate.getDay());
        return calendar.getActualMaximum(5);
    }

    public static int getWeekIndex(CalendarDate calendarDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendarDate.getYear(), calendarDate.getMonth() - 1, calendarDate.getDay());
        int i = calendar.get(7) - 1;
        if (i == 0) {
            return 7;
        }
        return i;
    }
}
