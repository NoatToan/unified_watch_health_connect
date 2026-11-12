package com.xiaomi.smarthome.library.common.util;

import com.xiaomi.onetrack.util.z;

/* JADX INFO: loaded from: classes2.dex */
public class Version {
    public static int compareVersion(String str, String str2) {
        if (str.equals(str2)) {
            return 0;
        }
        String[] strArrSplit = str.split(z.f14007a);
        String[] strArrSplit2 = str2.split(z.f14007a);
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        int i = 0;
        int i2 = 0;
        while (i < iMin) {
            i2 = Integer.parseInt(strArrSplit[i]) - Integer.parseInt(strArrSplit2[i]);
            if (i2 != 0) {
                break;
            }
            i++;
        }
        if (i2 != 0) {
            return i2 > 0 ? 1 : -1;
        }
        for (int i3 = i; i3 < strArrSplit.length; i3++) {
            if (Integer.parseInt(strArrSplit[i3]) > 0) {
                return 1;
            }
        }
        while (i < strArrSplit2.length) {
            if (Integer.parseInt(strArrSplit2[i]) > 0) {
                return -1;
            }
            i++;
        }
        return 0;
    }

    public static boolean isMarshmallow() {
        return true;
    }
}
