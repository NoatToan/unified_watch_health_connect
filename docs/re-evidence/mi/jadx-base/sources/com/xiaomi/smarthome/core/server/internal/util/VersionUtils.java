package com.xiaomi.smarthome.core.server.internal.util;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;

/* JADX INFO: loaded from: classes10.dex */
public class VersionUtils {
    public static boolean checkVersionSupportBleOtaUpgrade(int i, String str) {
        if (i == 1) {
            return compareFirmwareVersion4Ota(str, "2.3.0") >= 0;
        }
        if (i != 4) {
            return i == 5 && compareFirmwareVersion4Ota(str, "1.4.0") >= 0;
        }
        return compareFirmwareVersion4Ota(str, "1.1.0") >= 0;
    }

    public static int compareFirmwareVersion(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        String[] strArrSplit = str.split("[._]");
        String[] strArrSplit2 = str2.split("[._]");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 != i3) {
                    return i2 - i3;
                }
            } catch (Exception e) {
                BluetoothLog.e(e);
                return 0;
            }
        }
        return strArrSplit.length - strArrSplit2.length;
    }

    private static int compareFirmwareVersion4Ota(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1;
        }
        String[] strArrSplit = str.split("[._]");
        String[] strArrSplit2 = str2.split("[._]");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 != i3) {
                    return i2 - i3;
                }
            } catch (Exception unused) {
                return -1;
            }
        }
        return 0;
    }

    public static int compareMcuVersion(String str, String str2) {
        if (TextUtils.equals(str, str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        try {
            return Integer.parseInt(str) - Integer.parseInt(str2);
        } catch (Exception unused) {
            MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, "VersionUtils", "compareMcuVersion fail, newVersion=" + str + ",oldVersion=" + str2);
            return 0;
        }
    }
}
