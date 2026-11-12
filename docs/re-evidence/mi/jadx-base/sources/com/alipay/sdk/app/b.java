package com.alipay.sdk.app;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f5821a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f5822b;

    public static String a() {
        return f5822b;
    }

    public static String b(int i, String str, String str2) {
        return "resultStatus={" + i + "};memo={" + str + "};result={" + str2 + "}";
    }

    public static void c(String str) {
        f5822b = str;
    }

    public static void d(boolean z) {
        f5821a = z;
    }

    public static boolean e() {
        return f5821a;
    }

    public static String f() {
        c cVarB = c.b(c.CANCELED.a());
        return b(cVarB.a(), cVarB.b(), "");
    }

    public static String g() {
        c cVarB = c.b(c.DOUBLE_REQUEST.a());
        return b(cVarB.a(), cVarB.b(), "");
    }

    public static String h() {
        c cVarB = c.b(c.PARAMS_ERROR.a());
        return b(cVarB.a(), cVarB.b(), "");
    }
}
