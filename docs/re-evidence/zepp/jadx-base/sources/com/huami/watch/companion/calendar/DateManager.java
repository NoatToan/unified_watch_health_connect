package com.huami.watch.companion.calendar;

import com.huami.watch.util.DateDay;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DateManager {
    private static DateManager i;
    private CalendarDate a;
    private CalendarDate b;
    private CalendarDate c;
    private int d;
    private String e;
    private List<String> f = new ArrayList();
    private a g;
    private OnDayChangeListener h;

    public interface OnDayChangeListener {
        void onDayChange(String str);
    }

    public interface a {
        void onMonthChange(String str);
    }

    private DateManager() {
        DateDay dateDay = DateDay.today();
        this.a = new CalendarDate(dateDay.year(), dateDay.month(), dateDay.day());
    }

    public static DateManager get() {
        synchronized (DateManager.class) {
            if (i == null) {
                i = new DateManager();
            }
        }
        return i;
    }

    public CalendarDate getCurrentSelectDay() {
        return this.a;
    }

    public OnDayChangeListener getDayChangeListener() {
        return this.h;
    }

    public String getMaskColor() {
        return this.e;
    }

    public List<String> getMonthMasks() {
        return this.f;
    }

    public int getPageCount() {
        return this.d;
    }

    public CalendarDate getStartDate() {
        return this.b;
    }

    public CalendarDate getStopDate() {
        return this.c;
    }

    public void onMonthChange(String str) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.onMonthChange(str);
        }
    }

    public void reset() {
        this.a = new CalendarDate(DateDay.today().year(), DateDay.today().month(), DateDay.today().day());
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = null;
        this.f.clear();
    }

    public void setCurrentSelectDate(CalendarDate calendarDate) {
        this.a = calendarDate;
    }

    public void setDayChangeLister(OnDayChangeListener onDayChangeListener) {
        this.h = onDayChangeListener;
    }

    public void setMaskColor(String str) {
        this.e = str;
    }

    public void setMonthChangeLister(a aVar) {
        this.g = aVar;
    }

    public void setMonthMasks(List<String> list) {
        this.f = list;
    }

    public void setPageCount(int i2) {
        this.d = i2;
    }

    public void setStartDate(CalendarDate calendarDate) {
        this.b = calendarDate;
    }

    public void setStopDate(CalendarDate calendarDate) {
        this.c = calendarDate;
    }
}
