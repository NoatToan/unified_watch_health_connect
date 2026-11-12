package com.xiaomi.hm.health.bt.profile.gdsp.raw;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class HmAfData implements Serializable {
    private static final long serialVersionUID = 1;
    private int active;
    private long timestamp;

    public HmAfData(long j, int i) {
        this.timestamp = j;
        this.active = i;
    }

    private String simpleFormatDate(Long l) {
        return new SimpleDateFormat("yyyy/MM/dd HH:MM", Locale.getDefault()).format(new Date(l.longValue()));
    }

    public int getActive() {
        return this.active;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setActive(int i) {
        this.active = i;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public String toString() {
        return "Time:" + simpleFormatDate(Long.valueOf(this.timestamp)) + "result:" + this.active;
    }
}
