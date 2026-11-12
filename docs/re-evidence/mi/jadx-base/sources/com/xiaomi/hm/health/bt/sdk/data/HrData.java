package com.xiaomi.hm.health.bt.sdk.data;

import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
public class HrData implements Serializable {
    private static final long serialVersionUID = 1;
    private Calendar calendar;
    private int hr;

    public HrData(Calendar calendar, int i) {
        this.calendar = calendar;
        this.hr = i;
    }

    public Calendar getCalendar() {
        return this.calendar;
    }

    public int getHr() {
        return this.hr;
    }
}
