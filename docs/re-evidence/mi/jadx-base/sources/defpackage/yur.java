package defpackage;

import android.app.Application;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.xiaomi.yrn.bundle.config.YRNBundleError;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class yur {
    public static String a(YRNBundleError yRNBundleError, String str) {
        return ((" \n=========\n" + yRNBundleError.toString() + "\n") + "detail:" + str) + "\n=========";
    }

    public static boolean b(Long l, long j) {
        if (l == null) {
            l = 0L;
        }
        return System.currentTimeMillis() - l.longValue() > j;
    }

    public static YRNBundleInfo c(String str, String str2, YRNBundleInfo yRNBundleInfo, boolean z) {
        YRNBundleInfo yRNBundleInfoG;
        if (z) {
            yRNBundleInfoG = qur.j().g(str, str2, true);
        } else {
            if (yRNBundleInfo == null || !TextUtils.equals(yRNBundleInfo.getModule(), str2)) {
                yRNBundleInfo = null;
            }
            yRNBundleInfoG = yRNBundleInfo == null ? qur.j().g(str, str2, false) : yRNBundleInfo;
        }
        return yRNBundleInfoG != null ? yRNBundleInfoG.m873clone() : yRNBundleInfoG;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static String d(String str, String str2, gur gurVar) {
        String bundleFileName;
        if (gurVar == null || gurVar.p() == null) {
            bundleFileName = "index.android.bundle";
        } else {
            bundleFileName = gurVar.p().getBundleFileName(str2);
            if (TextUtils.isEmpty(bundleFileName)) {
                bundleFileName = "index.android.bundle";
            }
        }
        String str3 = str + File.separator + bundleFileName;
        zxr.a("YRN_YRNV3_SDK", "YRNBundleUtils.getJSBundleFileName: name is " + str3);
        return str3;
    }

    public static String e(gur gurVar) {
        return f(gurVar, (gurVar == null || TextUtils.isEmpty(gurVar.j())) ? "production" : vwr.g().f(gurVar.j()));
    }

    public static String f(gur gurVar, String str) {
        sk1.c(gurVar);
        Application applicationA = vwr.g().a();
        StringBuilder sb = new StringBuilder();
        sb.append(applicationA.getCacheDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("mirn_bundles");
        String string = sb.toString();
        String str3 = string + str2 + str;
        try {
            ((StorageManager) applicationA.getSystemService(StorageManager.class)).setCacheBehaviorGroup(new File(string), true);
        } catch (IOException e) {
            zxr.b("YRN_YRNV3_SDK", "YRNBundleUtils.getRootCachePath:setCacheBehaviorGroup" + e.getMessage());
        }
        return str3;
    }

    public static YRNBundleInfo g(List<YRNBundleInfo> list, String str) {
        if (list != null && list.size() != 0) {
            for (YRNBundleInfo yRNBundleInfo : list) {
                if (TextUtils.equals(yRNBundleInfo.getModule(), str)) {
                    return yRNBundleInfo;
                }
            }
        }
        return null;
    }
}
