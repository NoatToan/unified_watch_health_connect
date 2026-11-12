package com.huawei.hms.feature.dynamic.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13182a = "HMSPkgManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f13183b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f13184c = 8;
    private static final int d = 4;
    private static final int e = 5;

    public static boolean c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.w(f13182a, "context is null or pkgName is null.");
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
            boolean z = (packageInfo == null || (packageInfo.applicationInfo.flags & 1) == 0) ? false : true;
            Logger.i(f13182a, "isHMSSystemApp:" + z);
            if (z) {
                Logger.i(f13182a, "The HMS package:" + str + " is SystemApp");
                return true;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.e(f13182a, "getSystemApp flag error for " + str + ":" + e2.getMessage());
        }
        return false;
    }

    public static boolean b(Context context, String str) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.e(f13182a, "context is null or pkgName is null.");
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.e(f13182a, "get PrivAppFlag err for " + str + ":" + e2.getMessage());
            packageInfo = null;
        }
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) {
            Logger.i(f13182a, "Get pkg application null:" + str);
            return false;
        }
        try {
            Field field = applicationInfo.getClass().getField("privateFlags");
            AccessController.doPrivileged(new b(field));
            Object obj = field.get(applicationInfo);
            if (!(obj instanceof Integer)) {
                Logger.i(f13182a, "Get privFlag instance error.");
                return false;
            }
            int iIntValue = ((Integer) obj).intValue();
            Logger.d(f13182a, "privFlag of " + str + " is:" + iIntValue);
            boolean z = (iIntValue & 8) != 0;
            Logger.i(f13182a, "pkgName:" + str + ", isPrivApp:" + z);
            return z;
        } catch (IllegalAccessException | NoSuchFieldException e3) {
            Logger.e(f13182a, "get Priv App Flag err for " + str + ":" + e3.getMessage());
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        String str2;
        if (context == null) {
            Logger.e(f13182a, "context is null.");
            return false;
        }
        if (ModuleCopy.isPathInvalid(str)) {
            return false;
        }
        try {
            if (!new File(str).exists()) {
                Logger.w(f13182a, "the file does not exist.");
                return false;
            }
            String canonicalPath = new File(str).getCanonicalPath();
            if (canonicalPath.startsWith("/system/app/HFF")) {
                Logger.i(f13182a, "HFF file path, need not to verify.");
                return true;
            }
            if (canonicalPath.startsWith("/data/data/")) {
                String[] strArrSplit = canonicalPath.split("/");
                if (strArrSplit.length >= 4) {
                    str2 = strArrSplit[3];
                    return b(context, str2);
                }
                return false;
            }
            if (canonicalPath.startsWith("/data/user_de/") || canonicalPath.startsWith("/data/user/")) {
                String[] strArrSplit2 = canonicalPath.split("/");
                if (strArrSplit2.length >= 5) {
                    str2 = strArrSplit2[4];
                    return b(context, str2);
                }
            } else {
                Logger.w(f13182a, "illegal path.");
            }
            return false;
        } catch (IOException unused) {
            Logger.e(f13182a, "checkPathValidity IOException");
        }
    }

    public class b implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Field f13185a;

        @Override // java.security.PrivilegedAction
        public Object run() {
            this.f13185a.setAccessible(true);
            return null;
        }

        public b(Field field) {
            this.f13185a = field;
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            Logger.e(f13182a, "The given context is null.");
            return false;
        }
        for (String str : f13183b) {
            try {
                if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                    Logger.i(f13182a, "The HMS Core is installed, pkgName:" + str);
                    return true;
                }
                continue;
            } catch (PackageManager.NameNotFoundException unused) {
                Logger.w(f13182a, "Query for HMS Core package name:" + str + " failed.");
            }
        }
        return false;
    }

    public class a extends ArrayList<String> {
        public a() {
            add("com.huawei.hwid");
            add("com.huawei.hwid.tv");
        }
    }
}
