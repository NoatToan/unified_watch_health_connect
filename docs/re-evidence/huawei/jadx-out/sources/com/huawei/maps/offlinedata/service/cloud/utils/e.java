package com.huawei.maps.offlinedata.service.cloud.utils;

import com.huawei.maps.offlinedata.BuildConfig;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f17888b;

    public static int a() {
        String strB = b();
        if (strB == null || strB.length() == 0) {
            return f17887a;
        }
        String[] strArrSplit = strB.split("\\.");
        if (strArrSplit.length > 2 && strArrSplit[2].length() == 1) {
            strArrSplit[2] = "0" + strArrSplit[2];
        }
        int length = strArrSplit.length <= 4 ? strArrSplit.length : 4;
        String str = "";
        for (int i = 0; i < length; i++) {
            str = str + strArrSplit[i];
        }
        if (str.length() > 0) {
            f17887a = Integer.parseInt(str);
        }
        return f17887a;
    }

    public static String b() {
        String str = f17888b;
        if (str != null) {
            return str;
        }
        f17888b = BuildConfig.VERSION_NAME;
        return BuildConfig.VERSION_NAME;
    }
}
