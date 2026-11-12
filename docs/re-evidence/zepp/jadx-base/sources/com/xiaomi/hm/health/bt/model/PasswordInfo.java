package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public class PasswordInfo {
    public static final int STATE_NOT_SUPPORT = 1;
    public static final int STATE_NO_PWD = 2;
    public static final int STATE_OK = 0;
    private int a;
    private String b;

    public PasswordInfo() {
        this.a = 0;
        this.b = "";
    }

    public String getPwd() {
        return this.b;
    }

    public int getState() {
        return this.a;
    }

    public void setPwd(String pwd) {
        this.b = pwd;
    }

    public void setState(int state) {
        this.a = state;
    }

    public String toString() {
        return "PasswordInfo{state=" + this.a + ", pwd='" + this.b + "'}";
    }

    public PasswordInfo(int state) {
        this.a = 0;
        this.b = "";
        this.a = state;
    }

    public PasswordInfo(int state, String pwd) {
        this.a = 0;
        this.b = "";
        this.a = state;
        this.b = pwd;
    }
}
