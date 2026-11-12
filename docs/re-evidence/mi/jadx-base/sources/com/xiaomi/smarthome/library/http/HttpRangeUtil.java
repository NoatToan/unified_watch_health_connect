package com.xiaomi.smarthome.library.http;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class HttpRangeUtil {
    public static String generateRangeValue(long j, long j2) {
        StringBuffer stringBuffer = new StringBuffer("bytes=");
        if (j != -1 && j2 != -1) {
            if (j >= j2) {
                return null;
            }
            stringBuffer.append(j + "-" + j2);
            return stringBuffer.toString();
        }
        if (j == -1 && j2 == -1) {
            return null;
        }
        if (j == -1) {
            stringBuffer.append("-" + j2);
            return stringBuffer.toString();
        }
        if (j2 != -1) {
            return null;
        }
        stringBuffer.append(j + "-");
        return stringBuffer.toString();
    }

    public static long[] getEntityLength(String str) {
        long[] jArr = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("-");
        if (strArrSplit.length > 1 && !TextUtils.isEmpty(strArrSplit[1])) {
            String[] strArrSplit2 = strArrSplit[1].split("/");
            if (strArrSplit2.length > 1 && !TextUtils.isEmpty(strArrSplit2[1])) {
                jArr = new long[3];
                try {
                    jArr[2] = Long.parseLong(strArrSplit2[1].trim());
                    String[] strArrSplit3 = strArrSplit[0].split(" ");
                    if (strArrSplit3.length <= 1 || TextUtils.isEmpty(strArrSplit3[1])) {
                        jArr[0] = 0;
                    } else {
                        jArr[0] = Long.parseLong(strArrSplit3[1].trim());
                    }
                    jArr[1] = Long.parseLong(strArrSplit2[0].trim());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jArr;
    }
}
