package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class ejr {
    public static Boolean d(byte b2, int i) {
        if (i < 0 || i >= 8) {
            return null;
        }
        boolean[] zArr = new boolean[8];
        for (int i2 = 0; i2 < 8; i2++) {
            boolean z = true;
            if ((b2 & 1) != 1) {
                z = false;
            }
            zArr[i2] = z;
            b2 = (byte) (b2 >> 1);
        }
        return Boolean.valueOf(zArr[i]);
    }
}
