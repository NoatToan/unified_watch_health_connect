package com.huawei.haf.common.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class PowerUtil {
    private static PowerManager d;

    private PowerUtil() {
    }

    public static boolean c(Context context) {
        if (context == null) {
            context = BaseApplication.b();
        }
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver != null) {
            z = intentRegisterReceiver.getIntExtra("plugged", -1) != 0;
            LogUtil.b("PowerUtil", "isCharging = ", Boolean.valueOf(z));
        }
        return z;
    }

    static PowerManager c() {
        PowerManager powerManager = d;
        if (powerManager != null) {
            return powerManager;
        }
        PowerManager powerManagerK = CommonUtils.k();
        d = powerManagerK;
        return powerManagerK;
    }

    public static int a(Context context) {
        if (context == null) {
            context = BaseApplication.b();
        }
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return -1;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
        int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            LogUtil.e("PowerUtil", "getBatteryPercent currentLevel=", Integer.valueOf(intExtra), ", currentScale=", Integer.valueOf(intExtra2));
            return -1;
        }
        if (intExtra2 == 0) {
            LogUtil.e("PowerUtil", "getBatteryPercent currentScale is 0");
            return -1;
        }
        int i = (intExtra * 100) / intExtra2;
        LogUtil.b("PowerUtil", "currentLevel=", Integer.valueOf(intExtra), ", currentScale=", Integer.valueOf(intExtra2), ", percent=", Integer.valueOf(i));
        return i;
    }
}
