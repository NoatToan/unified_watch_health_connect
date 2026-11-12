package com.xiaomi.hm.health.bt.profile.gdsp.hr;

import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMHrData {
    private Calendar a;
    private int b;

    public HMHrData(Calendar c, int hr) {
        this.a = Calendar.getInstance();
        this.b = -1;
        this.a = c;
        this.b = hr;
    }

    public int getHr() {
        return this.b;
    }

    public Calendar getTime() {
        return this.a;
    }
}
