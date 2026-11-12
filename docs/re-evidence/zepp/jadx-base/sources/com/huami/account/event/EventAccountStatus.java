package com.huami.account.event;

/* JADX INFO: loaded from: classes4.dex */
public class EventAccountStatus {
    public static final int STATUS_LOGIN_SUCCESS = 1;
    public static final int STATUS_NULL = 0;
    public static final int STATUS_RELOGIN_SUCCESS = 2;
    private int a;

    public EventAccountStatus(int i) {
        this.a = 0;
        this.a = i;
    }

    public int getStatus() {
        return this.a;
    }
}
