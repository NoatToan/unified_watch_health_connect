package com.xiaomi.digitalkey.wearable.utils;

/* JADX INFO: loaded from: classes7.dex */
public class Logger {
    public static boolean LOG_CERTIFICATE = false;
    public static boolean LOG_ENDPOINT = false;
    public static boolean LOG_EPCONF = false;
    public static boolean LOG_KTS = false;
    public static boolean LOG_SE = false;
    public static boolean LOG_SECURITY = false;
    public static boolean LOG_SERVICE = false;
    public static boolean LOG_SHARE = false;
    public static boolean LOG_STORAGE = false;
    public static boolean LOG_TLV = false;
    public static boolean LOG_TSM = false;

    public static void log(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" : ");
        sb.append(str3);
    }

    public static void logWithLimit(String str, String str2, byte[] bArr, int i) {
        StringBuilder sb;
        String str3;
        if (bArr == null || bArr.length >= i) {
            ByteUtils.clone(bArr, 0, i);
            sb = new StringBuilder();
            sb.append(str2);
            str3 = " with Limit Length: ";
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            str3 = " : ";
        }
        sb.append(str3);
        sb.append(ByteUtils.toHexString(bArr));
    }

    public static void setDebug(boolean z) {
        LOG_SERVICE = z;
        LOG_TLV = z;
        LOG_SECURITY = z;
        LOG_KTS = z;
        LOG_SHARE = z;
        LOG_STORAGE = z;
        LOG_TSM = z;
        LOG_EPCONF = z;
        LOG_ENDPOINT = z;
        LOG_CERTIFICATE = z;
        LOG_SE = z;
    }
}
