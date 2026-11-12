package com.xiaomi.ai.nlp.factoid.utils;

import defpackage.dwe;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class Lunar implements Serializable {
    private static final long serialVersionUID = 1602338350199825098L;
    private int day;
    private boolean leap;
    private int month;
    private int year;

    public enum LunarType {
        yearMonthDay,
        monthDay,
        nonNumYear
    }

    public Lunar() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Lunar lunar = (Lunar) obj;
        return this.day == lunar.day && this.leap == lunar.leap && this.month == lunar.month && this.year == lunar.year;
    }

    public int getDay() {
        return this.day;
    }

    public int getEffectiveMonth() {
        return (!this.leap || this.day <= 15) ? this.month : this.month + 1;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public int hashCode() {
        return ((((((this.day + 31) * 31) + (this.leap ? 1231 : 1237)) * 31) + this.month) * 31) + this.year;
    }

    public boolean isLeap() {
        return this.leap;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public void setLeap(boolean z) {
        this.leap = z;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getYear());
        sb.append("(");
        sb.append(dwe.a(getYear()));
        sb.append(")年");
        sb.append(isLeap() ? "闰" : "");
        sb.append(dwe.e(getMonth()));
        sb.append("月");
        sb.append(dwe.d(getDay()));
        return sb.toString();
    }

    public Lunar(int i, int i2, int i3, boolean z) {
        this.year = i;
        this.month = i2;
        this.day = i3;
        this.leap = z;
    }

    public String toString(LunarType lunarType) {
        if (lunarType == LunarType.monthDay) {
            StringBuilder sb = new StringBuilder();
            sb.append(isLeap() ? "闰" : "");
            sb.append(dwe.e(getMonth()));
            sb.append("月");
            sb.append(dwe.d(getDay()));
            return sb.toString();
        }
        if (lunarType == LunarType.nonNumYear) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dwe.a(getYear()));
            sb2.append("年");
            sb2.append(isLeap() ? "闰" : "");
            sb2.append(dwe.e(getMonth()));
            sb2.append("月");
            sb2.append(dwe.d(getDay()));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getYear());
        sb3.append("(");
        sb3.append(dwe.a(getYear()));
        sb3.append(")年");
        sb3.append(isLeap() ? "闰" : "");
        sb3.append(dwe.e(getMonth()));
        sb3.append("月");
        sb3.append(dwe.d(getDay()));
        return sb3.toString();
    }

    public String toString(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(getYear());
            sb.append("(");
            sb.append(dwe.a(getYear()));
            sb.append(")年");
        }
        if (z2) {
            sb.append(isLeap() ? "闰" : "");
            sb.append(dwe.e(getMonth()));
            sb.append("月");
        }
        if (z3) {
            sb.append(dwe.d(getDay()));
        }
        return sb.toString();
    }
}
