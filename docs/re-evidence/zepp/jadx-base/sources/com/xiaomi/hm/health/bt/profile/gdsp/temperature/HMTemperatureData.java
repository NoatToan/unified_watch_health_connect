package com.xiaomi.hm.health.bt.profile.gdsp.temperature;

import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMTemperatureData {
    public Calendar a;
    public int b;

    public HMTemperatureData(Calendar calendar, int temperature) {
        this.a = Calendar.getInstance();
        this.b = -1;
        this.a = calendar;
        this.b = temperature;
    }

    public Calendar getCalendar() {
        return this.a;
    }

    public int getTemperature() {
        return this.b;
    }
}
