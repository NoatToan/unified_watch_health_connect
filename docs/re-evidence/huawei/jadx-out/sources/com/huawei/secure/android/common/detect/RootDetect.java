package com.huawei.secure.android.common.detect;

import android.os.Build;
import com.huawei.secure.android.common.detect.utils.c;
import com.huawei.secure.android.common.detect.utils.d;
import java.io.File;

/* JADX INFO: loaded from: classes15.dex */
public final class RootDetect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22754a = "RootDetect";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22755b = "/sbin:/vendor/bin:/system/sbin:/system/bin:/system/xbin:/system/bin/.ext:/system/sd/xbin:/system/usr/we-need-root:/cache:/data:/dev:/system/vendor/bin:/vendor/xbin:/system/vendor/xbin:";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22756c = "su";
    private static final String d = "magisk";

    private RootDetect() {
    }

    private static boolean a(String str) {
        for (String str2 : f22755b.split(":")) {
            if (new File(str2 + File.separator + str).exists()) {
                return true;
            }
        }
        return false;
    }

    private static boolean b() {
        try {
            if (Build.HARDWARE.contains("goldfish") || Build.FINGERPRINT.contains("generic")) {
                return true;
            }
            String str = Build.MODEL;
            return str.contains("google_sdk") || str.contains("Emulator") || str.contains("Android SDK built for x86") || str.contains("Android SDK built for arm64") || "google_sdk".equals(Build.PRODUCT);
        } catch (Exception e) {
            c.b(f22754a, "Check emulator " + e.getMessage());
            return false;
        }
    }

    private static boolean c() {
        return a(d);
    }

    private static boolean d() {
        return "0".equals(d.b("ro.secure"));
    }

    private static boolean e() {
        return a("su");
    }

    private static boolean f() {
        if (e()) {
            c.b(f22754a, "su file exists");
            return true;
        }
        if (d()) {
            c.b(f22754a, "SecureProperty is wrong");
            return true;
        }
        if (b()) {
            c.c(f22754a, "app run in emulator");
            return true;
        }
        if (a()) {
            c.c(f22754a, "build.tags is wrong");
            return true;
        }
        if (!c()) {
            return false;
        }
        c.b(f22754a, "Magisk exists");
        return true;
    }

    public static boolean isRoot() {
        if (Build.VERSION.SDK_INT < 27) {
            return f();
        }
        try {
            if (!SD.irtj()) {
                return false;
            }
            c.b(f22754a, "root exists");
            return true;
        } catch (Throwable th) {
            c.b(f22754a, "SD.irtj isRoot exception : " + th.getMessage());
            return f();
        }
    }

    private static boolean a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }
}
