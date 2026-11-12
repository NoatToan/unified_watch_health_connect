package com.xiaomi.hm.health.bt.model;

import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class HMLiftWristConfig implements Serializable {
    public static final int SENSITIVITY_SENSITIVE = 1;
    public static final int SENSITIVITY_STANDARD = 0;
    private static final long serialVersionUID = 1;
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private int g;

    public HMLiftWristConfig() {
        this.b = 7;
        this.c = 0;
        this.d = 22;
        this.e = 0;
        this.f = true;
        this.g = 0;
    }

    public int getSensitivity() {
        return this.g;
    }

    public int getStartHour() {
        return this.b;
    }

    public int getStartMinutes() {
        return this.c;
    }

    public int getStartTimeIndex() {
        int i = (this.b * 60) + this.c;
        return (this.d * 60) + this.e > i ? i : i + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN;
    }

    public int getStopHour() {
        return this.d;
    }

    public int getStopMinutes() {
        return this.e;
    }

    public int getStopTimeIndex() {
        return (this.d * 60) + this.e;
    }

    public boolean isAllDay() {
        return this.f;
    }

    public boolean isEnable() {
        return this.a;
    }

    public void setAllDay(boolean allDay) {
        this.f = allDay;
    }

    public void setEnable(boolean enable) {
        this.a = enable;
    }

    public void setSensitivity(int sensitivity) {
        this.g = sensitivity;
    }

    public void setStartHour(int startHour) {
        this.b = startHour;
    }

    public void setStartMinutes(int startMinutes) {
        this.c = startMinutes;
    }

    public void setStartTimeIndex(int startIndex) {
        if (startIndex < 0) {
            startIndex += 1440;
        }
        this.b = startIndex / 60;
        this.c = startIndex % 60;
    }

    public void setStopHour(int stopHour) {
        this.d = stopHour;
    }

    public void setStopMinutes(int stopMinutes) {
        this.e = stopMinutes;
    }

    public void setStopTimeIndex(int stopIndex) {
        this.d = stopIndex / 60;
        this.e = stopIndex % 60;
    }

    public String toString() {
        return "HMLiftWristConfig{enable=" + this.a + ", startHour=" + this.b + ", startMinutes=" + this.c + ", stopHour=" + this.d + ", stopMinutes=" + this.e + ", allDay=" + this.f + ", sensitivity = " + this.g + '}';
    }

    public HMLiftWristConfig(boolean enable) {
        this.b = 7;
        this.c = 0;
        this.d = 22;
        this.e = 0;
        this.f = true;
        this.g = 0;
        this.a = enable;
    }

    public HMLiftWristConfig(boolean enable, int sensitivity) {
        this.b = 7;
        this.c = 0;
        this.d = 22;
        this.e = 0;
        this.f = true;
        this.g = 0;
        this.a = enable;
        this.g = sensitivity;
    }
}
