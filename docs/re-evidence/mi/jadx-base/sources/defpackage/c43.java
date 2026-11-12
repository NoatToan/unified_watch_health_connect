package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class c43 {
    public static boolean a(double[] dArr, int i, int i2) {
        int i3 = i - i2;
        while (i3 < i) {
            int i4 = i3 + 1;
            if (dArr[i4] < dArr[i3]) {
                return false;
            }
            i3 = i4;
        }
        int i5 = i;
        while (i5 < i + i2) {
            double d = dArr[i5];
            i5++;
            if (d < dArr[i5]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(double[] dArr, int i, int i2) {
        int i3 = i - i2;
        while (i3 < i) {
            int i4 = i3 + 1;
            if (dArr[i4] > dArr[i3]) {
                return false;
            }
            i3 = i4;
        }
        int i5 = i;
        while (i5 < i + i2) {
            double d = dArr[i5];
            i5++;
            if (d > dArr[i5]) {
                return false;
            }
        }
        return true;
    }
}
