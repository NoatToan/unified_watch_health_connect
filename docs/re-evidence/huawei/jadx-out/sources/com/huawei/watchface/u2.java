package com.huawei.watchface;

import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public abstract class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30586a = "u2";

    public static void a(boolean z) {
        synchronized (u2.class) {
            HwLog.i(f30586a, "create -- enter isDelete:" + z);
            g5.c().d(g5.c().f());
            e5.c().a(CommonUtils.A(), z, z ^ true);
        }
    }

    public static void b() {
        synchronized (u2.class) {
            HwLog.i(f30586a, "destroy -- enter");
            e5.c().a();
            g5.c().a();
            s2.b().a();
        }
    }

    public static void c() {
        synchronized (u2.class) {
            HwLog.i(f30586a, "resume -- enter");
            e5.c().a(false, false, false);
        }
    }

    public static void a() {
        synchronized (u2.class) {
            g5.c().b();
            e5.c().b();
        }
    }
}
