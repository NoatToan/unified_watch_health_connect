package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
public final class o8f {
    public static void a(boolean z, double d, RoundingMode roundingMode) {
        if (z) {
            return;
        }
        String strValueOf = String.valueOf(roundingMode);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 83);
        sb.append("rounded value is out of range for input ");
        sb.append(d);
        sb.append(" and rounding mode ");
        sb.append(strValueOf);
        throw new ArithmeticException(sb.toString());
    }

    public static void b(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    public static void c(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    public static void d(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
