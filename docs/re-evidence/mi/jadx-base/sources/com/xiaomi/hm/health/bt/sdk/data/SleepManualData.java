package com.xiaomi.hm.health.bt.sdk.data;

import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
public class SleepManualData implements Serializable {
    private static final long serialVersionUID = 1;
    private Calendar calendar;
    private long startTime;
    private long stopTime;

    public SleepManualData(Calendar calendar, long j, long j2) {
        this.calendar = calendar;
        this.startTime = j;
        this.stopTime = j2;
    }

    public Calendar getCalendar() {
        return this.calendar;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setStopTime(long j) {
        this.stopTime = j;
    }
}
