package com.xiaomi.hm.health.bt.profile.gdsp.raw;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class HmAfData implements Serializable {
    private static final long serialVersionUID = 1;
    private long a;
    private int b;

    public HmAfData(long timestamp, int active) {
        this.a = timestamp;
        this.b = active;
    }

    private String a(Long timestamp) {
        return new SimpleDateFormat("yyyy/MM/dd HH:MM", Locale.getDefault()).format(new Date(timestamp.longValue()));
    }

    public int getActive() {
        return this.b;
    }

    public long getTimestamp() {
        return this.a;
    }

    public void setActive(int active) {
        this.b = active;
    }

    public void setTimestamp(long timestamp) {
        this.a = timestamp;
    }

    public String toString() {
        return "Time:" + a(Long.valueOf(this.a)) + "result:" + this.b;
    }
}
