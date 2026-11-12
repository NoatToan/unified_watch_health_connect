package com.alipay.sdk.app;

/* JADX INFO: loaded from: classes4.dex */
public class EnvUtils {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static EnvEnum f2064c = EnvEnum.ONLINE;

    public enum EnvEnum {
        ONLINE,
        PRE_SANDBOX,
        SANDBOX
    }

    public static boolean a() {
        return f2064c == EnvEnum.SANDBOX;
    }

    public static boolean b() {
        return d() || a();
    }

    public static boolean d() {
        return f2064c == EnvEnum.PRE_SANDBOX;
    }
}
