package com.xiaomi.hm.health.lab.init;

/* JADX INFO: loaded from: classes21.dex */
public class LabEventAccountStatus {
    public static final int STATUS_LOGIN_SUCCESS = 1;
    public static final int STATUS_NULL = 0;
    public static final int STATUS_RELOGIN_SUCCESS = 2;
    private int a;

    public LabEventAccountStatus(int i) {
        this.a = 0;
        this.a = i;
    }

    public int getStatus() {
        return this.a;
    }
}
