package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class upe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f35997a;

    static {
        String name = upe.class.getName();
        f35997a = name.substring(0, name.lastIndexOf(".") + 1);
    }

    public static void a(String str, String str2) {
        b(str, false, str2);
    }

    public static void b(String str, boolean z, String str2) {
        i(3, str, z, str2);
    }

    public static void c(String str, String str2) {
        e(str, false, str2, null);
    }

    public static void d(String str, String str2, Throwable th) {
        e(str, false, str2, th);
    }

    public static void e(String str, boolean z, String str2, Throwable th) {
        if (th != null) {
            str2 = str2 + th.toString();
        }
        i(6, str, z, str2);
    }

    public static String f() {
        return !bpe.k() ? "Cir_" : bpe.h().f().c();
    }

    public static void g(String str, String str2) {
        h(str, false, str2);
    }

    public static void h(String str, boolean z, String str2) {
        i(4, str, z, str2);
    }

    public static void i(int i, String str, boolean z, String str2) {
        if (bpe.k()) {
            j(bpe.h().f(), i, k(str), z, str2);
        } else {
            Log.println(i, k(str), str2);
        }
    }

    public static void j(xoe xoeVar, int i, String str, boolean z, String str2) {
        if (xoeVar.b()) {
            if (i != 3 || xoeVar.a()) {
                StringBuilder sb = new StringBuilder();
                if (xoeVar.d()) {
                    sb.append(xoe.f39313a.a(Thread.currentThread()));
                    sb.append("|");
                }
                if (xoeVar.f() > 0) {
                    sb.append(xoe.f39314b.a(r8o.b(new Throwable().getStackTrace(), f35997a, xoeVar.f())));
                    sb.append("\n");
                }
                sb.append(str2);
                List<dpe> listI = bpe.h().i();
                if (listI == null || listI.isEmpty()) {
                    listI = Arrays.asList(xoeVar.e());
                }
                Iterator<dpe> it = listI.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(xoeVar, i, str, z, sb.toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static String k(String str) {
        if (TextUtils.equals(f(), str)) {
            return str;
        }
        return f() + str;
    }

    public static void l(String str, String str2) {
        m(str, false, str2);
    }

    public static void m(String str, boolean z, String str2) {
        i(5, str, z, str2);
    }
}
