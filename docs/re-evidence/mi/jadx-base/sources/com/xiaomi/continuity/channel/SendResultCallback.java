package com.xiaomi.continuity.channel;

/* JADX INFO: loaded from: classes7.dex */
public interface SendResultCallback {
    public static final int SEND_END_CANCELED = 7;
    public static final int SEND_FAILED_CHANNEL_EXCEPTION = 3;
    public static final int SEND_FAILED_CHANNEL_NOT_EXIST = 1;
    public static final int SEND_FAILED_CHANNEL_NOT_INIT = 2;
    public static final int SEND_FAILED_PACKET_NOT_SUPPORT = 4;
    public static final int SEND_FAILED_PACKET_OVER_SIZE = 5;
    public static final int SEND_FAILED_READ_FILE_EXCEPTION = 6;
    public static final int SEND_SUCCESS = 0;

    void onProgress(int i);

    void onResult(int i, String str);
}
