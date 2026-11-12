package defpackage;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes.dex */
public class hf4 {
    public static String a(int i) {
        return tt3.U("{}", i, " ");
    }

    public static void b(Object obj) {
        if (!(obj instanceof Throwable)) {
            c("{}", obj);
        } else {
            Throwable th = (Throwable) obj;
            d(th, th.getMessage(), new Object[0]);
        }
    }

    public static void c(String str, Object... objArr) {
        if (qj1.D(objArr) || tt3.j(str, "{}")) {
            e(str, objArr);
        } else {
            e(a(objArr.length + 1), qj1.A(objArr, 0, str));
        }
    }

    public static void d(Throwable th, String str, Object... objArr) {
        PrintStream printStream = System.out;
        printStream.println(tt3.y(str, objArr));
        if (th != null) {
            th.printStackTrace();
            printStream.flush();
        }
    }

    public static void e(String str, Object... objArr) {
        d(null, str, objArr);
    }
}
