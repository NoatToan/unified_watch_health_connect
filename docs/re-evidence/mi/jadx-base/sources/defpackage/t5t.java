package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class t5t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f34352a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f34353b = 0;
    public static int c = 1;
    public static int d = 2;
    public static String e = null;
    public static int f = 0;
    public static boolean g = true;
    public static boolean h = true;
    public static boolean i = true;
    public static boolean j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f34354k = true;
    public static Boolean l = Boolean.FALSE;
    public static LinkedList<qk> m = new LinkedList<>();

    public static /* synthetic */ String A(String str) {
        return "" + str + "";
    }

    public static /* synthetic */ String B(String str) {
        return a() + str;
    }

    public static /* synthetic */ String C(String str) {
        return str;
    }

    public static /* synthetic */ String D(String str) {
        return str;
    }

    public static void E(final String str) {
        e("DEBUG", str, 0, 'w');
        i("DEBUG", new Function0() { // from class: j5t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t5t.D(str);
            }
        }, false);
    }

    public static String a() {
        return "<Unknown>";
    }

    public static void b(Object obj) {
        if (j && obj == null) {
            e("DEBUG", ">>> `NOT NULL` ASSERTION FAILED <<<", 0, 'e');
        }
    }

    public static void c(String str) {
        e("DEBUG", str, 0, 'd');
    }

    public static void d(String str, final String str2) {
        if (!g) {
            m(str, str2);
        } else {
            le.c(str, new Function0() { // from class: s5t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t5t.v(str2);
                }
            });
            i(str, new Function0() { // from class: i5t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t5t.w(str2);
                }
            }, false);
        }
    }

    public static void e(String str, final String str2, int i2, char c2) {
        if (h) {
            if (!m.isEmpty()) {
                Iterator<qk> it = m.iterator();
                while (it.hasNext()) {
                    if (it.next().a(c2, str, "" + str2 + "")) {
                        return;
                    }
                }
            }
            if (c2 == 'd') {
                le.a(str, (Function0<String>) new Function0() { // from class: q5t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t5t.y(str2);
                    }
                });
                return;
            }
            if (c2 == 'e') {
                le.b(str, new Function0() { // from class: p5t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t5t.A(str2);
                    }
                });
                return;
            }
            if (c2 == 'i') {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(str2);
                sb.append("");
                return;
            }
            if (c2 == 'v') {
                le.d(str, new Function0() { // from class: o5t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t5t.x(str2);
                    }
                });
            } else {
                if (c2 != 'w') {
                    return;
                }
                le.e(str, new Function0() { // from class: n5t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t5t.z(str2);
                    }
                });
            }
        }
    }

    public static void f(String str, final String str2, Throwable th) {
        if (f > f34352a) {
            le.a(str, "", th, (Function0<String>) new Function0() { // from class: h5t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t5t.s(str2);
                }
            });
            h(str, new Function0() { // from class: k5t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t5t.t(str2);
                }
            }, th, false);
        }
    }

    public static void g(String str, Function0<String> function0) {
        if (l.booleanValue()) {
            a2.a(str, function0, null, true);
        }
    }

    public static void h(String str, Function0<String> function0, Throwable th, boolean z) {
        if (h && z) {
            function0.invoke();
        }
        if (l.booleanValue()) {
            a2.a(str, function0, th, z);
        }
    }

    public static void i(String str, Function0<String> function0, boolean z) {
        if (h && z) {
            function0.invoke();
        }
        if (l.booleanValue()) {
            a2.a(str, function0, null, z);
        }
    }

    public static void j(boolean z) {
        if (!j || z) {
            return;
        }
        e("DEBUG", ">>> `TRUE` ASSERTION FAILED <<<", 0, 'e');
    }

    public static void k(boolean z, boolean z2, String str) {
        e = str;
        f = z ? f34353b : f34352a;
        n(z);
        g = z2;
        if (!z2 || str.isEmpty()) {
            return;
        }
        l = Boolean.TRUE;
        a2.a(str);
    }

    public static void l(final String str) {
        e("DEBUG", str, 0, 'e');
        i("DEBUG", new Function0() { // from class: r5t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t5t.u(str);
            }
        }, false);
    }

    public static void m(String str, String str2) {
        int i2 = f;
        if (i2 <= f34352a || i2 >= c) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(str2);
    }

    public static void n(boolean z) {
        h = z;
        i = z;
        j = z;
        f34354k = z;
    }

    public static boolean o() {
        int i2 = f;
        return i2 > f34352a && i2 < d;
    }

    public static void p() {
        if (i) {
            e("DEBUG", "<<<<====", 0, 'v');
        }
    }

    public static void q(String str) {
        e("DEBUG", str, 0, 'i');
    }

    public static void r(String str, final String str2) {
        int i2 = f;
        if (i2 <= f34352a || i2 >= d) {
            return;
        }
        le.e(str, new Function0() { // from class: l5t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t5t.B(str2);
            }
        });
        i(str, new Function0() { // from class: m5t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t5t.C(str2);
            }
        }, false);
    }

    public static /* synthetic */ String s(String str) {
        return a() + str;
    }

    public static /* synthetic */ String t(String str) {
        return str;
    }

    public static /* synthetic */ String u(String str) {
        return str;
    }

    public static /* synthetic */ String v(String str) {
        return str;
    }

    public static /* synthetic */ String w(String str) {
        return str;
    }

    public static /* synthetic */ String x(String str) {
        return "" + str + "";
    }

    public static /* synthetic */ String y(String str) {
        return "" + str + "";
    }

    public static /* synthetic */ String z(String str) {
        return "" + str + "";
    }
}
