package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class NewCalories {
    private Long a;
    private String b;
    private String c;
    private long d;
    private int e;

    public NewCalories(Long l, String str, String str2, long j, int i) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = i;
    }

    public long getBindTime() {
        return this.d;
    }

    public int getCal() {
        return this.e;
    }

    public String getDate() {
        return this.b;
    }

    public String getDeviceId() {
        return this.c;
    }

    public Long getId() {
        return this.a;
    }

    public void setBindTime(long j) {
        this.d = j;
    }

    public void setCal(int i) {
        this.e = i;
    }

    public void setDate(String str) {
        this.b = str;
    }

    public void setDeviceId(String str) {
        this.c = str;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public NewCalories() {
    }
}
