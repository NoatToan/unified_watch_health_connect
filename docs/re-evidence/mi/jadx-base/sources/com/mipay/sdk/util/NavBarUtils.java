package com.mipay.sdk.util;

import android.app.Activity;
import android.content.ContentResolver;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class NavBarUtils {
    public static final String FORCE_FSG_NAV_BAR = "force_fsg_nav_bar";
    private static Boolean IS_MIUI;

    private NavBarUtils() {
    }

    public static boolean isMiui() {
        if (IS_MIUI == null) {
            IS_MIUI = Boolean.valueOf(!TextUtils.isEmpty(SystemProperties.get("ro.miui.ui.version.code", "")));
        }
        return IS_MIUI.booleanValue();
    }

    public static boolean isSupportTransNav() {
        return isMiui();
    }

    public static boolean isThreeBtnNavBar(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, FORCE_FSG_NAV_BAR, 0) == 0;
    }

    public static void setNavBarColor(Window window, int i) {
        window.setNavigationBarColor(i);
    }

    public static void setNavBarTranslucent(Window window, boolean z) {
        if (z) {
            window.addFlags(134217728);
        } else {
            window.clearFlags(134217728);
        }
    }

    public static void updateNavigationBar(Activity activity, int i) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (!isSupportTransNav() || isThreeBtnNavBar(activity.getContentResolver())) {
            setNavBarColor(activity.getWindow(), i);
        } else {
            setNavBarTranslucent(activity.getWindow(), true);
        }
    }
}
