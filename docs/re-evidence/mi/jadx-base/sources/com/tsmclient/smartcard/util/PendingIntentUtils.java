package com.tsmclient.smartcard.util;

import android.app.PendingIntent;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public class PendingIntentUtils {
    private static final String FLAG_MUTABLE = "FLAG_MUTABLE";

    private PendingIntentUtils() {
    }

    public static int getMutablePendingIntentFlag() {
        if (Build.VERSION.SDK_INT <= 30) {
            return 0;
        }
        try {
            return PendingIntent.class.getDeclaredField(FLAG_MUTABLE).getInt(FLAG_MUTABLE);
        } catch (Exception e) {
            LogUtils.e("PendingIntentUtils", "getDeclaredField exception", e);
            return 33554432;
        }
    }
}
