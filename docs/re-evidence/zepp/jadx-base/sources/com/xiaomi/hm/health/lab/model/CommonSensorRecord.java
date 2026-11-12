package com.xiaomi.hm.health.lab.model;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class CommonSensorRecord {
    private long a = -1;
    private List<Number> b;

    public List<Number> getData() {
        return this.b;
    }

    public long getTimeStamp() {
        return this.a;
    }

    public void setData(List<Number> list) {
        this.b = list;
    }

    public void setTimeStamp(long j) {
        this.a = j;
    }
}
