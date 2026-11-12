package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class rys {
    public static int[] a(int i, int i2, int i3, double d, int i4, int i5, int i6) {
        double d2 = i4 == 0 ? 9.8556E-5d : 1.01817E-4d;
        double d3 = i4 == 0 ? 5.0167d : 5.7808d;
        double d4 = i4 == 0 ? 34.2325d : 41.9374d;
        double d5 = i4 == 0 ? 9.7581d : 9.8382d;
        double d6 = (i4 == 0 ? 36.0d : 45.0d) - d4;
        double d7 = d5 * 100.0d;
        return new int[]{i, i3, Math.abs((int) Math.ceil(((-Math.log(1.0d - ((((double) i2) * d6) / d7))) - (-Math.log(1.0d - ((((double) i5) * d6) / d7)))) / (d2 * (Math.exp(d3 * ((((double) i3) - d) / (((double) i6) - d))) - 1.0d))))};
    }

    public static int[] b(int i, int i2, int i3, int i4, int i5) {
        return d(i, i2, i3, i4, i5);
    }

    public static int[] c(int i, int i2, int i3, int i4, int i5, int i6) {
        double d = ((double) i6) + (((double) (i5 - i6)) * 0.2d);
        double d2 = i5;
        int iRound = (int) Math.round(0.8d * d2);
        if (d > iRound) {
            iRound = (int) Math.round((d2 + d) / 2.0d);
        }
        return a(i, i2, Math.abs(iRound), d, i3, i4, i5);
    }

    public static int[] d(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (i2 == 75) {
            return new int[]{75, 0, 0};
        }
        int i9 = 30 - i3;
        if (i9 <= 0) {
            i9 = 50 - i3;
            if (i9 > 0) {
                i8 = 50;
            } else {
                int i10 = 100 - i3;
                if (i10 <= 0) {
                    return new int[]{100, 0, 0};
                }
                int i11 = 75 - i2;
                if (i10 > i11) {
                    i6 = i11;
                    i7 = 75;
                } else {
                    i6 = i10;
                    i7 = 100;
                }
            }
            return c(i6, i7, i, i3, i4, i5);
        }
        i8 = 30;
        i7 = i8;
        i6 = i9;
        return c(i6, i7, i, i3, i4, i5);
    }
}
