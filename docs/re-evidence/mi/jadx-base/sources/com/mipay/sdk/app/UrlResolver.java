package com.mipay.sdk.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class UrlResolver {
    private static final String HTTPS_SCHEME = "https";
    private static final String HTTP_SCHEME = "http";
    private static final String[] WHITE_PACKAGE_LIST = {"com.mipay.wallet", "com.miui.tsmclient"};
    private static final String WHITE_PACKAGE_LIST_REG = "^com.xiaomi(\\.{1}[a-z]{1,}){1,}$";

    public static ResolveInfo checkIsOpenableIntent(Context context, Intent intent) {
        if (context != null && intent != null) {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities == null) {
                return null;
            }
            for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                if (isWhiteListPackage(resolveInfo.activityInfo.packageName)) {
                    return resolveInfo;
                }
            }
        }
        return null;
    }

    public static boolean isOpenableUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        return (HTTP_SCHEME.equals(uri.getScheme()) || "https".equals(uri.getScheme())) ? false : true;
    }

    private static boolean isWhiteListPackage(String str) {
        for (String str2 : WHITE_PACKAGE_LIST) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return Pattern.matches(WHITE_PACKAGE_LIST_REG, str);
    }
}
