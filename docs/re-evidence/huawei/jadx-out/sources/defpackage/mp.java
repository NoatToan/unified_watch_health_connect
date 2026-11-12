package defpackage;

import com.alipay.sdk.m.l.c;

/* JADX INFO: loaded from: classes4.dex */
public class mp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f42097a = false;
    public static String e;

    public static String a() {
        return e;
    }

    public static String b() {
        c cVarA = c.a(c.DOUBLE_REQUEST.b());
        return d(cVarA.b(), cVarA.a(), "");
    }

    public static boolean c() {
        return f42097a;
    }

    public static String e() {
        c cVarA = c.a(c.PARAMS_ERROR.b());
        return d(cVarA.b(), cVarA.a(), "");
    }

    public static void e(String str) {
        e = str;
    }

    public static void a(boolean z) {
        f42097a = z;
    }

    public static String d() {
        c cVarA = c.a(c.CANCELED.b());
        return d(cVarA.b(), cVarA.a(), "");
    }

    public static String d(int i, String str, String str2) {
        return "resultStatus={" + i + "};memo={" + str + "};result={" + str2 + "}";
    }
}
