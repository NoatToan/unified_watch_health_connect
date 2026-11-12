package fi.firstbeat.common;

/* JADX INFO: loaded from: classes22.dex */
public final class FbtFixedMath {
    public static int dtofx(double d) {
        return (int) (d * 65536.0d);
    }

    public static double fxtod(int i) {
        return ((double) i) / 65536.0d;
    }

    public static int fxtoi(int i) {
        return i / 65536;
    }

    public static int itofx(int i) {
        return i * 65536;
    }
}
