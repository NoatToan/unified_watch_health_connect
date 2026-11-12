package com.huami.mifit.sportlib.services.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.privacy.PrivacyProvider;
import com.huami.privacy.plugin.IsAppForeground;

/* JADX INFO: loaded from: classes11.dex */
public class SportServiceHelper {
    private static final String a = "SportServiceHelper";

    public static void bringSportToFront(Context context, Class<?> cls) {
        if (context == null || cls == null) {
            LogKit.w2f("IllegalArgumentException", "PackageUtils bringActivityToFront");
            throw new IllegalArgumentException();
        }
        try {
            Intent intent = new Intent(new Intent(context, cls));
            intent.addFlags(268566528);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean isSportingForeground(Context context, String... strArr) {
        return ((IsAppForeground) PrivacyProvider.get("手机休眠后判断App是否在前台,如果不在前台就拉起让用户看到", IsAppForeground.class)).getValue().booleanValue();
    }
}
