package com.xiaomi.hm.health.reminder;

/* JADX INFO: loaded from: classes21.dex */
public interface NotifyMessagePushCallback {
    public static final int ERROR_LOW_FW_VERSION = 3;
    public static final int ERROR_MSG_FORMAT_WRONG = 6;
    public static final int ERROR_NONE = -1;
    public static final int ERROR_NOT_BOUND = 0;
    public static final int ERROR_NOT_CONNECTED = 1;
    public static final int ERROR_NOT_SUPPORT = 2;
    public static final int ERROR_NOT_SUPPORT_PRO = 5;
    public static final int ERROR_WRITE_FAILED = 4;

    void onResult(int error);
}
