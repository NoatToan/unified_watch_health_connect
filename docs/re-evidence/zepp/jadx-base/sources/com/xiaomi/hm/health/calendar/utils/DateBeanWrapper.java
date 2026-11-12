package com.xiaomi.hm.health.calendar.utils;

import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.Date;

/* JADX INFO: loaded from: classes20.dex */
public class DateBeanWrapper<T> {
    private Date a;
    private int b;
    private int c;
    private T d;
    private boolean e;
    private boolean f;
    private boolean g;

    public Date getDate() {
        return this.a;
    }

    public int getDayOfWeek() {
        return this.b;
    }

    public T getExtraData() {
        return this.d;
    }

    public int getWaitDays() {
        return this.c;
    }

    public boolean isAfterLast() {
        return this.g;
    }

    public boolean isBeforeFirst() {
        return this.e;
    }

    public boolean isWaitingDay() {
        return this.f;
    }

    public void setAfterLast(boolean z) {
        this.g = z;
    }

    public void setBeforeFirst(boolean z) {
        this.e = z;
    }

    public void setDate(Date date) {
        this.a = date;
    }

    public void setDayOfWeek(int i) {
        this.b = i;
    }

    public void setExtraData(T t) {
        this.d = t;
    }

    public void setWaitDays(int i) {
        this.c = i;
    }

    public void setWaitingDay(boolean z) {
        this.f = z;
    }

    public String toString() {
        return this.a + " DateBeanWrapper{date=" + TimeUtils.debugTime(this.a.getTime()) + ", dayOfWeek=" + this.b + ", extraData=" + this.d + '}';
    }
}
