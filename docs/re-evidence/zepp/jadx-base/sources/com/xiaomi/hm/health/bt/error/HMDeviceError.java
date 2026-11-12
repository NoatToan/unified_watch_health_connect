package com.xiaomi.hm.health.bt.error;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes19.dex */
public class HMDeviceError {
    public static final int COMPRESS_FAILED = 12;
    public static final int CONTENT_PARSING_ERROR = 10;
    public static final int DECOMPRESS_FAILED = 13;
    public static final int ERROR_CANCEL = 9;
    public static final int ERROR_COMMAND_FAILED = 2;
    public static final int ERROR_CRC_NOT_MATCH = 8;
    public static final int ERROR_DEVICE_BUSY = 5;
    public static final int ERROR_LOSE_PACKAGE = 1;
    public static final int ERROR_MUSIC_ALIVE = 6;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NO_CONNECTION = 3;
    public static final int ERROR_NO_DATA = 4;
    public static final int ERROR_OTHER = 100;
    public static final int ERROR_SPEECH_ALIVE = 7;
    public static final int INVALID_COMMAND = 51;
    public static final int INVALID_PARAMETER = 52;
    public static final int INVALID_STATE = 53;
    public static final int NO_DATE = -1;
    public static final int TIMEOUT = 50;
    public static final int UNAUTHORIZED = 11;
    public static final int UNKNOWN = -2;
    private int a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DeviceError {
    }

    public HMDeviceError(int error) {
        this.a = error;
    }

    public int getError() {
        return this.a;
    }

    public boolean isErrorNone() {
        return this.a == 0;
    }

    public void setError(int error) {
        this.a = error;
    }
}
