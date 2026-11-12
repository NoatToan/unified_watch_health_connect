package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wkk {
    public static int a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }

    public static boolean b(int i, int i2) {
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return i == 2 && (i2 & 2) != 0;
        }
        return (i2 & 1) != 0;
    }
}
