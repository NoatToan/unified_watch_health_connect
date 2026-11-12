package com.huawei.hms.findnetwork.util;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public class HmsFindSDKLog {
    private static final String COMMON_TAG = "HMSFindNetworkSDK_61600300_";

    public static void d(String str, String str2) {
    }

    public static void w(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(COMMON_TAG + str, str2);
    }

    public static void i(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(COMMON_TAG + str, str2);
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(COMMON_TAG + str, str2);
    }
}
