package com.xiaomi.hm.health.bt.model;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMLiftWristConfig implements Serializable {
    public static final int SENSITIVITY_SENSITIVE = 1;
    public static final int SENSITIVITY_STANDARD = 0;
    private static final long serialVersionUID = 1;
    private boolean allDay;
    private boolean enable;
    private int sensitivity;
    private int startHour;
    private int startMinutes;
    private int stopHour;
    private int stopMinutes;

    public HMLiftWristConfig() {
        this.startHour = 7;
        this.startMinutes = 0;
        this.stopHour = 22;
        this.stopMinutes = 0;
        this.allDay = true;
        this.sensitivity = 0;
    }

    public int getSensitivity() {
        return this.sensitivity;
    }

    public int getStartHour() {
        return this.startHour;
    }

    public int getStartMinutes() {
        return this.startMinutes;
    }

    public int getStartTimeIndex() {
        int i = (this.startHour * 60) + this.startMinutes;
        return (this.stopHour * 60) + this.stopMinutes > i ? i : i - 1440;
    }

    public int getStopHour() {
        return this.stopHour;
    }

    public int getStopMinutes() {
        return this.stopMinutes;
    }

    public int getStopTimeIndex() {
        return (this.stopHour * 60) + this.stopMinutes;
    }

    public boolean isAllDay() {
        return this.allDay;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setAllDay(boolean z) {
        this.allDay = z;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setSensitivity(int i) {
        this.sensitivity = i;
    }

    public void setStartHour(int i) {
        this.startHour = i;
    }

    public void setStartMinutes(int i) {
        this.startMinutes = i;
    }

    public void setStartTimeIndex(int i) {
        if (i < 0) {
            i += 1440;
        }
        this.startHour = i / 60;
        this.startMinutes = i % 60;
    }

    public void setStopHour(int i) {
        this.stopHour = i;
    }

    public void setStopMinutes(int i) {
        this.stopMinutes = i;
    }

    public void setStopTimeIndex(int i) {
        this.stopHour = i / 60;
        this.stopMinutes = i % 60;
    }

    public String toString() {
        return "HMLiftWristConfig{enable=" + this.enable + ", startHour=" + this.startHour + ", startMinutes=" + this.startMinutes + ", stopHour=" + this.stopHour + ", stopMinutes=" + this.stopMinutes + ", allDay=" + this.allDay + ", sensitivity = " + this.sensitivity + AbstractJsonLexerKt.END_OBJ;
    }

    public HMLiftWristConfig(boolean z) {
        this.startHour = 7;
        this.startMinutes = 0;
        this.stopHour = 22;
        this.stopMinutes = 0;
        this.allDay = true;
        this.sensitivity = 0;
        this.enable = z;
    }

    public HMLiftWristConfig(boolean z, int i) {
        this.startHour = 7;
        this.startMinutes = 0;
        this.stopHour = 22;
        this.stopMinutes = 0;
        this.allDay = true;
        this.enable = z;
        this.sensitivity = i;
    }
}
