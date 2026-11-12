package com.milink.sdk.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class ApiUtils {
    private static final String TAG = "ML::ApiUtils";

    public static int getVersionCode(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("catch getVersionInfo error: ");
            sb.append(e.getMessage());
        }
        return -1;
    }
}
