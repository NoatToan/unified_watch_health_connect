package com.xiaomi.hm.health.device.model;

/* JADX INFO: loaded from: classes18.dex */
public class BindBaseStep {
    private int a;
    private long b;
    private String c;

    public BindBaseStep(int i, long j, String str) {
        this.a = 0;
        this.b = System.currentTimeMillis();
        this.c = null;
        this.a = i;
        this.b = j;
        this.c = str;
    }

    public int getBaseStep() {
        return this.a;
    }

    public long getBindTimestamp() {
        return this.b;
    }

    public String getUid() {
        return this.c;
    }
}
