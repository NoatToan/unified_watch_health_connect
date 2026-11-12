package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class x9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f38898a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f38899b = null;
    public static boolean c = false;
    public static boolean d = false;
    public static String e = "XMPush-" + Process.myPid();
    public static dqe f = new a();
    public static final HashMap<Integer, Long> g = new HashMap<>();
    public static final HashMap<Integer, String> h = new HashMap<>();
    public static final Integer i = -1;
    public static AtomicInteger j = new AtomicInteger(1);

    public static class a implements dqe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38900a = x9s.e;

        @Override // defpackage.dqe
        public void log(String str) {
        }

        @Override // defpackage.dqe
        public void log(String str, Throwable th) {
        }
    }

    public static void A(String str, Object... objArr) {
        if (v(1)) {
            i(1, f(str, objArr));
        }
    }

    public static void B(String str) {
        if (v(0)) {
            i(1, d(str));
        }
    }

    public static void C(String str, String str2) {
        if (c) {
            p(str, str2);
            return;
        }
        x(str, str2);
        if (d) {
            return;
        }
        p(str, str2);
    }

    public static void D(String str) {
        if (v(4)) {
            i(4, d(str));
        }
    }

    public static void E(String str) {
        if (c) {
            o(str);
            return;
        }
        d(str);
        if (d) {
            return;
        }
        o(str);
    }

    public static int a() {
        return f38898a;
    }

    public static Integer b(String str) {
        if (f38898a > 1) {
            return i;
        }
        Integer numValueOf = Integer.valueOf(j.incrementAndGet());
        g.put(numValueOf, Long.valueOf(System.currentTimeMillis()));
        h.put(numValueOf, str);
        f.log(str + " starts");
        return numValueOf;
    }

    public static String d(String str) {
        return w() + str;
    }

    public static String e(String str, String str2) {
        return "[" + str + "] " + str2;
    }

    public static String f(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Tid:");
        sb.append(Thread.currentThread().getId());
        sb.append("] ");
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static String g(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Tid:");
        sb.append(Thread.currentThread().getId());
        sb.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static void h(int i2) {
        if (i2 < 0 || i2 > 5) {
            i(2, "set log level as " + i2);
        }
        f38898a = i2;
    }

    public static void i(int i2, String str) {
        if (i2 >= f38898a) {
            f.log(str);
            return;
        }
        if (u()) {
            StringBuilder sb = new StringBuilder();
            sb.append("-->log(");
            sb.append(i2);
            sb.append("): ");
            sb.append(str);
        }
    }

    public static void j(int i2, String str, Throwable th) {
        if (i2 >= f38898a) {
            f.log(str, th);
            return;
        }
        if (u()) {
            StringBuilder sb = new StringBuilder();
            sb.append("-->log(");
            sb.append(i2);
            sb.append("): ");
            sb.append(str);
        }
    }

    public static void k(int i2, Throwable th) {
        if (i2 >= f38898a) {
            f.log("", th);
        } else if (u()) {
            StringBuilder sb = new StringBuilder();
            sb.append("-->log(");
            sb.append(i2);
            sb.append("): ");
        }
    }

    public static void l(dqe dqeVar) {
        f = dqeVar;
    }

    public static void m(Context context) {
        f38899b = context;
        if (y0t.j(context)) {
            c = true;
        }
        if (y0t.i()) {
            d = true;
        }
    }

    public static void n(Integer num) {
        if (f38898a <= 1) {
            HashMap<Integer, Long> map = g;
            if (map.containsKey(num)) {
                long jLongValue = map.remove(num).longValue();
                String strRemove = h.remove(num);
                long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                f.log(strRemove + " ends in " + jCurrentTimeMillis + " ms");
            }
        }
    }

    public static void o(String str) {
        if (v(2)) {
            i(2, d(str));
        }
    }

    public static void p(String str, String str2) {
        if (v(2)) {
            i(2, x(str, str2));
        }
    }

    public static void q(String str, Throwable th) {
        if (v(4)) {
            j(4, d(str), th);
        }
    }

    public static void r(String str, Object... objArr) {
        if (v(2)) {
            i(2, f(str, objArr));
        }
    }

    public static void s(Throwable th) {
        if (v(4)) {
            k(4, th);
        }
    }

    public static void t(Object... objArr) {
        if (v(4)) {
            i(4, g(objArr));
        }
    }

    public static boolean u() {
        return false;
    }

    public static boolean v(int i2) {
        return i2 >= f38898a || u();
    }

    public static String w() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    public static String x(String str, String str2) {
        return w() + e(str, str2);
    }

    public static void y(String str) {
        if (v(0)) {
            i(0, d(str));
        }
    }

    public static void z(String str, String str2) {
        if (v(1)) {
            i(1, x(str, str2));
        }
    }
}
