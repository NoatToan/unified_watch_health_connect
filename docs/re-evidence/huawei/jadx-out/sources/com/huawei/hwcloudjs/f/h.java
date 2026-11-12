package com.huawei.hwcloudjs.f;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17118a = "Utils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17119b;

    public static boolean c(Context context, String str) {
        String str2;
        if (context == null || str == null) {
            str2 = "packageInstalled is null or context fail";
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    packageManager.getPackageInfo(str, 16384);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                    d.b("Utils", "PackageManager NameNotFoundException ", true);
                }
            }
            str2 = "packageInstalled false";
        }
        d.b("Utils", str2, true);
        return false;
    }

    public static String b(Context context, String str) {
        if (context == null) {
            return "";
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager != null ? packageManager.getPackageInfo(str, 16384).versionName : "";
        } catch (PackageManager.NameNotFoundException unused) {
            d.b("Utils", " NameNotFoundException .. ", true);
            return "";
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                d.b("Utils", "closeStream IOException", true);
            }
        }
    }

    public static int a(Context context, String str) {
        if (context == null) {
            return 0;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageInfo(str, 16384).versionCode;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            d.b("Utils", " NameNotFoundException .. ", true);
            return 0;
        }
    }

    public static int a() {
        int i = f17119b;
        f17119b = i + 1;
        return i;
    }
}
