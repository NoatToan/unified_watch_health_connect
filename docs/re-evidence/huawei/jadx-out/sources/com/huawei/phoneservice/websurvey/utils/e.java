package com.huawei.phoneservice.websurvey.utils;

import android.content.Context;
import android.os.Build;
import com.huawei.phoneservice.faq.base.util.g;

/* JADX INFO: loaded from: classes13.dex */
public class e {
    public static boolean b(Context context) {
        if (context != null) {
            return Build.VERSION.SDK_INT > 28 && (context.getResources().getConfiguration().uiMode & 48) == 32;
        }
        g.e("NpsUtils", "isDarkMode: context is null");
        return false;
    }

    public static boolean d() {
        return !Build.MANUFACTURER.equalsIgnoreCase("HUAWEI");
    }
}
