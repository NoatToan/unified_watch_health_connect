package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class cid {
    public static String d() {
        PackageInfo packageInfo;
        String str;
        Context contextC = chm.c();
        try {
            packageInfo = contextC.getPackageManager().getPackageInfo(contextC.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            cib.d("OsInfoUtil", "getAppVersionName: " + e.getMessage());
            packageInfo = null;
        }
        if (packageInfo == null) {
            str = "";
        } else {
            str = packageInfo.versionName;
        }
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static String c() {
        return Build.MODEL;
    }

    public static String e() {
        return Build.VERSION.RELEASE;
    }

    public static String b() {
        return cie.b() ? "EmotionUI_11.1.0" : chz.c(cie.e() ? "ro.build.version.magic" : "ro.build.version.emui", "");
    }

    public static String a() {
        return chm.c().getPackageName();
    }

    public static String h() {
        if (TextUtils.isEmpty(cig.b("CodeValuePlatform_deviceUuid", ""))) {
            cig.e("CodeValuePlatform_deviceUuid", UUID.randomUUID().toString().replace(Constants.LINK, "").toLowerCase(Locale.ROOT));
        }
        return cig.b("CodeValuePlatform_deviceUuid", "");
    }
}
