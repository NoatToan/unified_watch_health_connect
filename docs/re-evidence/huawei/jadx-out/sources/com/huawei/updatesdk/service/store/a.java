package com.huawei.updatesdk.service.store;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f30003a;

    public static String a() {
        String str = f30003a;
        if (str != null) {
            return str;
        }
        Context contextA = com.huawei.updatesdk.sdk.service.app.a.c().a();
        try {
            StringBuilder sb = new StringBuilder("UpdateSDK##6.0.2.300##");
            String str2 = Build.BRAND;
            if (TextUtils.isEmpty(str2)) {
                str2 = "other";
            }
            sb.append(str2);
            sb.append("##");
            sb.append(com.huawei.updatesdk.service.device.b.a().e());
            sb.append("##");
            sb.append(contextA.getPackageName());
            PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
            if (packageInfo != null) {
                sb.append("##");
                sb.append(packageInfo.versionName);
            }
            String string = sb.toString();
            f30003a = string;
            return string;
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("ApplicationSession", "getUserAgent() " + e.getMessage());
            return null;
        }
    }
}
