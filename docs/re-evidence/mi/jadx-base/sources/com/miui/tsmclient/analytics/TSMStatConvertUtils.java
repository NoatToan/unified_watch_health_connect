package com.miui.tsmclient.analytics;

import android.annotation.TargetApi;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class TSMStatConvertUtils {
    public static final int LBS_ACCURACY_LENGTH = 2;

    private TSMStatConvertUtils() {
    }

    public static String getStatFormatLbs(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(".")) {
            return str;
        }
        int iIndexOf = str.indexOf(46);
        return str.length() > iIndexOf + 2 ? str.substring(0, iIndexOf + 3) : str;
    }

    @TargetApi(26)
    public static String getStatFormatTime(long j) {
        return Long.toUnsignedString(j, 32);
    }
}
