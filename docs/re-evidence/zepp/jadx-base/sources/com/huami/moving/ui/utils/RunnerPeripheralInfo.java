package com.huami.moving.ui.utils;

/* JADX INFO: loaded from: classes4.dex */
public class RunnerPeripheralInfo {
    private static volatile RunnerPeripheralInfo g;
    private String a;
    private String b;
    private String c;
    private boolean d;
    private String e;
    private int f;

    private RunnerPeripheralInfo() {
    }

    public static RunnerPeripheralInfo getInstance() {
        if (g == null) {
            g = new RunnerPeripheralInfo();
        }
        return g;
    }

    public static void initPeripheralInfo(String str, String str2, String str3, boolean z, String str4, int i) {
        if (g == null) {
            g = new RunnerPeripheralInfo();
        }
        g.b = str2;
        g.a = str;
        g.e = str4;
        g.c = str3;
        g.d = z;
        g.f = i;
    }

    public String getAvatarPath() {
        return this.b;
    }

    public String getAvatarUrl() {
        return this.a;
    }

    public String getBuyMifiProUrl() {
        return this.e;
    }

    public int getHeight() {
        return this.f;
    }

    public String getName() {
        return this.c;
    }

    public boolean isChinaUser() {
        return this.d;
    }

    public void setAvatarPath(String str) {
        this.b = str;
    }

    public void setAvatarUrl(String str) {
        this.a = str;
    }

    public void setBuyMifiProUrl(String str) {
        this.e = str;
    }

    public void setChinaUser(boolean z) {
        this.d = z;
    }

    public void setHeight(int i) {
        this.f = i;
    }

    public void setName(String str) {
        this.c = str;
    }
}
