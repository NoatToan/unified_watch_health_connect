package com.xiaomi.hm.health.bt.model;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMAutoBacklightInfo implements Serializable {
    public static final int MODE_DISABLE = 0;
    public static final int MODE_SUNRISE_SUNSET = 2;
    public static final int MODE_TIMER = 1;
    private static final long serialVersionUID = 1;
    private int mode = 0;
    private int startHour = -1;
    private int startMinute = -1;
    private int stopHour = -1;
    private int stopMinute = -1;

    public int getMode() {
        return this.mode;
    }

    public int getStartHour() {
        return this.startHour;
    }

    public int getStartMinute() {
        return this.startMinute;
    }

    public int getStopHour() {
        return this.stopHour;
    }

    public int getStopMinute() {
        return this.stopMinute;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setStartHour(int i) {
        this.startHour = i;
    }

    public void setStartMinute(int i) {
        this.startMinute = i;
    }

    public void setStopHour(int i) {
        this.stopHour = i;
    }

    public void setStopMinute(int i) {
        this.stopMinute = i;
    }

    public String toString() {
        return "HMAutoBacklightInfo{mode=" + this.mode + ", startHour=" + this.startHour + ", startMinute=" + this.startMinute + ", stopHour=" + this.stopHour + ", stopMinute=" + this.stopMinute + AbstractJsonLexerKt.END_OBJ;
    }
}
