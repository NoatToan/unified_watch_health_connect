package com.airbnb.lottie.parser.moshi;

/* JADX INFO: loaded from: classes7.dex */
final class JsonScope {
    static final int CLOSED = 8;
    static final int DANGLING_NAME = 4;
    static final int EMPTY_ARRAY = 1;
    static final int EMPTY_DOCUMENT = 6;
    static final int EMPTY_OBJECT = 3;
    static final int NONEMPTY_ARRAY = 2;
    static final int NONEMPTY_DOCUMENT = 7;
    static final int NONEMPTY_OBJECT = 5;

    private JsonScope() {
    }

    public static String getPath(int i14, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb3 = new StringBuilder("$");
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = iArr[i15];
            if (i16 == 1 || i16 == 2) {
                sb3.append('[');
                sb3.append(iArr2[i15]);
                sb3.append(']');
            } else if (i16 == 3 || i16 == 4 || i16 == 5) {
                sb3.append('.');
                String str = strArr[i15];
                if (str != null) {
                    sb3.append(str);
                }
            }
        }
        return sb3.toString();
    }
}
