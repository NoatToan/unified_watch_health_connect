package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public class HMOffWistLockConfig {
    private boolean a;
    private String b;

    public HMOffWistLockConfig(boolean enable, String pwd) {
        this.a = false;
        this.b = null;
        this.a = enable;
        this.b = pwd;
    }

    public boolean getEnable() {
        return this.a;
    }

    public String getPassword() {
        return this.b;
    }

    public String toString() {
        return "Off wist lock set: " + this.a;
    }
}
