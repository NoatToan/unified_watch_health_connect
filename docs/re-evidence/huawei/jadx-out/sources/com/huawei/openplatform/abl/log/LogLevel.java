package com.huawei.openplatform.abl.log;

import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: loaded from: classes12.dex */
public abstract class LogLevel {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int WARN = 5;

    public static String priorityToString(int i) {
        if (i == 3) {
            return "D";
        }
        if (i == 4) {
            return "I";
        }
        if (i != 5) {
            return i != 6 ? String.valueOf(i) : ExifInterface.LONGITUDE_EAST;
        }
        return "W";
    }
}
