package org.conscrypt;

import i3.e5;

/* JADX INFO: loaded from: classes3.dex */
final class ArrayUtils {
    private ArrayUtils() {
    }

    public static void checkOffsetAndCount(int i14, int i15, int i16) {
        if ((i15 | i16) < 0 || i15 > i14 || i14 - i15 < i16) {
            StringBuilder sbJ = e5.j(i14, i15, "length=", "; regionStart=", "; regionLength=");
            sbJ.append(i16);
            throw new ArrayIndexOutOfBoundsException(sbJ.toString());
        }
    }
}
