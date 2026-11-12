package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes7.dex */
public class dcm {
    public static double a(String str, String str2, int i) {
        if (str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            return 0.0d;
        }
        if (str.equals(str2)) {
            return 1.0d;
        }
        int length = str.length();
        int length2 = str2.length();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length + 1, length2 + 1);
        for (int i2 = 0; i2 <= length; i2++) {
            iArr[i2][0] = i2;
        }
        for (int i3 = 0; i3 <= length2; i3++) {
            iArr[0][i3] = i3;
        }
        for (int i4 = 1; i4 <= length; i4++) {
            for (int i5 = 1; i5 <= length2; i5++) {
                int i6 = i4 - 1;
                int i7 = i5 - 1;
                iArr[i4][i5] = Math.min(iArr[i6][i7] + (str.charAt(i6) == str2.charAt(i7) ? 0 : 1), Math.min(iArr[i6][i5] + 1, iArr[i4][i7] + 1));
            }
        }
        int i8 = iArr[length][length2];
        if (i8 <= i) {
            return 1.0d;
        }
        return 1.0d - ((((double) i8) * 1.0d) / ((double) Math.max(length, length2)));
    }
}
