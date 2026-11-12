package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class GpsRecord implements Serializable {
    private static final long serialVersionUID = 1;
    private SportDetail a;
    private SportSummary b;

    public SportDetail getDetail() {
        return this.a;
    }

    public SportSummary getSummary() {
        return this.b;
    }

    public void setDetail(SportDetail detail) {
        this.a = detail;
    }

    public void setSummary(SportSummary summary) {
        this.b = summary;
    }

    public String toString() {
        return "GpsRecord{detail=" + this.a + ", summary=" + this.b + '}';
    }
}
