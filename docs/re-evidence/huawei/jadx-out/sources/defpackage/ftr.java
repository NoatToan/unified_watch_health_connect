package defpackage;

/* JADX INFO: loaded from: classes29.dex */
public class ftr {
    public static int d(int i, int i2) {
        if (i == 0) {
            return 12000;
        }
        if (i2 <= 1) {
            return i;
        }
        int iA = a(i);
        if (iA < 1) {
            iA = 1;
        }
        int iPow = (int) Math.pow(10.0d, iA - 1);
        int i3 = 0;
        while (i3 < i) {
            i3 += (i2 - 1) * iPow;
        }
        return i3;
    }

    private static int a(int i) {
        int i2 = 0;
        do {
            i /= 10;
            if (i != 0) {
                i2++;
            }
        } while (i != 0);
        return i2;
    }
}
