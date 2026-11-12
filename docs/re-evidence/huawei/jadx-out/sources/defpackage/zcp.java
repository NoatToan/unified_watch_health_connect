package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class zcp {
    public static int d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int d(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    private zcp() {
    }

    public static void e(Object obj) {
        if (obj == null) {
            c();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            e(str);
        }
    }

    public static void a() {
        throw ((yyq) c(new yyq()));
    }

    public static void c() {
        throw ((NullPointerException) c(new NullPointerException()));
    }

    public static void e(String str) {
        throw ((NullPointerException) c(new NullPointerException(str)));
    }

    public static void b(String str) {
        throw ((yyw) c(new yyw(str)));
    }

    public static void d(String str) {
        b("lateinit property " + str + " has not been initialized");
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) c(new IllegalStateException(str + " must not be null")));
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) c(new NullPointerException(str + " must not be null")));
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            i(str);
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            g(str);
        }
    }

    private static void i(String str) {
        throw ((IllegalArgumentException) c(new IllegalArgumentException(c(str))));
    }

    private static void g(String str) {
        throw ((NullPointerException) c(new NullPointerException(c(str))));
    }

    private static String c(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = zcp.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b() {
        a("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void a(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void b(int i, String str) {
        b();
    }

    public static void d() {
        b();
    }

    private static <T extends Throwable> T c(T t) {
        return (T) a((Throwable) t, zcp.class.getName());
    }

    static <T extends Throwable> T a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }
}
