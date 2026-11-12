package com.xiaomi.hm.health.speech.entity;

/* JADX INFO: loaded from: classes21.dex */
public class AlarmTimerOffset {
    private String a;
    private long b;

    public String getTimeDesc() {
        return this.a;
    }

    public long getTimestamp() {
        return this.b;
    }

    public void setTimeDesc(String timeDesc) {
        this.a = timeDesc;
    }

    public void setTimestamp(long timestamp) {
        this.b = timestamp;
    }
}
