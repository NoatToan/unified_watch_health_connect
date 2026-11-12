package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class q3b {
    public static int a(int i, int i2) {
        if (i == 2) {
            return (i2 + 1) % 2 == 0 ? 2 : 1;
        }
        if (i == 3) {
            int i3 = (i2 + 1) % 3;
            if (i3 == 0) {
                return 2;
            }
            return i3 == 2 ? 0 : 1;
        }
        if (i != 4) {
            return i == 5 ? 1 : 0;
        }
        int i4 = (i2 + 1) % 4;
        if (i4 == 0) {
            return 2;
        }
        return (i4 == 3 || i4 == 2) ? 0 : 1;
    }

    public static int b(int i, int i2) {
        int iA = a(i, i2);
        if (iA == 1) {
            return 8388627;
        }
        return iA == 2 ? 8388629 : 17;
    }
}
