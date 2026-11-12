package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class bmr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f4377a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f4378b = new long[0];
    public static final float[] c = new float[0];
    public static final double[] d = new double[0];
    public static final boolean[] e = new boolean[0];
    public static final String[] f = new String[0];
    public static final byte[][] g = new byte[0][];
    public static final byte[] h = new byte[0];

    public static final int a(o34 o34Var, int i) throws IOException {
        int iF = o34Var.f();
        o34Var.F(i);
        int i2 = 1;
        while (o34Var.A() == i) {
            o34Var.F(i);
            i2++;
        }
        o34Var.E(iF);
        return i2;
    }

    public static int b(int i) {
        return i >>> 3;
    }

    public static int c(int i) {
        return i & 7;
    }

    public static int d(int i, int i2) {
        return (i << 3) | i2;
    }
}
