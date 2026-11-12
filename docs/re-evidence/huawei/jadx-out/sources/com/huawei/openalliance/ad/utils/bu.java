package com.huawei.openalliance.ad.utils;

/* JADX INFO: loaded from: classes12.dex */
public abstract class bu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ap f20519a;

    public static void a(String str) {
        f20519a.a(str);
    }

    public static void a(Runnable runnable, String str, long j) {
        f20519a.a(runnable, str, j);
    }

    public static void a(Runnable runnable, long j) {
        f20519a.a(runnable, null, j);
    }

    public static void a(Runnable runnable) {
        f20519a.a(runnable);
    }

    static {
        ap apVar = new ap("pps-msg-queue");
        f20519a = apVar;
        apVar.a();
    }
}
