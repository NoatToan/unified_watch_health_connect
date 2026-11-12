package com.xiaomi.hm.health.eventbus;

/* JADX INFO: loaded from: classes21.dex */
public class EventHttpError {
    public static final int EVENT_BUS = 1;
    public static final int EVENT_DOOR = 2;
    public static final int EVENT_MASTER = 3;
    public static final int EVENT_UNIONPAY = 4;
    public String errorCode;
    public String errorMsg;
    public int type;

    public EventHttpError(String str, String str2, int i) {
        this.errorCode = str;
        this.errorMsg = str2;
        this.type = i;
    }
}
