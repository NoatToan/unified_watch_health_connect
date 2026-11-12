package com.huawei.hms.ads.uiengineloader;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12914a = "ClassLoaderPathManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12915b = "com.huawei.hff";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<String, ArrayList<String>> f12916c = new HashMap<>();

    private static void c(Context context, String str, PackageInfo packageInfo) {
        if (f12916c.containsKey(str)) {
            af.b(f12914a, "HFF split info for dynamicApkPath has set.");
            return;
        }
        new r();
        Set<q> setA = r.a(context, packageInfo.applicationInfo, "com.huawei.hff");
        if (setA.isEmpty()) {
            af.b(f12914a, "No HFF split path need to add to classloader.");
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<q> it = setA.iterator();
        while (it.hasNext()) {
            arrayList.add(ad.a(it.next().f12923a));
        }
        f12916c.put(str, arrayList);
    }

    public static String b(Context context, String str, PackageInfo packageInfo) {
        String string = null;
        if (context == null || TextUtils.isEmpty(str) || packageInfo == null) {
            af.c(f12914a, "clientContext or dynamicApkPath or dynamicPackageInfo is null.");
            return null;
        }
        c(context, str, packageInfo);
        String strA = ag.a(context, str, z.a(context, str), packageInfo);
        packageInfo.applicationInfo.nativeLibraryDir = strA;
        if (!f12916c.containsKey(str)) {
            af.b(f12914a, "No split apk required, continue.");
            return strA;
        }
        ArrayList<String> arrayList = f12916c.get(str);
        if (arrayList == null || arrayList.isEmpty()) {
            af.b(f12914a, "No split apk path has set.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str2 : arrayList) {
                if (sb.length() != 0) {
                    sb.append(File.pathSeparator);
                }
                sb.append(z.b(context, str2));
            }
            string = sb.toString();
        }
        if (TextUtils.isEmpty(strA)) {
            return string;
        }
        if (TextUtils.isEmpty(string)) {
            return strA;
        }
        return strA + File.pathSeparator + string;
    }

    private static String a(Context context, ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            af.b(f12914a, "No split apk path has set.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (sb.length() != 0) {
                sb.append(File.pathSeparator);
            }
            sb.append(z.b(context, str));
        }
        return sb.toString();
    }

    public static String a(Context context, String str, PackageInfo packageInfo) {
        String str2;
        if (context == null || TextUtils.isEmpty(str) || packageInfo == null) {
            af.c(f12914a, "clientContext or dynamicApkPath or dynamicPackageInfo is null.");
            return null;
        }
        c(context, str, packageInfo);
        if (f12916c.containsKey(str)) {
            ArrayList<String> arrayList = f12916c.get(str);
            if (arrayList != null && !arrayList.isEmpty()) {
                StringBuilder sb = new StringBuilder(str);
                for (String str3 : arrayList) {
                    sb.append(File.pathSeparator);
                    sb.append(str3);
                }
                return sb.toString();
            }
            str2 = "No split apk path has set.";
        } else {
            str2 = "No split apk required, continue.";
        }
        af.b(f12914a, str2);
        return str;
    }
}
