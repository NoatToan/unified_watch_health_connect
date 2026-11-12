package defpackage;

import android.text.TextUtils;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class pwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f30859a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f30860b = -1;

    public static int a() {
        if (f30860b == -1) {
            f30860b = b();
        }
        return f30860b;
    }

    public static int b() {
        return SystemProperties.getInt("ro.mi.os.version.code", 0);
    }

    public static int c() {
        if (f30859a == -1) {
            f30859a = d();
        }
        return f30859a;
    }

    public static int d() {
        return SystemProperties.getInt("ro.miui.ui.version.code", 0);
    }

    public static boolean e() {
        return c() > 0;
    }

    public static boolean f() {
        return c() >= 15;
    }

    public static boolean g() {
        return (TextUtils.isEmpty(SystemProperties.get("ro.mi.os.version.code", "")) && TextUtils.isEmpty(SystemProperties.get("ro.miui.ui.version.code", ""))) ? false : true;
    }
}
