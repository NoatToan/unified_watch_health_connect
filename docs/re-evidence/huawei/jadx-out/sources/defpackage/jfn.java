package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class jfn {
    public static boolean a(double d, double d2) {
        return Math.abs(d - 90.0d) < 1.0E-6d && Math.abs(d2 + 80.0d) < 1.0E-6d;
    }

    public static boolean b(double d, double d2) {
        return (Math.abs(d - d2) < 1.0E-6d && Math.abs(d2 * d) < 1.0E-6d) || d2 > 180.0d || d2 <= -180.0d || d <= -90.0d || d >= 90.0d;
    }
}
