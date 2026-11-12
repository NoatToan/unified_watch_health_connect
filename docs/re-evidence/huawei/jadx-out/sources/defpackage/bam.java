package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.common.utils.CommonConstant;
import health.compact.a.LogUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class bam {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Set<String> f896b;

    public static Set<String> c(Context context) {
        Set<String> setD = d(context);
        String[] strArrB = b(context);
        if (!CollectionUtils.d(strArrB)) {
            if (LogUtil.d()) {
                LogUtil.c("Bundle_InfoProvider", "Module names are: ", Arrays.toString(strArrB));
            }
            Set<String> setB = AppBundleBuildConfig.b();
            for (String str : strArrB) {
                if (!str.startsWith("config.")) {
                    String str2 = str.split("\\.config\\.")[0];
                    if (setB.contains(str2)) {
                        setD.add(str2);
                    }
                }
            }
        }
        return setD;
    }

    private static Set<String> d(Context context) {
        if (f896b == null) {
            f896b = e(context);
        }
        return new HashSet(f896b);
    }

    private static Set<String> e(Context context) {
        HashSet hashSet = new HashSet();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                LogUtil.c("Bundle_InfoProvider", "App has no applicationInfo or metaData");
                return hashSet;
            }
            String string = applicationInfo.metaData.getString("shadow.bundletool.com.android.dynamic.apk.fused.modules");
            if (TextUtils.isEmpty(string)) {
                LogUtil.c("Bundle_InfoProvider", "App has no fused modules.");
                return hashSet;
            }
            Collections.addAll(hashSet, string.split(",", -1));
            hashSet.remove("");
            return hashSet;
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.d("Bundle_InfoProvider", "appInfo is not found in PackageManager, ex=", LogUtil.c(e));
            return hashSet;
        }
    }

    private static String[] b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo != null ? packageInfo.splitNames : CommonConstant.e;
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.d("Bundle_InfoProvider", "packageInfo is not found in PackageManager, ex=", LogUtil.c(e));
            return CommonConstant.e;
        }
    }
}
