package com.huami.mifit.sportlib.core;

import java.util.BitSet;
import java.util.HashMap;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class Geohash {
    private static int a = 30;
    private static final char[] b;
    public static final HashMap<Character, Integer> c;

    static {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', JsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z'};
        b = cArr;
        c = new HashMap<>();
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.put(Character.valueOf(cArr[i]), Integer.valueOf(i2));
            i++;
            i2++;
        }
    }

    private static String a(long j) {
        char[] cArr = new char[65];
        boolean z = j < 0;
        int i = 64;
        if (!z) {
            j = -j;
        }
        while (j <= -32) {
            cArr[i] = b[(int) (-(j % 32))];
            j /= 32;
            i--;
        }
        cArr[i] = b[(int) (-j)];
        if (z) {
            i--;
            cArr[i] = '-';
        }
        return new String(cArr, i, 65 - i);
    }

    private static double b(BitSet bitSet, double d, double d2) {
        double d3 = 0.0d;
        for (int i = 0; i < bitSet.length(); i++) {
            d3 = (d + d2) / 2.0d;
            if (bitSet.get(i)) {
                d = d3;
            } else {
                d2 = d3;
            }
        }
        return d3;
    }

    private static BitSet c(double d, double d2, double d3) {
        BitSet bitSet = new BitSet(a);
        for (int i = 0; i < a; i++) {
            double d4 = (d2 + d3) / 2.0d;
            if (d >= d4) {
                bitSet.set(i);
                d2 = d4;
            } else {
                d3 = d4;
            }
        }
        return bitSet;
    }

    public static double[] decode(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            sb.append(Integer.toString(c.get(Character.valueOf(c2)).intValue() + 32, 2).substring(1));
        }
        BitSet bitSet = new BitSet();
        BitSet bitSet2 = new BitSet();
        int i = 0;
        int i2 = 0;
        while (i < a * 2) {
            bitSet.set(i2, i < sb.length() && sb.charAt(i) == '1');
            i += 2;
            i2++;
        }
        int i3 = 1;
        int i4 = 0;
        while (i3 < a * 2) {
            bitSet2.set(i4, i3 < sb.length() && sb.charAt(i3) == '1');
            i3 += 2;
            i4++;
        }
        return new double[]{b(bitSet2, -90.0d, 90.0d), b(bitSet, -180.0d, 180.0d)};
    }

    public static String encode(double d, double d2) {
        BitSet bitSetC = c(d, -90.0d, 90.0d);
        BitSet bitSetC2 = c(d2, -180.0d, 180.0d);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            char c2 = '1';
            sb.append(bitSetC2.get(i) ? '1' : '0');
            if (!bitSetC.get(i)) {
                c2 = '0';
            }
            sb.append(c2);
        }
        return a(Long.parseLong(sb.toString(), 2));
    }

    public static void main(String[] strArr) throws Exception {
    }
}
