package com.huawei.haf.common.utils;

import android.os.PowerManager;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f5926a;

    private ScreenUtil() {
    }

    public static boolean d() {
        boolean zIsInteractive;
        PowerManager powerManagerC = PowerUtil.c();
        if (powerManagerC != null) {
            try {
                zIsInteractive = powerManagerC.isInteractive();
            } catch (Exception e) {
                LogUtil.d("HAF_ScreenUtil", "powerManager isInteractive failed, ex=", LogUtil.c(e));
                zIsInteractive = false;
            }
        } else {
            zIsInteractive = false;
        }
        if (f5926a != zIsInteractive) {
            LogUtil.b("HAF_ScreenUtil", "isScreenOn ", Boolean.valueOf(zIsInteractive));
            f5926a = zIsInteractive;
        }
        return zIsInteractive;
    }
}
