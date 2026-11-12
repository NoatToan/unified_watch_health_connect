package com.facebook.yrn.manager.utils;

import com.xiaomi.onetrack.util.z;

/* JADX INFO: loaded from: classes4.dex */
public class YRNConvertUtils {
    public static int getFloorIntByObject(Object obj) {
        double dFloor;
        if (obj == null) {
            return -1;
        }
        try {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj instanceof Double) {
                dFloor = Math.floor(((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof Float)) {
                    if (!(obj instanceof String)) {
                        return -1;
                    }
                    String[] strArrSplit = ((String) obj).split(z.f14007a);
                    if (strArrSplit.length > 0) {
                        return Integer.parseInt(strArrSplit[0]);
                    }
                    return -1;
                }
                dFloor = Math.floor(((Float) obj).floatValue());
            }
            return (int) dFloor;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
