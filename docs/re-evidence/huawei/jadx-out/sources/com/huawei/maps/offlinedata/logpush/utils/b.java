package com.huawei.maps.offlinedata.logpush.utils;

import android.content.Context;
import android.provider.Settings;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {
    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        boolean zA = d.a();
        g.c("LocalSwitchUtils", "IS_CHINA_ROM is: " + zA);
        int i = zA ? Settings.Secure.getInt(context.getContentResolver(), "user_experience_involved", 0) : 0;
        if (i == 0 && !zA) {
            i = Settings.Secure.getInt(context.getContentResolver(), "hw_app_analytics_state", i);
        }
        g.c("LocalSwitchUtils", "isEnabledUserExperience is: " + i);
        return i == 1;
    }
}
