package com.xiaomi.smarthome.library.common.statcode;

/* JADX INFO: loaded from: classes2.dex */
public class BleErrorCode {
    public static boolean needToReportCode(int i) {
        return (i == -14 || i == -17 || i == -34 || i == -35 || i == -2 || i == -32 || i == -5 || i == -55) ? false : true;
    }
}
