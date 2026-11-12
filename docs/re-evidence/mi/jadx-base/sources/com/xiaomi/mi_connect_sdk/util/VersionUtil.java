package com.xiaomi.mi_connect_sdk.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.xiaomi.mi_connect_sdk.Version;

/* JADX INFO: loaded from: classes11.dex */
public class VersionUtil {
    public static final int AIDL_VERSION_LEVEL_EIGHT = 8;

    public static String getSdkVersion() {
        return Version.getMiconnectSpecVersionCode() + "." + Version.getSdkVersionCode() + "." + Version.getAidlVersionCode() + "." + Version.getLittleVersionCode();
    }

    public static String getVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}
