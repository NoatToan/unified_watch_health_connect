package defpackage;

import java.util.BitSet;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class aht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1039a = 30;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f1040b;
    public static final HashMap<Character, Integer> c;

    static {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z'};
        f1040b = cArr;
        c = new HashMap<>();
        int i = 0;
        int i2 = 0;
        while (i < 32) {
            c.put(Character.valueOf(cArr[i]), Integer.valueOf(i2));
            i++;
            i2++;
        }
    }

    public static String a(double d, double d2) {
        BitSet bitSetC = c(d, -90.0d, 90.0d);
        BitSet bitSetC2 = c(d2, -180.0d, 180.0d);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < f1039a; i++) {
            char c2 = '0';
            sb.append(bitSetC2.get(i) ? '1' : '0');
            if (bitSetC.get(i)) {
                c2 = '1';
            }
            sb.append(c2);
        }
        return b(Long.parseLong(sb.toString(), 2));
    }

    public static String b(long j) {
        char[] cArr = new char[65];
        boolean z = j < 0;
        int i = 64;
        if (!z) {
            j = -j;
        }
        while (j <= -32) {
            cArr[i] = f1040b[(int) (-(j % 32))];
            j /= 32;
            i--;
        }
        cArr[i] = f1040b[(int) (-j)];
        if (z) {
            i--;
            cArr[i] = '-';
        }
        return new String(cArr, i, 65 - i);
    }

    public static BitSet c(double d, double d2, double d3) {
        BitSet bitSet = new BitSet(f1039a);
        for (int i = 0; i < f1039a; i++) {
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
}
