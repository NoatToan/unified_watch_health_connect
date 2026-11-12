package com.huawei.watchface;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes45.dex */
public abstract class s4 {
    public static boolean a(Context context, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(CommonUtils.getAuthorityByUri(uri), 0);
        if (providerInfoResolveContentProvider == null) {
            HwLog.e("UriUtils", "providerInfo is null");
            return false;
        }
        ApplicationInfo applicationInfo = providerInfoResolveContentProvider.applicationInfo;
        if (applicationInfo == null) {
            HwLog.e("UriUtils", "applicationInfo is null");
            return false;
        }
        String str = applicationInfo.packageName;
        if (str == null) {
            HwLog.e("UriUtils", "packageName is null");
            return false;
        }
        if (packageManager.checkSignatures(context.getPackageName(), str) != 0 && (applicationInfo.flags & 1) != 1) {
            return false;
        }
        HwLog.i("UriUtils", "isProviderUrlValid true");
        return true;
    }
}
