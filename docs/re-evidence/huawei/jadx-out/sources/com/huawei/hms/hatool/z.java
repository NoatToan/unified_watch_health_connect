package com.huawei.hms.hatool;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {
    public static boolean k(String str, String str2) {
        j0 j0VarC = c(str, str2);
        return j0VarC != null && j0VarC.h();
    }

    public static String j(String str, String str2) {
        j0 j0VarC = c(str, str2);
        return j0VarC != null ? j0VarC.c() : "";
    }

    public static boolean i(String str, String str2) {
        s0 s0VarA;
        l1 l1VarA = s.c().a(str);
        if (l1VarA == null || (s0VarA = l1VarA.a(str2)) == null) {
            return false;
        }
        return s0VarA.e();
    }

    public static boolean h(String str, String str2) {
        j0 j0VarC = c(str, str2);
        return j0VarC != null && j0VarC.g();
    }

    public static String g(String str, String str2) {
        j0 j0VarC = c(str, str2);
        return j0VarC != null ? j0VarC.d() : "";
    }

    public static boolean f(String str, String str2) {
        s0 s0VarA;
        l1 l1VarA = s.c().a(str);
        if (l1VarA == null || (s0VarA = l1VarA.a(str2)) == null) {
            return false;
        }
        return s0VarA.c();
    }

    public static boolean e(String str, String str2) {
        j0 j0VarC = c(str, str2);
        return j0VarC != null && j0VarC.f();
    }

    public static String d(String str, String str2) {
        j0 j0VarC = c(str, str2);
        return j0VarC != null ? j0VarC.b() : "";
    }

    private static j0 c(String str, String str2) {
        s0 s0VarA;
        l1 l1VarA = s.c().a(str);
        if (l1VarA == null || (s0VarA = l1VarA.a(str2)) == null) {
            return null;
        }
        return s0VarA.j();
    }

    public static boolean b(String str, String str2) {
        j0 j0VarC = c(str, str2);
        return j0VarC != null && j0VarC.e();
    }

    public static String a(String str, String str2) {
        j0 j0VarC = c(str, str2);
        return j0VarC != null ? j0VarC.a() : "";
    }
}
