package com.huawei.updatesdk.service.appmgr.fileinfo;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.huawei.updatesdk.sdk.foundation.utils.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, com.huawei.updatesdk.service.appmgr.fileinfo.a> f29931a;

    public String a(PackageInfo packageInfo) throws Throwable {
        ApplicationInfo applicationInfo;
        if (packageInfo == null || packageInfo.packageName == null || (applicationInfo = packageInfo.applicationInfo) == null || TextUtils.isEmpty(applicationInfo.sourceDir)) {
            return null;
        }
        com.huawei.updatesdk.service.appmgr.fileinfo.a aVar = this.f29931a.get(packageInfo.packageName);
        if (aVar != null && aVar.b() == packageInfo.lastUpdateTime && aVar.c() == packageInfo.versionCode) {
            return aVar.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(packageInfo.lastUpdateTime);
        sb.append(packageInfo.versionCode);
        sb.append(packageInfo.packageName);
        String str = "packagekey" + packageInfo.packageName;
        String str2 = "fileshakey" + packageInfo.packageName;
        boolean zEquals = TextUtils.equals(sb.toString(), com.huawei.updatesdk.service.bean.a.c().a(str));
        if (!zEquals) {
            com.huawei.updatesdk.service.bean.a.c().a(str, sb.toString());
        }
        String strA = com.huawei.updatesdk.service.bean.a.c().a(str2);
        if (TextUtils.isEmpty(strA) || !zEquals) {
            strA = d.a(packageInfo.applicationInfo.sourceDir, "SHA-256");
            com.huawei.updatesdk.service.bean.a.c().a(str2, strA);
        }
        com.huawei.updatesdk.service.appmgr.fileinfo.a aVar2 = new com.huawei.updatesdk.service.appmgr.fileinfo.a();
        aVar2.a(strA);
        aVar2.a(packageInfo.lastUpdateTime);
        aVar2.a(packageInfo.versionCode);
        this.f29931a.put(packageInfo.packageName, aVar2);
        return strA;
    }

    /* JADX INFO: renamed from: com.huawei.updatesdk.service.appmgr.fileinfo.b$b, reason: collision with other inner class name */
    static class C0292b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f29932a = new b();
    }

    public static b a() {
        return C0292b.f29932a;
    }

    private b() {
        this.f29931a = new HashMap();
    }
}
