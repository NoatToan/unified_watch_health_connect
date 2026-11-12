package com.huawei.health.h5pro.load.rule;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.utils.LogUtil;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes28.dex */
@Deprecated
public class SimpleTimeRuleParser {
    private SimpleTimeRuleParser() {
    }

    private static long d(String str) {
        return ExifInterface.LATITUDE_SOUTH.equals(str) ? new Date().getTime() / 1000 : new Date().getTime();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    private static long e(long j, String str, long j2, String str2) {
        byte b2;
        long j3;
        long j4;
        str2.getClass();
        str2.hashCode();
        int iHashCode = str2.hashCode();
        if (iHashCode != 68) {
            if (iHashCode != 72) {
                if (iHashCode == 2460 && str2.equals("MI")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals("H")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str2.equals("D")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            j3 = 86400000;
        } else {
            if (b2 != 1) {
                if (b2 != 2) {
                    j4 = j2 * 1000;
                } else {
                    j3 = 60000;
                }
                return ExifInterface.LATITUDE_SOUTH.equals(str) ? (j4 / 1000) + j : j + j4;
            }
            j3 = 3600000;
        }
        j4 = j2 * j3;
        if (ExifInterface.LATITUDE_SOUTH.equals(str)) {
        }
    }

    public static long parseTime(String str) {
        if (!Pattern.matches("-?\\d+:[DH(MI)S]:M?S:\\d+", str)) {
            LogUtil.w("H5PRO_SimpleTimeRule", a.a("parseTime, not match: ", str));
            return 0L;
        }
        String[] strArrSplit = str.split(":");
        String str2 = strArrSplit[2];
        long jD = Long.parseLong(strArrSplit[3]);
        if (jD <= 0) {
            jD = d(str2);
        }
        return e(jD, str2, Long.parseLong(strArrSplit[0]), strArrSplit[1]);
    }
}
