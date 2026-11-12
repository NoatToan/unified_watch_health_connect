package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes7.dex */
public final class wpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f38214a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f38215b = 2;
    public static bqe c = new a();
    public static bqe d;

    public static class a implements bqe {
        @Override // defpackage.bqe
        public void d(String str, String str2) {
            System.out.println("[DEBUG][" + str + "]" + str2);
        }

        @Override // defpackage.bqe
        public void e(String str, String str2) {
            System.out.println("[ERROR][" + str + "]" + str2);
        }

        @Override // defpackage.bqe
        public void i(String str, String str2) {
            System.out.println("[INFO][" + str + "]" + str2);
        }

        @Override // defpackage.bqe
        public void w(String str, String str2) {
            System.out.println("[WARN][" + str + "]" + str2);
        }
    }

    public static String a(String str) {
        if (!f38214a) {
            return str;
        }
        String name = Thread.currentThread().getName();
        if (name != null && name.length() > 32) {
            name = name.substring(0, 32);
        }
        return "[AIVS " + Thread.currentThread().getId() + "-" + name + "] " + str;
    }

    public static void b(String str, String str2) {
        bqe bqeVar;
        if (f38215b < 3 || (bqeVar = c) == null) {
            return;
        }
        bqeVar.d(a(str), str2);
    }

    public static void c(String str, String str2, boolean z) {
        d(str, str2, z, true);
    }

    public static void d(String str, String str2, boolean z, boolean z2) {
        bqe bqeVar;
        bqe bqeVar2;
        if (f38215b >= 0) {
            if (z2) {
                str = a(str);
            }
            if (z2 && (bqeVar2 = c) != null) {
                bqeVar2.e(str, str2);
            }
            if (!z || (bqeVar = d) == null) {
                return;
            }
            bqeVar.e(str, str2);
        }
    }

    public static void e(String str, String str2) {
        c(str, str2, true);
    }

    public static void f(String str, String str2, boolean z) {
        g(str, str2, z, true);
    }

    public static void g(String str, String str2, boolean z, boolean z2) {
        bqe bqeVar;
        bqe bqeVar2;
        if (f38215b >= 2) {
            if (z2) {
                str = a(str);
            }
            if (z2 && (bqeVar2 = c) != null) {
                bqeVar2.i(str, str2);
            }
            if (!z || (bqeVar = d) == null) {
                return;
            }
            bqeVar.i(str, str2);
        }
    }

    public static void h(String str, String str2) {
        f(str, str2, true);
    }

    public static void i(String str, String str2, boolean z) {
        j(str, str2, z, true);
    }

    public static void j(String str, String str2, boolean z, boolean z2) {
        bqe bqeVar;
        bqe bqeVar2;
        if (f38215b >= 1) {
            if (z2) {
                str = a(str);
            }
            if (z2 && (bqeVar2 = c) != null) {
                bqeVar2.w(str, str2);
            }
            if (!z || (bqeVar = d) == null) {
                return;
            }
            bqeVar.w(str, str2);
        }
    }

    public static void k(String str, String str2) {
        i(str, str2, true);
    }

    public static int l() {
        return f38215b;
    }

    public static void m(bqe bqeVar) {
        c = bqeVar;
    }

    public static void n(int i) {
        f38215b = i;
    }

    public static String o(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
