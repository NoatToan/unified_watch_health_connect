package p005kotlin.jvm.internal;

import am.j;
import java.util.Arrays;
import p005kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    public static class a {
        private a() {
        }
    }

    private s() {
    }

    public static boolean a(double d14, Double d15) {
        return d15 != null && d14 == d15.doubleValue();
    }

    public static boolean b(float f14, Float f15) {
        return f15 != null && f14 == f15.floatValue();
    }

    public static boolean c(Double d14, double d15) {
        return d14 != null && d14.doubleValue() == d15;
    }

    public static boolean d(Double d14, Double d15) {
        if (d14 == null) {
            return d15 == null;
        }
        return d15 != null && d14.doubleValue() == d15.doubleValue();
    }

    public static boolean e(Float f14, float f15) {
        return f14 != null && f14.floatValue() == f15;
    }

    public static boolean f(Float f14, Float f15) {
        if (f14 == null) {
            return f15 == null;
        }
        return f15 != null && f14.floatValue() == f15.floatValue();
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int h(int i14, int i15) {
        if (i14 < i15) {
            return -1;
        }
        return i14 == i15 ? 0 : 1;
    }

    public static int i(long j8, long j14) {
        if (j8 < j14) {
            return -1;
        }
        return j8 == j14 ? 0 : 1;
    }

    public static void j(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i14 = -1;
        for (int i15 = 0; i15 < length; i15++) {
            if (str.equals(stackTrace[i15].getClassName())) {
                i14 = i15;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i14 + 1, length));
    }

    public static String k(Object obj, String str) {
        return str + obj;
    }

    public static void l() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void m(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(j.m("lateinit property ", str, " has not been initialized"));
        j(uninitializedPropertyAccessException, s.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
