package com.xiaomi.passport.ui.settings.utils;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.a;
import com.xiaomi.accountsdk.utils.SharedPreferencesUtil;

/* JADX INFO: loaded from: classes11.dex */
public class PermissionRequestHistory {
    private static final String PREFERENCE_NAME = "permission_request_history";

    public static boolean getPermissionRequested(Context context, String str) {
        return new SharedPreferencesUtil(context, PREFERENCE_NAME).getBoolean(str, false);
    }

    public static boolean isPermissionPermanentlyDenied(Activity activity, String str) {
        return getPermissionRequested(activity, str) && !a.z(activity, str);
    }

    public static void setPermissionRequested(Context context, String str) {
        new SharedPreferencesUtil(context, PREFERENCE_NAME).saveBoolean(str, true);
    }
}
