package com.huami.watch.companion.calendar;

import com.huami.watch.util.TimeUtil;
import java.util.Calendar;

/* JADX INFO: loaded from: classes16.dex */
public class CalendarDate {
    private int a;
    private int b;
    private int c;

    public CalendarDate() {
    }

    public String date() {
        return TimeUtil.formatDateTime(millis(), "yyyy-MM-dd");
    }

    public boolean equals(Object obj) {
        return (obj instanceof CalendarDate) && millis() == ((CalendarDate) obj).millis();
    }

    public int getDay() {
        return this.c;
    }

    public int getMonth() {
        return this.b;
    }

    public int getYear() {
        return this.a;
    }

    public long millis() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.a, this.b - 1, this.c);
        return calendar.getTimeInMillis();
    }

    public void setDay(int i) {
        this.c = i;
    }

    public void setMonth(int i) {
        this.b = i;
    }

    public void setYear(int i) {
        this.a = i;
    }

    public String toString() {
        return "CalendarDate{year=" + this.a + ", month=" + this.b + ", day=" + this.c + '}';
    }

    public CalendarDate(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
