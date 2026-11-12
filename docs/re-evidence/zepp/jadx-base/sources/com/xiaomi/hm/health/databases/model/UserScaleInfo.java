package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class UserScaleInfo {
    private String a;
    private int b;
    private int c;

    public UserScaleInfo(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public int getAvatarIdOfScale() {
        return this.b;
    }

    public String getId() {
        return this.a;
    }

    public int getMeasureMode() {
        return this.c;
    }

    public void setAvatarIdOfScale(int i) {
        this.b = i;
    }

    public void setId(String str) {
        this.a = str;
    }

    public void setMeasureMode(int i) {
        this.c = i;
    }

    public UserScaleInfo() {
    }
}
