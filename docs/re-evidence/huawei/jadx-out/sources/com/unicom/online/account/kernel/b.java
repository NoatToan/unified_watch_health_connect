package com.unicom.online.account.kernel;

import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f31175a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f31176b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f31177c = "";
    private static String d = "";
    private static long e = 0;
    private static long f = 0;
    private static String g = "CU";

    public static Boolean e(String str) {
        return (str == null || str.length() == 0 || str.trim().length() == 0 || Constants.NULL.equals(str) || str.equals("")) ? Boolean.FALSE : Boolean.TRUE;
    }

    public static void d(String str) {
        d = str;
    }

    public static void c(String str) {
        f31176b = str;
    }

    public static void b(String str) {
        f31177c = str;
    }

    public static void b(long j) {
        e = j;
    }

    public static void a(String str) {
        g = str;
    }

    public static void a(long j) {
        f = j;
    }

    public static void a() {
        f31176b = "";
        f31177c = "";
        f = 0L;
        e = 0L;
    }
}
