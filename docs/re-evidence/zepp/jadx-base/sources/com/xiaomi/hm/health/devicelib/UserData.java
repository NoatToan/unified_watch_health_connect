package com.xiaomi.hm.health.devicelib;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class UserData implements Serializable {
    private String a;
    private int b;
    private boolean c;
    private float d;
    private int e;
    private int f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private String k;
    private String l;

    public static synchronized UserData get() {
        return DeviceCenter.getInstance().getUserData();
    }

    public int getAge() {
        return this.b;
    }

    public String getAvatarPath() {
        return this.h;
    }

    public String getAvatarUrl() {
        return this.g;
    }

    public String getBuyMifiProUrl() {
        return this.k;
    }

    public int getGender() {
        return this.f;
    }

    public int getHeight() {
        return this.e;
    }

    public String getName() {
        return this.i;
    }

    public String getUid() {
        return this.a;
    }

    public float getWeight() {
        return this.d;
    }

    public boolean isChinaUser() {
        return this.j;
    }

    public boolean isInternal() {
        return "internal".equals(this.l);
    }

    public boolean isMetric() {
        return this.c;
    }

    public boolean isPlay() {
        return "play".equals(this.l);
    }

    public void setAge(int i) {
        this.b = i;
    }

    public void setAvatarPath(String str) {
        this.h = str;
    }

    public void setAvatarUrl(String str) {
        this.g = str;
    }

    public void setBuyMifiProUrl(String str) {
        this.k = str;
    }

    public void setChannel(String str) {
        this.l = str;
    }

    public void setChinaUser(boolean z) {
        this.j = z;
    }

    public void setGender(int i) {
        this.f = i;
    }

    public void setHeight(int i) {
        this.e = i;
    }

    public void setIsMetric(boolean z) {
        this.c = z;
    }

    public void setName(String str) {
        this.i = str;
    }

    public void setUid(String str) {
        this.a = str;
    }

    public void setWeight(float f) {
        this.d = f;
    }

    public String toString() {
        return "UserData{uid='" + this.a + "', age=" + this.b + ", isMetric=" + this.c + ", weight=" + this.d + ", height=" + this.e + ", gender=" + this.f + ", avatarUrl='" + this.g + "', avatarPath='" + this.h + "', name='" + this.i + "', isChinaUser=" + this.j + ", buyMifiProUrl='" + this.k + "'}";
    }
}
