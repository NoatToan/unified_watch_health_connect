package com.github.promeg.pinyinhelper;

/* JADX INFO: loaded from: classes2.dex */
public final class Pinyin {
    private Pinyin() {
    }

    private static short a(byte[] bArr, byte[] bArr2, int i) {
        int i2 = i % 8;
        short s = (short) (bArr2[i] & 255);
        return (bArr[i / 8] & d.g[i2]) != 0 ? (short) (s | 256) : s;
    }

    private static int b(char c) {
        int i = c - 19968;
        if (i < 0 || i >= 7000) {
            return (7000 > i || i >= 14000) ? a(c.a, c.b, i - 14000) : a(b.a, b.b, i - 7000);
        }
        return a(a.a, a.b, i);
    }

    public static boolean isChinese(char c) {
        return (19968 <= c && c <= 40869 && b(c) > 0) || 12295 == c;
    }

    public static String toPinyin(char c) {
        if (isChinese(c)) {
            return c == 12295 ? d.c : d.i[b(c)];
        }
        return String.valueOf(c);
    }
}
