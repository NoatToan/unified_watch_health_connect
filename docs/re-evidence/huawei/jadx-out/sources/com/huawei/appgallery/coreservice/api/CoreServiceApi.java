package com.huawei.appgallery.coreservice.api;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.appgallery.coreservice.e;
import defpackage.bhm;
import defpackage.bhn;

/* JADX INFO: loaded from: classes23.dex */
public abstract class CoreServiceApi {
    public static void setHomeCountry(Context context, String str) {
        bhm.d().e(context, str);
    }

    @Deprecated
    public static void setAppName(Context context, String str) {
        bhm.d().d(context, str);
    }

    public static IConnectionResult getGuideInstallPendingIntent(Context context) {
        return e.a(context);
    }

    public static String getAppGalleryPkg(Context context) {
        return e.b(context);
    }

    public static AppGalleryInfo getAppGalleryInfo(Context context) {
        String strB = e.b(context);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(strB, 128);
            if (packageInfo != null) {
                return new AppGalleryInfo(packageInfo.versionName, packageInfo.versionCode);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            bhn.e("CoreServiceApi", "NameNotFoundException ");
        } catch (RuntimeException unused2) {
            bhn.a("CoreServiceApi", "getPackageInfo RuntimeException");
        }
        return null;
    }
}
