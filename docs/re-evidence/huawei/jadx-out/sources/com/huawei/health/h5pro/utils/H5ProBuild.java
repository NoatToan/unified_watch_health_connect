package com.huawei.health.h5pro.utils;

import android.os.Build;
import defpackage.exr;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProBuild {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f6991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f6992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f6993c;

    static {
        f6991a = CommonUtil.getClass("com.hihonor.android.os.Build") != null;
        f6992b = d();
        f6993c = a();
    }

    private H5ProBuild() {
    }

    private static int a() {
        if (!isNewHonor() && c()) {
            return exr.a("ro.build.hw_emui_api_level", 0);
        }
        return 0;
    }

    private static boolean c() {
        return f6992b != null;
    }

    private static Class d() {
        return CommonUtil.getClass("com.huawei.android.os.BuildEx");
    }

    public static boolean isEmuiGe100() {
        return f6993c >= 21;
    }

    public static boolean isNewHonor() {
        return "HONOR".equals(Build.MANUFACTURER);
    }
}
