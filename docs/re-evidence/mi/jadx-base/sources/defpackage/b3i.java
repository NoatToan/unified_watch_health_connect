package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b3i {
    public static int a(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static int b(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = e(i4, i);
        }
    }

    public static boolean c(int i) {
        if (i == 0) {
            return false;
        }
        int iA = a(i) >>> 1;
        int iD = 2;
        for (int i2 = 0; i2 < iA; i2++) {
            iD = d(iD, iD, i);
            if (b(iD ^ 2, i) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int d(int i, int i2, int i3) {
        int iE = e(i, i3);
        int iE2 = e(i2, i3);
        int i4 = 0;
        if (iE2 != 0) {
            int iA = 1 << a(i3);
            while (iE != 0) {
                if (((byte) (iE & 1)) == 1) {
                    i4 ^= iE2;
                }
                iE >>>= 1;
                iE2 <<= 1;
                if (iE2 >= iA) {
                    iE2 ^= i3;
                }
            }
        }
        return i4;
    }

    public static int e(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (a(i) >= a(i2)) {
            i ^= i2 << (a(i) - a(i2));
        }
        return i;
    }
}
